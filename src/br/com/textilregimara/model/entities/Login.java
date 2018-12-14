package br.com.textilregimara.model.entities;

/**
 *
 * @author NICOLETTI A.
 */
public class Login {
    
    private Integer idUsuario;
    private String nomeUsuario;
    private String senhaUsuario;
    private Boolean administrador;

    public Login() {
    }

    public Login(String nomeUsuario, String senhaUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.senhaUsuario = senhaUsuario;
    }    

    public Login(Integer idUsuario, String nomeUsuario, String senhaUsuario, Boolean administrador) {
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.senhaUsuario = senhaUsuario;
        this.administrador = administrador;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public Boolean getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Boolean administrador) {
        this.administrador = administrador;
    }
    
    
    
}
