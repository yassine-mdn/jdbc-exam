/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author yassine
 */
public class Table extends javax.swing.JFrame {

    /**
     * Creates new form Table
     */
    public Table() {
        initComponents();
    }


    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        mme = new javax.swing.JRadioButton();
        mle = new javax.swing.JRadioButton();
        m = new javax.swing.JRadioButton();
        enregistrer = new javax.swing.JButton();
        lister = new javax.swing.JButton();
        supprimer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableParicipant = new javax.swing.JTable();
        idField = new javax.swing.JTextField();
        comboBoxProfession = new javax.swing.JComboBox<>();
        nomField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        prenomField = new javax.swing.JTextField();
        ageSpinner = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Ajouter un nouveau participant");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nom");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Prénom");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Age");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("E-mail");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Profession");

        buttonGroup1.add(mme);
        mme.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        mme.setText("Mme");
        mme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmeActionPerformed(evt);
            }
        });

        buttonGroup1.add(mle);
        mle.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        mle.setText("Mlle");
        mle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mleActionPerformed(evt);
            }
        });

        buttonGroup1.add(m);
        m.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        m.setSelected(true);
        m.setText("M");
        m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActionPerformed(evt);
            }
        });

        enregistrer.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        enregistrer.setText("Enregistrer");
        enregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enregistrerActionPerformed(evt);
            }
        });

        lister.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lister.setText("Lister");
        lister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listerActionPerformed(evt);
            }
        });

        supprimer.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        supprimer.setText("Supprimer");
        supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerActionPerformed(evt);
            }
        });

        tableParicipant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableParicipantMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableParicipant);

        idField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        comboBoxProfession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxProfessionActionPerformed(evt);
            }
        });

        nomField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        emailField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        prenomField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        ageSpinner.setModel(new javax.swing.SpinnerNumberModel(18, 18, 70, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(27, 27, 27)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(nomField, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                                        .addComponent(prenomField)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(mme)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(mle)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(m))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(enregistrer)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(lister, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                                                .addComponent(supprimer)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel7)
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(ageSpinner)
                                                                .addComponent(idField, javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(comboBoxProfession, javax.swing.GroupLayout.Alignment.LEADING, 0, 100, Short.MAX_VALUE)
                                                                .addComponent(emailField)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(nomField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(prenomField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel5)
                                                        .addComponent(ageSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(comboBoxProfession, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(mme)
                                                        .addComponent(mle)
                                                        .addComponent(m))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(enregistrer)
                                                        .addComponent(lister))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(supprimer))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void mmeActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void mleActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void mActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void comboBoxProfessionActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
       if (mapProfession.size()!= 0) {

            int index = mapProfession.get(comboBoxProfession.getSelectedIndex());


            Connection connection = SingletonConnection.getConnection();
            String SQL = "Select * from exam.public.participant pa natural join profession p where p.id = " + index;
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(SQL);
                ResultSet rs = preparedStatement.executeQuery();
                DefaultTableModel modelDyn = TableUtility.generateTableModel(rs);
                tableParicipant.setModel(modelDyn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void enregistrerActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        int id = Integer.parseInt(idField.getText());
        String nom = nomField.getText();
        String prenom = emailField.getText();
        int age = (int) ageSpinner.getValue();
        String email = prenomField.getText();
        String profession = (String) comboBoxProfession.getSelectedItem();
        String civilite = mme.isSelected() ? "Mme" : mle.isSelected() ? "Mlle" : "M";

        Connection connection = SingletonConnection.getConnection();
        String SQL = "insert into exam.public.participant(nom, prenom, age, email, profession, civilite) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1,nom);
            preparedStatement.setString(2,prenom);
            preparedStatement.setInt(3,age);
            preparedStatement.setString(4,email);
            preparedStatement.setString(5,profession);
            preparedStatement.setString(6,civilite);
            preparedStatement.executeUpdate();
            listerActionPerformed(evt);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    private void listerActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        Connection connection = SingletonConnection.getConnection();
        String SQL = "Select * from exam.public.participant";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            ResultSet rs = preparedStatement.executeQuery();
            DefaultTableModel modelDyn = TableUtility.generateTableModel(rs);
            tableParicipant.setModel(modelDyn);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private void supprimerActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        int row = tableParicipant.getSelectedRow();

        Connection connection = SingletonConnection.getConnection();
        String SQL = "delete from exam.public.participant WHERE id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1,row);
            preparedStatement.executeUpdate();
            listerActionPerformed(evt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        listerActionPerformed(evt);
    }

    private void onLaunch(){

        Connection connection = SingletonConnection.getConnection();
        String SQL = "Select * from exam.public.participant";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            ResultSet rs = preparedStatement.executeQuery();
            DefaultTableModel modelDyn = TableUtility.generateTableModel(rs);
            tableParicipant.setModel(modelDyn);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        SQL = "Select * from exam.public.profession";
        LinkedList<Profession> professionsList = new LinkedList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                int id = rs.getInt(1);
                String nom = rs.getString(2);
                professionsList.add(new Profession(id,nom));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        comboBoxProfession.removeAllItems();
        for (int i = 0; i < professionsList.size(); i++) {
            comboBoxProfession.addItem(professionsList.get(i).getNom());
            mapProfession.put(i,professionsList.get(i).getId());
        }
        System.out.println();
    }

    private void tableParicipantMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        int row = tableParicipant.getSelectedRow();
        idField.setText("" +tableParicipant.getValueAt(row, 0));
        nomField.setText("" +tableParicipant.getValueAt(row, 1));
        emailField.setText("" + tableParicipant.getValueAt(row, 2));
        ageSpinner.setValue(tableParicipant.getValueAt(row, 3));
        prenomField.setText("" +tableParicipant.getValueAt(row, 4));
        String c = "" + tableParicipant.getValueAt(row, 6);
        switch (c) {
            case "Mme" -> mme.setSelected(true);
            case "Mlle" -> mle.setSelected(true);
            default -> m.setSelected(true);
        }

    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               Table table = new Table();
               table.setVisible(true);
               table.onLaunch();

            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JSpinner ageSpinner;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboBoxProfession;
    private javax.swing.JTextField emailField;
    private javax.swing.JButton enregistrer;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lister;
    private javax.swing.JRadioButton m;
    private javax.swing.JRadioButton mle;
    private javax.swing.JRadioButton mme;
    private javax.swing.JTextField nomField;
    private javax.swing.JTextField prenomField;
    private javax.swing.JButton supprimer;
    private javax.swing.JTable tableParicipant;
    // End of variables declaration


    //User Variables
    private HashMap<Integer,Integer> mapProfession = new HashMap<>();
}
