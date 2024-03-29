package alfi270423.model;

import java.util.ArrayList;
import java.util.List;
public class AnggotaDaoImpl implements AnggotaDao{
    List<Anggota> data = new ArrayList();

    public AnggotaDaoImpl() {
        data.add(new Anggota("98111","Ali","Padang","L"));
        data.add(new Anggota("98121","Ani","Padang","P"));
    }
    
    public void save(Anggota anggota){
        data.add(anggota);
    }
   
    public void update(int index, Anggota anggota){
        data.set(index, anggota);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Anggota getAnggota(int index){
        return data.get(index);
    }
    public List<Anggota> getAllAnggota(){
        return data;
    }
}
