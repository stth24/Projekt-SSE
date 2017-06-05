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
    private String projektdauer;
    private String imagePath;

    @OneToMany(mappedBy = "project")
    private List<ProjectHolder> projectHolders;

    @OneToMany(mappedBy = "project")
    private List<ProjectTask> projectTasks;

    public static Finder<Long, Project> find = new Finder<Long, Project>(Project.class);

    public Project(Long id, String name, String beschreibung, String projektdauer, String imagePath, List<ProjectHolder> projectHolders, List<ProjectTask> projectTasks) {
        this.id = id;
        this.name = name;
        this.beschreibung = beschreibung;
        this.projektdauer = projektdauer;
        this.imagePath = imagePath;
        this.projectHolders = projectHolders;
        this.projectTasks = projectTasks;
    }

    public Project() {

    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", beschreibung='" + beschreibung + '\'' +
                ", projektdauer='" + projektdauer + '\'' +
                ", projectHolders=" + projectHolders +
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

    public String getProjektdauer() {


        return projektdauer;
    }

    public void setProjektdauer(String projektdauer) {

        //Task task = (Task) Task.find.all();

        this.projektdauer = projektdauer;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public List<ProjectHolder> getProjectHolders() {
        return projectHolders;
    }

    public void setProjectHolders(List<ProjectHolder> projectHolders) {
        this.projectHolders = projectHolders;
    }

    public List<ProjectTask> getProjectTasks() {
        return projectTasks;
    }

    public void setProjectTasks(List<ProjectTask> projectTasks) {
        this.projectTasks = projectTasks;
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
}
