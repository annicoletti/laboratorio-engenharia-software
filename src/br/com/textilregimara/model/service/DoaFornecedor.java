package br.com.textilregimara.model.service;

/**
 *
 * @author NICOLETTI A.
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import br.com.textilregimara.model.data.DataConnection;
import br.com.textilregimara.model.entities.Fornecedor;
import br.com.textilregimara.model.data.MapeamentoDB;

public class DoaFornecedor {

    public static int getRows() {

        DataConnection dataConnection = new DataConnection();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String sql = "select * from Pessoas;";

        try {
            dataConnection.conectar();
            connection = dataConnection.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            resultSet.last();
            int linhas = resultSet.getRow();
            //System.out.println("Linhas: " + linhas);
            dataConnection.desconectar();
            return linhas;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return 0;
        }
    }

    public static List<Integer> getListInteger() {
        String sql = "select idPessoa from Pessoas";
        List<Integer> id = new ArrayList<>();
        DataConnection dc = new DataConnection();
        dc.conectar();

        try {

            Connection conn = dc.getConnection();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                id.add(rs.getInt("idPessoa"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dc.desconectar();
            return id;
        }

    }

    public Fornecedor getLastFornecedor() {
        DataConnection dc = new DataConnection();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String sql = "select * from Pessoas;";
        Fornecedor fornecedor = new Fornecedor();

        dc.conectar();
        connection = dc.getConnection();
        try {

            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            if (resultSet.last()) {
                fornecedor.setIdCliente(resultSet.getInt("idPessoa"));
                fornecedor.setNome(resultSet.getString("nomePessoa"));
                fornecedor.setSaldo(resultSet.getDouble("valorPessoa"));
            } else {
                fornecedor.setIdCliente(0);
                fornecedor.setNome("");
                fornecedor.setSaldo(0.0);
            }
            //System.out.println(fornecedor);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        dc.desconectar();
        return fornecedor;
    }

    public static int getCountFornecedor() {
        DataConnection dc = new DataConnection();

        String sql = "select count(*) TOTAL from Pessoas;";
        int total = 0;
        dc.conectar();
        Connection connection = dc.getConnection();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            resultSet.next();
            total = resultSet.getInt("TOTAL");
            System.out.println(total);

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            dc.desconectar();
            return total;
        }
    }

    public int getLastId() {
        DataConnection dc = new DataConnection();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String sql = "select * from Pessoas;";
        int lastId;

        dc.conectar();
        connection = dc.getConnection();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            if (resultSet.last()) {
                return resultSet.getInt("idPessoa");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        dc.desconectar();
        return 0;
    }

    public int insertFornecedor(String nomePessoa) {

        DataConnection dataConnection = new DataConnection();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String sql = "insert into Pessoas (nomePessoa) value ('" + nomePessoa + "');";

        dataConnection.conectar();
        connection = dataConnection.getConnection();
        try {
            statement = connection.createStatement();
            statement.executeUpdate(sql);
            dataConnection.desconectar();
            return 1;
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            dataConnection.desconectar();
        }
        return 0;
    }

    public int excluirFornecedor(String idFornecedor) {
        int delete = 0;
        if (DoaLancamentos.deleteRegistroById(Integer.parseInt(idFornecedor)) == 0) {

            DataConnection dc = new DataConnection();
            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;
            String sql = "delete from Pessoas where idPessoa = " + idFornecedor + ";";

            dc.conectar();
            connection = dc.getConnection();
            try {
                statement = connection.createStatement();
                statement.executeUpdate(sql);
                delete = statement.getUpdateCount();
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                dc.desconectar();
            }
        }
        return delete;
    }

    public void alterar(String codigo, String nome) {

        DataConnection dc = new DataConnection();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String sql = "update Pessoas set nomePessoa = '" + nome + "' where idPessoa = " + codigo + ";";
        dc.conectar();

        connection = dc.getConnection();
        try {
            statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            dc.desconectar();
        }
    }

    public static void alterar(Fornecedor f) {

        String sql = "call SP_UpdatePessoa (?,?);";
        DataConnection dc = new DataConnection();
        dc.conectar();

        try {
            Connection conn = dc.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, f.getIdCliente());
            pstm.setDouble(2, f.getRegistro(0).getSaldo());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            dc.desconectar();
        }
    }

    public static void alterar2(Fornecedor f) {
        String sql = "update Pessoas set valorPessoa = 0 where idPessoa = " + f.getSaldo() + " ;";
        DataConnection dc = new DataConnection();
        dc.conectar();

        try {
            Connection conn = dc.getConnection();
            Statement pstm = conn.createStatement();
            pstm.execute(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            dc.desconectar();
        }
    }

    public List<Fornecedor> buscar(String palavra, int nColuna) {
        List<Fornecedor> resultado = new ArrayList<>();
        String coluna = "";
        switch (nColuna) {
            case (1): {
                coluna = "idPessoa";
                break;
            }
            case (2): {
                coluna = "nomePessoa";
                break;
            }
            case (3): {
                coluna = "valorPessoa";
                break;
            }
        }
        String sql = "select * from Pessoas where " + coluna + " like '%" + palavra + "%';";
        DataConnection dc = new DataConnection();

        Connection conn = null;
        Statement stm = null;
        ResultSet rs = null;

        dc.conectar();
        conn = dc.getConnection();

        try {
            stm = conn.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                resultado.add(new Fornecedor(rs.getInt("idPessoa"), rs.getString("nomePessoa"), rs.getDouble("valorPessoa")));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            dc.desconectar();
            return resultado;
        }
    }

    public Fornecedor buscar(String byId) {
        DataConnection dc = new DataConnection();
        String sql = "select p.idPessoa, p.nomePessoa, p.valorPessoa from Pessoas p where idPessoa  =  " + byId + " ;";

        dc.conectar();

        Fornecedor fornecedor = new Fornecedor();

        Connection conn = dc.getConnection();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            if (rs.next()) {
                fornecedor.setIdCliente(rs.getInt("idPessoa"));
                fornecedor.setNome(rs.getString("nomePessoa"));
                fornecedor.setSaldo(rs.getDouble("valorPessoa"));
            } else {
                fornecedor = null;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            fornecedor = null;
        } finally {
            dc.desconectar();
            return fornecedor;
        }
    }

    public Fornecedor buscarWithPreparedStatement(int byId) {
        DataConnection dc = new DataConnection();
        //String sql = "select p.idPessoa, p.nomePessoa, p.valorPessoa from pessoas p where idPessoa  =  ? ;";
        String sql = "select * from VW_Pessoas where CODIGO = ?;";

        dc.conectar();

        Fornecedor fornecedor = new Fornecedor();

        Connection conn = dc.getConnection();

        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, byId);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                fornecedor.setIdCliente(rs.getInt("CODIGO"));
                fornecedor.setNome(rs.getString("NOME"));
                fornecedor.setSaldo(rs.getDouble("SALDO"));
            } else {
                fornecedor = null;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            fornecedor = null;
        } finally {
            dc.desconectar();
            return fornecedor;
        }
    }

    public static List<Fornecedor> catchAllFornecedores() {

        List<Fornecedor> resultado = new ArrayList<>();
        String sql = "select * from Pessoas;";
        DataConnection dc = new DataConnection();
        dc.conectar();

        Connection conn = dc.getConnection();

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                resultado.add(new Fornecedor(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            return resultado;
        }
    }
}
