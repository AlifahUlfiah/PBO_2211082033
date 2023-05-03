package alfi260423;

public class Anggota {
    private String nama;
    private String nobp;
    private String alamat;
    
    public Anggota() {}
    
    public Anggota(String nama, String nobp, String alamat){
        this.nama = nama;
        this.nobp = nobp ;
        this.alamat = alamat;
    }
    
    public String getNobp(){
        return nobp;
    }
    
    public void setNobp(String nobp){
        this.nobp = nobp;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
}
