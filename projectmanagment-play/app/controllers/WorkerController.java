package controllers;

import com.google.inject.Inject;
import models.Worker;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

/**
 * Created by MLauf on 18.05.2017.
 */
public class WorkerController extends Controller {


    @Inject
    public FormFactory formFactory;

    public Result list() {
        List<Worker> workerList = Worker.find.all();
        return ok(views.html.workerList.render(workerList));
    }

    public Result show(Long id) {
        return ok();
    }

    public Result create() {
        Form<Worker> workerForm = formFactory.form(Worker.class);
        Worker worker = workerForm.bindFromRequest().get();
        worker.save();
        return  redirect(routes.WorkerController.list());
    }

    public Result delete(Long id) {

        Worker worker = Worker.find.byId(id);




        return redirect(routes.ProjectController.list());
    }


}
