/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.textilregimara.model.enums;

/**
 *
 * @author Administrador
 */
public enum Operacao {
   
    DEBITO(1), CREDITO(2);
    
    private int tipo;

    private Operacao(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
}
