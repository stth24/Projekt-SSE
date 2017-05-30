
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

class addTask extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[Task],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(taskForm: play.data.Form[Task]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

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

            """),format.raw/*17.13*/("""<button type="submit" class="btn btn-success" value="Anlegen" ><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Anlegen </button>
        """)))}),format.raw/*18.10*/("""
        """),format.raw/*19.9*/("""</div>
    </div>

""")))}))
      }
    }
  }

  def render(taskForm:play.data.Form[Task]): play.twirl.api.HtmlFormat.Appendable = apply(taskForm)

  def f:((play.data.Form[Task]) => play.twirl.api.HtmlFormat.Appendable) = (taskForm) => apply(taskForm)

  def ref: this.type = this

}


}

/**/
object addTask extends addTask_Scope0.addTask
              /*
                  -- GENERATED --
                  DATE: Tue May 30 15:12:46 CEST 2017
                  SOURCE: C:/Users/Stefan Theissl/servSE/projekt/Projekt-SSE/projectmanagment-play/app/views/addTask.scala.html
                  HASH: 874646dcddd1188635bb02e9b10d28e4290640b4
                  MATRIX: 763->1|890->33|920->38|946->56|984->57|1016->63|1225->245|1240->251|1330->332|1369->333|1411->348|1426->354|1536->442|1578->457|1593->463|1704->552|1746->567|1761->573|1887->677|1931->693|2126->857|2163->867
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|43->12|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|48->17|49->18|50->19
                  -- GENERATED --
              */
          