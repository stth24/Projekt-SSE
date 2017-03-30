package model;

import java.util.ArrayList;

/**
 * Created by Stefan Theissl on 28.03.2017.
 */
public class Kunde {
    Integer ID;
    String Vorname;
    String Nachname;
    ArrayList<Projekt> projekts = new ArrayList<>();

    public Kunde(Integer id, String vorname, String nachname) {
        ID = id;
        Vorname = vorname;
        Nachname = nachname;
    }

    public void addProjekt(Projekt p){
        projekts.add(p);
    }

    public void removeProjekt(Projekt p){
        projekts.remove(p);
    }

    public ArrayList<Projekt> getProjekts() {
        return projekts;
    }

    public void setProjekts(ArrayList<Projekt> projekts) {
        this.projekts = projekts;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String vorname) {
        Vorname = vorname;
    }

    public String getNachname() {
        return Nachname;
    }

    public void setNachname(String nachname) {
        Nachname = nachname;
    }

    @Override
    public String toString() {
        return getID() + " " + getVorname() + " " + getNachname();
    }
}
