
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object tasks_Scope0 {
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

class tasks extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Task,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(task: Task):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.14*/("""

    """),_display_(/*3.6*/main("Projekt Edit")/*3.26*/{_display_(Seq[Any](format.raw/*3.27*/("""
        """),format.raw/*4.9*/("""<div class="row">
            <div class="col-xs-12">
                <h1>Aufgabe: """),_display_(/*6.31*/task/*6.35*/.getName()),format.raw/*6.45*/("""</h1>
            </div>
        </div>

        <div class="row">
            <div class="col-xs-12">
                <b>Infos</b>
                <div>"""),_display_(/*13.23*/task/*13.27*/.getBeschreibung()),format.raw/*13.45*/("""</div>
                <div></div>
            </div>
        </div>

        <div class="row add-item">
            <div class="col-xs-2">
                <a href=""""),_display_(/*20.27*/routes/*20.33*/.FormController.addWorkerTask()),format.raw/*20.64*/("""" class="btn btn-success"><i class="fa fa-plus-square fa-2x" aria-hidden="true"></i></a>
            </div>

        </div>
        <div class="row">
            <div class="col-xs-12">
                <table class="table table-striped">
                    <thead>
                        <tr>

                            <td>ID</td>
                            <td>Vorname</td>
                            <td>Nachname</td>
                            <td>Abteilung</td>
                        </tr>
                    </thead>
                    <tbody>
                    """),_display_(/*37.22*/for(worker <- task.getWorkerTasks()) yield /*37.58*/{_display_(Seq[Any](format.raw/*37.59*/("""
                        """),format.raw/*38.25*/("""<tr>
                            <td>"""),_display_(/*39.34*/worker/*39.40*/.getWorker().getId()),format.raw/*39.60*/("""</td>
                            <td>"""),_display_(/*40.34*/worker/*40.40*/.getWorker().getVorname()),format.raw/*40.65*/("""</td>
                            <td>"""),_display_(/*41.34*/worker/*41.40*/.getWorker().getNachname()),format.raw/*41.66*/("""</td>
                            <td>"""),_display_(/*42.34*/worker/*42.40*/.getWorker().getAbteilung()),format.raw/*42.67*/("""</td>


                        </tr>

                    """)))}),format.raw/*47.22*/("""



                    """),format.raw/*51.21*/("""</tbody>
                </table>
            </div>

        </div>

    """)))}))
      }
    }
  }

  def render(task:Task): play.twirl.api.HtmlFormat.Appendable = apply(task)

  def f:((Task) => play.twirl.api.HtmlFormat.Appendable) = (task) => apply(task)

  def ref: this.type = this

}


}

/**/
object tasks extends tasks_Scope0.tasks
              /*
                  -- GENERATED --
                  DATE: Tue May 30 15:12:46 CEST 2017
                  SOURCE: C:/Users/Stefan Theissl/servSE/projekt/Projekt-SSE/projectmanagment-play/app/views/tasks.scala.html
                  HASH: 7666514f3d18a8e8e94e844f56a7960cf6e2e62d
                  MATRIX: 743->1|850->13|884->22|912->42|950->43|986->53|1098->139|1110->143|1140->153|1328->314|1341->318|1380->336|1580->509|1595->515|1647->546|2273->1145|2325->1181|2364->1182|2418->1208|2484->1247|2499->1253|2540->1273|2607->1313|2622->1319|2668->1344|2735->1384|2750->1390|2797->1416|2864->1456|2879->1462|2927->1489|3023->1554|3079->1582
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|37->6|37->6|37->6|44->13|44->13|44->13|51->20|51->20|51->20|68->37|68->37|68->37|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|78->47|82->51
                  -- GENERATED --
              */
          