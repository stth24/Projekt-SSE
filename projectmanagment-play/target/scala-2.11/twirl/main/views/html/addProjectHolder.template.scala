
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addProjectHolder_Scope0 {
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

class addProjectHolder extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[play.data.Form[ProjectHolder],List[Project],List[Customer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projectHolderForm: play.data.Form[ProjectHolder], projectList: List[Project], customerList: List[Customer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.110*/("""

"""),_display_(/*3.2*/main("Neue Auftraggeber")/*3.27*/{_display_(Seq[Any](format.raw/*3.28*/("""
    """),format.raw/*4.5*/("""<div class="row">
        <div class="col-xs-12">
            <h1>Neues Projekt zuweisen</h1>
        </div>
    </div>

    <div class="row">
        <div class="col-xs-12">
        """),_display_(/*12.10*/helper/*12.16*/.form(action = routes.ProjectHolderController.create())/*12.71*/{_display_(Seq[Any](format.raw/*12.72*/("""

            """),_display_(/*14.14*/helper/*14.20*/.select(
                field = projectHolderForm("tmpproject"),
                options = (projectList.map(project => project.getId().toString() -> project.getName())),
                'id -> "project",
                '_label -> "Projekt",
                'class -> "form-control")),format.raw/*19.42*/("""
            """),_display_(/*20.14*/helper/*20.20*/.select(
                field = projectHolderForm("tmpcustomer"),
                options = (customerList.map(customer => customer.getId().toString() -> customer.getName())),
                'id -> "customer",
                '_label -> "Kunde",
                'class -> "form-control")),format.raw/*25.42*/("""

            """),format.raw/*27.13*/("""<button type="submit" class="btn btn-success" value="Anlegen" ><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Einlagern </button>
        """)))}),format.raw/*28.10*/("""
        """),format.raw/*29.9*/("""</div>
    </div>

""")))}))
      }
    }
  }

  def render(projectHolderForm:play.data.Form[ProjectHolder],projectList:List[Project],customerList:List[Customer]): play.twirl.api.HtmlFormat.Appendable = apply(projectHolderForm,projectList,customerList)

  def f:((play.data.Form[ProjectHolder],List[Project],List[Customer]) => play.twirl.api.HtmlFormat.Appendable) = (projectHolderForm,projectList,customerList) => apply(projectHolderForm,projectList,customerList)

  def ref: this.type = this

}


}

/**/
object addProjectHolder extends addProjectHolder_Scope0.addProjectHolder
              /*
                  -- GENERATED --
                  DATE: Tue May 30 15:12:46 CEST 2017
                  SOURCE: C:/Users/Stefan Theissl/servSE/projekt/Projekt-SSE/projectmanagment-play/app/views/addProjectHolder.scala.html
                  HASH: bc6ffcbd54b0ff7895c282a1efa7f9a97909f634
                  MATRIX: 819->1|1023->109|1053->114|1086->139|1124->140|1156->146|1375->338|1390->344|1454->399|1493->400|1537->417|1552->423|1862->712|1904->727|1919->733|2233->1026|2277->1042|2474->1208|2511->1218
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|43->12|43->12|43->12|43->12|45->14|45->14|50->19|51->20|51->20|56->25|58->27|59->28|60->29
                  -- GENERATED --
              */
          