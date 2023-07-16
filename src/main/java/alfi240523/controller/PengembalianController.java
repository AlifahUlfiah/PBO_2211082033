package alfi240523.controller;

import alfi240523.model.*;
import alfi240523.dao.*;
import alfi240523.view.*;
import java.sql.SQLException;
import alfi240523.database.DatabaseHelper;
import java.util.List;
import java.util.logging.*;
import javax.swing.table.DefaultTableModel;

public class PengembalianController {
    FormPengembalian view;
    Pengembalian model;
    PengembalianDao dao;
    AnggotaDao anggotadao;
    BukuDao bukudao;
    PeminjamanDao peminjamandao;
    
    public PengembalianController(FormPengembalian view) {
        try {
        this.view = view;
        dao = new PengembalianDaoImpl(DatabaseHelper.getConnection());
        anggotadao = new AnggotaDaoImpl(DatabaseHelper.getConnection());
        bukudao = new BukuDaoImpl(DatabaseHelper.getConnection());
        } catch (SQLException ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void clearForm(){
        view.getTxtDenda().setText("");
        view.getTxtKembali().setText("");
        view.getTxtDikembalikan().setText("");
        view.getTxtPinjam().setText("");
    }
    
    public void isiCboAnggota(){
        try {
        view.getCboNobp().removeAllItems();
        List<Anggota> list = anggotadao.getAll();
        for(Anggota anggota : list) {
            view.getCboNobp().addItem(anggota.getNobp()+"-"+anggota.getNama());
            
        } } catch (SQLException ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void isiCboBuku() {
        view.getCboKB().removeAllItems();
        for(Buku buku : list){
            view.getCboKB().addItem(buku.getKodeBuku()+"-"+buku.getJudulBuku());
        }
    }
    
    public void tampilTabel(){
        try {
            DefaultTableModel tabelModel =
                    (DefaultTableModel) view.getTblPengembalian().getModel();
            tabelModel.setRowCount(0);
            List<Pengembalian> list = dao.getAll();
            for (Pengembalian pengembalian : list) {
                Anggota anggota = anggotadao.getAnggota(pengembalian.getNobp());
                Buku buku = bukudao.getBuku(pengembalian.getKodeBuku());
                Peminjaman peminjaman = peminjamandao.getPeminjaman(pengembalian.getNobp());
            Object[] row = {
                pengembalian.getNobp(),
                pengembalian.getKodeBuku(),
                pengembalian.getTglPinjam(),
                pengembalian.getTglKembali(),
                pengembalian.getTerlambat(),
                pengembalian.getDenda()
            };
            tabelModel.addRow(row);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE, null, ex); } 
    }
    
    public void insert() {
        try {
            model = new Pengembalian();
            model.setKodeBuku(view.getCboKB().getSelectedItem().toString().split("-")[0]);
            model.setNobp(view.getCboNobp().getSelectedItem().toString().split("-")[0]);
            model.setTglPinjam(view.getTxtPinjam().getText());
            model.setTglKembali(view.getTxtKembali().getText());
            model.setTerlambat(view.getTxtTerlambat().getText());
            model.setDenda(view.getTxtDenda().getText());
            dao.insert(model);
        } catch (SQLException ex) {
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update() {
        try {
            int index = view.getTblPengembalian().getSelectedRow();
            model.setKodeBuku(view.getCboKB().getSelectedItem().toString().split("-")[0]);
            model.setNobp(view.getCboNobp().getSelectedItem().toString().split("-")[0]);
            model.setTglPinjam(view.getTxtPinjam().getText());
            model.setTglKembali(view.getTxtKembali().getText());
            model.setTerlambat(view.getTxtTerlambat().getText());
            model.setDenda(view.getTxtDenda().getText());
            dao.update(model);
        } catch (SQLException ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delete() {
        try {
            String nobp = view.getTxtNobp().getText();
            dao.delete(nobp);
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getPengembalian() {
        try {
            String nobp =
                    view.getTblPengembalian().getValueAt(view.getTblPengembalian().getSelectedRow(),0).toString();
            model = dao.getPengembalian(nobp);
            String kodeBuku =  
                    view.getTblPengembalian().getValueAt(view.getTblPengembalian().getSelectedRow(),2).toString();
            model = dao.getPengembalian(nobp);
            String tglPinjam =
                    view.getTblPengembalian().getValueAt(view.getTblPengembalian().getSelectedRow(),4).toString();
            model = dao.getPengembalian(nobp);
            
            model = dao.getPengembalian(nobp, kodeBuku, tglpinjam);
            Anggota anggota = anggotadao.getAnggota(model.getNobp());
            view.getCboNobp().getSelectedItem(anggota.getNobp()+"-"+anggota.getNama());
            Buku buku = bukudao.getBuku(model.getKodeBuku());
            view.getCboKB().getSelectedItem(buku.getKodeBuku()+"-"+buku.getJudulBuku());
            
            view.getTxtPinjam().setText(model.getTglPinjam());
            view.getTxtKembali().setText(model.getTglKembali());
        } catch (SQLException ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

