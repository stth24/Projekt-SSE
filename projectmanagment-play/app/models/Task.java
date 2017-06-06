package models;

import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by MLauf on 18.05.2017.
 */
@Entity
public class Task extends Model {

    @Id
    @Column(name = "task_id")
    private Long id;


    private String name;
    private String beschreibung;
    private long dauer;

    @ManyToOne
    private Project project;

    @Transient
    private String tmpproject;

    public static Finder<Long, Task> find = new Finder<Long, Task>(Task.class);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public long getDauer() {
        return dauer;
    }

    public void setDauer(long dauer) {
        this.dauer = dauer;
    }

    public static Finder<Long, Task> getFind() {
        return find;
    }

    public static void setFind(Finder<Long, Task> find) {
        Task.find = find;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getTmpproject() {
        return tmpproject;
    }

    public void setTmpproject(String tmpproject) {
        this.tmpproject = tmpproject;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", beschreibung='" + beschreibung + '\'' +
                ", dauer=" + dauer +
                '}';
    }


}
