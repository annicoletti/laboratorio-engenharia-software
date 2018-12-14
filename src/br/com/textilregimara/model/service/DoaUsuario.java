package br.com.textilregimara.model.service;

import br.com.textilregimara.model.data.DataConnection;
import br.com.textilregimara.model.data.MapeamentoDB;
import br.com.textilregimara.model.entities.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author NICOLETTI A.
 */
public class DoaUsuario {
    
    public static void deleteUsuario(Usuario u) {     
        String sql = "call SP_DeleteUsuario(?);";
        
        DataConnection dc = new DataConnection(MapeamentoDB.CONF);
        dc.conectar();
                
        try{
            Connection conn = dc.getConnection();
            PreparedStatement pstm = conn.prepareCall(sql);
            
            pstm.setInt(1, u.getIdUsuario());
            pstm.executeUpdate();
            
            pstm.close();
            conn.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"ERRO: " + e.getMessage() );
        }
    }
    
    public static void updateUsuario(Usuario u) {     
        String sql = "call SP_UpdateUsuario(?, ?, ?, ?, ?);";
        
        DataConnection dc = new DataConnection(MapeamentoDB.CONF);
        dc.conectar();
                
        try{
            Connection conn = dc.getConnection();
            PreparedStatement pstm = conn.prepareCall(sql);
            
            pstm.setInt(1, u.getIdUsuario());
            pstm.setString(2, u.getNome());
            pstm.setString(3, u.getUsuario());
            pstm.setString(4, u.getSenha());
            pstm.setBoolean(5, u.getAdministrador());
            pstm.executeUpdate();
            
            pstm.close();
            conn.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"ERRO: " + e.getMessage() );
        }
    }
    
    public static void insertUsuario(Usuario u) {     
        String sql = "call SP_InsertUsuario(?, ?, ?, ?);";
        
        DataConnection dc = new DataConnection(MapeamentoDB.CONF);
        dc.conectar();
        
        try{
            Connection conn = dc.getConnection();
            PreparedStatement pstm = conn.prepareCall(sql);
            
            pstm.setString(1, u.getUsuario());
            pstm.setString(2, u.getNome());
            pstm.setString(3, u.getSenha());
            pstm.setBoolean(4, u.getAdministrador());
            pstm.execute();
            
            pstm.close();
            conn.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"ERRO: " + e.getMessage() );
        }
    }
    
    public static List<Usuario> getTodosUsuarios(){
        
        String sql = "select * from VW_Usuario;";
        List<Usuario> resultado = new ArrayList<>();
        
        DataConnection dc = new DataConnection(MapeamentoDB.CONF);
        dc.conectar();
        
        try{
            Connection conn = dc.getConnection();
            PreparedStatement pstm = conn.prepareCall(sql);
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()){
                resultado.add(new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getBoolean(4) ));
            }
                       
            pstm.close();
            conn.close();           
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"ERRO: " + e.getMessage() );
        }
        finally{
            return resultado;
        }        
    }
}
