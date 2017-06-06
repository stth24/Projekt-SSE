package models;

import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by MLauf on 18.05.2017.
 */
@Entity
public class Project extends Model {

    @Id
    @Column(name="project_id")
    private Long id;

    private String name;
    private String beschreibung;
    private String imagePath;


    @OneToMany(mappedBy = "project")
    private List<Task> tasks;

    @ManyToOne
    private Customer customer;

    @Transient
    private String tmpcustomer;

    public static Finder<Long, Project> find = new Finder<Long, Project>(Project.class);


    public Project() {

    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", beschreibung='" + beschreibung + '\'' +
                ", projektdauer='" + this.projektdauer() + '\'' +
                ", projectHolders=" + this.customer.getName() +
                '}';
    }

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

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }


    public static Finder<Long, Project> getFind() {
        return find;
    }

    public static void setFind(Finder<Long, Project> find) {
        Project.find = find;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getTmpcustomer() {
        return tmpcustomer;
    }

    public void setTmpcustomer(String tmpcustomer) {
        this.tmpcustomer = tmpcustomer;
    }

    public Long projektdauer(){
        Long dauer = 0L;
        for(Task task: tasks){
            dauer += task.getDauer();
        }
        return dauer;
    }
}
