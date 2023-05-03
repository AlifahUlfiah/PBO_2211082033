package alfi260423;

import javax.swing.JTable;
import javax.swing.JTextField;

public class FormAnggota extends javax.swing.JFrame {
    
    AnggotaController controller;
    
    public FormAnggota() {
        initComponents();
        controller = new AnggotaController(this);
        controller.bersihForm();
    }
    
    public JTable getTblAnggota() {
        return tblAnggota;
    }
    
    public JTextField getTxtAlamat() {
        return txtAlamat;
    }
    
    public JTextField getTxtNama() {
        return txtNama;
    }
    
    public JTextField getTxtNobp() {
        return txtNobp;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNobp = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAnggota = new javax.swing.JTable();

        jButton1.setText("jButton1");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("NO BP");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 10, 50, 30);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 50, 60, 30);

        jLabel3.setText("Alamat");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 87, 50, 30);

        txtNobp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNobpActionPerformed(evt);
            }
        });
        getContentPane().add(txtNobp);
        txtNobp.setBounds(110, 13, 330, 30);
        getContentPane().add(txtNama);
        txtNama.setBounds(110, 50, 330, 30);
        getContentPane().add(txtAlamat);
        txtAlamat.setBounds(110, 90, 330, 30);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(360, 130, 72, 23);

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert);
        btnInsert.setBounds(30, 130, 72, 23);

        btnUpdate.setText("Update");
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(140, 130, 73, 23);

        btnDelete.setText("Delete");
        getContentPane().add(btnDelete);
        btnDelete.setBounds(250, 130, 72, 23);

        tblAnggota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NOBP", "Nama", "Alamat"
            }
        ));
        jScrollPane1.setViewportView(tblAnggota);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 162, 430, 340);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNobpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNobpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNobpActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

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
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblAnggota;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNobp;
    // End of variables declaration//GEN-END:variables
}
