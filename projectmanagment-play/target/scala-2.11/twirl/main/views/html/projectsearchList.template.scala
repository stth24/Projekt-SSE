
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object projectsearchList_Scope0 {
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

class projectsearchList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Project],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projectList: List[Project]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.30*/("""


"""),_display_(/*4.2*/main("Projekte")/*4.18*/{_display_(Seq[Any](format.raw/*4.19*/("""
  """),format.raw/*5.3*/("""<h1>Projekte</h1>
  """),_display_(/*6.4*/if(projectList.size() > 0)/*6.30*/ {_display_(Seq[Any](format.raw/*6.32*/("""

    """),format.raw/*8.5*/("""<div class="row">
      <div class="col-xs-12">
        <table class="table table-striped">
          <thead>
            <tr>
              <td>ID</td>
              <td>Name</td>
              <td>Beschreibung</td>
              <td>Projektdauer</td>
            </tr>
          </thead>
          <tbody>
          """),_display_(/*20.12*/for(project <- projectList) yield /*20.39*/{_display_(Seq[Any](format.raw/*20.40*/("""
            """),format.raw/*21.13*/("""<tr>
              <td>"""),_display_(/*22.20*/project/*22.27*/.getId()),format.raw/*22.35*/("""</td>
              <td>"""),_display_(/*23.20*/project/*23.27*/.getName()),format.raw/*23.37*/("""</td>
              <td>"""),_display_(/*24.20*/project/*24.27*/.getBeschreibung()),format.raw/*24.45*/("""</td>
              <td>"""),_display_(/*25.20*/project/*25.27*/.getProjektdauer()),format.raw/*25.45*/("""</td>

              <td>
                <a href=""""),_display_(/*28.27*/routes/*28.33*/.ProjectController.show(project.getId())),format.raw/*28.73*/("""" class="btn btn-danger"><i class="glyphicon glyphicon-pencil" aria-hidden="true"></i></a>
                <a href=""""),_display_(/*29.27*/routes/*29.33*/.ProjectController.delete(project.getId())),format.raw/*29.75*/("""" class="btn btn-danger"><i class="glyphicon glyphicon-remove" aria-hidden="true"></i></a>

              </td>


            </tr>

          """)))}),format.raw/*36.12*/("""
          """),format.raw/*37.11*/("""</tbody>
        </table>
      </div>

    </div>
  """)))}/*42.5*/else/*42.9*/{_display_(Seq[Any](format.raw/*42.10*/("""
    """),format.raw/*43.5*/("""<div class="warehouse-item">
      Kein Projekte vorhanden
    </div>
  """)))}),format.raw/*46.4*/("""

  """),format.raw/*48.3*/("""<div class="new-holder">
    <a href=""""),_display_(/*49.15*/routes/*49.21*/.FormController.addProject()),format.raw/*49.49*/("""" class="btn btn-success"><i class="fa fa-plus-square-o" aria-hidden="true"></i> Neues Projekt anlegen</a>
  </div>

""")))}))
      }
    }
  }

  def render(projectList:List[Project]): play.twirl.api.HtmlFormat.Appendable = apply(projectList)

  def f:((List[Project]) => play.twirl.api.HtmlFormat.Appendable) = (projectList) => apply(projectList)

  def ref: this.type = this

}


}

/**/
object projectsearchList extends projectsearchList_Scope0.projectsearchList
              /*
                  -- GENERATED --
                  DATE: Tue Jun 06 01:10:32 CEST 2017
                  SOURCE: C:/Users/Stefan Theissl/servSE/projekt/Projekt-SSE/projectmanagment-play/app/views/projectsearchList.scala.html
                  HASH: 09cb9ff3d96b1cdb663768e2e1b07c288ab0d49b
                  MATRIX: 776->1|899->29|931->36|955->52|993->53|1023->57|1070->79|1104->105|1143->107|1177->115|1535->446|1578->473|1617->474|1659->488|1711->513|1727->520|1756->528|1809->554|1825->561|1856->571|1909->597|1925->604|1964->622|2017->648|2033->655|2072->673|2154->728|2169->734|2230->774|2375->892|2390->898|2453->940|2635->1091|2675->1103|2752->1163|2764->1167|2803->1168|2836->1174|2942->1250|2975->1256|3042->1296|3057->1302|3106->1330
                  LINES: 27->1|32->1|35->4|35->4|35->4|36->5|37->6|37->6|37->6|39->8|51->20|51->20|51->20|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|59->28|59->28|59->28|60->29|60->29|60->29|67->36|68->37|73->42|73->42|73->42|74->43|77->46|79->48|80->49|80->49|80->49
                  -- GENERATED --
              */
          