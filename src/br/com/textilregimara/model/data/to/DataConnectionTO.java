/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.textilregimara.model.data.to;

import java.io.Serializable;

import br.com.textilregimara.model.data.DataConnection;

/**
 *
 * @author nicoletti
 */
public class DataConnectionTO implements Serializable {
    
    private static long serialVersionUID = 1L;

    private String serverName;
    
    private String port;
    
    private String path;
    
    private String databaseName;
    
    private String user;
    
    private String password;

    public DataConnectionTO(){
    }
    
    public DataConnectionTO(String serverName, String port, String path, String databaseName, String user, String password){
        this.databaseName = databaseName;
        this.password = password;
        this.path = path;
        this.port = port;
        this.serverName = serverName;
        this.user = user;        
    }
    /**
     * Create an object DataConnectionTO from DataConnection to save it
     * 
     * @param obj
     */
    public DataConnectionTO(Object obj){
        if (obj instanceof DataConnection){
            DataConnection d = (DataConnection) obj;
            this.databaseName = d.getDatabaseName();
            this.password = d.getPassword();
            this.path = d.getPath();
            this.port = d.getPort();
            this.serverName = d.getServerName();
            this.user = d.getUser();
        }        
    }
    
    /**
     * @return the serverName
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * @param serverName the serverName to set
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * @return the port
     */
    public String getPort() {
        return port;
    }

    /**
     * @param port the port to set
     */
    public void setPort(String port) {
        this.port = port;
    }

    /**
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * @return the databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * @param databaseName the databaseName to set
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}