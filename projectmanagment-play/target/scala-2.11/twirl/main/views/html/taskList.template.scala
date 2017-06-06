
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
  def apply/*1.2*/(tasks: List[Task]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.21*/("""

"""),_display_(/*3.2*/main("Tasks")/*3.15*/{_display_(Seq[Any](format.raw/*3.16*/("""
    """),format.raw/*4.5*/("""<h1>Aufgaben</h1>
    """),_display_(/*5.6*/if(tasks.size() > 0)/*5.26*/ {_display_(Seq[Any](format.raw/*5.28*/("""

        """),format.raw/*7.9*/("""<div class="row">
            <div class="col-xs-12">
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <td>ID</td>
                            <td>Name</td>
                            <td>Beschreibung</td>
                            <td>Taskdauer</td>
                            <td>Projekt</td>
                        </tr>
                    </thead>
                    <tbody>
                    """),_display_(/*20.22*/for(task <- tasks) yield /*20.40*/{_display_(Seq[Any](format.raw/*20.41*/("""
                        """),format.raw/*21.25*/("""<tr>
                            <td>"""),_display_(/*22.34*/task/*22.38*/.getId()),format.raw/*22.46*/("""</td>
                            <td>"""),_display_(/*23.34*/task/*23.38*/.getName()),format.raw/*23.48*/("""</td>
                            <td>"""),_display_(/*24.34*/task/*24.38*/.getBeschreibung()),format.raw/*24.56*/("""</td>
                            <td>"""),_display_(/*25.34*/task/*25.38*/.getDauer()),format.raw/*25.49*/("""</td>
                            <td>"""),_display_(/*26.34*/task/*26.38*/.getProject().getName()),format.raw/*26.61*/("""</td>

                            <td>
                                <a href=""""),_display_(/*29.43*/routes/*29.49*/.TaskController.show(task.getId())),format.raw/*29.83*/("""" class="btn btn-danger"><i class="glyphicon glyphicon-pencil" aria-hidden="true"></i></a>
                                <a href=""""),_display_(/*30.43*/routes/*30.49*/.TaskController.delete(task.getId())),format.raw/*30.85*/("""" class="btn btn-danger"><i class="glyphicon glyphicon-remove" aria-hidden="true"></i></a>

                            </td>


                        </tr>

                    """)))}),format.raw/*37.22*/("""
                    """),format.raw/*38.21*/("""</tbody>
                </table>
            </div>

        </div>
    """)))}/*43.7*/else/*43.11*/{_display_(Seq[Any](format.raw/*43.12*/("""
        """),format.raw/*44.9*/("""<div class="warehouse-item">
            Keine Aufgaben vorhanden
        </div>
    """)))}),format.raw/*47.6*/("""

    """),format.raw/*49.5*/("""<div class="new-holder">
        <a href=""""),_display_(/*50.19*/routes/*50.25*/.FormController.addTask()),format.raw/*50.50*/("""" class="btn btn-success"><i class="fa fa-plus-square-o" aria-hidden="true"></i> Neuen Task anlegen</a>
    </div>

""")))}))
      }
    }
  }

  def render(tasks:List[Task]): play.twirl.api.HtmlFormat.Appendable = apply(tasks)

  def f:((List[Task]) => play.twirl.api.HtmlFormat.Appendable) = (tasks) => apply(tasks)

  def ref: this.type = this

}


}

/**/
object taskList extends taskList_Scope0.taskList
              /*
                  -- GENERATED --
                  DATE: Tue Jun 06 04:36:46 CEST 2017
                  SOURCE: C:/Users/Stefan Theissl/servSE/projekt/Projekt-SSE/projectmanagment-play/app/views/taskList.scala.html
                  HASH: b5d76cb7f5cf09f60874be2652b0113aa495a74f
                  MATRIX: 755->1|869->20|899->25|920->38|958->39|990->45|1039->69|1067->89|1106->91|1144->103|1679->611|1713->629|1752->630|1806->656|1872->695|1885->699|1914->707|1981->747|1994->751|2025->761|2092->801|2105->805|2144->823|2211->863|2224->867|2256->878|2323->918|2336->922|2380->945|2492->1030|2507->1036|2562->1070|2723->1204|2738->1210|2795->1246|3013->1433|3063->1455|3160->1535|3173->1539|3212->1540|3249->1550|3368->1639|3403->1647|3474->1691|3489->1697|3535->1722
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|36->5|38->7|51->20|51->20|51->20|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|60->29|60->29|60->29|61->30|61->30|61->30|68->37|69->38|74->43|74->43|74->43|75->44|78->47|80->49|81->50|81->50|81->50
                  -- GENERATED --
              */
          