
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object customer_Scope0 {
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

class customer extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Customer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: Customer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""


"""),_display_(/*4.2*/main("Kunden")/*4.16*/{_display_(Seq[Any](format.raw/*4.17*/("""
  """),format.raw/*5.3*/("""<h1>"""),_display_(/*5.8*/customer/*5.16*/.getName()),format.raw/*5.26*/("""</h1>

  <div class="row">
    <div class="col-xs-12">
      <table class="table table-striped">
        <thead>
          <tr>
            <td>ID</td>
            <td>Name</td>
            <td>Branche</td>
            <td>Projekte</td>
      <tbody>
        <tr>
          <td>"""),_display_(/*18.16*/customer/*18.24*/.getId()),format.raw/*18.32*/("""</td>
          <td>"""),_display_(/*19.16*/customer/*19.24*/.getName()),format.raw/*19.34*/("""</td>
          <td>"""),_display_(/*20.16*/customer/*20.24*/.getBranche),format.raw/*20.35*/("""</td>
          <td>
            <ul>
            """),_display_(/*23.14*/for(project <- customer.getProjects()) yield /*23.52*/{_display_(Seq[Any](format.raw/*23.53*/("""
              """),format.raw/*24.15*/("""<li>"""),_display_(/*24.20*/project/*24.27*/.getName()),format.raw/*24.37*/("""</li>
            """)))}),format.raw/*25.14*/("""
            """),format.raw/*26.13*/("""</ul>
          </td>
        </tr>
      </tbody>
      </table>
    </div>
  </div>


  <div class="row back">
    <div class="col-xs-12">
      <a href=""""),_display_(/*37.17*/routes/*37.23*/.CustomerController.list()),format.raw/*37.49*/(""""><i class="fa fa-caret-left" aria-hidden="true"></i> Zurück</a>
    </div>
  </div>

""")))}))
      }
    }
  }

  def render(customer:Customer): play.twirl.api.HtmlFormat.Appendable = apply(customer)

  def f:((Customer) => play.twirl.api.HtmlFormat.Appendable) = (customer) => apply(customer)

  def ref: this.type = this

}


}

/**/
object customer extends customer_Scope0.customer
              /*
                  -- GENERATED --
                  DATE: Tue Jun 06 03:39:34 CEST 2017
                  SOURCE: C:/Users/Stefan Theissl/servSE/projekt/Projekt-SSE/projectmanagment-play/app/views/customer.scala.html
                  HASH: 1ed4e625cc819996e4f836fdfbebaf72441194b2
                  MATRIX: 753->1|868->21|900->28|922->42|960->43|990->47|1020->52|1036->60|1066->70|1385->362|1402->370|1431->378|1480->400|1497->408|1528->418|1577->440|1594->448|1626->459|1707->513|1761->551|1800->552|1844->568|1876->573|1892->580|1923->590|1974->610|2016->624|2211->792|2226->798|2273->824
                  LINES: 27->1|32->1|35->4|35->4|35->4|36->5|36->5|36->5|36->5|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|54->23|54->23|54->23|55->24|55->24|55->24|55->24|56->25|57->26|68->37|68->37|68->37
                  -- GENERATED --
              */
          