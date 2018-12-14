package br.com.textilregimara.model.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import br.com.textilregimara.model.data.DataConnection;
import br.com.textilregimara.model.data.MapeamentoDB;
import br.com.textilregimara.model.entities.Fornecedor;
import br.com.textilregimara.model.entities.Registro;
import br.com.textilregimara.model.enums.Operacao;
import javax.swing.JOptionPane;

/**
 *
 * @author NICOLETTI A.
 */
public class DoaLancamentos {

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    public static List<Registro> getLancamentosCompleto(Fornecedor f) {

        DataConnection dc = new DataConnection(MapeamentoDB.CONF);
        dc.conectar();

        List<Registro> resultado = new ArrayList<>();
        String sql = "select * from VW_ResgistroCompleto where ID = ? ;";

        try {
            Connection conn = dc.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, f.getIdCliente());
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {

                resultado.add(new Registro(rs.getInt(1),
                        rs.getTimestamp("DIA"),
                        rs.getString("DESCRICAO"),
                        Operacao.valueOf(rs.getString("TIPO")),
                        rs.getDouble("VALOR"),
                        rs.getDouble("SALDO")));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            dc.desconectar();
            return resultado;
        }
    }

    public static List<Registro> getLancamentos(Fornecedor f) {

        DataConnection dc = new DataConnection(MapeamentoDB.CONF);
        dc.conectar();

        List<Registro> resultado = new ArrayList<>();
        String sql = "select * from VW_Registros where ID = ? ;";

        try {
            Connection conn = dc.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, f.getIdCliente());
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {

                resultado.add(new Registro(rs.getInt("ID"),
                        rs.getTimestamp("DIA"),
                        rs.getString("DESCRICAO"),
                        Operacao.valueOf(rs.getString("TIPO")),
                        rs.getDouble("VALOR"),
                        rs.getDouble("SALDO")));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            dc.desconectar();
            return resultado;
        }
    }

    public static int deleteRegistroById(int id) {

        int r = JOptionPane.showConfirmDialog(null, "DESEJA APAGAR TODOS OS LANÇAMENTOS DESTA PESSOA?");
        int n = 0;

        if (r == 0) {
            DataConnection dc = new DataConnection(MapeamentoDB.CONF);
            dc.conectar();
            String sql = "delete from Lancamentos where idPessoa = ? ;";

            try {
                Connection conn = dc.getConnection();
                PreparedStatement pstm = conn.prepareStatement(sql);
                pstm.setInt(1, id);
                n = pstm.executeUpdate();
                JOptionPane.showMessageDialog(null, n + " : Lançamentos Apagados");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                dc.desconectar();
            }
        }
        return r;
    }

    public static void deleteRegistroByIdWithoutConfirm(int id) {

        int n = 0;
        DataConnection dc = new DataConnection(MapeamentoDB.CONF);
        dc.conectar();
        String sql = "delete from Lancamentos where idPessoa = ? ;";

        try {
            Connection conn = dc.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            n = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dc.desconectar();
        }
    }

    public static Double totalCredito(Integer idPessoa) {
        String sql = "select sum(valorLancamento) SOMA from Lancamentos where idOperacao = 2 and idPessoa = ?;";
        DataConnection dc = new DataConnection(MapeamentoDB.CONF);
        dc.conectar();
        double total = 0;
        try {
            Connection conn = dc.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, idPessoa);
            ResultSet rs = pstm.executeQuery();
            rs.next();
            total = rs.getDouble(1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dc.desconectar();
            return total;
        }
    }

    public static Double totalDebito(Integer idPessoa) {
        String sql = "select sum(valorLancamento) SOMA from Lancamentos where idOperacao = 1 and idPessoa = ?;";
        DataConnection dc = new DataConnection(MapeamentoDB.CONF);
        dc.conectar();
        double total = 0;
        try {
            Connection conn = dc.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, idPessoa);
            ResultSet rs = pstm.executeQuery();
            rs.next();
            total = rs.getDouble(1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dc.desconectar();
            return total;
        }
    }

    public static void salvaUltimoLancamento(Fornecedor f) {
        //call SP_InsertRegistro ('descricao','2010/12/30',100,3,1);
        String sql = "call SP_InsertRegistro (?,?,?,?,?,?);";

        DataConnection dc = new DataConnection(MapeamentoDB.CONF);
        dc.conectar();

        try {
            Connection conn = dc.getConnection();
            PreparedStatement pstm = conn.prepareCall(sql);

            pstm.setString(1, f.getLastRegistro().getDescricao());
            pstm.setString(2, sdf.format(f.getLastRegistro().getData()));
            pstm.setDouble(3, f.getLastRegistro().getValor());
            pstm.setDouble(4, f.getLastRegistro().getSaldo());
            pstm.setInt(5, f.getLastRegistro().getIdCliente());
            pstm.setInt(6, f.getLastRegistro().getOperacao().getTipo());

            pstm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dc.desconectar();
        }
    }

    public static void savePackLancamentos(Fornecedor f) {

        // call SP_InsertRegistro ('descricao','2010/12/30',100,3,1);
        String sql = "call SP_InsertRegistro (?,?,?,?,?,?);";
        List<Registro> registro = f.getRegistro();

        DataConnection dc = new DataConnection(MapeamentoDB.CONF);
        dc.conectar();

        try {
            Connection conn = dc.getConnection();
            PreparedStatement pstm = conn.prepareCall(sql);
            for (Registro r : registro) {
                pstm.setString(1, r.getDescricao());
                pstm.setString(2, sdf.format(r.getData()));
                pstm.setDouble(3, r.getValor());
                pstm.setDouble(4, r.getSaldo());
                pstm.setInt(5, f.getIdCliente());
                pstm.setInt(6, r.getOperacaoInt());
                pstm.execute();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
