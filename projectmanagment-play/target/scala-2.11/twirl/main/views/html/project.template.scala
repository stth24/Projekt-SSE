
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object project_Scope0 {
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

class project extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Project,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(project: Project):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""


"""),_display_(/*4.2*/main("Projekte")/*4.18*/{_display_(Seq[Any](format.raw/*4.19*/("""
  """),format.raw/*5.3*/("""<h1>"""),_display_(/*5.8*/project/*5.15*/.getName),format.raw/*5.23*/("""</h1>

    <div class="row">
      <div class="col-xs-12">
        <table class="table table-striped">
          <thead>
            <tr>
              <td>ID</td>
              <td>Name</td>
              <td>Beschreibung</td>
              <td>Projektdauer</td>
              <td>Kunde</td>
              <td>Aufgaben</td>
        <tbody>
            <tr>
              <td>"""),_display_(/*20.20*/project/*20.27*/.getId()),format.raw/*20.35*/("""</td>
              <td>"""),_display_(/*21.20*/project/*21.27*/.getName()),format.raw/*21.37*/("""</td>
              <td>"""),_display_(/*22.20*/project/*22.27*/.getBeschreibung()),format.raw/*22.45*/("""</td>
              <td>"""),_display_(/*23.20*/project/*23.27*/.projektdauer()),format.raw/*23.42*/("""</td>
              <td>"""),_display_(/*24.20*/project/*24.27*/.getCustomer.getName()),format.raw/*24.49*/("""</td>
              <td>
                <ul>
                """),_display_(/*27.18*/for(task <- project.getTasks()) yield /*27.49*/{_display_(Seq[Any](format.raw/*27.50*/("""
                  """),format.raw/*28.19*/("""<li>"""),_display_(/*28.24*/task/*28.28*/.getName()),format.raw/*28.38*/("""</li>
                """)))}),format.raw/*29.18*/("""
                """),format.raw/*30.17*/("""</ul>
              </td>
            </tr>
        </tbody>
        </table>
      </div>
    </div>


  <div class="row back">
    <div class="col-xs-12">
      <a href=""""),_display_(/*41.17*/routes/*41.23*/.ProjectController.list()),format.raw/*41.48*/(""""><i class="fa fa-caret-left" aria-hidden="true"></i> Zurück</a>
    </div>
  </div>

""")))}))
      }
    }
  }

  def render(project:Project): play.twirl.api.HtmlFormat.Appendable = apply(project)

  def f:((Project) => play.twirl.api.HtmlFormat.Appendable) = (project) => apply(project)

  def ref: this.type = this

}


}

/**/
object project extends project_Scope0.project
              /*
                  -- GENERATED --
                  DATE: Tue Jun 06 04:36:45 CEST 2017
                  SOURCE: C:/Users/Stefan Theissl/servSE/projekt/Projekt-SSE/projectmanagment-play/app/views/project.scala.html
                  HASH: 89bca81331e78551418bddf9cf25bd1063eac648
                  MATRIX: 750->1|863->19|895->26|919->42|957->43|987->47|1017->52|1032->59|1060->67|1479->459|1495->466|1524->474|1577->500|1593->507|1624->517|1677->543|1693->550|1732->568|1785->594|1801->601|1837->616|1890->642|1906->649|1949->671|2042->737|2089->768|2128->769|2176->789|2208->794|2221->798|2252->808|2307->832|2353->850|2564->1034|2579->1040|2625->1065
                  LINES: 27->1|32->1|35->4|35->4|35->4|36->5|36->5|36->5|36->5|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|58->27|58->27|58->27|59->28|59->28|59->28|59->28|60->29|61->30|72->41|72->41|72->41
                  -- GENERATED --
              */
          