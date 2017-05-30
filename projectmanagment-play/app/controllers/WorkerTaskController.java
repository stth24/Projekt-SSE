package controllers;

import com.google.inject.Inject;
import models.*;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by MLauf on 18.05.2017.
 */
public class WorkerTaskController extends Controller {

    @Inject
    public FormFactory formFactory;

    public Result create() {

        Form<WorkerTask> workerTaskForm = formFactory.form(WorkerTask.class);
       WorkerTask worker = workerTaskForm.bindFromRequest().get();
        System.out.println(worker.getTmpworker());

        worker.setWorker(Worker.find.byId(Long.parseLong(worker.getTmpworker())));
        worker.setTask(Task.find.byId(Long.parseLong(worker.getTmptask())));
        worker.save();
        return redirect(routes.WorkerController.list());
    }

}
