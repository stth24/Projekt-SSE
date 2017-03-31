package model;

import java.util.ArrayList;

/**
 * Created by Stefan Theissl on 28.03.2017.
 */
public class Kunde {
    Integer ID;
    String Name;
    ArrayList<Projekt> projekte = new ArrayList<>();

    public Kunde(Integer id, String name) {
        ID = id;
        Name = name;
    }

    public void addProjekt(Projekt p){
        projekte.add(p);
    }

    public void removeProjekt(Projekt p){
        projekte.remove(p);
    }

    public ArrayList<Projekt> getProjekts() {
        return projekte;
    }

    public void setProjekts(ArrayList<Projekt> projekts) {
        this.projekte = projekts;
    }

    public Integer getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return getID() + " " + getName();
    }
}
