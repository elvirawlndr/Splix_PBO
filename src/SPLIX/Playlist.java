/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SPLIX;
import java.util.ArrayList;

/**
 *
 * @author Elvira Wulandari
 */
public class Playlist extends Musik {
    private int ID_Playlist;
    private int ID_User;
    private ArrayList<Musik> List_Musik;

    public int getID_Playlist() {
        return ID_Playlist;
    }

    public void setID_Playlist(int ID_Playlist) {
        this.ID_Playlist = ID_Playlist;
    }

    public int getID_User() {
        return ID_User;
    }

    public void setID_User(int ID_User) {
        this.ID_User = ID_User;
    }

    public ArrayList<Musik> getList_Musik() {
        return List_Musik;
    }

    public void setList_Musik(ArrayList<Musik> List_Musik) {
        this.List_Musik = List_Musik;
    }
}
