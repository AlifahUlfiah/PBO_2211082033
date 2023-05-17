package UTS_B.model;

public class Pembayaran {
    private String kodePesanan;
    private String namaPemesan;
    private String tglPesan;
    private String harga;
    private String ongkir;
    private String diskon;
    private int total;
    
    public Pembayaran () {}
    
    public Pembayaran(String kodePesanan, String namaPesanan, String tglPesan, String harga, String ongkir, String diskon, int total) {
        this.kodePesanan = kodePesanan;
        this.namaPemesan = namaPemesan;
        this.tglPesan = tglPesan;
        this.harga = harga;
        this.ongkir = ongkir;
        this.diskon = diskon;
        this.total = total;
    }
    
    public String getKodePesanan() {
        return kodePesanan;
    }
    
    public String getNamaPemesan() {
        return namaPemesan;
    }
    
    public String getTglPesan() {
        return tglPesan;
    }
    
    public String getHarga() {
        return harga;
    }
    
    public String getOngkir() {
        return ongkir;
    }
    
    public String getDiskon() {
        return diskon;
    }
    
    public String getTotal() {
        return (harga + ongkir);
    }
    
    ///////////////////////////////////////
    
    public void setKodePesanan(String kodePesanan) {
        this.kodePesanan = kodePesanan;
    }
    
    public void setNamaPemesan(String namaPemesan) {
        this.namaPemesan = namaPemesan;
    }
    
    public void setTglPesan(String tglPesan) {
        this.tglPesan = tglPesan;
    }
    
    public void setHarga(String harga) {
        this.harga = harga;
    }
    
    public void setOngkir(String ongkir) {
        this.ongkir = ongkir;
    }
    
    public void setDiskon(String diskon) {
        this.diskon = diskon;
    }
    
    public void setTotal(int total){
        this.total = total;
    }
}
