package controllers;

import com.google.inject.Inject;
import models.*;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

/**
 * Created by martinschipflinger on 09.05.17.
 */
public class FormController extends Controller {
    @Inject
    public FormFactory formFactory;

    public Result addCustomer(){
        Form<Customer> customerForm = formFactory.form(Customer.class);
        return ok(views.html.addCustomer.render(customerForm));
    }

    public Result addProject(){

        Form<Project> projectForm = formFactory.form(Project.class);
        return ok(views.html.addProject.render(projectForm));

    }

    public Result addTask(){

        Form<Task> taskForm = formFactory.form(Task.class);
        return ok(views.html.addTask.render(taskForm));
    }

    public Result addWorker(){
        Form<Worker> workerForm = formFactory.form(Worker.class);
        return ok(views.html.addWorker.render(workerForm));
    }

    public Result addProjectTask() {

        Form<ProjectTask> projectTaskForm = formFactory.form(ProjectTask.class);
        List<Project> projectList = Project.find.all();
        List<Task> taskList = Task.find.all();
        return ok(views.html.addProjectTask.render(projectTaskForm, projectList, taskList));
    }

    public Result addProjectHolder() {

        Form<ProjectHolder> projectHolderForm = formFactory.form(ProjectHolder.class);
        List<Project> projectList = Project.find.all();
        List<Customer> customerList = Customer.find.all();
        return ok(views.html.addProjectHolder.render(projectHolderForm, projectList, customerList));
    }

    public Result addWorkerTask() {

        Form<WorkerTask> workerTaskForm = formFactory.form(WorkerTask.class);
        List<Worker> workerList = Worker.find.all();
        List<Task> taskList = Task.find.all();
        return ok(views.html.addWorkerTask.render(workerTaskForm, workerList, taskList));
    }
}
