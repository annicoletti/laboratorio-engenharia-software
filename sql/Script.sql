drop database db_idem;

create database db_idem;

use db_idem;

create table Usuario(
	idUsuario int auto_increment,
	nomeUsuario varchar(30) not null,
    senhaUsuario varchar(30) not null,
    administrador bool,
Constraint PK_idUsuario primary key (idUsuario),
Constraint UK_NomeUsuario Unique (nomeUsuario)
);

create table Pessoas(
	idPessoa int auto_increment,
    nomePessoa varchar(40),
    valorPessoa double(10,2),
Constraint PK_Pessoa primary key (idPessoa)
);

create table Operacoes(
	idOperacao int auto_increment,
    tipo varchar(50) not null,
    sigla char not null,
Constraint PK_idOperacao primary key (idOperacao),
constraint UK_Sigla unique (sigla)
);

create table Lancamentos(
	idLancamento int auto_increment,
    descricaoLancamento varchar(50),
    dataLancamento datetime not null,
    valorLancamento double(10,2),
    valorSaldo double(10,2),
    idPessoa int not null,
    idOperacao int not null,
Constraint PK_Lancamentos primary key (idLancamento),
Constraint FK_Lancamentos_Operacoes foreign key (idOperacao) references Operacoes (idOperacao),
Constraint FK_Lancamentos_Pessoas foreign key (idPessoa) references Pessoas (idPessoa)
);

/* INSERTS */

insert into Usuario (nomeUsuario, senhaUsuario, administrador) values ('admin','admin',1);
insert into Operacoes (tipo, sigla) values ('DEBITO','D');
insert into Operacoes (tipo, sigla) values ('CREDITO','C');


-- insert into pessoas (nomePessoa) values ('TESTE 1'),('TESTE A'),('TESTE B'),('TESTE C');
-- insert into pessoas (nomePessoa, valorPessoa) values ('TESTE 1', 3000.00),('TESTE A', 3500.00),('TESTE B', 1000.00),('TESTE C', 500.00);

/* VIEW */
create view VW_Pessoas as select p.idPessoa CODIGO, p.nomePessoa NOME, p.valorPessoa SALDO from Pessoas p;

create view VW_Registros as
		select p.idPessoa ID, l.dataLancamento DIA, l.descricaoLancamento DESCRICAO, o.tipo TIPO, l.valorLancamento VALOR, l.valorSaldo SALDO
		from Lancamentos l
		inner join Pessoas p on l.idPessoa = p.idPessoa
		inner join Operacoes o on o.idOperacao = l.idOperacao
        order by DIA desc;
        
create view VW_ResgistroCompleto as        
	select 	l.idLancamento, 
			l.descricaoLancamento, 
			l.dataLancamento, 
			l.valorLancamento, 
			l.valorSaldo, 
			p.nomePessoa,         
			o.tipo
	from Lancamentos l 
	inner join Pessoas p on p.idPessoa = l.idPessoa
	inner join Operacoes o on o.idOperacao = l.idOperacao;

/* PROCEDURES */
-- Inserir pessoa
DELIMITER //
create procedure SP_InsertPessoa (nome varchar(40))
	begin 
		insert into Pessoas (nomePessoa, valorPessoa) values (nome, 0);
	end
DELIMITER ; 

-- Inserir Registro
DELIMITER //
create procedure SP_InsertRegistro (descricao varchar(40), 
									dia datetime, 
									valor decimal(10,2),
                                    saldo decimal(10,2),
                                    codigoPessoa int, 
                                    operacao int)
	begin 
		insert into Lancamentos (descricaoLancamento, dataLancamento, valorLancamento, valorSaldo, idPessoa, idOperacao) 
						 values (descricao, dia, valor, saldo, codigoPessoa, operacao);
        update Pessoas set valorPessoa = saldo where idPessoa = codigoPessoa;
	end
DELIMITER ; 

-- Atualiza Registro
DELIMITER //
create procedure SP_UpdatePessoa (id int, valor decimal(10,2))
	begin
		update Pessoas  
			set valorPessoa = valor
		where idPessoa = id;
	end
DELIMITER ;

/* FUNCTIONS */
select sum(valorLancamento) SOMA from Lancamentos where idOperacao = 1 and idPessoa = 3;

/*///////////////////////////////////////////////////////////////////////////////////////////////////*/
/* ATUALIZAÇÂO - 06/12/2018 */
/*///////////////////////////////////////////////////////////////////////////////////////////////////*/

/* TABELA CLIENTE */
alter table Usuario add column (nomePessoa varchar(30) not null);
update Usuario set nomePessoa = 'administrador' where idUsuario = 1;

create view VW_Usuario as 
	select u.idUsuario, u.nomeUsuario, u.nomePessoa, u.administrador
    from Usuario u;

-- Insere Usuarios
DELIMITER //
create procedure SP_InsertUsuario (nome varchar(30), usuario varchar(30), senha varchar(30), admin bool)
	begin
		insert into Usuario ( nomeUsuario, nomePessoa, senhaUsuario, administrador)
        values (nome, usuario, senha, admin);
	end
DELIMITER ;

-- Atualiza Usuarios
DELIMITER //
create procedure SP_UpdateUsuario(id int, nome varchar(30), usuario varchar(30), senha varchar(30), admin bool)
	begin
		update Usuario 
        set nomeUsuario = usuario,
			nomePessoa = nome,
            senhaUsuario = senha,
            administrador = admin
		where idUsuario = id;
	end
DELIMITER ;

-- Exclui usuario
DELIMITER //
create procedure SP_DeleteUsuario (id int)
	begin
		delete from Usuario where idUsuario = id; 
    end
DELIMITER ;




/* Fim atualização */




