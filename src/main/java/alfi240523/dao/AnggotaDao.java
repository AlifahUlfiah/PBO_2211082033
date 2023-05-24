package alfi240523.dao;
import alfi240523.model.Anggota;
import java.sql.SQLException;
import java.util.List;
public interface AnggotaDao {
    void insert(Anggota anggota) throws SQLException;
    void update(Anggota anggota) throws SQLException;
    void delete(String nobp) throws SQLException;
    Anggota getAnggota(String nobp) throws SQLException;
    List<Anggota> getAll() throws SQLException;
}
