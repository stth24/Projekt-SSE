
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object taskList_Scope0 {
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

class taskList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Task],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(taskList: List[Task]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.24*/("""

"""),_display_(/*3.2*/main("Tasks")/*3.15*/{_display_(Seq[Any](format.raw/*3.16*/("""
    """),format.raw/*4.5*/("""<h1>Aufgaben</h1>
    """),_display_(/*5.6*/if(taskList.size() > 0)/*5.29*/ {_display_(Seq[Any](format.raw/*5.31*/("""

        """),format.raw/*7.9*/("""<div class="row">
            <div class="col-xs-12">
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <td>ID</td>
                            <td>Name</td>
                            <td>Beschreibung</td>
                            <td>Taskdauer</td>
                        </tr>
                    </thead>
                    <tbody>
                    """),_display_(/*19.22*/for(task <- taskList) yield /*19.43*/{_display_(Seq[Any](format.raw/*19.44*/("""
                        """),format.raw/*20.25*/("""<tr>
                            <td>"""),_display_(/*21.34*/task/*21.38*/.getId()),format.raw/*21.46*/("""</td>
                            <td>"""),_display_(/*22.34*/task/*22.38*/.getName()),format.raw/*22.48*/("""</td>
                            <td>"""),_display_(/*23.34*/task/*23.38*/.getBeschreibung()),format.raw/*23.56*/("""</td>
                            <td>"""),_display_(/*24.34*/task/*24.38*/.getDauer()),format.raw/*24.49*/("""</td>

                            <td>
                                <a href=""""),_display_(/*27.43*/routes/*27.49*/.TaskController.show(task.getId())),format.raw/*27.83*/("""" class="btn btn-danger"><i class="glyphicon glyphicon-pencil" aria-hidden="true"></i></a>
                                <a href=""""),_display_(/*28.43*/routes/*28.49*/.TaskController.delete(task.getId())),format.raw/*28.85*/("""" class="btn btn-danger"><i class="glyphicon glyphicon-remove" aria-hidden="true"></i></a>

                            </td>


                        </tr>

                    """)))}),format.raw/*35.22*/("""
                    """),format.raw/*36.21*/("""</tbody>
                </table>
            </div>

        </div>
    """)))}/*41.7*/else/*41.11*/{_display_(Seq[Any](format.raw/*41.12*/("""
        """),format.raw/*42.9*/("""<div class="warehouse-item">
            Keine Aufgaben vorhanden
        </div>
    """)))}),format.raw/*45.6*/("""

    """),format.raw/*47.5*/("""<div class="new-holder">
        <a href=""""),_display_(/*48.19*/routes/*48.25*/.FormController.addTask()),format.raw/*48.50*/("""" class="btn btn-success"><i class="fa fa-plus-square-o" aria-hidden="true"></i> Neuen Task anlegen</a>
    </div>

""")))}))
      }
    }
  }

  def render(taskList:List[Task]): play.twirl.api.HtmlFormat.Appendable = apply(taskList)

  def f:((List[Task]) => play.twirl.api.HtmlFormat.Appendable) = (taskList) => apply(taskList)

  def ref: this.type = this

}


}

/**/
object taskList extends taskList_Scope0.taskList
              /*
                  -- GENERATED --
                  DATE: Tue May 30 15:12:46 CEST 2017
                  SOURCE: C:/Users/Stefan Theissl/servSE/projekt/Projekt-SSE/projectmanagment-play/app/views/taskList.scala.html
                  HASH: 402f804bec848739f62fdb07bba8b8ac5dcf1167
                  MATRIX: 755->1|872->23|902->28|923->41|961->42|993->48|1042->72|1073->95|1112->97|1150->109|1639->571|1676->592|1715->593|1769->619|1835->658|1848->662|1877->670|1944->710|1957->714|1988->724|2055->764|2068->768|2107->786|2174->826|2187->830|2219->841|2331->926|2346->932|2401->966|2562->1100|2577->1106|2634->1142|2852->1329|2902->1351|2999->1431|3012->1435|3051->1436|3088->1446|3207->1535|3242->1543|3313->1587|3328->1593|3374->1618
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|36->5|38->7|50->19|50->19|50->19|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|58->27|58->27|58->27|59->28|59->28|59->28|66->35|67->36|72->41|72->41|72->41|73->42|76->45|78->47|79->48|79->48|79->48
                  -- GENERATED --
              */
          