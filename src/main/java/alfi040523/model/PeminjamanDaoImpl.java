package alfi040523.model;
import alfi270423.model.AnggotaDao;
import alfi270423.model.AnggotaDaoImpl;
import alfi270423.model.BukuDao;
import alfi270423.model.BukuDaoImpl;
import java.util.List;
import java.util.ArrayList;

public class PeminjamanDaoImpl implements PeminjamanDao{
    List<Peminjaman> data = new ArrayList<>();
    public PeminjamanDaoImpl(){
        AnggotaDao daoAnggota = new AnggotaDaoImpl();
        BukuDao daoBuku = new BukuDaoImpl();
        data.add(new Peminjaman(daoAnggota.getAnggota(0),daoBuku.getBuku(0)
                ,"27-04-2023","02-05-2023"));
        data.add(new Peminjaman(daoAnggota.getAnggota(0),daoBuku.getBuku(1)
                ,"15-04-2023","01-05-2023"));
    }
    public void save(Peminjaman peminjaman){
        data.add(peminjaman);
    }
    public void update(int idx, Peminjaman peminjaman){
        data.set(idx, peminjaman);
    }
    public void delete(int idx){
        data.remove(idx);
    }
    public Peminjaman getPeminjaman(int idx){
        return data.get(idx);
    }
    public List<Peminjaman> getAllPeminjaman(){
        return data;
    } 
}