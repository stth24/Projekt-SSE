package model;

import org.joda.time.DateTime;

import java.util.ArrayList;

/**
 * Created by Stefan Theissl on 30.03.2017.
 */
public class Aufgabe {
    String Beschreibung;
    String Bezeichnung;
    DateTime Startzeit;
    DateTime Endzeit;
    ArrayList<Mitarbeiter> mitarbeiter = new ArrayList<>();

    public Aufgabe(String beschreibung, String bezeichnung, DateTime startzeit, DateTime endzeit) {
        Beschreibung = beschreibung;
        Bezeichnung = bezeichnung;
        Startzeit = startzeit;
        Endzeit = endzeit;
    }

    public void addMitarbeiter(Mitarbeiter m){
        mitarbeiter.add(m);
    }

    public  void removeMitarbeiter(Mitarbeiter m){
        mitarbeiter.remove(m);
    }

    public ArrayList<Mitarbeiter> getMitarbeiter() {
        return mitarbeiter;
    }

    public void setMitarbeiter(ArrayList<Mitarbeiter> mitarbeiter) {
        this.mitarbeiter = mitarbeiter;
    }

    public String getBeschreibung() {
        return Beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        Beschreibung = beschreibung;
    }

    public String getBezeichnung() {
        return Bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        Bezeichnung = bezeichnung;
    }

    public DateTime getStartzeit() {
        return Startzeit;
    }

    public void setStartzeit(DateTime startzeit) {
        Startzeit = startzeit;
    }

    public DateTime getEndzeit() {
        return Endzeit;
    }

    public void setEndzeit(DateTime endzeit) {
        Endzeit = endzeit;
    }
}
