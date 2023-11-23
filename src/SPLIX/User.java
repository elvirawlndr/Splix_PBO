/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SPLIX;
import java.time.LocalDate;
/**
 *
 * @author Elvira Wulandari
 */
public class User {
    private int ID_User;
    private String Nama_User;
    private String Email_User;
    private String Nomor_Telepon;
    private LocalDate Tanggal_Lahir;
    private String Kata_Sandi;
    private String Status_Akun;

    public int getID_User() {
        return ID_User;
    }

    public void setID_User(int ID_User) {
        this.ID_User = ID_User;
    }

    public String getNama_User() {
        return Nama_User;
    }

    public void setNama_User(String Nama_User) {
        this.Nama_User = Nama_User;
    }

    public String getEmail_User() {
        return Email_User;
    }

    public void setEmail_User(String Email_User) {
        this.Email_User = Email_User;
    }

    public String getNomor_Telepon() {
        return Nomor_Telepon;
    }

    public void setNomor_Telepon(String Nomor_Telepon) {
        this.Nomor_Telepon = Nomor_Telepon;
    }

    public LocalDate getTanggal_Lahir() {
        return Tanggal_Lahir;
    }

    public void setTanggal_Lahir(LocalDate Tanggal_Lahir) {
        this.Tanggal_Lahir = Tanggal_Lahir;
    }

    public String getKata_Sandi() {
        return Kata_Sandi;
    }

    public void setKata_Sandi(String Kata_Sandi) {
        this.Kata_Sandi = Kata_Sandi;
    }

    public String getStatus_Akun() {
        return Status_Akun;
    }

    public void setStatus_Akun(String Status_Akun) {
        this.Status_Akun = Status_Akun;
    }
    
    
}
