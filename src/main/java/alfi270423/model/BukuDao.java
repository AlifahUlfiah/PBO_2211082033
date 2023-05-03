package alfi270423.model;
import java.util.List;
public interface BukuDao {
    void save(Buku buku );
    void update(int index, Buku buku);
    void delete(int index);
    Buku getBuku(int index);
    public List<Buku> getAllBuku();
}
