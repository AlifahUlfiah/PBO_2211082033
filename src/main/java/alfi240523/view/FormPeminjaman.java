package alfi240523.view;
import alfi240523.controller.*;
public class FormPeminjaman extends javax.swing.JFrame {
    PeminjamanController controller;
    public FormPeminjaman() {
        initComponents();
        controller = new PeminjamanController(this);
        controller.clearForm();
    }
    
    public javax.swing.JComboBox<String> getCboNobp() {
        return cboNobp;
    }
    
    public javax.swing.JComboBox<String> getCboKB() {
        return cboKB;
    }
    
    public javax.swing.JTextField getTxtPinjam() {
        return txtTP;
    }
    
    public javax.swing.JTextField getTxtKembali() {
        return txtTK;
    }
    
    public javax.swing.JTable getTblPeminjaman() {
        return tblPeminjaman;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtTK = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTP = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPeminjaman = new javax.swing.JTable();
        btnCancel = new javax.swing.JButton();
        btnDelete2 = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        cboKB = new javax.swing.JComboBox<>();
        cboNobp = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Tgl Kembali");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 130, 90, 30);
        getContentPane().add(txtTK);
        txtTK.setBounds(110, 130, 320, 30);

        jLabel2.setText("NoBP");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 90, 30);

        jLabel3.setText("Kode Buku");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 50, 90, 30);

        jLabel4.setText("Tgl Pinjam");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 90, 90, 30);
        getContentPane().add(txtTP);
        txtTP.setBounds(110, 90, 320, 30);

        btnInsert.setText("Insert");
        getContentPane().add(btnInsert);
        btnInsert.setBounds(450, 20, 80, 23);

        btnUpdate.setText("Update");
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(450, 70, 80, 23);

        tblPeminjaman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NoBP", "Kode Buku", "Tgl Pinjam", "Tgl Kembali"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPeminjaman);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 182, 630, 190);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(550, 20, 80, 23);

        btnDelete2.setText("Delete");
        getContentPane().add(btnDelete2);
        btnDelete2.setBounds(450, 120, 80, 23);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(550, 70, 80, 23);

        cboKB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cboKB);
        cboKB.setBounds(110, 50, 320, 30);

        cboNobp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboNobp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNobpActionPerformed(evt);
            }
        });
        getContentPane().add(cboNobp);
        cboNobp.setBounds(110, 10, 320, 30);

        setSize(new java.awt.Dimension(652, 410));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        controller.clearForm();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void cboNobpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNobpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboNobpActionPerformed

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
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPeminjaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete2;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboKB;
    private javax.swing.JComboBox<String> cboNobp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPeminjaman;
    private javax.swing.JTextField txtTK;
    private javax.swing.JTextField txtTP;
    // End of variables declaration//GEN-END:variables
}
