/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.textilregimara.view.screen;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import br.com.textilregimara.model.entities.Fornecedor;
import br.com.textilregimara.model.entities.Registro;
import br.com.textilregimara.model.service.DoaFornecedor;
import br.com.textilregimara.model.service.DoaLancamentos;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class TelaLancamentos extends javax.swing.JFrame {

    /**
     * Creates new form TelaLancamentos
     */
    public TelaLancamentos() {
        initComponents();
        setTotaisContas();
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabelStaticNome = new javax.swing.JLabel();
        jLabelStaticId = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jLabelNomePessoa = new javax.swing.JLabel();
        jLabelStaticSaldo = new javax.swing.JLabel();
        jLabelSaldo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jComboBoxOperacao = new javax.swing.JComboBox<>();
        jLabelIdPessoa = new javax.swing.JLabel();
        jTextFieldIdPessoa = new javax.swing.JTextField();
        jButtonCarregarPessoa = new javax.swing.JButton();
        jLabelValor = new javax.swing.JLabel();
        jLabelOperacao = new javax.swing.JLabel();
        jTextFieldValor = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();
        jButtonConfirmar = new javax.swing.JButton();
        jLabelDescricao = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        jButtonSair = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableExtrato = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabelTotalDebito = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelTotalCredito = new javax.swing.JLabel();
        jButtonCorrigir = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lançamentos");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelStaticNome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelStaticNome.setText("Nome:");

        jLabelStaticId.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelStaticId.setText("Id:");

        jLabelId.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabelNomePessoa.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabelStaticSaldo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelStaticSaldo.setText("Saldo:");

        jLabelSaldo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelStaticSaldo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelStaticNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelNomePessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelStaticId)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelStaticId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelStaticNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelNomePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelStaticSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jComboBoxOperacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DÉBITO", "CRÉDITO" }));
        jComboBoxOperacao.setEnabled(false);
        jComboBoxOperacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOperacaoActionPerformed(evt);
            }
        });

        jLabelIdPessoa.setText("ID PESSOA: ");

        jButtonCarregarPessoa.setText("CARREGAR");
        jButtonCarregarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCarregarPessoaActionPerformed(evt);
            }
        });

        jLabelValor.setText("VALOR R$:");

        jLabelOperacao.setText("OPERAÇÃO: ");

        jTextFieldValor.setEnabled(false);

        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonConfirmar.setText("CONFIRMAR");
        jButtonConfirmar.setEnabled(false);
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });

        jLabelDescricao.setText("DESCRIÇÃO:");

        jTextFieldDescricao.setEnabled(false);

        jButtonSair.setText("SAIR");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonConfirmar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabelIdPessoa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelOperacao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelValor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelDescricao))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextFieldIdPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCarregarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldValor)
                            .addComponent(jComboBoxOperacao, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdPessoa)
                    .addComponent(jTextFieldIdPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCarregarPessoa))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValor)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescricao)
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelOperacao)
                    .addComponent(jComboBoxOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonConfirmar)
                    .addComponent(jButtonSair))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableExtrato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATA", "DESCRIÇÃO", "OPERAÇÃO", "VALOR", "SALDO"
            }
        ));
        jTableExtrato.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableExtrato.setEnabled(false);
        jScrollPane1.setViewportView(jTableExtrato);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Totais"));

        jLabelTotalDebito.setText("0");

        jLabel4.setText("DÉBITOS: ");

        jLabel5.setText("CRÉDITOS: ");

        jLabelTotalCredito.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTotalDebito, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTotalCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel4)
                .addComponent(jLabelTotalDebito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5)
                .addComponent(jLabelTotalCredito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonCorrigir.setBackground(new java.awt.Color(0, 153, 0));
        jButtonCorrigir.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonCorrigir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCorrigir.setText("CORRIGIR");
        jButtonCorrigir.setEnabled(false);
        jButtonCorrigir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCorrigirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 43, Short.MAX_VALUE)
                        .addComponent(jButtonCorrigir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonCorrigir)
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(707, 598));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(TelaLogin.IMAGE_PATH + "icone.png")));
    }   
    
    private void jComboBoxOperacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOperacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxOperacaoActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void limparCampos() {
        fornecedor = null;
        jTextFieldDescricao.setText("");
        jTextFieldIdPessoa.setText("");
        jTextFieldValor.setText("");
        jComboBoxOperacao.setSelectedIndex(0);
        jButtonCorrigir.setEnabled(false);
    }

    private void jButtonCarregarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarregarPessoaActionPerformed
        // TODO add your handling code here:
        jTextFieldIdPessoa.setEnabled(false);
        jTextFieldDescricao.setEnabled(true);
        jTextFieldValor.setEnabled(true);
        jComboBoxOperacao.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonConfirmar.setEnabled(true);
        jButtonSair.setEnabled(false);
        jButtonCarregarPessoa.setEnabled(false);
        carregaFrames();
        jButtonCorrigir.setEnabled(true);
    }//GEN-LAST:event_jButtonCarregarPessoaActionPerformed

    private void atualizaTabela(List<Registro> resultado) {
        DefaultTableModel tabela = (DefaultTableModel) jTableExtrato.getModel();
        tabela.setNumRows(0);

        for (int i = 0; i < resultado.size(); i++) {
            tabela.addRow(new Object[]{
                sdf.format(resultado.get(i).getData()),
                resultado.get(i).getDescricao(),
                resultado.get(i).getOperacao(),
                //String.format("%.2f", resultado.get(i).getValor()),
                //String.format("%.2f", resultado.get(i).getSaldo())
                java.text.NumberFormat.getCurrencyInstance(new Locale("pt","br")).format(resultado.get(i).getValor()),
                java.text.NumberFormat.getCurrencyInstance(new Locale("pt","br")).format(resultado.get(i).getSaldo())
            });
        }
    }

    public void carregaFrames() {
        try {
            int id = Integer.parseInt(jTextFieldIdPessoa.getText());
            //fornecedor = new DoaFornecedor().buscar( jTextFieldIdPessoa.getText() );
            fornecedor = new DoaFornecedor().buscarWithPreparedStatement(id);
            if (fornecedor != null) {
                jLabelId.setText(fornecedor.getIdCliente().toString());
                jLabelNomePessoa.setText(fornecedor.getNome());

                Double saldo = fornecedor.getSaldo();
                if (saldo < 0) {
                    jLabelSaldo.setForeground(Color.RED);
                } else if (saldo > 0) {
                    jLabelSaldo.setForeground(Color.BLUE);
                } else {
                    jLabelSaldo.setForeground(Color.BLACK);
                }
                //jLabelSaldo.setText( String.format("%.2f", fornecedor.getSaldo() ) );

                //System.out.println(df.format( fornecedor.getSaldo()) );
                
                //old//jLabelSaldo.setText(String.format("%.4f", fornecedor.getSaldo()));
                jLabelSaldo.setText( java.text.NumberFormat.getCurrencyInstance(new Locale("pt","br")).format(fornecedor.getSaldo()) );
        
                //GERAR TABELA
                List<Registro> lista = new ArrayList<>();
                fornecedor.setRegistro(DoaLancamentos.getLancamentos(fornecedor));
                atualizaTabela(DoaLancamentos.getLancamentos(fornecedor));
                setTotaisContas(DoaLancamentos.totalDebito(Integer.parseInt(jTextFieldIdPessoa.getText())), DoaLancamentos.totalCredito(Integer.parseInt(jTextFieldIdPessoa.getText())));

            } else {
                JOptionPane.showMessageDialog(null, "Código Inexistente");
                cancelar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digite um número");
            cancelar();
        }
    }

    private void atualizaTabela() {
        DefaultTableModel tabela = (DefaultTableModel) jTableExtrato.getModel();
        tabela.setNumRows(0);
    }

    private void cancelar() {
        jTextFieldIdPessoa.setEnabled(true);
        jTextFieldDescricao.setEnabled(false);
        jTextFieldValor.setEnabled(false);
        jComboBoxOperacao.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonConfirmar.setEnabled(false);
        jButtonSair.setEnabled(true);
        jButtonCarregarPessoa.setEnabled(true);
        jLabelId.setText("");
        jLabelNomePessoa.setText("");
        jLabelSaldo.setText("");
        limparCampos();
    }

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        cancelar();
        limparCampos();
        atualizaTabela();
        setTotaisContas();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void executarLancamento() {
        if (jComboBoxOperacao.getSelectedIndex() == 0) {
            //DEBITO
            fornecedor.debita(Double.parseDouble(jTextFieldValor.getText()), jTextFieldDescricao.getText().toUpperCase());
        } else {
            //CREDITO            
            fornecedor.credita(Double.parseDouble(jTextFieldValor.getText()), jTextFieldDescricao.getText().toUpperCase());
        }
        DoaLancamentos.salvaUltimoLancamento(fornecedor);

    }

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        // TODO add your handling code here:
        if (!(jTextFieldValor.getText().equals("")) ) {
            try{
                Double.parseDouble(jTextFieldValor.getText());
                executarLancamento();
                jTextFieldDescricao.setText("");
                jTextFieldValor.setText("");
                carregaFrames();
            }
            catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Somente números é aceito no campo VALOR");
            }            
        } else {
            JOptionPane.showMessageDialog(this, "Digite um Valor");
        }

    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jButtonCorrigirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCorrigirActionPerformed
        // TODO add your handling code here:
        TelaAjustelancamentos telaAjustelancamentos = new TelaAjustelancamentos();
        telaAjustelancamentos.atualizaListaRegistro(this.fornecedor);
        telaAjustelancamentos.saveFrame(this);
        telaAjustelancamentos.geraTabela();
        telaAjustelancamentos.setVisible(true);

    }//GEN-LAST:event_jButtonCorrigirActionPerformed

    private void setTotaisContas() {
        jLabelTotalDebito.setText( java.text.NumberFormat.getCurrencyInstance(new Locale("pt","br")).format(0.0)) ;
        jLabelTotalCredito.setText( java.text.NumberFormat.getCurrencyInstance(new Locale("pt","br")).format(0.0));
    }

    private void setTotaisContas(Double debito, Double credito) {
        jLabelTotalDebito.setText(java.text.NumberFormat.getCurrencyInstance(new Locale("pt","br")).format(debito));
        jLabelTotalCredito.setText(java.text.NumberFormat.getCurrencyInstance(new Locale("pt","br")).format(credito));
    }

    public void desativaBotaoCorrigir() {
        this.jButtonCorrigir.setEnabled(false);
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
            java.util.logging.Logger.getLogger(TelaLancamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLancamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLancamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLancamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLancamentos().setVisible(true);
            }
        });
    }

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Fornecedor fornecedor = null;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonCarregarPessoa;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonCorrigir;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxOperacao;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelIdPessoa;
    private javax.swing.JLabel jLabelNomePessoa;
    private javax.swing.JLabel jLabelOperacao;
    private javax.swing.JLabel jLabelSaldo;
    private javax.swing.JLabel jLabelStaticId;
    private javax.swing.JLabel jLabelStaticNome;
    private javax.swing.JLabel jLabelStaticSaldo;
    private javax.swing.JLabel jLabelTotalCredito;
    private javax.swing.JLabel jLabelTotalDebito;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableExtrato;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldIdPessoa;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
}
