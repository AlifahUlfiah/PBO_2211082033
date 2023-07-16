package alfi240523.dao;

import java.sql.*;
import alfi240523.model.*;
import java.util.*;

public class PengembalianDaoImpl implements PengembalianDao {
    Connection connection;
    public PengembalianDaoImpl (Connection connection) {
        this.connection = connection;
    }

    public void insert(Pengembalian pengembalian) throws SQLException {
        String sql = "Insert into pengembalian values (?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, pengembalian.getNobp());
        ps.setString(2, pengembalian.getKodeBuku());
        ps.setString(3, pengembalian.getTglPinjam());
        ps.setString(4, pengembalian.getTglKembali());
        ps.setString(5, pengembalian.getTerlambat());
        ps.setString(6, pengembalian.getDenda());
        ps.executeUpdate();
    }
    
    public void update(Pengembalian pengembalian) throws SQLException {
        String sql= "Update pengembalian set tglKembali=? "+"where nobp=? and kodebuku=? and tglpinjam=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1,pengembalian.getNobp());
        ps.setString(2,pengembalian.getKodeBuku());
        ps.setString(3,pengembalian.getTglPinjam());
        ps.setString(4,pengembalian.getTglKembali());
        ps.setString(5, pengembalian.getTerlambat());
        ps.setString(6, pengembalian.getDenda());
        ps.executeUpdate();
    }
    
    public void delete(String nobp) throws SQLException {
        String sql = "Delete from pengembalian where nobp=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, nobp);
        ps.executeUpdate();
    }
    
    public Pengembalian getPengembalian(String nobp) throws SQLException {
        String sql = "Select * from pengembalian where nobp=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, nobp);
        ResultSet rs = ps.executeQuery();
        Pengembalian pengembalian = null;
        if(rs.next()) {
            pengembalian = new Pengembalian();
            pengembalian.setNobp(rs.getString(1));
            pengembalian.setKodeBuku(rs.getString(2));
            pengembalian.setTglPinjam(rs.getString(3));
            pengembalian.setTglKembali(rs.getString(4));
            pengembalian.setTerlambat(rs.getString(5));
            pengembalian.setDenda(rs.getString(6));
        }
        return pengembalian;
    }
    
    public List<Pengembalian> getAll() throws SQLException {
        String sql = "Select * from pengembalian";
        PreparedStatement ps = connection.prepareStatement(sql);
        Pengembalian pengembalian;
        ResultSet rs = ps.executeQuery();
        List <Pengembalian> list = new ArrayList<>();
        while (rs.next()) {
            pengembalian = new Pengembalian();
            pengembalian.setNobp(rs.getString(1));
            pengembalian.setKodeBuku(rs.getString(2));
            pengembalian.setTglPinjam(rs.getString(3));
            pengembalian.setTglKembali(rs.getString(4));
            pengembalian.setTerlambat(rs.getString(5));
            pengembalian.setDenda(rs.getString(6));
        }
        return list;
    }
}
