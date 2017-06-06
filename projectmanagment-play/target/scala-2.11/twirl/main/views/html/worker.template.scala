
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object worker_Scope0 {
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

class worker extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Worker,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(worker: Worker):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/("""


"""),_display_(/*4.2*/main("Mitarbeiter")/*4.21*/{_display_(Seq[Any](format.raw/*4.22*/("""
  """),format.raw/*5.3*/("""<h1>"""),_display_(/*5.8*/worker/*5.14*/.getVorname()),format.raw/*5.27*/(""" """),_display_(/*5.29*/worker/*5.35*/.getNachname()),format.raw/*5.49*/("""</h1>

  <div class="row">
    <div class="col-xs-12">
      <table class="table table-striped">
        <thead>
          <tr>
            <td>ID</td>
            <td>Vorname</td>
            <td>Nachname</td>
            <td>Abteilung</td>
      <tbody>
        <tr>
          <td>"""),_display_(/*18.16*/worker/*18.22*/.getId()),format.raw/*18.30*/("""</td>
          <td>"""),_display_(/*19.16*/worker/*19.22*/.getVorname()),format.raw/*19.35*/("""</td>
          <td>"""),_display_(/*20.16*/worker/*20.22*/.getNachname()),format.raw/*20.36*/("""</td>
          <td>"""),_display_(/*21.16*/worker/*21.22*/.getAbteilung()),format.raw/*21.37*/("""</td>
      </tbody>
      </table>
    </div>
  </div>


  <div class="row back">
    <div class="col-xs-12">
      <a href=""""),_display_(/*30.17*/routes/*30.23*/.WorkerController.list()),format.raw/*30.47*/(""""><i class="fa fa-caret-left" aria-hidden="true"></i> Zurück</a>
    </div>
  </div>

""")))}))
      }
    }
  }

  def render(worker:Worker): play.twirl.api.HtmlFormat.Appendable = apply(worker)

  def f:((Worker) => play.twirl.api.HtmlFormat.Appendable) = (worker) => apply(worker)

  def ref: this.type = this

}


}

/**/
object worker extends worker_Scope0.worker
              /*
                  -- GENERATED --
                  DATE: Tue Jun 06 04:36:46 CEST 2017
                  SOURCE: C:/Users/Stefan Theissl/servSE/projekt/Projekt-SSE/projectmanagment-play/app/views/worker.scala.html
                  HASH: 199063c20a4a023774bd6a6d81e997fb977fc5d2
                  MATRIX: 747->1|858->17|890->24|917->43|955->44|985->48|1015->53|1029->59|1062->72|1090->74|1104->80|1138->94|1462->391|1477->397|1506->405|1555->427|1570->433|1604->446|1653->468|1668->474|1703->488|1752->510|1767->516|1803->531|1966->667|1981->673|2026->697
                  LINES: 27->1|32->1|35->4|35->4|35->4|36->5|36->5|36->5|36->5|36->5|36->5|36->5|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|61->30|61->30|61->30
                  -- GENERATED --
              */
          