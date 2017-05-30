
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object workerList_Scope0 {
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

class workerList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Worker],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(workerList: List[Worker]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""

"""),_display_(/*3.2*/main("Worker")/*3.16*/{_display_(Seq[Any](format.raw/*3.17*/("""
    """),format.raw/*4.5*/("""<h1>Mitarbeiter</h1>
    """),_display_(/*5.6*/if(workerList.size() > 0)/*5.31*/ {_display_(Seq[Any](format.raw/*5.33*/("""

        """),format.raw/*7.9*/("""<div class="row">
            <div class="col-xs-12">
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <td>ID</td>
                            <td>Vorname</td>
                            <td>Nachname</td>
                            <td>Abteilung</td>
                            <td>Arbeitszeit</td>
                        </tr>
                    </thead>
                    <tbody>
                    """),_display_(/*20.22*/for(worker <- workerList) yield /*20.47*/{_display_(Seq[Any](format.raw/*20.48*/("""
                        """),format.raw/*21.25*/("""<tr>
                            <td>"""),_display_(/*22.34*/worker/*22.40*/.getId()),format.raw/*22.48*/("""</td>
                            <td>"""),_display_(/*23.34*/worker/*23.40*/.getVorname()),format.raw/*23.53*/("""</td>
                            <td>"""),_display_(/*24.34*/worker/*24.40*/.getNachname()),format.raw/*24.54*/("""</td>
                            <td>"""),_display_(/*25.34*/worker/*25.40*/.getAbteilung()),format.raw/*25.55*/("""</td>
                            <td>"""),_display_(/*26.34*/worker/*26.40*/.getArbeitszeit()),format.raw/*26.57*/("""</td>
                            <td>

                                <a href=""""),_display_(/*29.43*/routes/*29.49*/.WorkerController.delete(worker.getId())),format.raw/*29.89*/("""" class="btn btn-danger"><i class="glyphicon glyphicon-remove" aria-hidden="true"></i></a>

                            </td>


                        </tr>

                    """)))}),format.raw/*36.22*/("""
                    """),format.raw/*37.21*/("""</tbody>
                </table>
            </div>

        </div>
    """)))}/*42.7*/else/*42.11*/{_display_(Seq[Any](format.raw/*42.12*/("""
        """),format.raw/*43.9*/("""<div class="warehouse-item">
            Keine Mitarbeiter vorhanden
        </div>
    """)))}),format.raw/*46.6*/("""

    """),format.raw/*48.5*/("""<div class="new-holder">
        <a href=""""),_display_(/*49.19*/routes/*49.25*/.FormController.addWorker()),format.raw/*49.52*/("""" class="btn btn-success"><i class="fa fa-plus-square-o" aria-hidden="true"></i> Neuen Mitarbeiter anlegen</a>
    </div>

""")))}))
      }
    }
  }

  def render(workerList:List[Worker]): play.twirl.api.HtmlFormat.Appendable = apply(workerList)

  def f:((List[Worker]) => play.twirl.api.HtmlFormat.Appendable) = (workerList) => apply(workerList)

  def ref: this.type = this

}


}

/**/
object workerList extends workerList_Scope0.workerList
              /*
                  -- GENERATED --
                  DATE: Tue May 30 15:12:46 CEST 2017
                  SOURCE: C:/Users/Stefan Theissl/servSE/projekt/Projekt-SSE/projectmanagment-play/app/views/workerList.scala.html
                  HASH: bf41c11c3b00c21a5d52577556c9a14a4dfcf022
                  MATRIX: 761->1|882->27|912->32|934->46|972->47|1004->53|1056->80|1089->105|1128->107|1166->119|1704->630|1745->655|1784->656|1838->682|1904->721|1919->727|1948->735|2015->775|2030->781|2064->794|2131->834|2146->840|2181->854|2248->894|2263->900|2299->915|2366->955|2381->961|2419->978|2531->1063|2546->1069|2607->1109|2825->1296|2875->1318|2972->1398|2985->1402|3024->1403|3061->1413|3183->1505|3218->1513|3289->1557|3304->1563|3352->1590
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|36->5|38->7|51->20|51->20|51->20|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|60->29|60->29|60->29|67->36|68->37|73->42|73->42|73->42|74->43|77->46|79->48|80->49|80->49|80->49
                  -- GENERATED --
              */
          