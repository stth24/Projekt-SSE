
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
                            <td>Kunde</td>
                            <td>Aufgaben</td>
                    <tbody>
                    """),_display_(/*20.22*/for(project <- projectList) yield /*20.49*/{_display_(Seq[Any](format.raw/*20.50*/("""
                        """),format.raw/*21.25*/("""<tr>
                            <td>"""),_display_(/*22.34*/project/*22.41*/.getId()),format.raw/*22.49*/("""</td>
                            <td>"""),_display_(/*23.34*/project/*23.41*/.getName()),format.raw/*23.51*/("""</td>
                            <td>"""),_display_(/*24.34*/project/*24.41*/.getBeschreibung()),format.raw/*24.59*/("""</td>
                            <td>"""),_display_(/*25.34*/project/*25.41*/.projektdauer()),format.raw/*25.56*/("""</td>
                            <td>"""),_display_(/*26.34*/project/*26.41*/.getCustomer.getName()),format.raw/*26.63*/("""</td>
                            <td>
                                <ul>
                                """),_display_(/*29.34*/for(task <- project.getTasks()) yield /*29.65*/{_display_(Seq[Any](format.raw/*29.66*/("""
                                    """),format.raw/*30.37*/("""<li>"""),_display_(/*30.42*/task/*30.46*/.getName()),format.raw/*30.56*/("""</li>
                                """)))}),format.raw/*31.34*/("""
                                """),format.raw/*32.33*/("""</ul>
                            </td>

                            <td>
                                <a href=""""),_display_(/*36.43*/routes/*36.49*/.ProjectController.show(project.getId())),format.raw/*36.89*/("""" class="btn btn-danger"><i class="glyphicon glyphicon-pencil" aria-hidden="true"></i></a>
                                <a href=""""),_display_(/*37.43*/routes/*37.49*/.ProjectController.delete(project.getId())),format.raw/*37.91*/("""" class="btn btn-danger"><i class="glyphicon glyphicon-remove" aria-hidden="true"></i></a>

                            </td>


                        </tr>

                    """)))}),format.raw/*44.22*/("""
                    """),format.raw/*45.21*/("""</tbody>
                </table>
            </div>

        </div>
    """)))}/*50.7*/else/*50.11*/{_display_(Seq[Any](format.raw/*50.12*/("""
        """),format.raw/*51.9*/("""<div class="warehouse-item">
            Kein Projekte vorhanden
        </div>
    """)))}),format.raw/*54.6*/("""

    """),format.raw/*56.5*/("""<div class="new-holder">
        <a href=""""),_display_(/*57.19*/routes/*57.25*/.FormController.addProject()),format.raw/*57.53*/("""" class="btn btn-success"><i class="fa fa-plus-square-o" aria-hidden="true"></i> Neues Projekt anlegen</a>
    </div>
    <br>
    <div class="row">
        <div class="col-xs-12">
            <input type="text" id="searchparam" placeholder="Suchbegriff"/>
            <button id="searchbtn" class="btn btn-success">Suchen</button>
        </div>
    </div>

    <script>
            $('#searchbtn').click(function()"""),format.raw/*68.45*/("""{"""),format.raw/*68.46*/("""
                """),format.raw/*69.17*/("""var prm = $('#searchparam').val();
//                alert(prm);
                window.location = "/projectsearch/" + prm;
            """),format.raw/*72.13*/("""}"""),format.raw/*72.14*/(""");
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
                  DATE: Tue Jun 06 03:02:18 CEST 2017
                  SOURCE: C:/Users/Stefan Theissl/servSE/projekt/Projekt-SSE/projectmanagment-play/app/views/projectList.scala.html
                  HASH: d13b944b4a60ea3e416941de3b3675b979114d69
                  MATRIX: 764->1|887->29|919->36|943->52|981->53|1013->59|1062->83|1096->109|1135->111|1173->123|1695->618|1738->645|1777->646|1831->672|1897->711|1913->718|1942->726|2009->766|2025->773|2056->783|2123->823|2139->830|2178->848|2245->888|2261->895|2297->910|2364->950|2380->957|2423->979|2562->1091|2609->1122|2648->1123|2714->1161|2746->1166|2759->1170|2790->1180|2861->1220|2923->1254|3070->1374|3085->1380|3146->1420|3307->1554|3322->1560|3385->1602|3603->1789|3653->1811|3750->1891|3763->1895|3802->1896|3839->1906|3957->1994|3992->2002|4063->2046|4078->2052|4127->2080|4582->2507|4611->2508|4657->2526|4824->2665|4853->2666
                  LINES: 27->1|32->1|35->4|35->4|35->4|36->5|37->6|37->6|37->6|39->8|51->20|51->20|51->20|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|60->29|60->29|60->29|61->30|61->30|61->30|61->30|62->31|63->32|67->36|67->36|67->36|68->37|68->37|68->37|75->44|76->45|81->50|81->50|81->50|82->51|85->54|87->56|88->57|88->57|88->57|99->68|99->68|100->69|103->72|103->72
                  -- GENERATED --
              */
          