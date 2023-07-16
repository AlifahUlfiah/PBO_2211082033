package alfi240523.dao;

import java.sql.*;
import alfi240523.model.*;
import java.util.*;

public class PeminjamanDaoImpl implements PeminjamanDao{
    Connection connection;
    public PeminjamanDaoImpl (Connection connection) {
        this.connection = connection;
    }

    public void insert(Peminjaman peminjaman) throws SQLException {
        String sql = "Insert into peminjaman values (?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, peminjaman.getNobp());
        ps.setString(2, peminjaman.getKodeBuku());
        ps.setString(3, peminjaman.getTglPinjam());
        ps.setString(4, peminjaman.getTglKembali());
        ps.executeUpdate();
    }
    
    public void update(Peminjaman peminjaman) throws SQLException {
        String sql= "Update peminjaman set tglKembali=? "+"where nobp=? and kodebuku=? and tglpinjam=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1,peminjaman.getNobp());
        ps.setString(2,peminjaman.getKodeBuku());
        ps.setString(3,peminjaman.getTglPinjam());
        ps.setString(4,peminjaman.getTglKembali());
        ps.executeUpdate();
    }
    
    public void delete(String nobp) throws SQLException {
        String sql = "Delete from peminjaman where nobp=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, nobp);
        ps.executeUpdate();
    }
    
    public Peminjaman getPeminjaman(String nobp) throws SQLException {
        String sql = "Select * from peminjaman where nobp=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, nobp);
        ResultSet rs = ps.executeQuery();
        Peminjaman peminjaman = null;
        if(rs.next()) {
            peminjaman = new Peminjaman();
            peminjaman.setNobp(rs.getString(1));
            peminjaman.setKodeBuku(rs.getString(2));
            peminjaman.setTglPinjam(rs.getString(3));
            peminjaman.setTglKembali(rs.getString(4));
        }
        return peminjaman;
    }
    
    public List<Peminjaman> getAll() throws SQLException {
        String sql = "Select * from peminjaman";
        PreparedStatement ps = connection.prepareStatement(sql);
        Peminjaman peminjaman;
        ResultSet rs = ps.executeQuery();
        List <Peminjaman> list = new ArrayList<>();
        while (rs.next()) {
            peminjaman = new Peminjaman();
            peminjaman.setNobp(rs.getString(1));
            peminjaman.setKodeBuku(rs.getString(2));
            peminjaman.setTglPinjam(rs.getString(3));
            peminjaman.setTglKembali(rs.getString(4));
        }
        return list;
    }
}
