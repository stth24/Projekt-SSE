
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

    """),format.raw/*7.20*/("""
    """),format.raw/*8.5*/("""<div class="row">
        <div class="col-xs-12">
            <input type="text" id="searchparam" placeholder="Suchbegriff"/>
            <button id="searchbtn" class="btn btn-success">Suchen</button>
        </div>
    </div>

    <script>
            $('#searchbtn').click(function()"""),format.raw/*16.45*/("""{"""),format.raw/*16.46*/("""
                """),format.raw/*17.17*/("""var prm = $('#searchparam').val();
//                alert(prm);
                window.location = "/projectsearch/" + prm;
            """),format.raw/*20.13*/("""}"""),format.raw/*20.14*/(""");
    </script>

    """),_display_(/*23.6*/if(projectList.size() > 0)/*23.32*/ {_display_(Seq[Any](format.raw/*23.34*/("""

        """),format.raw/*25.9*/("""<div class="row">
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
                    """),_display_(/*37.22*/for(project <- projectList) yield /*37.49*/{_display_(Seq[Any](format.raw/*37.50*/("""
                        """),format.raw/*38.25*/("""<tr>
                            <td>"""),_display_(/*39.34*/project/*39.41*/.getId()),format.raw/*39.49*/("""</td>
                            <td>"""),_display_(/*40.34*/project/*40.41*/.getName()),format.raw/*40.51*/("""</td>
                            <td>"""),_display_(/*41.34*/project/*41.41*/.getBeschreibung()),format.raw/*41.59*/("""</td>
                            <td>"""),_display_(/*42.34*/project/*42.41*/.projektdauer()),format.raw/*42.56*/("""</td>
                            <td>"""),_display_(/*43.34*/project/*43.41*/.getCustomer.getName()),format.raw/*43.63*/("""</td>
                            <td>
                                <ul>
                                """),_display_(/*46.34*/for(task <- project.getTasks()) yield /*46.65*/{_display_(Seq[Any](format.raw/*46.66*/("""
                                    """),format.raw/*47.37*/("""<li>"""),_display_(/*47.42*/task/*47.46*/.getName()),format.raw/*47.56*/("""</li>
                                """)))}),format.raw/*48.34*/("""
                                """),format.raw/*49.33*/("""</ul>
                            </td>

                            <td>
                                <a href=""""),_display_(/*53.43*/routes/*53.49*/.ProjectController.show(project.getId())),format.raw/*53.89*/("""" class="btn btn-danger"><i class="glyphicon glyphicon-pencil" aria-hidden="true"></i></a>
                                <a href=""""),_display_(/*54.43*/routes/*54.49*/.ProjectController.delete(project.getId())),format.raw/*54.91*/("""" class="btn btn-danger"><i class="glyphicon glyphicon-remove" aria-hidden="true"></i></a>

                            </td>


                        </tr>

                    """)))}),format.raw/*61.22*/("""
                    """),format.raw/*62.21*/("""</tbody>
                </table>
            </div>

        </div>
    """)))}/*67.7*/else/*67.11*/{_display_(Seq[Any](format.raw/*67.12*/("""
        """),format.raw/*68.9*/("""<div class="warehouse-item">
            Kein Projekte vorhanden
        </div>
    """)))}),format.raw/*71.6*/("""

    """),format.raw/*73.5*/("""<div class="new-holder">
        <a href=""""),_display_(/*74.19*/routes/*74.25*/.FormController.addProject()),format.raw/*74.53*/("""" class="btn btn-success"><i class="fa fa-plus-square-o" aria-hidden="true"></i> Neues Projekt anlegen</a>
    </div>
    <br>

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
                  DATE: Tue Jun 06 04:36:46 CEST 2017
                  SOURCE: C:/Users/Stefan Theissl/servSE/projekt/Projekt-SSE/projectmanagment-play/app/views/projectList.scala.html
                  HASH: 8cf80d15c98724695c0ecac407561ec97020b39a
                  MATRIX: 764->1|887->29|919->36|943->52|981->53|1013->59|1065->99|1097->105|1418->398|1447->399|1493->417|1660->556|1689->557|1741->583|1776->609|1816->611|1855->623|2377->1118|2420->1145|2459->1146|2513->1172|2579->1211|2595->1218|2624->1226|2691->1266|2707->1273|2738->1283|2805->1323|2821->1330|2860->1348|2927->1388|2943->1395|2979->1410|3046->1450|3062->1457|3105->1479|3244->1591|3291->1622|3330->1623|3396->1661|3428->1666|3441->1670|3472->1680|3543->1720|3605->1754|3752->1874|3767->1880|3828->1920|3989->2054|4004->2060|4067->2102|4285->2289|4335->2311|4432->2391|4445->2395|4484->2396|4521->2406|4639->2494|4674->2502|4745->2546|4760->2552|4809->2580
                  LINES: 27->1|32->1|35->4|35->4|35->4|36->5|38->7|39->8|47->16|47->16|48->17|51->20|51->20|54->23|54->23|54->23|56->25|68->37|68->37|68->37|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|77->46|77->46|77->46|78->47|78->47|78->47|78->47|79->48|80->49|84->53|84->53|84->53|85->54|85->54|85->54|92->61|93->62|98->67|98->67|98->67|99->68|102->71|104->73|105->74|105->74|105->74
                  -- GENERATED --
              */
          