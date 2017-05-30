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
public class TaskController extends Controller{

    @Inject
    public FormFactory formFactory;

    public Result list() {

        List<Task> taskList = Task.find.all();
        return ok(views.html.taskList.render(taskList));

    }

    public Result show(Long id) {

        Task task = Task.find.byId(id);

        return ok(views.html.tasks.render(task));
    }

    public Result create() {
        Form<Task> taskForm = formFactory.form(Task.class);
        Task task = taskForm.bindFromRequest().get();

        task.save();
        return  redirect(routes.TaskController.list());
    }

    public Result delete(Long id) {

        Task task = Task.find.byId(id);
        List<ProjectTask> project = task.getProjectTasks();
        List<WorkerTask> worker = task.getWorkerTasks();


        for(ProjectTask onetask : project) {
            onetask.delete();
        }

        for(WorkerTask oneworker : worker) {
            oneworker.delete();
        }


        project.clear();
        worker.clear();
       task.save();
       task.delete();


        return redirect(routes.TaskController.list());
    }


}
