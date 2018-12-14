package br.com.textilregimara.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import br.com.textilregimara.model.enums.Operacao;

/**
 *
 * @author NICOLETTI A.
 */
public class Registro {
    
    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    
    private Integer idCliente;
    private Date data;
    private String descricao;
    private Operacao operacao;
    private Double valor;
    private Double saldo;

    public Registro() {
    }

    public Registro(Integer idCliente, Date data, String descricao, Operacao operacao, Double valor, Double saldo) {
        this.idCliente = idCliente;
        this.data = data;
        this.descricao = descricao;
        this.operacao = operacao;
        this.valor = valor;
        this.saldo = saldo;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Operacao getOperacao() {
        return operacao;
    }
    
    public int getOperacaoInt(){
        return operacao.getTipo();
    }

    public void setOperacaoInt(int i){
        this.operacao.setTipo(i);
    }
    
    public void setOperacao(Operacao operacao) {
        this.operacao = operacao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }    
    
    @Override
    public String toString() {
        return "Registro{" + "idCliente=" + idCliente + ", data=" + sdf.format(data) + ", descricao=" + descricao + ", operacao=" + operacao + ", valor=" + valor + ", saldo=" + saldo + ")";
    }

    
    
}
