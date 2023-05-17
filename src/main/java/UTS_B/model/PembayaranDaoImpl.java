package UTS_B.model;
import java.util.*;
public class PembayaranDaoImpl implements PembayaranDao{
    List<Pembayaran> data = new ArrayList();

    @Override
    public void save(Pembayaran pembayaran){
        data.add(pembayaran);
    }
   
    @Override
    public void update(int index, Pembayaran pembayaran){
        data.set(index, pembayaran);
    }
    
    @Override
    public void delete(int index){
        data.remove(index);
    }
    
    @Override
    public Pembayaran getPembayaran(int index){
        return data.get(index);
    }

    @Override
    public List<Pembayaran> getAllPembayaran(){
        return data;
    }
}
