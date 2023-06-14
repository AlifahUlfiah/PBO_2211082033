package alfi240523.view;
import alfi240523.controller.BukuController;
public class FormBuku extends javax.swing.JFrame {
    BukuController controller;
    public FormBuku() {
        initComponents();
        controller = new BukuController(this);
        controller.clearForm();
    }
    
    public javax.swing.JTextField getTxtKB() {
        return txtKB;
    }
    
    public javax.swing.JTextField getTxtJB() {
        return txtJB;
    }
    
    public javax.swing.JTextField getTxtPengarang() {
        return txtPengarang;
    }
    
    public javax.swing.JTextField getTxtPenerbit() {
        return txtPenerbit;
    }
    
    public javax.swing.JTable getTblBuku() {
        return tblBuku;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtPenerbit = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtKB = new javax.swing.JTextField();
        txtJB = new javax.swing.JTextField();
        txtPengarang = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBuku = new javax.swing.JTable();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        btnDelete2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Penerbit");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 130, 90, 30);
        getContentPane().add(txtPenerbit);
        txtPenerbit.setBounds(120, 130, 310, 30);

        jLabel2.setText("Kode Buku");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 90, 30);

        jLabel3.setText("Judul Buku");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 50, 90, 30);

        jLabel4.setText("Pengarang");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 90, 90, 30);

        txtKB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKBActionPerformed(evt);
            }
        });
        getContentPane().add(txtKB);
        txtKB.setBounds(120, 10, 310, 30);
        getContentPane().add(txtJB);
        txtJB.setBounds(120, 50, 310, 30);
        getContentPane().add(txtPengarang);
        txtPengarang.setBounds(120, 90, 310, 30);

        tblBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Buku", "Judul Buku", "Pengarang", "Penerbit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblBuku);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 170, 610, 170);

        btnInsert.setText("Insert");
        getContentPane().add(btnInsert);
        btnInsert.setBounds(450, 20, 72, 23);

        btnUpdate.setText("Update");
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(450, 70, 73, 23);

        btnDelete.setText("Delete");
        getContentPane().add(btnDelete);
        btnDelete.setBounds(540, 70, 72, 23);

        btnDelete1.setText("Delete");
        getContentPane().add(btnDelete1);
        btnDelete1.setBounds(450, 120, 72, 23);

        btnDelete2.setText("Delete");
        getContentPane().add(btnDelete2);
        btnDelete2.setBounds(540, 20, 72, 23);

        setSize(new java.awt.Dimension(632, 376));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtKBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKBActionPerformed

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
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnDelete2;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBuku;
    private javax.swing.JTextField txtJB;
    private javax.swing.JTextField txtKB;
    private javax.swing.JTextField txtPenerbit;
    private javax.swing.JTextField txtPengarang;
    // End of variables declaration//GEN-END:variables
}
