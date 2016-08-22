/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.locadora.gui;

import br.ufmt.ic.locadora.dao.FornecedorDAO;
import br.ufmt.ic.locadora.entidade.Banco;
import br.ufmt.ic.locadora.entidade.ContaBancaria;
import br.ufmt.ic.locadora.entidade.Endereco;
import br.ufmt.ic.locadora.entidade.Fornecedor;
import br.ufmt.ic.locadora.exception.CNPJException;
import br.ufmt.ic.locadora.tablemodel.FornecedorTableModel;
import javax.swing.JOptionPane;
import locadora.FabricaDAO;

/**
 *
 * @author brunosette
 */
public class FornecedorJPanel extends javax.swing.JPanel {
    FornecedorDAO dao = FabricaDAO.CriarForncedorDAO();
    private FornecedorTableModel tableModel;
    private boolean editar = false;
    private int linhaSelecionada;
    private Fornecedor chave;
    /**
     * Creates new form FornecedorJPanel
     */
    public FornecedorJPanel() {
        tableModel = new FornecedorTableModel(dao.listar());
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editarjButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        funcionariojTable = new javax.swing.JTable();
        excluirjButton = new javax.swing.JButton();
        ruajTextField = new javax.swing.JTextField();
        ruajLabel = new javax.swing.JLabel();
        complementojTextField = new javax.swing.JTextField();
        complementojLabel = new javax.swing.JLabel();
        bairrojTextField = new javax.swing.JTextField();
        bairrojLabel = new javax.swing.JLabel();
        cepjLabel = new javax.swing.JLabel();
        cidadejTextField = new javax.swing.JTextField();
        cidadejLabel = new javax.swing.JLabel();
        estadojLabel = new javax.swing.JLabel();
        estadojTextField = new javax.swing.JTextField();
        numerojTextField = new javax.swing.JTextField();
        ruajLabel1 = new javax.swing.JLabel();
        cepjFormattedTextField = new javax.swing.JFormattedTextField();
        telefonejLabel = new javax.swing.JLabel();
        celularjLabel = new javax.swing.JLabel();
        emailjTextField = new javax.swing.JTextField();
        emailjLabel = new javax.swing.JLabel();
        cpfjLabel = new javax.swing.JLabel();
        cnpjjFormattedTextField = new javax.swing.JFormattedTextField();
        telefonejFormattedTextField = new javax.swing.JFormattedTextField();
        celularjFormattedTextField = new javax.swing.JFormattedTextField();
        nomejLabel = new javax.swing.JLabel();
        nomejTextField = new javax.swing.JTextField();
        cadastrarjButton = new javax.swing.JButton();
        limparjButton = new javax.swing.JButton();
        bancojTextField = new javax.swing.JTextField();
        nacionalidadejLabel3 = new javax.swing.JLabel();
        ccjTextField = new javax.swing.JTextField();
        nacionalidadejLabel7 = new javax.swing.JLabel();
        nomejLabel1 = new javax.swing.JLabel();
        razaojTextField = new javax.swing.JTextField();

        editarjButton1.setText("Editar");
        editarjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarjButton1ActionPerformed(evt);
            }
        });

        funcionariojTable.setModel(tableModel);
        jScrollPane1.setViewportView(funcionariojTable);

        excluirjButton.setText("Excluir");
        excluirjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirjButtonActionPerformed(evt);
            }
        });

        ruajLabel.setText("Rua:");

        complementojLabel.setText("Complemento:");

        bairrojLabel.setText("Bairro:");

        cepjLabel.setText("Cep:");

        cidadejLabel.setText("Cidade:");

        estadojLabel.setText("Estado:");

        ruajLabel1.setText("Numero:");

        try {
            cepjFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        telefonejLabel.setText("Telefone:");

        celularjLabel.setText("Celular:");

        emailjLabel.setText("Email:");

        cpfjLabel.setText("CNPJ:");

        try {
            cnpjjFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            telefonejFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            celularjFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        nomejLabel.setText("Nome:");

        cadastrarjButton.setText("Cadastrar");
        cadastrarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarjButtonActionPerformed(evt);
            }
        });

        limparjButton.setText("Limpar");
        limparjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparjButtonActionPerformed(evt);
            }
        });

        bancojTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bancojTextFieldActionPerformed(evt);
            }
        });

        nacionalidadejLabel3.setText("Banco:");

        ccjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccjTextFieldActionPerformed(evt);
            }
        });

        nacionalidadejLabel7.setText("CC:");

        nomejLabel1.setText("Razão:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nacionalidadejLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bancojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nacionalidadejLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ccjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefonejLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(celularjLabel))
                                    .addComponent(emailjLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(celularjFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telefonejFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cpfjLabel)
                                    .addComponent(nomejLabel))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cnpjjFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(nomejLabel1)
                                .addGap(28, 28, 28)
                                .addComponent(razaojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(ruajLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ruajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(bairrojLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bairrojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(complementojLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(complementojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(limparjButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cadastrarjButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(estadojLabel)
                                    .addComponent(ruajLabel1)
                                    .addComponent(cidadejLabel)
                                    .addComponent(cepjLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numerojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(estadojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cidadejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cepjFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(643, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(477, 477, 477)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(excluirjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(editarjButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomejLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cpfjLabel)
                            .addComponent(cnpjjFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefonejFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefonejLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(celularjFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celularjLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailjLabel))
                        .addGap(80, 80, 80))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ruajLabel)
                            .addComponent(ruajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(complementojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(complementojLabel)
                            .addComponent(razaojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomejLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bairrojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bairrojLabel))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cepjLabel)
                            .addComponent(cepjFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cidadejLabel)
                            .addComponent(cidadejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(estadojLabel)
                            .addComponent(estadojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ruajLabel1)
                            .addComponent(numerojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(limparjButton)
                        .addComponent(cadastrarjButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bancojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nacionalidadejLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ccjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nacionalidadejLabel7))))
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addComponent(editarjButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(excluirjButton)
                            .addGap(341, 341, 341))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1)))
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editarjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarjButton1ActionPerformed
        // TODO add your handling code here:
        if (funcionariojTable.getSelectedRowCount() == 1) {
            linhaSelecionada = funcionariojTable.getSelectedRow();
            Fornecedor selecionado = tableModel.getFornecedor(linhaSelecionada);

            nomejTextField.setText(selecionado.getNome());
            razaojTextField.setText(selecionado.getRazaoSocial());
            telefonejFormattedTextField.setText(selecionado.getTelefone());
            celularjFormattedTextField.setText(selecionado.getCelular());
            emailjTextField.setText(selecionado.getEmail());
            cnpjjFormattedTextField.setText(selecionado.getCnpj());
            
            
            cepjFormattedTextField.setText(selecionado.getEndereco().getCep());
            ruajTextField.setText(selecionado.getEndereco().getRua());
            bairrojTextField.setText(selecionado.getEndereco().getBairro());
            estadojTextField.setText(selecionado.getEndereco().getEstado());
            cidadejTextField.setText(selecionado.getEndereco().getCidade());
            numerojTextField.setText(selecionado.getEndereco().getNumero());
            complementojTextField.setText(selecionado.getEndereco().getComplemento());
            chave = selecionado;
            editar = true;
        } else {
            JOptionPane.showMessageDialog(this, "Selecione somente 1 linha!");
        }
    }//GEN-LAST:event_editarjButton1ActionPerformed

    private void excluirjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirjButtonActionPerformed
        // TODO add your handling code here:

        if (funcionariojTable.getSelectedRowCount() > 0) {
            int confirmacao = JOptionPane.showConfirmDialog(funcionariojTable, "Confirma a exclusão?");
            if (confirmacao == JOptionPane.YES_OPTION) {
                linhaSelecionada = funcionariojTable.getSelectedRow();
                Fornecedor selecionado = tableModel.getFornecedor(linhaSelecionada);
                dao.remover(selecionado.getCnpj());
                tableModel.remover(linhaSelecionada, selecionado);
                JOptionPane.showMessageDialog(this, "Excluido com Sucesso!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione ao menos 1 linha!");
        }
    }//GEN-LAST:event_excluirjButtonActionPerformed

    private void cadastrarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarjButtonActionPerformed
        // TODO add your handling code here:

        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome(nomejTextField.getText());
        fornecedor.setRazaoSocial(razaojTextField.getText());
        fornecedor.setTelefone(telefonejFormattedTextField.getText());
        fornecedor.setCelular(celularjFormattedTextField.getText());
        fornecedor.setEmail(emailjTextField.getText());
        fornecedor.setCnpj(cnpjjFormattedTextField.getText());
        
        
        ContaBancaria conta = new ContaBancaria();
        Banco banco = new Banco();
        //banco.setNomeBanco(bancojTextField.getText());
        //conta.setBanco(banco);
        conta.setContaNumero(ccjTextField.getText());

        fornecedor.setConta(conta);

        Endereco end = new Endereco();
        end.setBairro(bairrojTextField.getText());
        end.setCep(cepjFormattedTextField.getText());
        end.setCidade(cidadejTextField.getText());
        end.setComplemento(complementojTextField.getText());
        end.setEstado(estadojTextField.getText());
        end.setNumero(numerojTextField.getText());
        end.setRua(ruajTextField.getText());

        fornecedor.setEndereco(end);

        try {
            if (editar) {
                dao.alterar(fornecedor, chave);
                JOptionPane.showMessageDialog(this, "Alterado!");
                tableModel.alterar(linhaSelecionada, fornecedor);
            } else {
                dao.inserir(fornecedor);
                JOptionPane.showMessageDialog(this, "Cadastrado!");
                tableModel.adicionar(fornecedor);
            }
            limparjButtonActionPerformed(null);
        } catch (CNPJException erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
            cnpjjFormattedTextField.grabFocus();
        } 

    }//GEN-LAST:event_cadastrarjButtonActionPerformed

    private void limparjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparjButtonActionPerformed
        // TODO add your handling code here:

        nomejTextField.setText("");
        telefonejFormattedTextField.setText("");
        celularjFormattedTextField.setText("");
        emailjTextField.setText("");
        cnpjjFormattedTextField.setText("");
        ruajTextField.setText("");
        complementojTextField.setText("");
        bairrojTextField.setText("");
        cepjFormattedTextField.setText("");
        cidadejTextField.setText("");
        estadojTextField.setText("");
        bancojTextField.setText("");
        ccjTextField.setText("");
        numerojTextField.setText("");
        razaojTextField.setText("");
        editar = false;
    }//GEN-LAST:event_limparjButtonActionPerformed

    private void bancojTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bancojTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bancojTextFieldActionPerformed

    private void ccjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ccjTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bairrojLabel;
    private javax.swing.JTextField bairrojTextField;
    private javax.swing.JTextField bancojTextField;
    private javax.swing.JButton cadastrarjButton;
    private javax.swing.JTextField ccjTextField;
    private javax.swing.JFormattedTextField celularjFormattedTextField;
    private javax.swing.JLabel celularjLabel;
    private javax.swing.JFormattedTextField cepjFormattedTextField;
    private javax.swing.JLabel cepjLabel;
    private javax.swing.JLabel cidadejLabel;
    private javax.swing.JTextField cidadejTextField;
    private javax.swing.JFormattedTextField cnpjjFormattedTextField;
    private javax.swing.JLabel complementojLabel;
    private javax.swing.JTextField complementojTextField;
    private javax.swing.JLabel cpfjLabel;
    private javax.swing.JButton editarjButton1;
    private javax.swing.JLabel emailjLabel;
    private javax.swing.JTextField emailjTextField;
    private javax.swing.JLabel estadojLabel;
    private javax.swing.JTextField estadojTextField;
    private javax.swing.JButton excluirjButton;
    private javax.swing.JTable funcionariojTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limparjButton;
    private javax.swing.JLabel nacionalidadejLabel3;
    private javax.swing.JLabel nacionalidadejLabel7;
    private javax.swing.JLabel nomejLabel;
    private javax.swing.JLabel nomejLabel1;
    private javax.swing.JTextField nomejTextField;
    private javax.swing.JTextField numerojTextField;
    private javax.swing.JTextField razaojTextField;
    private javax.swing.JLabel ruajLabel;
    private javax.swing.JLabel ruajLabel1;
    private javax.swing.JTextField ruajTextField;
    private javax.swing.JFormattedTextField telefonejFormattedTextField;
    private javax.swing.JLabel telefonejLabel;
    // End of variables declaration//GEN-END:variables
}
