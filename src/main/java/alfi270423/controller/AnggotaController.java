package alfi270423.controller;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import alfi270423.model.Anggota;
import alfi270423.model.AnggotaDao;
import alfi270423.model.AnggotaDaoImpl;
import alfi270423.view.FormAnggota;

public class AnggotaController {
    private FormAnggota formAnggota;
    private Anggota anggota;
    private AnggotaDao anggotaDao;
    
    public AnggotaController(FormAnggota formAnggota) {
        this.formAnggota = formAnggota;
        anggotaDao = new AnggotaDaoImpl();
    }
    
    public void IsiCboJenisKelamin() {
        formAnggota.getCboJK().removeAllItems();
        formAnggota.getCboJK().addItem("L");
        formAnggota.getCboJK().addItem("P");
    }
   
    public void bersihForm() {
        formAnggota.getTxtAlamat().setText("");
        formAnggota.getTxtNamaAnggota().setText("");
        formAnggota.getTxtKodeAnggota().setText("");
    }
    
    public void getAnggota() {
        int index = formAnggota.getTblAnggota().getSelectedRow();
        anggota = anggotaDao.getAnggota(index);
        if(anggota!=null) {
            formAnggota.getTxtKodeAnggota().setText(anggota.getKodeAnggota());
            formAnggota.getTxtNamaAnggota().setText(anggota.getNamaAnggota());
            formAnggota.getTxtAlamat().setText(anggota.getAlamat());
            formAnggota.getCboJK().setSelectedItem(anggota.getJenisKelamin());
        }
    }
    
    public void saveAnggota() {
        anggota = new Anggota();
        anggota.setNamaAnggota(formAnggota.getTxtNamaAnggota().getText());
        anggota.setKodeAnggota(formAnggota.getTxtKodeAnggota().getText());
        anggota.setAlamat(formAnggota.getTxtAlamat().getText());
        anggota.setJenisKelamin(formAnggota.getCboJK().getSelectedItem().toString());
        anggotaDao.save(anggota);
        JOptionPane.showMessageDialog(formAnggota, "Insert OK");
    }
    
    public void updateAnggota() {
        int index = formAnggota.getTblAnggota().getSelectedRow();        
        anggota.setKodeAnggota(formAnggota.getTxtKodeAnggota().getText());
        anggota.setNamaAnggota(formAnggota.getTxtNamaAnggota().getText());
        anggota.setAlamat(formAnggota.getTxtAlamat().getText());
        anggota.setJenisKelamin(formAnggota.getCboJK().getSelectedItem().toString());
        anggotaDao.save(anggota);
        JOptionPane.showMessageDialog(formAnggota, "Update OK");
    }
    
    public void delete() {
        int index = formAnggota.getTblAnggota().getSelectedRow();
        anggotaDao.delete(index);
        JOptionPane.showMessageDialog(formAnggota, "Delete OK");
    }
    
    public void tampil() {
    DefaultTableModel tabelModel = 
    (DefaultTableModel) formAnggota.getTblAnggota().getModel();
    tabelModel.setRowCount(0);
    List<Anggota> list = anggotaDao.getAllAnggota();
    for (Anggota anggota1 : list) {
        Object row[] = {
            anggota1.getKodeAnggota(),
            anggota1.getNamaAnggota(),
            anggota1.getJenisKelamin(),
            anggota1.getAlamat()
        };
        tabelModel.addRow(row);
        }
    }
    
    
}
