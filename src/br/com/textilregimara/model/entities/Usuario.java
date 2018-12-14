package br.com.textilregimara.model.entities;

/**
 *
 * @author NICOLETTI A.
 */
public class Usuario {
    
    private Integer idUsuario;
    private String nome;
    private String usuario;
    private String senha;
    private Boolean administrador;
    
    public Usuario(){};

    /**
     * Instância para Resultado do DB
     * @param idUsuario
     * @param nome
     * @param usuario
     * @param administrador 
     */
    public Usuario(Integer idUsuario, String nome, String usuario, Boolean administrador) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.usuario = usuario;
        this.administrador = administrador;
    }  

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario(String nome, String usuario, String senha, Boolean administrador) {
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
        this.administrador = administrador;
    }

    public String getNome() {
        return nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public Boolean getAdministrador() {
        return administrador;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setAdministrador(Boolean administrador) {
        this.administrador = administrador;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nome=" + nome + ", usuario=" + usuario + ", senha=" + senha + ", administrador=" + administrador + '}';
    }   

}
