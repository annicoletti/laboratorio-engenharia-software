package br.com.textilregimara.application;

import java.util.Date;
import java.util.Scanner;
import br.com.textilregimara.model.entities.Fornecedor;
import br.com.textilregimara.model.entities.Registro;
import br.com.textilregimara.model.enums.Operacao;

/**
 *
 * @author NICOLETTI A.
 */
public class Program {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        Registro r1 = new Registro(10, new Date(), "abobora", Operacao.CREDITO, 100.0, 20.0);
        Registro r2 = new Registro(10, new Date(), "abobora", Operacao.DEBITO, 100.0, 20.0);
        
        System.out.println( r1.getOperacao() + " = " + r1.getOperacaoInt() );
        System.out.println( r2.getOperacao() + " = " + r2.getOperacaoInt() );
        
        r1.setOperacaoInt(1);
        r2.setOperacaoInt(2);
        
        System.out.println( r1.getOperacao() + " = " + r1.getOperacaoInt() );
        System.out.println( r2.getOperacao() + " = " + r2.getOperacaoInt() );
        
        
        System.out.println("-----------------------------------");
        
        Fornecedor[] fornecedor = new Fornecedor[3];
        for (int i = 0; i < 3; i++) {
            fornecedor[i] = new Fornecedor(i, "fornecedor " + i, 0.0);
        }
        
        
        boolean sair = false;
        while(!sair){
            System.out.println("-------------------");
            System.out.println("Opções");
            System.out.println("1 - Debitar");
            System.out.println("2 - Creditar");
            System.out.println("0 - Sair");
            System.out.println();
            System.out.print("Opcao: ");
                        
            int opcao = scan.nextInt();
            
            switch (opcao){
                case 1 : {
                    //System.out.println("1");
                    System.out.print("ID Cliente: ");
                    int idCliente = scan.nextInt();
                    System.out.print("Valor: R$ ");
                    double valor = scan.nextDouble();
                    fornecedor[idCliente].debita(valor,"TESTE");
                    break;
                }
                case 2 : {
                    //System.out.println("2");
                    System.out.print("ID Cliente: ");
                    int idCliente = scan.nextInt();
                    System.out.print("Valor: R$ ");
                    double valor = scan.nextDouble();
                    fornecedor[idCliente].credita(valor,"TESTE");
                    break;
                }
                case 0 : {
                    //.out.println("0");
                    System.out.println("Saindo...");
                    sair = true;
                    break;
                }
            }
            
            for(Fornecedor f : fornecedor){
                System.out.println(f);
            }
            
        }
        
    }
    
}
