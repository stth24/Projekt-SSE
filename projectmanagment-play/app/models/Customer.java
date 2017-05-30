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
public class Customer extends Model {

    @Id
    @Column(name="customer_id")
    private Long id;

    private String name;
    private String branche;

    @OneToMany(mappedBy = "customer")
    private List<ProjectHolder> projectHolders;

    public static Finder<Long, Customer> find = new Finder<Long, Customer>(Customer.class);


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", branche='" + branche + '\'' +
                ", projectHolders=" + projectHolders +
                '}';
    }

    public Customer(Long id, String name, String branche, List<ProjectHolder> projectHolders) {
        this.id = id;
        this.name = name;
        this.branche = branche;
        this.projectHolders = projectHolders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranche() {
        return branche;
    }

    public void setBranche(String branche) {
        this.branche = branche;
    }

    public List<ProjectHolder> getProjectHolders() {
        return projectHolders;
    }

    public void setProjectHolders(List<ProjectHolder> projectHolders) {
        this.projectHolders = projectHolders;
    }

    public static Finder<Long, Customer> getFind() {
        return find;
    }

    public static void setFind(Finder<Long, Customer> find) {
        Customer.find = find;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
