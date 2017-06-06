
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addTask_Scope0 {
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

class addTask extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.data.Form[Task],List[Project],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(taskForm: play.data.Form[Task], projectList: List[Project]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.62*/("""

"""),_display_(/*3.2*/main("Neuer Task")/*3.20*/{_display_(Seq[Any](format.raw/*3.21*/("""
    """),format.raw/*4.5*/("""<div class="row">
        <div class="col-xs-12">
            <h1>Neue Aufgabe</h1>
        </div>
    </div>

    <div class="row">
        <div class="col-xs-12">
        """),_display_(/*12.10*/helper/*12.16*/.form(action = routes.TaskController.create(), 'enctype -> "multipart/form-data")/*12.97*/{_display_(Seq[Any](format.raw/*12.98*/("""
            """),_display_(/*13.14*/helper/*13.20*/.inputText(taskForm("name"), 'id -> "name", '_label -> "Name", 'class -> "form-control")),format.raw/*13.108*/("""
            """),_display_(/*14.14*/helper/*14.20*/.inputText(taskForm("beschreibung"), '_label -> "Beschreibung", 'class -> "form-control")),format.raw/*14.109*/("""
            """),_display_(/*15.14*/helper/*15.20*/.inputText(taskForm("dauer"), '_label -> "Aufgabendauer", 'class -> "form-control", 'type -> "textarea")),format.raw/*15.124*/("""
            """),_display_(/*16.14*/helper/*16.20*/.select(
                field = taskForm("tmpproject"),
                options = (projectList.map(project => project.getId.toString -> project.getName())),
                'id -> "project",
                '_label -> "Project",
                'class -> "form-control")),format.raw/*21.42*/("""

            """),format.raw/*23.13*/("""<button type="submit" class="btn btn-success" value="Anlegen" ><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Anlegen </button>
        """)))}),format.raw/*24.10*/("""
        """),format.raw/*25.9*/("""</div>
    </div>

""")))}))
      }
    }
  }

  def render(taskForm:play.data.Form[Task],projectList:List[Project]): play.twirl.api.HtmlFormat.Appendable = apply(taskForm,projectList)

  def f:((play.data.Form[Task],List[Project]) => play.twirl.api.HtmlFormat.Appendable) = (taskForm,projectList) => apply(taskForm,projectList)

  def ref: this.type = this

}


}

/**/
object addTask extends addTask_Scope0.addTask
              /*
                  -- GENERATED --
                  DATE: Tue Jun 06 02:21:34 CEST 2017
                  SOURCE: C:/Users/Stefan Theissl/servSE/projekt/Projekt-SSE/projectmanagment-play/app/views/addTask.scala.html
                  HASH: ab8130ca08ea62455a8a903c38f16772458bba2f
                  MATRIX: 777->1|932->61|962->66|988->84|1026->85|1058->91|1267->273|1282->279|1372->360|1411->361|1453->376|1468->382|1578->470|1620->485|1635->491|1746->580|1788->595|1803->601|1929->705|1971->720|1986->726|2283->1002|2327->1018|2522->1182|2559->1192
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|43->12|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|52->21|54->23|55->24|56->25
                  -- GENERATED --
              */
          