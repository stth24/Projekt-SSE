package model;

import java.util.ArrayList;

/**
 * Created by Stefan Theissl on 28.03.2017.
 */
public class Projekt {
    Integer ID;
    String Bezeichnung;
    String Beschreibung;
    ArrayList<Aufgabe> aufgaben = new ArrayList<>();


    public Projekt(Integer id, String bezeichnung, String beschreibung) {
        ID = id;
        Bezeichnung = bezeichnung;
        Beschreibung = beschreibung;
    }

    public void addAufgabe(Aufgabe a){
        aufgaben.add(a);
    }

    public void removeProjekt(Aufgabe a){
        aufgaben.remove(a);
    }

    public ArrayList<Aufgabe> getAufgaben() {
        return aufgaben;
    }

    public void setAufgaben(ArrayList<Aufgabe> aufgaben) {
        this.aufgaben = aufgaben;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getBezeichnung() {
        return Bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        Bezeichnung = bezeichnung;
    }

    public String getBeschreibung() {
        return Beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        Beschreibung = beschreibung;
    }


    @Override
    public String toString() {
        return getID() + " " + getBezeichnung() + " Beschreibung: " + getBezeichnung();
    }
}
