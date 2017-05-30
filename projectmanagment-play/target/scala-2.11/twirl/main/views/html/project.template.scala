
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

"""),_display_(/*3.2*/main("Projekt Edit")/*3.22*/{_display_(Seq[Any](format.raw/*3.23*/("""
    """),format.raw/*4.5*/("""<div class="row">
        <div class="col-xs-12">
            <h1>Projekt: """),_display_(/*6.27*/project/*6.34*/.getName()),format.raw/*6.44*/("""</h1>
        </div>
    </div>

    <div class="row">
        <div class="col-xs-12">
            <b>Infos</b>
            <div>"""),_display_(/*13.19*/project/*13.26*/.getName()),format.raw/*13.36*/(""" """),_display_(/*13.38*/project/*13.45*/.getBeschreibung()),format.raw/*13.63*/("""</div>
            <div></div>
        </div>
    </div>

    <div class="row add-item">
        <div class="col-xs-2">
            <a href=""""),_display_(/*20.23*/routes/*20.29*/.FormController.addProjectTask()),format.raw/*20.61*/("""" class="btn btn-success"><i class="fa fa-plus-square fa-2x" aria-hidden="true"></i></a>
        </div>

    </div>
    <div class="row">
        <div class="col-xs-12">
            <table class="table table-striped">
                <thead>
                    <tr>

                        <td>Name</td>
                        <td>Beschreibung</td>
                        <td>Dauer</td>
                    </tr>
                </thead>
                <tbody>
                """),_display_(/*36.18*/for(task <- project.getProjectTasks()) yield /*36.56*/{_display_(Seq[Any](format.raw/*36.57*/("""
                    """),format.raw/*37.21*/("""<tr>

                        <td>"""),_display_(/*39.30*/task/*39.34*/.getTask.getName()),format.raw/*39.52*/("""</td>
                        <td>"""),_display_(/*40.30*/task/*40.34*/.getTask.getBeschreibung()),format.raw/*40.60*/("""</td>
                        <td>"""),_display_(/*41.30*/task/*41.34*/.getTask.getDauer()),format.raw/*41.53*/("""</td>

                    </tr>

                """)))}),format.raw/*45.18*/("""



                """),format.raw/*49.17*/("""</tbody>
            </table>
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
                  DATE: Tue May 30 15:12:46 CEST 2017
                  SOURCE: C:/Users/Stefan Theissl/servSE/projekt/Projekt-SSE/projectmanagment-play/app/views/project.scala.html
                  HASH: a8bdcba0682d2ac69cb1f9bc1214d66e6ef44c33
                  MATRIX: 750->1|863->19|893->24|921->44|959->45|991->51|1095->129|1110->136|1140->146|1304->283|1320->290|1351->300|1380->302|1396->309|1435->327|1611->476|1626->482|1679->514|2205->1013|2259->1051|2298->1052|2348->1074|2412->1111|2425->1115|2464->1133|2527->1169|2540->1173|2587->1199|2650->1235|2663->1239|2703->1258|2789->1313|2841->1337
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|37->6|37->6|37->6|44->13|44->13|44->13|44->13|44->13|44->13|51->20|51->20|51->20|67->36|67->36|67->36|68->37|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|76->45|80->49
                  -- GENERATED --
              */
          