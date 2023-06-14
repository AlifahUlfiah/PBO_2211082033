package alfi240523.dao;

import alfi240523.model.Peminjaman;
import java.sql.SQLException;
import java.util.List;

        
public interface PeminjamanDao {
    void insert(Peminjaman peminjaman) throws SQLException;
    void update(Peminjaman peminjaman) throws SQLException;
    void delete(String nobp) throws SQLException;
    Peminjaman getPeminjaman(String nobp) throws SQLException;
    List<Peminjaman> getAll() throws SQLException;
}