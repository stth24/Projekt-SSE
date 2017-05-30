package models;

import com.avaje.ebean.Finder;
import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by MLauf on 18.05.2017.
 */
@Entity
public class ProjectTask extends Model {

    @Id
    @Column(name = "projectTask_id")
    private Long id;

    @ManyToOne
    private Project project;

    @ManyToOne
    private Task task;

    @Transient
    private String tmpproject;

    @Transient
    private String tmptask;

    public static Finder<Long, ProjectTask> find = new Finder<Long, ProjectTask>(ProjectTask.class);


    @Override
    public String toString() {
        return "ProjectTask{" +
                "project=" + project +
                ", task=" + task +
                '}';
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public static Finder<Long, ProjectTask> getFind() {
        return find;
    }

    public static void setFind(Finder<Long, ProjectTask> find) {
        ProjectTask.find = find;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTmpproject() {
        return tmpproject;
    }

    public void setTmpproject(String tmpproject) {
        this.tmpproject = tmpproject;
    }

    public String getTmptask() {
        return tmptask;
    }

    public void setTmptask(String tmptask) {
        this.tmptask = tmptask;
    }
}


