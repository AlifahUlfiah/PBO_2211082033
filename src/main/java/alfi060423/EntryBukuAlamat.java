package alfi060423;

public class EntryBukuAlamat {
    private String nama;
    private String alamat; 
    private String email;
    private String telepon;
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getTelepon(){
        return telepon;
    }
    
    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
    
    public EntryBukuAlamat(){
        
    }
    
    public EntryBukuAlamat(String temp){
        this.nama = temp;
    }
    
    public EntryBukuAlamat(String nama, String alamat, String email, String telepon){ 
        this.nama = nama;
        this.alamat = alamat;
        this.email = email;
        this.telepon = telepon; 
    } 
}
