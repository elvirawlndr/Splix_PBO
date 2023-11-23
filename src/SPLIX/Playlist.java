package SPLIX;

import java.util.ArrayList;

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
