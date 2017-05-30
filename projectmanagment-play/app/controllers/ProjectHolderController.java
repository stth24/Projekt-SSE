package controllers;

import com.google.inject.Inject;
import models.Customer;
import models.Project;
import models.ProjectHolder;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by MLauf on 18.05.2017.
 */
public class ProjectHolderController extends Controller {

    @Inject
    public FormFactory formFactory;

public Result create() {

    Form<ProjectHolder> projectHolderForm = formFactory.form(ProjectHolder.class);
    ProjectHolder holder = projectHolderForm.bindFromRequest().get();
    System.out.println(holder.getTmpcustomer());

    holder.setCustomer(Customer.find.byId(Long.parseLong(holder.getTmpcustomer())));
    holder.setProject(Project.find.byId(Long.parseLong(holder.getTmpproject())));
    holder.save();
    return redirect(routes.ProjectController.list());
}

}
