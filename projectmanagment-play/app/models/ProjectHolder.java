package models;

import com.avaje.ebean.Finder;
import com.avaje.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import java.util.List;
import javax.persistence.*;

/**
 * Created by MLauf on 18.05.2017.
 */
@Entity
public class ProjectHolder extends Model{

    @Id
    @Column(name = "projectHolder_id")
    private Long id;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Project project;

    @Transient
    private String tmpproject;

    @Transient
    private String tmpcustomer;




    public static Finder<Long, ProjectHolder> find = new Finder<Long, ProjectHolder>(ProjectHolder.class);


    @Override
    public String toString() {
        return "ProjectHolder{" +
                "id=" + id +
                ", customer=" + customer +
                ", project=" + project +
                '}';
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public static Finder<Long, ProjectHolder> getFind() {
        return find;
    }

    public static void setFind(Finder<Long, ProjectHolder> find) {
        ProjectHolder.find = find;
    }

    public String getTmpcustomer() {
        return tmpcustomer;
    }

    public void setTmpcustomer(String tmpcustomer) {
        this.tmpcustomer = tmpcustomer;
    }

    public String getTmpproject() {
        return tmpproject;
    }

    public void setTmpproject(String tmpproject) {
        this.tmpproject = tmpproject;
    }
}
