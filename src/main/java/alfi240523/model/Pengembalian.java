package alfi240523.model;

public class Pengembalian {
    private String nobp;
    private String kodeBuku;
    private String tglPinjam;
    private String tglKembali;
    private String terlambat;
    private String denda;

    public Pengembalian() {}

    public Pengembalian(String nobp, String kodeBuku, String tglPinjam, String tglKembali, String terlambat, String denda) {
        this.nobp = nobp;
        this.kodeBuku = kodeBuku;
        this.tglPinjam = tglPinjam;
        this.tglKembali = tglKembali;
        this.terlambat = terlambat;
        this.denda = denda;
    }

    public String getNobp() {
        return nobp;
    }

    public void setNobp(String nobp) {
        this.nobp = nobp;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getTglPinjam() {
        return tglPinjam;
    }

    public void setTglPinjam(String tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public String getTglKembali() {
        return tglKembali;
    }

    public void setTglKembali(String tglKembali) {
        this.tglKembali = tglKembali;
    }

    public String getTerlambat() {
        return terlambat;
    }

    public void setTerlambat(String terlambat) {
        this.terlambat = terlambat;
    }

    public String getDenda() {
        return denda;
    }

    public void setDenda(String denda) {
        this.denda = denda;
    }
}