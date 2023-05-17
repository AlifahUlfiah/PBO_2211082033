package alfi270423.controller;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import alfi270423.model.Buku;
import alfi270423.model.BukuDao;
import alfi270423.model.BukuDaoImpl;
import alfi270423.view.FormBuku;

public class BukuController {
    private FormBuku formBuku;
    private Buku buku;
    private BukuDao bukuDao;
   
    public BukuController(FormBuku formBuku) {
        this.formBuku = formBuku;
        bukuDao = new BukuDaoImpl();
    }
    
    public void bersihForm() {
        formBuku.txtKB().setText("");
        formBuku.txtJudul().setText("");
        formBuku.txtPengarang().setText("");
        formBuku.txtPenerbit().setText("");
        formBuku.txtTahun().setText("");
    }
    
    public void saveBuku() {
        buku = new Buku();
        buku.setKodeBuku(formBuku.txtKB().getText());
        buku.setJudul(formBuku.txtJudul().getText());
        buku.setPengarang(formBuku.txtPengarang().getText());
        buku.setPenerbit(formBuku.txtPenerbit().getText());
        buku.setTahun(formBuku.txtTahun().getText());
        bukuDao.save(buku);
        JOptionPane.showMessageDialog(formBuku, "Insert OK");
    }
    
    public void getBuku() {
        int index = formBuku.tblBuku().getSelectedRow();
        buku = bukuDao.getBuku(index);
        if(buku!=null) {
            formBuku.txtKB().setText(buku.getKodeBuku());
            formBuku.txtJudul().setText(buku.getJudul());
            formBuku.txtPengarang().setText(buku.getPengarang());
            formBuku.txtPenerbit().setText(buku.getPenerbit());
            formBuku.txtTahun().setText(buku.getTahun());
        }
    }
    
    public void updateBuku() {
        int index = formBuku.tblBuku().getSelectedRow();
        buku.setKodeBuku(formBuku.txtKB().getText());
        buku.setJudul(formBuku.txtJudul().getText());
        buku.setPengarang(formBuku.txtPengarang().getText());
        buku.setPenerbit(formBuku.txtPenerbit().getText());
        buku.setTahun(formBuku.txtTahun().getText());
        bukuDao.update(index, buku);
        JOptionPane.showMessageDialog(formBuku, "Update OK");
    }
    
    public void delete() {
        int index = formBuku.tblBuku().getSelectedRow();
        bukuDao.delete(index);
        JOptionPane.showMessageDialog(formBuku, "Delete OK");
    }
    
    public void tampil() {
    DefaultTableModel tabelModel = 
    (DefaultTableModel) formBuku.tblBuku().getModel();
    tabelModel.setRowCount(0);
    List<Buku> list = bukuDao.getAllBuku();
    for (Buku buku1 : list) {
        Object row[] = {
            buku1.getKodeBuku(),
            buku1.getJudul(),
            buku1.getPengarang(),
            buku1.getPenerbit(),
            buku1.getTahun()
        };
        tabelModel.addRow(row);
        }
    }
}
