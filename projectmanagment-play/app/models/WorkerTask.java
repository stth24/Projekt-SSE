package models;

import com.avaje.ebean.Finder;
import com.avaje.ebean.Model;

import javax.persistence.*;

/**
 * Created by MLauf on 18.05.2017.
 */
@Entity
public class WorkerTask extends Model {

    @Id
    @Column(name = "WorkerTask_id")
private Long id;

    @ManyToOne
    private Worker worker;

    @ManyToOne
    private Task task;


    @Transient
    private String tmpworker;

    @Transient
    private String tmptask;

    public static Finder<Long, WorkerTask> find = new Finder<Long, WorkerTask>(WorkerTask.class);

    @Override
    public String toString() {
        return "WorkerTask{" +
                "worker=" + worker +
                ", task=" + task +
                '}';
    }



    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public static Finder<Long, WorkerTask> getFind() {
        return find;
    }

    public static void setFind(Finder<Long, WorkerTask> find) {
        WorkerTask.find = find;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getTmptask() {
        return tmptask;
    }

    public void setTmptask(String tmptask) {
        this.tmptask = tmptask;
    }

    public String getTmpworker() {
        return tmpworker;
    }

    public void setTmpworker(String tmpworker) {
        this.tmpworker = tmpworker;
    }
}
