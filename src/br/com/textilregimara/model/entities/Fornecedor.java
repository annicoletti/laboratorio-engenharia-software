package br.com.textilregimara.model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import br.com.textilregimara.model.enums.Operacao;

/**
 *
 * @author NICOLETTI A.
 */
public class Fornecedor {
    
    private Integer idCliente;
    private String nome;
    private Double saldo;
    
    private List<Registro> registro = new ArrayList<>();

    public Fornecedor() {
    }

    public Fornecedor(Integer idCliente, String nome, Double saldo) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.saldo = saldo;
    }

    public List<Registro> getRegistro(){
        return this.registro;
    }
    
    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setRegistro(List<Registro> registro) {
        this.registro = registro;
    }    

    public Registro getRegistro(int i) {
        return registro.get(i);
    }
        
    public Registro getLastRegistro() {
        return registro.get( registro.size() -1 );
    }
        
    public void debita(Double d, String descricao){
        this.saldo += d;
        registro.add(new Registro(this.idCliente, new Date(), descricao, Operacao.DEBITO, d, this.saldo));
    }
 
     public void credita(Double d, String descricao){
        this.saldo -= d;
        registro.add(new Registro(this.idCliente, new Date(), descricao, Operacao.CREDITO, d, this.saldo));
    }
     
    public void alteraValorRegistro(int id, Date dataRegistro, String descricao, Operacao operacao, Double valor ){
        registro.get(id).setData(dataRegistro);
        registro.get(id).setDescricao(descricao);
        registro.get(id).setOperacao(operacao);
        registro.get(id).setValor(valor);
        
        //Refatorar valores
        this.refatorarRegistros();        
    }
    
    public void refatorarRegistros(){
        this.setSaldo(0.0);
        //System.out.println(">>>>>>>>>>>>>> " + this.saldo + "       " + registro.size());
        for(int i = (registro.size()-1); i>=0; i-- ){
            if(registro.get(i).getOperacaoInt() == 1){
                this.setSaldo( this.saldo += registro.get(i).getValor());
                registro.get(i).setSaldo(this.saldo);                
                //System.out.println("D");
            }
            else{
                this.setSaldo( this.saldo -= registro.get(i).getValor());
                registro.get(i).setSaldo(this.saldo);
                //System.out.println("C");
            }
            //System.out.println(i + " SALDO= " + this.saldo + " SALDO= " +registro.get(i).getSaldo());
        }
    }

    @Override
    public String toString() {
        return "Fornecedor{" + "idCliente=" + idCliente + ", nome=" + nome + ", saldo=" + saldo + ", registro=" + registro + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.idCliente);
        hash = 59 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fornecedor other = (Fornecedor) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.idCliente, other.idCliente)) {
            return false;
        }
        return true;
    }
    
}
