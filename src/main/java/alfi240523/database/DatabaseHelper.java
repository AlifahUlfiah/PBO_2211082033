package alfi240523.database;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import alfi240523.model.*;
import alfi240523.dao.*;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.util.logging.Level;
public class DatabaseHelper {
    private static Connection connection;
    
    public static Connection getConnection() throws SQLException{
        if(connection == null) {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setUrl("");
            dataSource.setUser("root");
            dataSource.setPassword("");
            
            connection = dataSource.getConnection();
        }
        return connection;
    }
    
    public static void main(String args []) {
        try{
            Anggota anggota = new Anggota();
            anggota.setNobp("2211082033");
            anggota.setNama("Alifah Ulfiah");
            anggota.setAlamat("Padang");
            anggota.setJenisKelamin("P");
            AnggotaDao dao = new AnggotaDaoImpl(connection);
            dao.insert(anggota);
            JOptionPane.showMessageDialog(null, "Koneksi OK");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            Logger.getLogger(DatabaseHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
