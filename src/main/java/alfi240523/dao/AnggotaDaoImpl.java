package alfi240523.dao;
import java.sql.*;
import alfi240523.model.Anggota;
import java.util.*;
public class AnggotaDaoImpl implements AnggotaDao{
    Connection connection;
    public AnggotaDaoImpl(Connection connection) {
        this.connection = connection;
    }
    
    public void insert(Anggota anggota) throws SQLException{
    String sql = "insert into anggota values(?,?,?,?)";
    PreparedStatement ps = connection.prepareStatement(sql);
    ps.setString(1, anggota.getNobp());
    ps.setString(2,anggota.getNama());
    ps.setString(3, anggota.getAlamat());
    ps.setString(4,anggota.getJenisKelamin());
    ps.executeUpdate();
    }
    
    public void update(Anggota anggota) throws SQLException{
        String sql = "update anggota set nama=?, alamat=?, jenisKelamin=?, where nobp=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        
        ps.setString(1,anggota.getNama());
        ps.setString(2, anggota.getAlamat());
        ps.setString(3,anggota.getJenisKelamin());
        ps.setString(4, anggota.getNobp());
        ps.executeUpdate();
    }
    
    public void delete(String nobp) throws SQLException{
        String sql = "delete from anggota where nobp=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1,nobp);
    }
    
    public Anggota getAnggota(String nobp) throws SQLException{
        String sql = "select * from anggota where nobp=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1,nobp);
        ResultSet rs = ps.executeQuery();
        Anggota anggota = null;
        if(rs.next()){
            anggota = new Anggota();
            anggota.setNobp(rs.getString(1));
            anggota.setNama(rs.getString(2));
            anggota.setAlamat(rs.getString(3));
            anggota.setJenisKelamin(rs.getString(4));
        }
        return anggota;
    }
    
    public List<Anggota> getAll() throws SQLException{
        String sql = "select * from anggota";
        PreparedStatement ps = connection.prepareStatement(sql);
        Anggota anggota = null;
        ResultSet rs = ps.executeQuery();
        List<Anggota> list = new ArrayList<>();
        while(rs.next()){
            anggota = new Anggota();
            anggota.setNobp(rs.getString(1));
            anggota.setNama(rs.getString(2));
            anggota.setAlamat(rs.getString(3));
            anggota.setJenisKelamin(rs.getString(4));
            list.add(anggota);
        }
        return list;
    }
}
