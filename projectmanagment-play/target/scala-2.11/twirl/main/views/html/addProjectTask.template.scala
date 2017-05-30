
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addProjectTask_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class addProjectTask extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[play.data.Form[ProjectTask],List[Project],List[Task],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projectTaskForm: play.data.Form[ProjectTask], projectList: List[Project], taskList: List[Task]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.98*/("""

"""),_display_(/*3.2*/main("Neu Projektaufgaben")/*3.29*/{_display_(Seq[Any](format.raw/*3.30*/("""
    """),format.raw/*4.5*/("""<div class="row">
        <div class="col-xs-12">
            <h1>Neue Projektaufgaben zuweisen</h1>
        </div>
    </div>

    <div class="row">
        <div class="col-xs-12">
        """),_display_(/*12.10*/helper/*12.16*/.form(action = routes.ProjectTaskController.create())/*12.69*/{_display_(Seq[Any](format.raw/*12.70*/("""
            """),_display_(/*13.14*/helper/*13.20*/.select(
                field = projectTaskForm("tmpproject"),
                options = (projectList.map(project => project.getId().toString() -> project.getName())),
                'id -> "project",
                '_label -> "Projekt",
                'class -> "form-control")),format.raw/*18.42*/("""
            """),_display_(/*19.14*/helper/*19.20*/.select(
                field = projectTaskForm("tmptask"),
                options = (taskList.map(task => task.getId().toString() -> task.getName())),
                'id -> "task",
                '_label -> "Aufgabe",
                'class -> "form-control")),format.raw/*24.42*/("""

            """),format.raw/*26.13*/("""<button type="submit" class="btn btn-success" value="Anlegen" ><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Einlagern </button>
        """)))}),format.raw/*27.10*/("""
        """),format.raw/*28.9*/("""</div>
    </div>

""")))}))
      }
    }
  }

  def render(projectTaskForm:play.data.Form[ProjectTask],projectList:List[Project],taskList:List[Task]): play.twirl.api.HtmlFormat.Appendable = apply(projectTaskForm,projectList,taskList)

  def f:((play.data.Form[ProjectTask],List[Project],List[Task]) => play.twirl.api.HtmlFormat.Appendable) = (projectTaskForm,projectList,taskList) => apply(projectTaskForm,projectList,taskList)

  def ref: this.type = this

}


}

/**/
object addProjectTask extends addProjectTask_Scope0.addProjectTask
              /*
                  -- GENERATED --
                  DATE: Tue May 30 15:12:46 CEST 2017
                  SOURCE: C:/Users/Stefan Theissl/servSE/projekt/Projekt-SSE/projectmanagment-play/app/views/addProjectTask.scala.html
                  HASH: 15f05e797e44ea8ddc6d4b170f0f9a7950767ed2
                  MATRIX: 809->1|1000->97|1030->102|1065->129|1103->130|1135->136|1361->335|1376->341|1438->394|1477->395|1519->410|1534->416|1842->703|1884->718|1899->724|2189->993|2233->1009|2430->1175|2467->1185
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|43->12|43->12|43->12|43->12|44->13|44->13|49->18|50->19|50->19|55->24|57->26|58->27|59->28
                  -- GENERATED --
              */
          