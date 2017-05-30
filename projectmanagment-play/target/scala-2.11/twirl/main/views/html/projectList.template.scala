
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object projectList_Scope0 {
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

class projectList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Project],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projectList: List[Project]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.30*/("""

"""),_display_(/*3.2*/main("Projekte")/*3.18*/{_display_(Seq[Any](format.raw/*3.19*/("""
    """),format.raw/*4.5*/("""<h1>Projekte</h1>
    """),_display_(/*5.6*/if(projectList.size() > 0)/*5.32*/ {_display_(Seq[Any](format.raw/*5.34*/("""

        """),format.raw/*7.9*/("""<div class="row">
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
                    """),_display_(/*19.22*/for(project <- projectList) yield /*19.49*/{_display_(Seq[Any](format.raw/*19.50*/("""
                        """),format.raw/*20.25*/("""<tr>
                            <td>"""),_display_(/*21.34*/project/*21.41*/.getId()),format.raw/*21.49*/("""</td>
                            <td>"""),_display_(/*22.34*/project/*22.41*/.getName()),format.raw/*22.51*/("""</td>
                            <td>"""),_display_(/*23.34*/project/*23.41*/.getBeschreibung()),format.raw/*23.59*/("""</td>
                            <td>"""),_display_(/*24.34*/project/*24.41*/.getProjektdauer()),format.raw/*24.59*/("""</td>

                            <td>
                                <a href=""""),_display_(/*27.43*/routes/*27.49*/.ProjectController.show(project.getId())),format.raw/*27.89*/("""" class="btn btn-danger"><i class="glyphicon glyphicon-pencil" aria-hidden="true"></i></a>
                                <a href=""""),_display_(/*28.43*/routes/*28.49*/.ProjectController.delete(project.getId())),format.raw/*28.91*/("""" class="btn btn-danger"><i class="glyphicon glyphicon-remove" aria-hidden="true"></i></a>

                            </td>


                        </tr>

                    """)))}),format.raw/*35.22*/("""
                    """),format.raw/*36.21*/("""</tbody>
                </table>
            </div>

        </div>
    """)))}/*41.7*/else/*41.11*/{_display_(Seq[Any](format.raw/*41.12*/("""
        """),format.raw/*42.9*/("""<div class="warehouse-item">
            Kein Projekte vorhanden
        </div>
    """)))}),format.raw/*45.6*/("""

    """),format.raw/*47.5*/("""<div class="new-holder">
        <a href=""""),_display_(/*48.19*/routes/*48.25*/.FormController.addProject()),format.raw/*48.53*/("""" class="btn btn-success"><i class="fa fa-plus-square-o" aria-hidden="true"></i> Neues Projekt anlegen</a>
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
object projectList extends projectList_Scope0.projectList
              /*
                  -- GENERATED --
                  DATE: Tue May 30 15:12:46 CEST 2017
                  SOURCE: C:/Users/Stefan Theissl/servSE/projekt/Projekt-SSE/projectmanagment-play/app/views/projectList.scala.html
                  HASH: 8a4860b821f045a181ed7558c2b4caabdebd1589
                  MATRIX: 764->1|887->29|917->34|941->50|979->51|1011->57|1060->81|1094->107|1133->109|1171->121|1663->586|1706->613|1745->614|1799->640|1865->679|1881->686|1910->694|1977->734|1993->741|2024->751|2091->791|2107->798|2146->816|2213->856|2229->863|2268->881|2380->966|2395->972|2456->1012|2617->1146|2632->1152|2695->1194|2913->1381|2963->1403|3060->1483|3073->1487|3112->1488|3149->1498|3267->1586|3302->1594|3373->1638|3388->1644|3437->1672
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|36->5|38->7|50->19|50->19|50->19|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|58->27|58->27|58->27|59->28|59->28|59->28|66->35|67->36|72->41|72->41|72->41|73->42|76->45|78->47|79->48|79->48|79->48
                  -- GENERATED --
              */
          