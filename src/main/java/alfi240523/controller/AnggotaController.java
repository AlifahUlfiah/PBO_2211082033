package alfi240523.controller;
import alfi240523.model.*;
import alfi240523.dao.*;
import alfi240523.view.*;
import java.sql.SQLException;
import alfi240523.database.DatabaseHelper;
import java.util.List;
import java.util.logging.*;
import javax.swing.table.DefaultTableModel;

public class AnggotaController {
    FormAnggota view;
    Anggota model;
    AnggotaDao dao;
    
    public AnggotaController(FormAnggota view) {
        this.view = view;
        try {
            dao = new AnggotaDaoImpl(DatabaseHelper.getConnection());
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void clearForm(){
        view.getTxtNOBP().setText("");
        view.getTxtNama().setText("");
        view.getTxtAlamat().setText("");
        view.getCboJK().removeAllItems();
        view.getCboJK().addItem("L");
        view.getCboJK().addItem("P");
    }
    
    public void tampil(){
        try {
            DefaultTableModel tabelModel =
                    (DefaultTableModel) view.getTblAnggota().getModel();
            tabelModel.setRowCount(0);
            List<Anggota> list = dao.getAll();
            for (Anggota anggota : list) {
            Object[] row = {
                anggota.getNobp(),
                anggota.getNama(),
                anggota.getAlamat(),
                anggota.getJenisKelamin()
            };
            tabelModel.addRow(row);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex); } 
    }
    
    public void insert() {
        try {
            model = new Anggota();
            model.setNobp(view.getTxtNOBP().getText());
            model.setNama(view.getTxtNama().getText());
            model.setAlamat(view.getTxtAlamat().getText());
            model.setJenisKelamin(view.getCboJK().getSelectedItem().toString());
            dao.insert(model);
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getAnggota() {
        try {
            String nobp =
                    view.getTblAnggota().getValueAt(view.getTblAnggota().getSelectedRow(),0).toString();
            model = dao.getAnggota(nobp);
            if(model != null) {
                view.getTxtNOBP().setText(model.getNobp());
                view.getTxtNama().setText(model.getNama());
                view.getTxtAlamat().setText(model.getAlamat());
                view.getCboJK().setSelectedItem(model.getJenisKelamin());
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update() {
        try {
            int index = view.getTblAnggota().getSelectedRow();
            model.setNobp(view.getTxtNOBP().getText());
            model.setNama(view.getTxtNama().getText());
            model.setAlamat(view.getTxtAlamat().getText());
            model.setJenisKelamin(view.getCboJK().getSelectedItem().toString());
            dao.update(model);
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
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
}
