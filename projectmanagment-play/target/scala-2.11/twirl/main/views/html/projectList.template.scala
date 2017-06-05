
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


"""),_display_(/*4.2*/main("Projekte")/*4.18*/{_display_(Seq[Any](format.raw/*4.19*/("""
    """),format.raw/*5.5*/("""<h1>Projekte</h1>
    """),_display_(/*6.6*/if(projectList.size() > 0)/*6.32*/ {_display_(Seq[Any](format.raw/*6.34*/("""

        """),format.raw/*8.9*/("""<div class="row">
            <div class="col-xs-12">
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <td>ID</td>
                            <td>Name</td>
                            <td>Beschreibung</td>
                            <td>Projektdauer</td>
                    <tbody>
                    """),_display_(/*18.22*/for(project <- projectList) yield /*18.49*/{_display_(Seq[Any](format.raw/*18.50*/("""
                        """),format.raw/*19.25*/("""<tr>
                            <td>"""),_display_(/*20.34*/project/*20.41*/.getId()),format.raw/*20.49*/("""</td>
                            <td>"""),_display_(/*21.34*/project/*21.41*/.getName()),format.raw/*21.51*/("""</td>
                            <td>"""),_display_(/*22.34*/project/*22.41*/.getBeschreibung()),format.raw/*22.59*/("""</td>
                            <td>"""),_display_(/*23.34*/project/*23.41*/.getProjektdauer()),format.raw/*23.59*/("""</td>

                            <td>
                                <a href=""""),_display_(/*26.43*/routes/*26.49*/.ProjectController.show(project.getId())),format.raw/*26.89*/("""" class="btn btn-danger"><i class="glyphicon glyphicon-pencil" aria-hidden="true"></i></a>
                                <a href=""""),_display_(/*27.43*/routes/*27.49*/.ProjectController.delete(project.getId())),format.raw/*27.91*/("""" class="btn btn-danger"><i class="glyphicon glyphicon-remove" aria-hidden="true"></i></a>

                            </td>


                        </tr>

                    """)))}),format.raw/*34.22*/("""
                    """),format.raw/*35.21*/("""</tbody>
                </table>
            </div>

        </div>
    """)))}/*40.7*/else/*40.11*/{_display_(Seq[Any](format.raw/*40.12*/("""
        """),format.raw/*41.9*/("""<div class="warehouse-item">
            Kein Projekte vorhanden
        </div>
    """)))}),format.raw/*44.6*/("""

    """),format.raw/*46.5*/("""<div class="new-holder">
        <a href=""""),_display_(/*47.19*/routes/*47.25*/.FormController.addProject()),format.raw/*47.53*/("""" class="btn btn-success"><i class="fa fa-plus-square-o" aria-hidden="true"></i> Neues Projekt anlegen</a>
    </div>
    <br>
    <div class="row">
        <div class="col-xs-12">
            <input type="text" id="searchparam" placeholder="Suchbegriff"/>
            <button id="searchbtn" class="btn btn-success">Suchen</button>
        </div>
    </div>

    <script>
            $('#searchbtn').click(function()"""),format.raw/*58.45*/("""{"""),format.raw/*58.46*/("""
                """),format.raw/*59.17*/("""var prm = $('#searchparam').val();
//                alert(prm);
                window.location = "/projectsearch/" + prm;
            """),format.raw/*62.13*/("""}"""),format.raw/*62.14*/(""");
    </script>
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
                  DATE: Tue Jun 06 01:50:15 CEST 2017
                  SOURCE: C:/Users/Stefan Theissl/servSE/projekt/Projekt-SSE/projectmanagment-play/app/views/projectList.scala.html
                  HASH: a7bf672fe452004f3eb91e999c5e7f1a7dba19c9
                  MATRIX: 764->1|887->29|919->36|943->52|981->53|1013->59|1062->83|1096->109|1135->111|1173->123|1604->527|1647->554|1686->555|1740->581|1806->620|1822->627|1851->635|1918->675|1934->682|1965->692|2032->732|2048->739|2087->757|2154->797|2170->804|2209->822|2321->907|2336->913|2397->953|2558->1087|2573->1093|2636->1135|2854->1322|2904->1344|3001->1424|3014->1428|3053->1429|3090->1439|3208->1527|3243->1535|3314->1579|3329->1585|3378->1613|3833->2040|3862->2041|3908->2059|4075->2198|4104->2199
                  LINES: 27->1|32->1|35->4|35->4|35->4|36->5|37->6|37->6|37->6|39->8|49->18|49->18|49->18|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|57->26|57->26|57->26|58->27|58->27|58->27|65->34|66->35|71->40|71->40|71->40|72->41|75->44|77->46|78->47|78->47|78->47|89->58|89->58|90->59|93->62|93->62
                  -- GENERATED --
              */
          