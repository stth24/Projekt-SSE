
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object navigation_Scope0 {
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

class navigation extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*3.1*/("""<div class="nav-item">
    <a href=""""),_display_(/*4.15*/routes/*4.21*/.WorkerController.list()),format.raw/*4.45*/(""""><i class="glyphicon glyphicon-user" aria-hidden="true"></i> Mitarbeiter</a>
</div>
<div class="nav-item">
    <a href=""""),_display_(/*7.15*/routes/*7.21*/.HomeController.index()),format.raw/*7.44*/(""""><i class="glyphicon glyphicon-file" aria-hidden="true"></i> Projekte</a>
</div>
<div class="nav-item">
    <a href=""""),_display_(/*10.15*/routes/*10.21*/.TaskController.list()),format.raw/*10.43*/(""""><i class="glyphicon glyphicon-barcode" aria-hidden="true"></i> Aufgaben</a>
</div>
<div class="nav-item">
    <a href=""""),_display_(/*13.15*/routes/*13.21*/.CustomerController.list()),format.raw/*13.47*/(""""><i class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></i> Kunden</a>
</div>


"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object navigation extends navigation_Scope0.navigation
              /*
                  -- GENERATED --
                  DATE: Tue May 30 15:12:46 CEST 2017
                  SOURCE: C:/Users/Stefan Theissl/servSE/projekt/Projekt-SSE/projectmanagment-play/app/views/navigation.scala.html
                  HASH: 8d090e35882e103c350dd5e5bc970458eef4fb01
                  MATRIX: 748->1|844->3|872->5|935->42|949->48|993->72|1141->194|1155->200|1198->223|1344->342|1359->348|1402->370|1551->492|1566->498|1613->524
                  LINES: 27->1|32->1|34->3|35->4|35->4|35->4|38->7|38->7|38->7|41->10|41->10|41->10|44->13|44->13|44->13
                  -- GENERATED --
              */
          