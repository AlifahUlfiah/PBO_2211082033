package alfi240523.dao;

import alfi240523.model.Buku;
import java.sql.SQLException;
import java.util.List;

public interface BukuDao {
    void insert(Buku buku) throws SQLException;
    void update(Buku buku) throws SQLException;
    void delete(String kodebuku) throws SQLException;
    Buku getBuku(String kodebuku) throws SQLException;
    List<Buku> getAll() throws SQLException;
}
