package alfi240523.controller;

import alfi240523.model.*;
import alfi240523.dao.*;
import alfi240523.view.*;
import java.sql.SQLException;
import alfi240523.database.DatabaseHelper;
import java.util.List;
import java.util.logging.*;
import javax.swing.table.DefaultTableModel;

/*
public class PeminjamanController {
    FormPeminjaman view;
    Peminjaman model;
    PeminjamanDao dao;
    AnggotaDao anggotadao;
    BukuDao bukudao;
    
    public PeminjamanController(FormPeminjaman view) {
        try {
        this.view = view;
        dao = new PeminjamanDaoImpl(DatabaseHelper.getConnection());.≥≥≤/
        anggotadao = new AnggotaDaoImpl(DatabaseHelper.getConnection());
        bukudao = new BukuDaoImpl(DatabaseHelper.getConnection());
        } catch (SQLException ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void clearForm(){
        view.getTxtPinjam().setText("");
        view.getTxtKembali().setText("");
    }
    
    public void isiComboAnggota(){
        try {
        view.getCboNobp().removeAllItems();
        List<Peminjaman> list = PeminjamanDao.getAll();
        for(Peminjaman p : list) {
            Anggota anggota = anggotaDao.getAnggota(p.getNobp());
            view.getcboNobp().addItem(getNobp()+"-"+anggota.getNama());
            
        } } catch (SQLException ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void isiComboBuku() {
        view.getCboKB().removeAllItems();
        for(Buku buku){
            
        }
    }
    
    public void tampil(){
        try {
            DefaultTableModel tabelModel =
                    (DefaultTableModel) view.getTblPeminjaman().getModel();
            tabelModel.setRowCount(0);
            List<Peminjaman> list = dao.getAll();
            for (Peminjaman peminjaman : list) {
            Object[] row = {
                peminjaman.getNobp(),
                peminjaman.getKodeBuku(),
                peminjaman.getTglPinjam(),
                peminjaman.getTglKembali()
            };
            tabelModel.addRow(row);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE, null, ex); } 
    }
    
    public void insert() {
        try {
            model = new Peminjaman();
            model.setKodeBuku(view.getCboKB().getSelectedItem().toString()split("-")[0]);
            model.setNobp(view.getCboNobp().getSelectedItem().toString()split("-")[0]);
            model.setTglPinjam(view.getTxtPinjam().getText());
            model.setTglKembali(view.getTxtKembali().getText());
            dao.insert(model);
        } catch (SQLException ex) {
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update() {
        try {
            int index = view.getTblPeminjaman().getSelectedRow();
            model.setKodeBuku(view.getCboKB().getSelectedItem().toString()split("-")[0]);
            model.setNobp(view.getCboNobp().getSelectedItem().toString()split("-")[0]);
            model.setTglPinjam(view.getTxtPinjam().getText());
            model.setTglKembali(view.getTxtKembali().getText());
            dao.update(model);
        } catch (SQLException ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delete() {
        try {
            String nobp = view.getTxtNOBP().getText();
            dao.delete(nobp);
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getPeminjaman() {
        try {
            String nobp =
                    view.getTblPeminjaman().getValueAt(view.getTblPeminjaman().getSelectedRow(),0).toString();
            model = dao.getPeminjaman(nobp);
            String kodeBuku =  
                    view.getTblPeminjaman().getValueAt(view.getTblPeminjaman().getSelectedRow(),0).toString();
            model = dao.getPeminjaman(nobp);
            String tglPinjam =
                    view.getTblPeminjaman().getValueAt(view.getTblPeminjaman().getSelectedRow(),0).toString();
            model = dao.getPeminjaman(nobp);
            
            model = dao.getPeminjaman(nobp, kodeBuku, tglpinjam);
            Anggota anggota = anggotadao.getAnggota(model.getNobp());
            view.getCboNobp().getSelectedItem(anggota.getNobp()+"-"+anggota.getNama());
            Buku buku = bukudao.getBuku(model.getKodeBuku());
            view.getCboKB().getSelectedItem(buku.getKodeBuku()+"-"+buku.getJudulBuku());
            
            view.getTxtPinjam().setText(model.getTglPinjam());
            view.getTxtKembali().setText(model.getTglKembali());
        } catch (SQLException ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
*/