
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addCustomer_Scope0 {
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

class addCustomer extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[Customer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customerForm: play.data.Form[Customer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.42*/("""

"""),_display_(/*3.2*/main("Neuen Kunden")/*3.22*/{_display_(Seq[Any](format.raw/*3.23*/("""
    """),format.raw/*4.5*/("""<div class="row">
        <div class="col-xs-12">
            <h1>Neuer Kunde</h1>
        </div>
    </div>

    <div class="row">
        <div class="col-xs-12">
        """),_display_(/*12.10*/helper/*12.16*/.form(action = routes.CustomerController.create(), 'enctype -> "multipart/form-data")/*12.101*/{_display_(Seq[Any](format.raw/*12.102*/("""

            """),_display_(/*14.14*/helper/*14.20*/.inputText(customerForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*14.97*/("""
            """),_display_(/*15.14*/helper/*15.20*/.inputText(customerForm("branche"), '_label -> "Branche", 'class -> "form-control")),format.raw/*15.103*/("""


            """),format.raw/*18.13*/("""<button type="submit" class="btn btn-success" value="Anlegen" ><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Anlegen </button>
        """)))}),format.raw/*19.10*/("""
        """),format.raw/*20.9*/("""</div>
    </div>

""")))}))
      }
    }
  }

  def render(customerForm:play.data.Form[Customer]): play.twirl.api.HtmlFormat.Appendable = apply(customerForm)

  def f:((play.data.Form[Customer]) => play.twirl.api.HtmlFormat.Appendable) = (customerForm) => apply(customerForm)

  def ref: this.type = this

}


}

/**/
object addCustomer extends addCustomer_Scope0.addCustomer
              /*
                  -- GENERATED --
                  DATE: Tue May 30 15:12:46 CEST 2017
                  SOURCE: C:/Users/Stefan Theissl/servSE/projekt/Projekt-SSE/projectmanagment-play/app/views/addCustomer.scala.html
                  HASH: cc6272fc1faf3ec8ae922ac6261c0fb46201e039
                  MATRIX: 775->1|910->41|940->46|968->66|1006->67|1038->73|1246->254|1261->260|1356->345|1396->346|1440->363|1455->369|1553->446|1595->461|1610->467|1715->550|1761->568|1956->732|1993->742
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|43->12|43->12|43->12|43->12|45->14|45->14|45->14|46->15|46->15|46->15|49->18|50->19|51->20
                  -- GENERATED --
              */
          