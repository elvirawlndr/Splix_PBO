package SPLIX;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Musik {
    private int ID_Musik;
    private String Judul_Musik;
    private String Nama_Penyanyi;
    private String Judul_Album;
    private String Genre_Musik;
    private LocalDate TglRilis_Musik;
    private LocalTime Durasi_Musik;
    private int JumPutar_Musik;

    public int getID_Musik() {
        return ID_Musik;
    }

    public void setID_Musik(int ID_Musik) {
        this.ID_Musik = ID_Musik;
    }

    public String getJudul_Musik() {
        return Judul_Musik;
    }

    public void setJudul_Musik(String Judul_Musik) {
        this.Judul_Musik = Judul_Musik;
    }

    public String getNama_Penyanyi() {
        return Nama_Penyanyi;
    }

    public void setNama_Penyanyi(String Nama_Penyanyi) {
        this.Nama_Penyanyi = Nama_Penyanyi;
    }

    public String getJudul_Album() {
        return Judul_Album;
    }

    public void setJudul_Album(String Judul_Album) {
        this.Judul_Album = Judul_Album;
    }

    public String getGenre_Musik() {
        return Genre_Musik;
    }

    public void setGenre_Musik(String Genre_Musik) {
        this.Genre_Musik = Genre_Musik;
    }

    public LocalDate getTglRilis_Musik() {
        return TglRilis_Musik;
    }

    public void setTglRilis_Musik(LocalDate TglRilis_Musik) {
        this.TglRilis_Musik = TglRilis_Musik;
    }

    public LocalTime getDurasi_Musik() {
        return Durasi_Musik;
    }

    public void setDurasi_Musik(LocalTime Durasi_Musik) {
        this.Durasi_Musik = Durasi_Musik;
    }

    public int getJumPutar_Musik() {
        return JumPutar_Musik;
    }

    public void setJumPutar_Musik(int JumPutar_Musik) {
        this.JumPutar_Musik = JumPutar_Musik;
    }
    
    
}
