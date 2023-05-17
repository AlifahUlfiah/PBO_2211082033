package UTS_B.controller;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import UTS_B.model.*;
import UTS_B.view.*;

public class PembayaranController {
    private FormPembayaran formPembayaran;
    private Pembayaran pembayaran;
    private PembayaranDao pembayaranDao;
    
    public PembayaranController(FormPembayaran formPembayaran) {
        this.formPembayaran = formPembayaran;
        pembayaranDao = new PembayaranDaoImpl();
    }
    
    public void bersihForm() {
        formPembayaran.TxtKodePesanan().setText("");
        formPembayaran.TxtNamaPemesan().setText("");
        formPembayaran.TxtTglPesan().setText("");
        formPembayaran.TxtHarga().setText("");
        formPembayaran.TxtOngkir().setText("");
        formPembayaran.TxtDiskon().setText("");
    }
    
    public void savePembayaran() {
        pembayaran = new Pembayaran();
        pembayaran.setKodePesanan(formPembayaran.TxtKodePesanan().getText());
        pembayaran.setNamaPemesan(formPembayaran.TxtNamaPemesan().getText());
        pembayaran.setTglPesan(formPembayaran.TxtTglPesan().getText());
        pembayaran.setHarga(formPembayaran.TxtHarga().getText());
        pembayaran.setOngkir(formPembayaran.TxtOngkir().getText());
        pembayaran.setDiskon(formPembayaran.TxtDiskon().getText());
        pembayaranDao.save(pembayaran);
        JOptionPane.showMessageDialog(formPembayaran, "Save OK");
    }
    
    public void getPembayaran() {
        int index = formPembayaran.TblPesan().getSelectedRow();
        pembayaran = pembayaranDao.getPembayaran(index);
        if(pembayaran != null) {
            formPembayaran.TxtKodePesanan().setText(pembayaran.getKodePesanan());
            formPembayaran.TxtNamaPemesan().setText(pembayaran.getNamaPemesan());
            formPembayaran.TxtTglPesan().setText(pembayaran.getTglPesan());
            formPembayaran.TxtHarga().setText(pembayaran.getHarga());
            formPembayaran.TxtOngkir().setText(pembayaran.getOngkir());
            formPembayaran.TxtDiskon().setText(pembayaran.getDiskon());
        }
    }
    
    public void updatePembayaran() {
        int index = formPembayaran.TblPesan().getSelectedRow();
        pembayaran.setKodePesanan(formPembayaran.TxtKodePesanan().getText());
        pembayaran.setNamaPemesan(formPembayaran.TxtNamaPemesan().getText());
        pembayaran.setTglPesan(formPembayaran.TxtTglPesan().getText());
        pembayaran.setHarga(formPembayaran.TxtHarga().getText());
        pembayaran.setOngkir(formPembayaran.TxtOngkir().getText());
        pembayaran.setDiskon(formPembayaran.TxtDiskon().getText());
        pembayaranDao.update(index, pembayaran);
        JOptionPane.showMessageDialog(formPembayaran, "Update OK");
    }
    
    public void delete() {
        int index = formPembayaran.TblPesan().getSelectedRow();
        pembayaranDao.delete(index);
        JOptionPane.showMessageDialog(formPembayaran, "Delete OK");
    }
    
    public void tampil() {
    DefaultTableModel tabelModel = 
    (DefaultTableModel) formPembayaran.TblPesan().getModel();
    tabelModel.setRowCount(0);
    List<Pembayaran> list = pembayaranDao.getAllPembayaran();
    for (Pembayaran pembayaran : list) {
        Object row[] = {
            pembayaran.getKodePesanan(),
            pembayaran.getNamaPemesan(),
            pembayaran.getTglPesan(),
            pembayaran.getHarga(),
            pembayaran.getOngkir(),
            pembayaran.getDiskon()
        };
        tabelModel.addRow(row);
        }
    }
}
