
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object task_Scope0 {
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

class task extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Task,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(task: Task):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.14*/("""


"""),_display_(/*4.2*/main("Aufgaben")/*4.18*/{_display_(Seq[Any](format.raw/*4.19*/("""
  """),format.raw/*5.3*/("""<h1>"""),_display_(/*5.8*/task/*5.12*/.getName()),format.raw/*5.22*/("""</h1>

  <div class="row">
    <div class="col-xs-12">
      <table class="table table-striped">
        <thead>
          <tr>
            <td>ID</td>
            <td>Name</td>
            <td>Beschreibung</td>
            <td>Dauer</td>
            <td>Projekt</td>
      <tbody>
        <tr>
          <td>"""),_display_(/*19.16*/task/*19.20*/.getId()),format.raw/*19.28*/("""</td>
          <td>"""),_display_(/*20.16*/task/*20.20*/.getName()),format.raw/*20.30*/("""</td>
          <td>"""),_display_(/*21.16*/task/*21.20*/.getBeschreibung()),format.raw/*21.38*/("""</td>
          <td>"""),_display_(/*22.16*/task/*22.20*/.getDauer()),format.raw/*22.31*/("""</td>
          <td>"""),_display_(/*23.16*/task/*23.20*/.getProject().getName()),format.raw/*23.43*/("""</td>
        </tr>
      </tbody>
      </table>
    </div>
  </div>


  <div class="row back">
    <div class="col-xs-12">
      <a href=""""),_display_(/*33.17*/routes/*33.23*/.TaskController.list()),format.raw/*33.45*/(""""><i class="fa fa-caret-left" aria-hidden="true"></i> Zurück</a>
    </div>
  </div>

""")))}))
      }
    }
  }

  def render(task:Task): play.twirl.api.HtmlFormat.Appendable = apply(task)

  def f:((Task) => play.twirl.api.HtmlFormat.Appendable) = (task) => apply(task)

  def ref: this.type = this

}


}

/**/
object task extends task_Scope0.task
              /*
                  -- GENERATED --
                  DATE: Tue Jun 06 03:43:04 CEST 2017
                  SOURCE: C:/Users/Stefan Theissl/servSE/projekt/Projekt-SSE/projectmanagment-play/app/views/task.scala.html
                  HASH: 53dd7f72d62c6d6abac30e7d24fdbc2acb8ea44d
                  MATRIX: 741->1|848->13|880->20|904->36|942->37|972->41|1002->46|1014->50|1044->60|1395->384|1408->388|1437->396|1486->418|1499->422|1530->432|1579->454|1592->458|1631->476|1680->498|1693->502|1725->513|1774->535|1787->539|1831->562|2009->713|2024->719|2067->741
                  LINES: 27->1|32->1|35->4|35->4|35->4|36->5|36->5|36->5|36->5|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|64->33|64->33|64->33
                  -- GENERATED --
              */
          