/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.locadora.gui;

import br.ufmt.ic.locadora.dao.AmbienteDAO;
import br.ufmt.ic.locadora.dao.GeneroDAO;
import br.ufmt.ic.locadora.entidade.Ambiente;
import br.ufmt.ic.locadora.entidade.Genero;
import br.ufmt.ic.locadora.exception.RegistroException;
import br.ufmt.ic.locadora.tablemodel.AmbienteTableModel;
import br.ufmt.ic.locadora.tablemodel.GeneroTableModel;
import javax.swing.JOptionPane;
import br.ufmt.ic.locadora.util.FabricaDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author brunosette
 */
public class GeneroJPanel extends javax.swing.JPanel {

    private GeneroDAO dao = FabricaDAO.CriarGeneroDAO();
    private GeneroTableModel tableModel;
    private boolean editar = false;
    private int linhaSelecionada;
    private Genero chave;

    /**
     * Creates new form GeneroJPanel
     */
    public GeneroJPanel() {
        tableModel = new GeneroTableModel(dao.listar());
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

        nomejTextField = new javax.swing.JTextField();
        limparjButton = new javax.swing.JButton();
        cadastrarjButton = new javax.swing.JButton();
        editarjButton = new javax.swing.JButton();
        escluirjButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        generojTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createTitledBorder(null, "Genero", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18)))); // NOI18N

        nomejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomejTextFieldActionPerformed(evt);
            }
        });

        limparjButton.setText("Limpar");
        limparjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparjButtonActionPerformed(evt);
            }
        });

        cadastrarjButton.setText("Salvar");
        cadastrarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarjButtonActionPerformed(evt);
            }
        });

        editarjButton.setText("Editar");
        editarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarjButtonActionPerformed(evt);
            }
        });

        escluirjButton.setText("Excluir");
        escluirjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escluirjButtonActionPerformed(evt);
            }
        });

        generojTable.setModel(tableModel);
        jScrollPane1.setViewportView(generojTable);

        jLabel1.setText("Nome:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(escluirjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(limparjButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cadastrarjButton)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarjButton)
                    .addComponent(limparjButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(editarjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(escluirjButton)
                        .addGap(161, 161, 161))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void limparjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparjButtonActionPerformed
        // TODO add your handling code here:

        nomejTextField.setText("");

        editar = false;
    }//GEN-LAST:event_limparjButtonActionPerformed

    private void cadastrarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarjButtonActionPerformed
        // TODO add your handling code here:
        Genero novo = new Genero();
        novo.setNome(nomejTextField.getText());

        try {
            if (editar) {
                dao.alterar(novo);
                JOptionPane.showMessageDialog(this, "Alterado com Sucesso!");
                tableModel.alterar(linhaSelecionada, novo);
            } else {
                dao.inserir(novo);
                JOptionPane.showMessageDialog(this, "Cadastrado com Sucesso!");
                tableModel.adicionar(novo);
            }
            limparjButtonActionPerformed(null);
        } catch (RegistroException erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
            nomejTextField.grabFocus();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao inserir, verifique os dados");
            nomejTextField.grabFocus();
            Logger.getLogger(GeneroJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cadastrarjButtonActionPerformed

    private void editarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarjButtonActionPerformed
        // TODO add your handling code here:

        if (generojTable.getSelectedRowCount() == 1) {
            linhaSelecionada = generojTable.getSelectedRow();
            Genero selecionado = tableModel.getGenero(linhaSelecionada);

            nomejTextField.setText(selecionado.getNome());

            chave = selecionado;
            editar = true;
        } else {
            JOptionPane.showMessageDialog(this, "Selecione somente 1 linha!");
        }
    }//GEN-LAST:event_editarjButtonActionPerformed

    private void escluirjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escluirjButtonActionPerformed
        // TODO add your handling code here:
        if (generojTable.getSelectedRowCount() > 0) {
            int confirmacao = JOptionPane.showConfirmDialog(generojTable, "Confirma a exclusão?");
            if (confirmacao == JOptionPane.YES_OPTION) {
                linhaSelecionada = generojTable.getSelectedRow();
                Genero selecionado = tableModel.getGenero(linhaSelecionada);
                try {
                    dao.remover(selecionado.getCodigo());
                    tableModel.remover(linhaSelecionada, selecionado);
                    JOptionPane.showMessageDialog(this, "Excluido com Sucesso!");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Não foi possivel remover. Outros dados dependem deste");

                    Logger.getLogger(GeneroJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione ao menos 1 linha!");
        }
    }//GEN-LAST:event_escluirjButtonActionPerformed

    private void nomejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomejTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarjButton;
    private javax.swing.JButton editarjButton;
    private javax.swing.JButton escluirjButton;
    private javax.swing.JTable generojTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limparjButton;
    private javax.swing.JTextField nomejTextField;
    // End of variables declaration//GEN-END:variables
}
