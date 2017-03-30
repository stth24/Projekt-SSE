package model;

/**
 * Created by Stefan Theissl on 28.03.2017.
 */
public class Mitarbeiter {
    Integer ID;
    String Vorname;
    String Nachname;

    public Mitarbeiter(Integer id, String vorname, String nachname) {
        ID = id;
        Vorname = vorname;
        Nachname = nachname;
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
