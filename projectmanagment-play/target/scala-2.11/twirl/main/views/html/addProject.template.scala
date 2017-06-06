
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addProject_Scope0 {
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

class addProject extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.data.Form[Project],List[Customer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projectForm: play.data.Form[Project], customerList: List[Customer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.70*/("""

"""),_display_(/*3.2*/main("Neues Projekt")/*3.23*/{_display_(Seq[Any](format.raw/*3.24*/("""
    """),format.raw/*4.5*/("""<div class="row">
        <div class="col-xs-12">
            <h1>Neues Projekt</h1>
        </div>
    </div>

    <div class="row">
        <div class="col-xs-12">
        """),_display_(/*12.10*/helper/*12.16*/.form(action = routes.ProjectController.create(), 'enctype -> "multipart/form-data")/*12.100*/{_display_(Seq[Any](format.raw/*12.101*/("""
            """),_display_(/*13.14*/helper/*13.20*/.inputText(projectForm("name"), 'id -> "name", '_label -> "Name", 'class -> "form-control")),format.raw/*13.111*/("""
            """),_display_(/*14.14*/helper/*14.20*/.inputText(projectForm("beschreibung"), '_label -> "Beschreibung", 'class -> "form-control")),format.raw/*14.112*/("""
            """),_display_(/*15.14*/helper/*15.20*/.inputFile(
                projectForm("image"), '_label -> "Bild", 'class -> "form-control"
            )),format.raw/*17.14*/("""
            """),_display_(/*18.14*/helper/*18.20*/.select(
                field = projectForm("tmpcustomer"),
                options = (customerList.map(customer => customer.getId.toString -> customer.getName())),
                'id -> "customer",
                '_label -> "Kunde",
                'class -> "form-control")),format.raw/*23.42*/("""
            """),format.raw/*24.13*/("""<button type="submit" class="btn btn-success" value="Anlegen" ><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Anlegen </button>
        """)))}),format.raw/*25.10*/("""
        """),format.raw/*26.9*/("""</div>
    </div>

""")))}))
      }
    }
  }

  def render(projectForm:play.data.Form[Project],customerList:List[Customer]): play.twirl.api.HtmlFormat.Appendable = apply(projectForm,customerList)

  def f:((play.data.Form[Project],List[Customer]) => play.twirl.api.HtmlFormat.Appendable) = (projectForm,customerList) => apply(projectForm,customerList)

  def ref: this.type = this

}


}

/**/
object addProject extends addProject_Scope0.addProject
              /*
                  -- GENERATED --
                  DATE: Tue Jun 06 02:41:26 CEST 2017
                  SOURCE: C:/Users/Stefan Theissl/servSE/projekt/Projekt-SSE/projectmanagment-play/app/views/addProject.scala.html
                  HASH: cb09d89421a9318348eda781fc95a6cfbbd37b99
                  MATRIX: 787->1|950->69|980->74|1009->95|1047->96|1079->102|1289->285|1304->291|1398->375|1438->376|1480->391|1495->397|1608->488|1650->503|1665->509|1779->601|1821->616|1836->622|1966->731|2008->746|2023->752|2327->1035|2369->1049|2564->1213|2601->1223
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|43->12|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|48->17|49->18|49->18|54->23|55->24|56->25|57->26
                  -- GENERATED --
              */
          