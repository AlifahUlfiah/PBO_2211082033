package alfi240523.controller;

import alfi240523.model.Buku;
import alfi240523.dao.*;
import alfi240523.view.*;
import java.sql.SQLException;
import alfi240523.database.DatabaseHelper;
import java.util.List;
import java.util.logging.*;
import javax.swing.table.DefaultTableModel;

public class BukuController {
    FormBuku view;
    Buku model;
    BukuDao dao;
    
    public BukuController(FormBuku view) {
        this.view = view;
        try {
            dao = new BukuDaoImpl(DatabaseHelper.getConnection());
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void clearForm(){
        view.getTxtKB().setText("");
        view.getTxtJB().setText("");
        view.getTxtPengarang().setText("");
        view.getTxtPenerbit().setText("");
    }
    
    public void tampil(){
        try {
            DefaultTableModel tabelModel =
                    (DefaultTableModel) view.getTblBuku().getModel();
            tabelModel.setRowCount(0);
            List<Buku> list = dao.getAll();
            for (Buku buku : list) {
            Object[] row = {
                buku.getKodeBuku(),
                buku.getJudulBuku(),
                buku.getPengarang(),
                buku.getPenerbit()
            };
            tabelModel.addRow(row);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE, null, ex); } 
    }
    
    public void insert() {
        try {
            model = new Buku();
            model.setKodeBuku(view.getTxtKB().getText());
            model.setJudulBuku(view.getTxtJB().getText());
            model.setPengarang(view.getTxtPengarang().getText());
            model.setPenerbit(view.getTxtPenerbit().getText());
            dao.insert(model);
        } catch (SQLException ex) {
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getBuku() {
        try {
            String nobp =
                    view.getTblBuku().getValueAt(view.getTblBuku().getSelectedRow(),0).toString();
            model = dao.getBuku(nobp);
            if(model != null) {
                view.getTxtKB().setText(model.getKodeBuku());
                view.getTxtJB().setText(model.getJudulBuku());
                view.getTxtPengarang().setText(model.getPengarang());
                view.getTxtPenerbit().setText(model.getPenerbit());
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update() {
        try {
            int index = view.getTblBuku().getSelectedRow();
            model.setKodeBuku(view.getTxtKB().getText());
            model.setJudulBuku(view.getTxtJB().getText());
            model.setPengarang(view.getTxtPengarang().getText());
            model.setPenerbit(view.getTxtPenerbit().getText());
            dao.update(model);
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delete() {
        try {
            String nobp = view.getTxtJB().getText();
            dao.delete(nobp);
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
