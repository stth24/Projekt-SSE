package models;

import com.avaje.ebean.Finder;
import com.avaje.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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


    @OneToMany(mappedBy = "task")
    private List<ProjectTask> projectTasks;

    @OneToMany(mappedBy = "task")
    private List<WorkerTask> workerTasks;



    public static Finder<Long, Task> find = new Finder<Long, Task>(Task.class);


    public Task(Long id, String name, String beschreibung, long dauer, List<ProjectTask> projectTasks, List<WorkerTask> workerTasks) {
        this.id = id;
        this.name = name;
        this.beschreibung = beschreibung;
        this.dauer = dauer;
        this.projectTasks = projectTasks;
        this.workerTasks = workerTasks;
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

    public long getDauer() {
        return dauer;
    }

    public void setDauer(long dauer) {
        this.dauer = dauer;
    }

    public List<ProjectTask> getProjectTasks() {
        return projectTasks;
    }

    public void setProjectTasks(List<ProjectTask> projectTasks) {
        this.projectTasks = projectTasks;
    }

    public List<WorkerTask> getWorkerTasks() {
        return workerTasks;
    }

    public void setWorkerTasks(List<WorkerTask> workerTasks) {
        this.workerTasks = workerTasks;
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

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", beschreibung='" + beschreibung + '\'' +
                ", dauer=" + dauer +
                ", projectTasks=" + projectTasks +
                ", workerTasks=" + workerTasks +
                '}';
    }


}
