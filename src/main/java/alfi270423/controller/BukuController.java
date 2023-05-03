package alfi270423.controller;


import javax.swing.JOptionPane;
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
}
