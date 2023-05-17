
package alfi040523.view;
import alfi040523.controller.PeminjamanController;
public class FormPeminjaman extends javax.swing.JFrame {
    PeminjamanController controller;
    public FormPeminjaman() {
        initComponents();
        controller = new PeminjamanController(this);
        controller.isiCombo();
        controller.bersihForm();
        controller.tampil();
    }

    public javax.swing.JComboBox<String> getcboAnggota() {
        return cboAnggota;
    }
    public javax.swing.JComboBox<String> getcboBuku(){
        return cboBuku;
    }
    public javax.swing.JTextField getTxtKembali(){
        return txtKembali;
    }
    public javax.swing.JTextField getTxtPinjam(){
        return txtPinjam;
    }
    public javax.swing.JTable getTblPeminjaman() {
        return tblPeminjaman;
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtKembali = new javax.swing.JTextField();
        txtPinjam = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        cboBuku = new javax.swing.JComboBox<>();
        cboAnggota = new javax.swing.JComboBox<>();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPeminjaman = new javax.swing.JTable();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Tanggal Kembali");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 130, 100, 30);

        jLabel2.setText("NOBP");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 80, 30);

        jLabel3.setText("Kode Buku");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 50, 80, 30);

        jLabel4.setText("Tanggal Pinjam");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 90, 100, 30);
        getContentPane().add(txtKembali);
        txtKembali.setBounds(120, 130, 330, 30);

        txtPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPinjamActionPerformed(evt);
            }
        });
        getContentPane().add(txtPinjam);
        txtPinjam.setBounds(120, 90, 330, 30);

        btnCancel.setText("Cancel");
        getContentPane().add(btnCancel);
        btnCancel.setBounds(370, 180, 78, 23);

        cboBuku.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cboBuku);
        cboBuku.setBounds(120, 50, 330, 30);

        cboAnggota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAnggotaActionPerformed(evt);
            }
        });
        getContentPane().add(cboAnggota);
        cboAnggota.setBounds(120, 10, 330, 30);

        btnInsert.setText("Insert");
        getContentPane().add(btnInsert);
        btnInsert.setBounds(20, 180, 72, 23);

        btnUpdate.setText("Update");
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(130, 180, 78, 23);

        btnDelete.setText("Delete");
        getContentPane().add(btnDelete);
        btnDelete.setBounds(250, 180, 78, 23);

        tblPeminjaman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOBP", "Kode Buku", "Tgl. Pinjam", "Tgl. Kembali"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPeminjaman);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 220, 452, 170);

        setSize(new java.awt.Dimension(472, 433));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cboAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAnggotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboAnggotaActionPerformed

    private void txtPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPinjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPinjamActionPerformed

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
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboAnggota;
    private javax.swing.JComboBox<String> cboBuku;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable tblPeminjaman;
    private javax.swing.JTextField txtKembali;
    private javax.swing.JTextField txtPinjam;
    // End of variables declaration//GEN-END:variables
}
