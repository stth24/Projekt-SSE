package controllers;

import com.google.inject.Inject;
import models.Project;
import models.ProjectHolder;
import models.ProjectTask;
import models.Task;
import org.h2.store.fs.FileUtils;
import play.data.Form;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import scala.Product;
import play.data.FormFactory;

import java.io.File;
import java.util.List;

/**
 * Created by MLauf on 18.05.2017.
 */
public class ProjectController extends Controller{

    @Inject
    public FormFactory formFactory;

    public Result list() {

        List<Project> projectList = Project.find.all();

//        return ok(views.html.projectList.render(projectList, "Gesamte Liste"));
        return ok(views.html.projectList.render(projectList));
    }

    public Result show(Long id) {

        
        Project project = Project.find.byId(id);

//        String json = Json.stringify(Json.toJson(project));
//        return ok(json);
        return ok(views.html.project.render(project));

    }

    public Result create() {
        Form<Project> projectForm = formFactory.form(Project.class);
        Project project = projectForm.bindFromRequest().get();
        Http.MultipartFormData body = request().body().asMultipartFormData();
        Http.MultipartFormData.FilePart image = body.getFile("image");

        String fileName = "";
        if (image != null) {
            fileName = image.getFilename();
            File file = (File) image.getFile();

            try {
                FileUtils.move(file.getAbsolutePath(), "public/images/"+fileName);
            } catch (Exception ioe) {
                System.out.println("Problem operating on filesystem");
            }

        }

        project.setImagePath("images/"+fileName);
        project.save();
        return  redirect(routes.ProjectController.list());
    }

    public Result delete(Long id) {

        Project project = Project.find.byId(id);
        List<ProjectTask> task = project.getProjectTasks();
        List<ProjectHolder> holder = project.getProjectHolders();


        for(ProjectTask onetask : task) {
            onetask.delete();
        }

        for(ProjectHolder oneholder : holder) {
            oneholder.delete();
        }


        task.clear();
        holder.clear();
        project.save();
        project.delete();

        return redirect(routes.ProjectController.list());


    }

    public Result search(String name){

        List<Project> projectList = Project.find.where().ilike("name", name + "%").findList();
//        String param = "Suchwort: " + name;
//        String json = Json.stringify(Json.toJson(projectList));
//        return ok(json);
        return ok(views.html.projectList.render(projectList));
    }


}
