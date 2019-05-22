/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.textilregimara.view.screen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import br.com.textilregimara.model.data.DataConnection;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Administrador
 */
public class TelaConfiguracaoSql extends javax.swing.JFrame {

    private DataConnection dataConnection;
    /**
     * Creates new form configuracaoSql
     */
    public TelaConfiguracaoSql() {
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
        jLabelPath = new javax.swing.JLabel();
        jTextFieldPath = new javax.swing.JTextField();
        jLabelDatabaseName = new javax.swing.JLabel();
        jTextFieldDatabaseName = new javax.swing.JTextField();
        jPanelAuthentication = new javax.swing.JPanel();
        jLabelUser = new javax.swing.JLabel();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jLabelPassword = new javax.swing.JLabel();
        jTextFieldUser = new javax.swing.JTextField();
        jPanelDatabase = new javax.swing.JPanel();
        jLabelServerName = new javax.swing.JLabel();
        jTextFieldServerName = new javax.swing.JTextField();
        jLabelConnectPort = new javax.swing.JLabel();
        jTextFieldConnectPort = new javax.swing.JTextField();
        jPanelButton = new javax.swing.JPanel();
        jButtonSair = new javax.swing.JButton();
        jButtonGravar = new javax.swing.JButton();
        jButtonConfigurar = new javax.swing.JButton();
        jButtonTestar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelStatus = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        jMenuItemAbrir = new javax.swing.JMenuItem();
        jMenuItemTestar = new javax.swing.JMenuItem();
        jMenuItemGravar = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuração do Banco de Dados");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Database"));

        jLabelPath.setText("Path:");

        jLabelDatabaseName.setText("Database Name:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldDatabaseName)
                    .addComponent(jTextFieldPath)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPath)
                            .addComponent(jLabelDatabaseName))
                        .addGap(0, 326, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPath)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelDatabaseName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldDatabaseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 151, 438, 150);

        jPanelAuthentication.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Authentication"));

        jLabelUser.setText("User:");

        jLabelPassword.setText("Password:");

        javax.swing.GroupLayout jPanelAuthenticationLayout = new javax.swing.GroupLayout(jPanelAuthentication);
        jPanelAuthentication.setLayout(jPanelAuthenticationLayout);
        jPanelAuthenticationLayout.setHorizontalGroup(
            jPanelAuthenticationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAuthenticationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAuthenticationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelPassword)
                    .addComponent(jLabelUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAuthenticationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                    .addComponent(jTextFieldUser))
                .addContainerGap())
        );
        jPanelAuthenticationLayout.setVerticalGroup(
            jPanelAuthenticationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAuthenticationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAuthenticationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUser)
                    .addComponent(jTextFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAuthenticationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword)
                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelAuthentication);
        jPanelAuthentication.setBounds(10, 304, 438, 106);

        jPanelDatabase.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()), "Database"));

        jLabelServerName.setText("Server Name:");

        jLabelConnectPort.setText("Connect Port:");

        javax.swing.GroupLayout jPanelDatabaseLayout = new javax.swing.GroupLayout(jPanelDatabase);
        jPanelDatabase.setLayout(jPanelDatabaseLayout);
        jPanelDatabaseLayout.setHorizontalGroup(
            jPanelDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatabaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldServerName)
                    .addGroup(jPanelDatabaseLayout.createSequentialGroup()
                        .addGroup(jPanelDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelServerName)
                            .addComponent(jLabelConnectPort))
                        .addGap(0, 343, Short.MAX_VALUE))
                    .addComponent(jTextFieldConnectPort))
                .addContainerGap())
        );
        jPanelDatabaseLayout.setVerticalGroup(
            jPanelDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatabaseLayout.createSequentialGroup()
                .addComponent(jLabelServerName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldServerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelConnectPort)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldConnectPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelDatabase);
        jPanelDatabase.setBounds(10, 11, 438, 147);

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonGravar.setText("Gravar");
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });

        jButtonConfigurar.setText("Configurar");
        jButtonConfigurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfigurarActionPerformed(evt);
            }
        });

        jButtonTestar.setText("Testar");
        jButtonTestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTestarActionPerformed(evt);
            }
        });

        jLabelStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/textilregimara/model/image/icon/IcoDB_null.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelStatus)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelButtonLayout = new javax.swing.GroupLayout(jPanelButton);
        jPanelButton.setLayout(jPanelButtonLayout);
        jPanelButtonLayout.setHorizontalGroup(
            jPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonTestar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButtonConfigurar)
                .addGap(18, 18, 18)
                .addComponent(jButtonGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelButtonLayout.setVerticalGroup(
            jPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGravar)
                    .addComponent(jButtonSair)
                    .addComponent(jButtonConfigurar)
                    .addComponent(jButtonTestar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelButtonLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelButton);
        jPanelButton.setBounds(10, 417, 427, 62);

        jMenuArquivo.setText("Arquivo");

        jMenuItemAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemAbrir.setText("Abrir");
        jMenuItemAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAbrirActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemAbrir);

        jMenuItemTestar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemTestar.setText("Testar");
        jMenuItemTestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTestarActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemTestar);

        jMenuItemGravar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemGravar.setText("Gravar");
        jMenuItemGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGravarActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemGravar);

        jMenuBar1.add(jMenuArquivo);

        jMenuSobre.setText("Sobre");

        jMenuItem4.setText("Ajuda");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenuSobre.add(jMenuItem4);

        jMenuBar1.add(jMenuSobre);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(476, 558));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(TelaLogin.IMAGE_PATH + "icone.png")));
    }    
    
    private void gravar(DataConnection obj) {
        JFileChooser chooser = new JFileChooser();
        chooser.showSaveDialog(this);

        String file = null;
        
        try{
            file = chooser.getSelectedFile().getAbsolutePath();
        }
        catch(Exception e ){
            file = null;
        }
        
        if (file != null) {
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(file, false));
                
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
                out.writeObject(obj);
                out.close();
                JOptionPane.showMessageDialog(null, "Arquivo salvo com sucesso");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            }
        }
    }

    private void gravar(String local) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(local, false));
            bw.write(jTextFieldServerName.getText() + ";");
            bw.write(jTextFieldConnectPort.getText() + ";");
            bw.write(jTextFieldPath.getText() + ";");
            bw.write(jTextFieldDatabaseName.getText() + ";");
            bw.write(jTextFieldUser.getText() + ";");
            bw.write(jPasswordFieldPassword.getSelectedText());
            bw.close();
            JOptionPane.showMessageDialog(null, "Arquivo salvo com sucesso");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed
        // TODO add your handling code here:
        gravar(this.dataConnection);
    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        TelaLogin login = new TelaLogin();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonTestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTestarActionPerformed
        // TODO add your handling code here:
        this.dataConnection.setServerName(jTextFieldServerName.getText());
        this.dataConnection.setPort(jTextFieldConnectPort.getText());
        this.dataConnection.setPath(jTextFieldPath.getText());
        this.dataConnection.setDatabaseName(jTextFieldDatabaseName.getText());
        this.dataConnection.setUser(jTextFieldUser.getText());
        this.dataConnection.setPassword(jPasswordFieldPassword.getSelectedText());
       
        dataConnection.conectar();
        Connection conn = dataConnection.getConnection();
        
        JOptionPane.showMessageDialog(null, conn.toString() );
        try {
            dataConnection.conectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            dataConnection.desconectar();
        }
    }//GEN-LAST:event_jButtonTestarActionPerformed

    private void jMenuItemTestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTestarActionPerformed
        // TODO add your handling code here:
        jButtonTestarActionPerformed(evt);
    }//GEN-LAST:event_jMenuItemTestarActionPerformed

    private void jMenuItemGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGravarActionPerformed
        // TODO add your handling code here:
        jButtonGravarActionPerformed(evt);
    }//GEN-LAST:event_jMenuItemGravarActionPerformed

    private void jMenuItemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAbrirActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(jMenuArquivo);
        File file = null;
        
        try{
            file = chooser.getSelectedFile();
            ObjectInputStream ow = new ObjectInputStream(new FileInputStream(file));
            this.dataConnection = (DataConnection) ow.readObject();
            System.out.println(">>>>>>>>>>>> " + dataConnection);
        }
        catch(Exception e){
            file = null;
        }
        
        if(file != null){
            completaCampos(file);
        }
    }//GEN-LAST:event_jMenuItemAbrirActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Configurador de Banco de dados 1.0\nMySQL\nPostgres");
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButtonConfigurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfigurarActionPerformed
        // TODO add your handling code here:
        configurar();
    }//GEN-LAST:event_jButtonConfigurarActionPerformed

    public void configurar() {
        gravar("%homeDrive%conf.ini");
    }

    public void completaCampos(File file) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file.getAbsolutePath()));
            String info[] = br.readLine().split(";");
            jTextFieldServerName.setText(info[0]);
            jTextFieldConnectPort.setText(info[1]);
            jTextFieldPath.setText(info[2]);
            jTextFieldDatabaseName.setText(info[3]);
            jTextFieldUser.setText(info[4]);
            jPasswordFieldPassword.setText(info[5]);
            br.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(TelaConfiguracaoSql.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConfiguracaoSql.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConfiguracaoSql.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConfiguracaoSql.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConfiguracaoSql().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfigurar;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonTestar;
    private javax.swing.JLabel jLabelConnectPort;
    private javax.swing.JLabel jLabelDatabaseName;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelPath;
    private javax.swing.JLabel jLabelServerName;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItemAbrir;
    private javax.swing.JMenuItem jMenuItemGravar;
    private javax.swing.JMenuItem jMenuItemTestar;
    private javax.swing.JMenu jMenuSobre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelAuthentication;
    private javax.swing.JPanel jPanelButton;
    private javax.swing.JPanel jPanelDatabase;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldConnectPort;
    private javax.swing.JTextField jTextFieldDatabaseName;
    private javax.swing.JTextField jTextFieldPath;
    private javax.swing.JTextField jTextFieldServerName;
    private javax.swing.JTextField jTextFieldUser;
    // End of variables declaration//GEN-END:variables

    //More Variables declarations
    private String serverName;
    private String port;
    private String path;
    private String databaseName;
    private String user;
    private String password;
    private boolean teste = false;

}
