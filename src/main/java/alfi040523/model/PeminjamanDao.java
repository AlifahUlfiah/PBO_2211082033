
package alfi040523.model;
import java.util.List;
public interface PeminjamanDao {
    void save(Peminjaman peminjaman );
    void update(int index, Peminjaman peminjaman );
    void delete(int index);
    Peminjaman getPeminjaman(int index);
    public List<Peminjaman> getAllPeminjaman();
}
