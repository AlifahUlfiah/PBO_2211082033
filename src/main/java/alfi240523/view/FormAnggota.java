package alfi240523.view;
import alfi240523.controller.*;
public class FormAnggota extends javax.swing.JFrame {
    AnggotaController controller;
    public FormAnggota() {
        initComponents();
        controller = new AnggotaController(this);
        controller.clearForm();
    }
    
    public javax.swing.JTextField getTxtNOBP() {
        return txtNOBP;
    }
    
    public javax.swing.JTextField getTxtNama() {
        return txtNama;
    }
    
    public javax.swing.JTextField getTxtAlamat() {
        return txtAlamat;
    }
    
    public javax.swing.JComboBox<String> getCboJK() {
        return cboJK;
    }
    
    public javax.swing.JTable getTblAnggota() {
        return tblAnggota;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JTextField();
        txtNOBP = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        cboJK = new javax.swing.JComboBox<>();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAnggota = new javax.swing.JTable();
        btnDelete1 = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jScrollPane2.setViewportView(jEditorPane1);

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Jenis Kelamin");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 130, 90, 30);

        jLabel2.setText("No BP");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 90, 30);

        jLabel3.setText("Nama");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 50, 90, 30);

        jLabel4.setText("Alamat");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 90, 90, 30);
        getContentPane().add(txtAlamat);
        txtAlamat.setBounds(110, 90, 280, 30);
        getContentPane().add(txtNOBP);
        txtNOBP.setBounds(110, 10, 280, 30);
        getContentPane().add(txtNama);
        txtNama.setBounds(110, 50, 280, 30);

        cboJK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cboJK);
        cboJK.setBounds(110, 130, 72, 30);

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert);
        btnInsert.setBounds(410, 20, 72, 23);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(410, 60, 73, 23);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(500, 20, 72, 23);

        tblAnggota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No BP", "Nama", "Alamat", "Jenis Kelamin"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAnggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAnggotaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAnggota);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 170, 560, 140);

        btnDelete1.setText("Delete");
        getContentPane().add(btnDelete1);
        btnDelete1.setBounds(410, 100, 72, 23);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(500, 60, 72, 23);

        setSize(new java.awt.Dimension(583, 348));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblAnggotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAnggotaMouseClicked
        // TODO add your handling code here:
        controller.getAnggota();
    }//GEN-LAST:event_tblAnggotaMouseClicked

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        controller.insert();
        controller.tampil();
        controller.clearForm();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        controller.update();
        controller.tampil();
        controller.clearForm();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        controller.clearForm();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(FormAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAnggota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboJK;
    private javax.swing.JButton jButton1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable tblAnggota;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtNOBP;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}
