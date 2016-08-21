/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.locadora.gui;

import br.ufmt.ic.locadora.dao.FuncionarioDAO;
import br.ufmt.ic.locadora.dao.PontoDAO;
import locadora.FabricaDAO;
import br.ufmt.ic.locadora.dao.impl.FuncionarioDAOImpl;
import br.ufmt.ic.locadora.entidade.Funcionario;
import br.ufmt.ic.locadora.entidade.Ponto;
import br.ufmt.ic.locadora.exception.RegistroException;
import br.ufmt.ic.locadora.tablemodel.PontoTableModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author brunosette
 */
public class PontoJPanel extends javax.swing.JPanel {

    private PontoDAO dao = FabricaDAO.CriarPontoDAO();
    private FuncionarioDAO funcionarioDAO = FabricaDAO.CriarFuncionarioDAO();
    
     
    private PontoTableModel tableModel;
    private boolean editar = false;
    private int linhaSelecionada;
    private Ponto chave;

    /**
     * Creates new form PontoJPanel
     */
    public PontoJPanel() {
        tableModel = new PontoTableModel(dao.listar());
        initComponents();
        setComboFuncionario();
        setComboTipoPonto();
    }

    private void setComboFuncionario() {
        funcionariojComboBox.removeAllItems();
        funcionariojComboBox.addItem("Selecione");

        Map<String, Funcionario> funcionarios = funcionarioDAO.listar();
        Collection<Funcionario> colecao = funcionarios.values();
        for (Funcionario funcionario : colecao) {
            funcionariojComboBox.addItem(funcionario);
        }

    }

    private void setComboTipoPonto() {
        tipoPontojComboBox.removeAllItems();
        tipoPontojComboBox.addItem("Selecione");
        tipoPontojComboBox.addItem("Entrada");
        tipoPontojComboBox.addItem("Saída");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastrarjButton = new javax.swing.JButton();
        limparjButton = new javax.swing.JButton();
        funcionariojComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        editarjButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        datajFormattedTextField = new javax.swing.JFormattedTextField();
        excluirjButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pontojTable = new javax.swing.JTable();
        tipoPontojComboBox = new javax.swing.JComboBox<>();

        setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createTitledBorder(null, "Ponto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 18)))); // NOI18N

        cadastrarjButton.setText("Salvar");
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

        funcionariojComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Tipo de Ponto:");

        jLabel3.setText("Funcionario:");

        editarjButton.setText("Editar");
        editarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarjButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Data:");

        try {
            datajFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        excluirjButton.setText("Excluir");

        pontojTable.setModel(tableModel);
        jScrollPane1.setViewportView(pontojTable);

        tipoPontojComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entrada", "Saída" }));
        tipoPontojComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoPontojComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(excluirjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editarjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cadastrarjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(limparjButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(funcionariojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tipoPontojComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 122, Short.MAX_VALUE)
                                .addComponent(datajFormattedTextField, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(funcionariojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tipoPontojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(datajFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarjButton)
                    .addComponent(limparjButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editarjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(excluirjButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarjButtonActionPerformed
        // TODO add your handling code here:
        
         if (pontojTable.getSelectedRowCount() == 1) {
            linhaSelecionada = pontojTable.getSelectedRow();
            Ponto selecionado = tableModel.getPonto(linhaSelecionada);

            try{
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                datajFormattedTextField.setText(sdf.format(selecionado.getDataPonto()));
            }catch (NullPointerException erro){
                
            }
            
            tipoPontojComboBox.setSelectedItem(selecionado.getTipoPonto());
            funcionariojComboBox.setSelectedItem(selecionado.getFuncionario());
            
            chave = selecionado;
            editar = true;
        } else {
            JOptionPane.showMessageDialog(this, "Selecione somente 1 linha!");
        }


    }//GEN-LAST:event_editarjButtonActionPerformed

    private void tipoPontojComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoPontojComboBoxActionPerformed
        // TODO add your handling code here:

        
    }//GEN-LAST:event_tipoPontojComboBoxActionPerformed

    private void cadastrarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarjButtonActionPerformed
        // TODO add your handling code here:

        Ponto novo = new Ponto();

        if (funcionariojComboBox.getSelectedIndex() > 0) {
            novo.setFuncionario((Funcionario) funcionariojComboBox.getSelectedItem());
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um Funcionario");
            funcionariojComboBox.grabFocus();
            return;
        }

        if (tipoPontojComboBox.getSelectedIndex() > 0) {
            novo.setTipoPonto((String) tipoPontojComboBox.getSelectedItem());
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um Tipo de Ponto");
            tipoPontojComboBox.grabFocus();
            return;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String sData = (String) datajFormattedTextField.getText();

        if (sData != null) {
            try {
                novo.setDataPonto(sdf.parse(sData));
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this, "Data Inválida!");
                datajFormattedTextField.grabFocus();
                return;
            }
        }

        try {
            if (editar == true) {
                dao.alterar(novo, chave);
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
        }


    }//GEN-LAST:event_cadastrarjButtonActionPerformed

    private void limparjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparjButtonActionPerformed
        // TODO add your handling code here:
        datajFormattedTextField.setText("");
        funcionariojComboBox.setSelectedIndex(0);
        tipoPontojComboBox.setSelectedIndex(0);
        editar = false;
    }//GEN-LAST:event_limparjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarjButton;
    private javax.swing.JFormattedTextField datajFormattedTextField;
    private javax.swing.JButton editarjButton;
    private javax.swing.JButton excluirjButton;
    private javax.swing.JComboBox funcionariojComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limparjButton;
    private javax.swing.JTable pontojTable;
    private javax.swing.JComboBox<String> tipoPontojComboBox;
    // End of variables declaration//GEN-END:variables
}
