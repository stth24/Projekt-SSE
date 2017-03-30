package controllers;

//import play.mvc.Controller;
//import play.mvc.Result;
import model.Mitarbeiter;
import play.mvc.*;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by Stefan Theissl on 28.03.2017.
 */
public class MitarbeiterController extends Controller {
    ArrayList<Mitarbeiter> mitarbeiter = new ArrayList<Mitarbeiter>();


    public Result getInfo(){
        String info = "";
        if(!mitarbeiter.isEmpty())
            for(Mitarbeiter m: mitarbeiter)
                info += m.toString() + "; ";
        else
            info = "Keine Mitarbeiter";

        return ok(info);
    }

    public Result create(){
        Map<String, String[]> bodyData = request().body().asFormUrlEncoded();
        Mitarbeiter m = new Mitarbeiter(
                Integer.valueOf(bodyData.get("mitarbeiter_id")[0]),
                bodyData.get("mitarbeiter_nachname")[0],
                bodyData.get("mitarbeiter_vorname")[0]
        );
        mitarbeiter.add(m);
        return ok("Mitarbeiter " + m.getNachname() + " erstelllt");
    }

    public Result update(Integer id){
        Map<String, String[]> bodyData = request().body().asFormUrlEncoded();
        Mitarbeiter m = null;
        for(Mitarbeiter mita: mitarbeiter)
            if(m.getID() == id)
                m = mita;

        if(m != null) {
            m.setNachname(bodyData.get("student_nachname")[0]);
            m.setVorname(bodyData.get("student_vorname")[0]);
            return ok("Student " + m.getNachname() + " updatet");
        }
        else
            return ok("failed");
    }

    public Result delete(Integer id){
        Mitarbeiter m = null;
        for(Mitarbeiter mita: mitarbeiter)
            if(mita.getID() == id)
                m = mita;
        if(m != null){
            mitarbeiter.remove(m);
            return ok("gelöscht " + id);
        }
        else
            return ok("failed");
    }

}
