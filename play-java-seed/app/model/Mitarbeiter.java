package model;

import java.util.ArrayList;

/**
 * Created by Stefan Theissl on 28.03.2017.
 */
public class Mitarbeiter {
    Integer ID;
    String Vorname;
    String Nachname;
    ArrayList<Aufgabe> aufgaben = new ArrayList<>();

    public Mitarbeiter(Integer id, String vorname, String nachname) {
        ID = id;
        Vorname = vorname;
        Nachname = nachname;
    }

    public Integer getID() {
        return ID;
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

    public ArrayList<Aufgabe> getAufgaben() {
        return aufgaben;
    }

    public void setAufgaben(ArrayList<Aufgabe> aufgaben) {
        this.aufgaben = aufgaben;
    }

    public void addAufgabe(Aufgabe a){
        aufgaben.add(a);
    }

    public void removeAufgabe(Aufgabe a){
        aufgaben.remove(a);
    }

    @Override
    public String toString() {
        return getID() + " " + getVorname() + " " + getNachname();
    }
}
