package alfi270423.model;

import java.util.*;

public class BukuDaoImpl implements BukuDao{
    List<Buku> data = new ArrayList();

    @Override
    public void save(Buku buku){
        data.add(buku);
    }
   
    @Override
    public void update(int index, Buku buku){
        data.set(index, buku);
    }
    
    @Override
    public void delete(int index){
        data.remove(index);
    }
    
    @Override
    public Buku getBuku(int index){
        return data.get(index);
    }

    @Override
    public List<Buku> getAllBuku(){
        return data;
    }
}