package controllers;

import com.google.inject.Inject;
import models.*;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

/**
 * Created by MLauf on 18.05.2017.
 */
public class ProjectTaskController extends Controller {

    @Inject
    public FormFactory formFactory;

    public Result create() {
        Form<ProjectTask> projectTaskForm = formFactory.form(ProjectTask.class);
        ProjectTask task = projectTaskForm.bindFromRequest().get();
        System.out.println(task.getTmptask());


        task.setTask(Task.find.byId(Long.parseLong(task.getTmptask())));
        task.setProject(Project.find.byId(Long.parseLong(task.getTmpproject())));


        task.save();
        return redirect(routes.ProjectController.list());
    }

}
