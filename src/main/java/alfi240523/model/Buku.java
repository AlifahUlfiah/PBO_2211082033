package alfi240523.model;

public class Buku {
    private String kodeBuku;
    private String judulBuku;
    private String pengarang;
    private String penerbit;
    
    public Buku(){}
    
    public Buku(String nobp, String judulBuku, String pengarang, String penerbit) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
    }
    
    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }
    
    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }
    
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
    
    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
    
    
    public String getKodeBuku() {
        return kodeBuku;
    }
    
    public String getJudulBuku() {
        return judulBuku;
    }
    
    public String getPengarang() {
        return pengarang;
    }
    
    public String getPenerbit() {
        return penerbit;
    }
}
