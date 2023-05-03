
package alfi260423;

import java.util.List;

public interface AnggotaDao {
    Anggota save (Anggota anggota);
    Anggota update (int index, Anggota anggota);
    void delete (int index);
    Anggota getAnggota (int index);
    List<Anggota> getAllAnggota();
}