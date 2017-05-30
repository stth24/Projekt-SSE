
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addWorkerTask_Scope0 {
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

class addWorkerTask extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[play.data.Form[WorkerTask],List[Worker],List[Task],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(workerTaskForm: play.data.Form[WorkerTask], workerList: List[Worker], taskList: List[Task]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.94*/("""

"""),_display_(/*3.2*/main("Neue Mitarbeiteraufgaben")/*3.34*/{_display_(Seq[Any](format.raw/*3.35*/("""
    """),format.raw/*4.5*/("""<div class="row">
        <div class="col-xs-12">
            <h1>Neue Aufgaben für Mitarbeiter</h1>
        </div>
    </div>

    <div class="row">
        <div class="col-xs-12">
        """),_display_(/*12.10*/helper/*12.16*/.form(action = routes.WorkerTaskController.create())/*12.68*/{_display_(Seq[Any](format.raw/*12.69*/("""
            """),_display_(/*13.14*/helper/*13.20*/.select(
                field = workerTaskForm("tmpworker"),
                options = (workerList.map(worker => worker.getId().toString() -> worker.getNachname())),
                'id -> "worker",
                '_label -> "Mitarbeiter",
                'class -> "form-control")),format.raw/*18.42*/("""
            """),_display_(/*19.14*/helper/*19.20*/.select(
                field = workerTaskForm("tmptask"),
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

  def render(workerTaskForm:play.data.Form[WorkerTask],workerList:List[Worker],taskList:List[Task]): play.twirl.api.HtmlFormat.Appendable = apply(workerTaskForm,workerList,taskList)

  def f:((play.data.Form[WorkerTask],List[Worker],List[Task]) => play.twirl.api.HtmlFormat.Appendable) = (workerTaskForm,workerList,taskList) => apply(workerTaskForm,workerList,taskList)

  def ref: this.type = this

}


}

/**/
object addWorkerTask extends addWorkerTask_Scope0.addWorkerTask
              /*
                  -- GENERATED --
                  DATE: Tue May 30 15:12:46 CEST 2017
                  SOURCE: C:/Users/Stefan Theissl/servSE/projekt/Projekt-SSE/projectmanagment-play/app/views/addWorkerTask.scala.html
                  HASH: bf9aa18b689e1531881d8ec97fc263b4fe87c8a0
                  MATRIX: 805->1|992->93|1022->98|1062->130|1100->131|1132->137|1358->336|1373->342|1434->394|1473->395|1515->410|1530->416|1839->704|1881->719|1896->725|2185->993|2229->1009|2426->1175|2463->1185
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|43->12|43->12|43->12|43->12|44->13|44->13|49->18|50->19|50->19|55->24|57->26|58->27|59->28
                  -- GENERATED --
              */
          