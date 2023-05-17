package UTS_B.model;
import java.util.List;
public interface PembayaranDao {
    void save(Pembayaran pembayaran);
    void update(int index, Pembayaran pembayaran);
    void delete(int index);
    Pembayaran getPembayaran(int index);
    public List<Pembayaran> getAllPembayaran();
}
