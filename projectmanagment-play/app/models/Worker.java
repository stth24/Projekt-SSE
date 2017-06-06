package models;


import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by MLauf on 18.05.2017.
 */
@Entity
public class Worker extends Model {

    @Id
    @Column(name = "workerid")
    private Long id;

    private String vorname;
    private String nachname;
    private String abteilung;

//    @ManyToMany(mappedBy = "worker")
//    private List<Task> tasks;


    public static Finder<Long, Worker> find = new Finder<Long, Worker>(Worker.class);


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getAbteilung() {
        return abteilung;
    }

    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    public static Finder<Long, Worker> getFind() {
        return find;
    }

    public static void setFind(Finder<Long, Worker> find) {
        Worker.find = find;
    }

//    public List<Task> getTasks() {
//        return tasks;
//    }
//
//    public void setTasks(List<Task> tasks) {
//        this.tasks = tasks;
//    }
}
