
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addWorker_Scope0 {
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

class addWorker extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[Worker],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(workerForm: play.data.Form[Worker]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.38*/("""

"""),_display_(/*3.2*/main("Neuer Mitarbeiter")/*3.27*/{_display_(Seq[Any](format.raw/*3.28*/("""
    """),format.raw/*4.5*/("""<div class="row">
        <div class="col-xs-12">
            <h1>Neuer Mitarbeiter</h1>
        </div>
    </div>

    <div class="row">
        <div class="col-xs-12">
        """),_display_(/*12.10*/helper/*12.16*/.form(action = routes.WorkerController.create(), 'enctype -> "multipart/form-data")/*12.99*/{_display_(Seq[Any](format.raw/*12.100*/("""
            """),_display_(/*13.14*/helper/*13.20*/.inputText(workerForm("vorname"), 'id -> "vorname", '_label -> "Vorname", 'class -> "form-control")),format.raw/*13.119*/("""
            """),_display_(/*14.14*/helper/*14.20*/.inputText(workerForm("nachname"), '_label -> "Nachname", 'class -> "form-control")),format.raw/*14.103*/("""
            """),_display_(/*15.14*/helper/*15.20*/.inputText(workerForm("Abteilung"), '_label -> "Abteilung", 'class -> "form-control", 'type -> "textarea")),format.raw/*15.126*/("""

            """),format.raw/*17.13*/("""<button type="submit" class="btn btn-success" value="Anlegen" ><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Anlegen </button>
        """)))}),format.raw/*18.10*/("""
        """),format.raw/*19.9*/("""</div>
    </div>

""")))}))
      }
    }
  }

  def render(workerForm:play.data.Form[Worker]): play.twirl.api.HtmlFormat.Appendable = apply(workerForm)

  def f:((play.data.Form[Worker]) => play.twirl.api.HtmlFormat.Appendable) = (workerForm) => apply(workerForm)

  def ref: this.type = this

}


}

/**/
object addWorker extends addWorker_Scope0.addWorker
              /*
                  -- GENERATED --
                  DATE: Tue Jun 06 04:36:45 CEST 2017
                  SOURCE: C:/Users/Stefan Theissl/servSE/projekt/Projekt-SSE/projectmanagment-play/app/views/addWorker.scala.html
                  HASH: d30b1e282347702d697acb0c1c7d645554f3bd7d
                  MATRIX: 769->1|900->37|930->42|963->67|1001->68|1033->74|1247->261|1262->267|1354->350|1394->351|1436->366|1451->372|1572->471|1614->486|1629->492|1734->575|1776->590|1791->596|1919->702|1963->718|2158->882|2195->892
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|43->12|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|48->17|49->18|50->19
                  -- GENERATED --
              */
          