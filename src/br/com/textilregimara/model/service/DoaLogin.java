package br.com.textilregimara.model.service;

/**
 *
 * @author NICOLETTI A.
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.com.textilregimara.model.data.DataConnection;
import br.com.textilregimara.model.entities.Login;

public class DoaLogin {

    public static boolean selectUsuario(Login login) {
        Connection connection = null;
        DataConnection dataConnection = new DataConnection();
        dataConnection.conectar();
        connection = dataConnection.getConnection();
        String sql = "Select nomeUsuario, senhausUario from Usuario where nomeUsuario = '" + login.getNomeUsuario() + "';";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Login teste = new Login(resultSet.getString("nomeUsuario"), resultSet.getString("senhausUario"));

//                System.out.println( "DIGITADO: " + teste.getNomeUsuario() + " " + teste.getSenhaUsuario());
//                System.out.println( "NO BANCO: " + login.getNomeUsuario() + " " + login.getSenhaUsuario());
                if (teste.getSenhaUsuario().equals(login.getSenhaUsuario())) {
                    return true;
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
