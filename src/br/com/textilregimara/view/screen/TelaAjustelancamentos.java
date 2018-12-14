/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.textilregimara.view.screen;

import br.com.textilregimara.model.entities.Fornecedor;
import br.com.textilregimara.model.entities.Registro;
import br.com.textilregimara.model.service.DoaFornecedor;
import br.com.textilregimara.model.service.DoaLancamentos;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class TelaAjustelancamentos extends javax.swing.JFrame {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Fornecedor fornecedor;
    private TelaLancamentos telaLancamentos;
    
    /**
     * Creates new form TelaAjustelancamentos
     */
    public TelaAjustelancamentos() {
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableLancamentos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButtonAlterar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jTextFieldNumeroLancamento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonRefatorarLancamentos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableLancamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NUMERO", "DATA", "DESCRICAO", "OPERAÇÃO", "VALOR R$", "SALDO R$"
            }
        ));
        jScrollPane2.setViewportView(jTableLancamentos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 979, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonAlterar.setText("ALTERAR");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonSair.setText("CANCELAR");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jLabel1.setText("NÚMERO DO LANÇAMENTO: ");

        jButtonRefatorarLancamentos.setBackground(new java.awt.Color(255, 0, 0));
        jButtonRefatorarLancamentos.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonRefatorarLancamentos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRefatorarLancamentos.setText("REFATORAR LANÇAMENTOS");
        jButtonRefatorarLancamentos.setEnabled(false);
        jButtonRefatorarLancamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefatorarLancamentosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldNumeroLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButtonRefatorarLancamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                .addComponent(jButtonSair)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButtonAlterar)
                    .addComponent(jTextFieldNumeroLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSair)
                    .addComponent(jButtonRefatorarLancamentos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1043, 701));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(TelaLogin.IMAGE_PATH + "icone.png")));
    }   
    
    public void saveFrame(TelaLancamentos frame){
        this.telaLancamentos = frame;
    }
    
    private void createTable(){
        geraTabela(DoaLancamentos.getLancamentos(fornecedor));
    }
    
    public void atualizaListaRegistro(Fornecedor fornecedor){
        this.fornecedor = fornecedor;
        System.out.println(this.fornecedor);
    }
        
    private void geraTabela( List<Registro> resultado ){
        DefaultTableModel tabela = (DefaultTableModel) jTableLancamentos.getModel();
        tabela.setNumRows(0);
       
        for (int i = 0; i < resultado.size(); i++) {
            tabela.addRow(new Object[]{
                i+1,
                sdf.format(resultado.get(i).getData()),
                resultado.get(i).getDescricao(),
                resultado.get(i).getOperacao(),
                String.format("%.2f",resultado.get(i).getValor()),
                String.format("%.2f",resultado.get(i).getSaldo())
            });            
        } 
    }
    public void geraTabela(){
        List<Registro> resultado = fornecedor.getRegistro();
        DefaultTableModel tabela = (DefaultTableModel) jTableLancamentos.getModel();
        tabela.setNumRows(0);
       
        for (int i = 0; i < resultado.size(); i++) {
            tabela.addRow(new Object[]{
                i+1,
                sdf.format(resultado.get(i).getData()),
                resultado.get(i).getDescricao(),
                resultado.get(i).getOperacao(),
                //String.format("%.2f",resultado.get(i).getValor()),
                //String.format("%.2f",resultado.get(i).getSaldo())
                java.text.NumberFormat.getCurrencyInstance(new Locale("pt","br")).format(resultado.get(i).getValor()),
                java.text.NumberFormat.getCurrencyInstance(new Locale("pt","br")).format(resultado.get(i).getSaldo())
            });            
        } 
    }
    
    
    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        // TODO add your handling code here:
        try{
            if(jTextFieldNumeroLancamento.getText()==null) throw new Exception();
            int n = Integer.parseInt(jTextFieldNumeroLancamento.getText());
            if(n<=fornecedor.getRegistro().size() ){
                TelaAlteracao telaAlteracao = new TelaAlteracao();
                telaAlteracao.defineFields(fornecedor, Integer.parseInt(jTextFieldNumeroLancamento.getText()));
                telaAlteracao.saveFrame(this);
                telaAlteracao.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "Digite um número válido");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Digite um número");
        }        
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        telaLancamentos.carregaFrames();
        telaLancamentos.desativaBotaoCorrigir();
        this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonRefatorarLancamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefatorarLancamentosActionPerformed
        // TODO add your handling code here:
        DoaLancamentos.deleteRegistroByIdWithoutConfirm(fornecedor.getIdCliente());
        DoaLancamentos.savePackLancamentos(fornecedor);
        Double temp = fornecedor.getRegistro(0).getSaldo();
        DoaFornecedor.alterar(fornecedor);
        telaLancamentos.carregaFrames();
        this.dispose();
    }//GEN-LAST:event_jButtonRefatorarLancamentosActionPerformed

    public void ativaBotaoRefatoramento(){
        this.jButtonRefatorarLancamentos.setEnabled(true);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAjustelancamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAjustelancamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAjustelancamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAjustelancamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new TelaAjustelancamentos().setVisible(true);
            }
        });
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonRefatorarLancamentos;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableLancamentos;
    private javax.swing.JTextField jTextFieldNumeroLancamento;
    // End of variables declaration//GEN-END:variables
}
