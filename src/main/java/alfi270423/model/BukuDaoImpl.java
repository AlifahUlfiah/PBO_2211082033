package alfi270423.model;

import java.util.*;

public class BukuDaoImpl implements BukuDao{
    List<Buku> data = new ArrayList();

    public void save(Buku buku){
        data.add(buku);
    }
   
    public void update(int index, Buku buku){
        data.set(index, buku);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Buku getBuku(int index){
        return data.get(index);
    }

    public List<Buku> getAllBuku(){
        return data;
    }
}