package alfi240523.dao;

import alfi240523.model.Pengembalian;
import java.sql.SQLException;
import java.util.List;

public interface PengembalianDao {
    void insert(Pengembalian pengembalian) throws SQLException;
    void update(Pengembalian pengembalian) throws SQLException;
    void delete(String nobp) throws SQLException;
    Pengembalian getPengembalian(String nobp) throws SQLException;
    List<Pengembalian> getAll() throws SQLException;
}
