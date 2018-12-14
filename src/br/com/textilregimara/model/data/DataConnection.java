package br.com.textilregimara.model.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author NICOLETTI A.
 */
public class DataConnection {

    private String serverName;
    private String port;
    private String path;
    private String databaseName;
    private String user;
    private String password;

    private Connection connection = null;

    public DataConnection(String serverName, String port, String path, String databaseName, String user, String password) {
        this.serverName = serverName;
        this.port = port;
        this.path = path;
        this.databaseName = databaseName;
        this.user = user;
        if(password.equals("")){
            this.password = null;
        }
        this.password = password;
    }

    public DataConnection(File conf) {
        try (BufferedReader br = new BufferedReader(new FileReader(conf))) {
            String string[] = br.readLine().split(";");
            this.serverName = string[0];
            this.port = string[1];
            this.path = string[2];
            this.databaseName = string[3];
            this.user = string[4];
            this.password = string[5];
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    @Override
    public String toString() {
        return "MySqlConnection{" + "serverName=" + serverName + ", port=" + port + ", path=" + path + ", databaseName=" + databaseName + ", user=" + user + ", password=" + password + '}';
    }

    public void conectar() {
        String url = "jdbc:" + this.serverName + "://" + this.path + ":" + this.port + "/" + this.databaseName + "?useSSL=false";
        try {
            connection = DriverManager.getConnection(url, this.user, this.password);
            //JOptionPane.showMessageDialog(null, "Conectado com sucesso no banco " + this.databaseName);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO CONECTAR: " + ex.getMessage());
        }
    }
    
    public void desconectar() {
        try {
            if (connection != null) {
                connection.close();
                //JOptionPane.showMessageDialog(null, "Connexão fechada com sucesso");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO DESCONECTAR: " + ex.getMessage());
        }
    }

}
