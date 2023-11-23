package SPLIX;

import java.time.LocalDateTime;

public class Premium {
    private int ID_Pembayaran;
    private int Total_Pembayaran;
    private LocalDateTime Waktu_Pembayaran;
    
    public enum Metode_Pembayaran{
        GOPAY,
        Shopeepay,
        DANA,
        OVO,
        Transfer_Bank;
    }
    
    public enum Pilihan_Paket{
        Mini,
        Individual,
        Duo,
        Family;
    }

    public int getID_Pembayaran() {
        return ID_Pembayaran;
    }

    public void setID_Pembayaran(int ID_Pembayaran) {
        this.ID_Pembayaran = ID_Pembayaran;
    }

    public int getTotal_Pembayaran() {
        return Total_Pembayaran;
    }

    public void setTotal_Pembayaran(int Total_Pembayaran) {
        this.Total_Pembayaran = Total_Pembayaran;
    }

    public LocalDateTime getWaktu_Pembayaran() {
        return Waktu_Pembayaran;
    }

    public void setWaktu_Pembayaran(LocalDateTime Waktu_Pembayaran) {
        this.Waktu_Pembayaran = Waktu_Pembayaran;
    }
    
}
