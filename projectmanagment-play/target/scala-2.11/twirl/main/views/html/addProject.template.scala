
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

class addProject extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[Project],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projectForm: play.data.Form[Project]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.40*/("""

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
            """),format.raw/*18.13*/("""<button type="submit" class="btn btn-success" value="Anlegen" ><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Anlegen </button>
        """)))}),format.raw/*19.10*/("""
        """),format.raw/*20.9*/("""</div>
    </div>

""")))}))
      }
    }
  }

  def render(projectForm:play.data.Form[Project]): play.twirl.api.HtmlFormat.Appendable = apply(projectForm)

  def f:((play.data.Form[Project]) => play.twirl.api.HtmlFormat.Appendable) = (projectForm) => apply(projectForm)

  def ref: this.type = this

}


}

/**/
object addProject extends addProject_Scope0.addProject
              /*
                  -- GENERATED --
                  DATE: Tue May 30 15:12:46 CEST 2017
                  SOURCE: C:/Users/Stefan Theissl/servSE/projekt/Projekt-SSE/projectmanagment-play/app/views/addProject.scala.html
                  HASH: 305ecc999e86b66eba8c64b7a615d1e3afda9827
                  MATRIX: 772->1|905->39|935->44|964->65|1002->66|1034->72|1244->255|1259->261|1353->345|1393->346|1435->361|1450->367|1563->458|1605->473|1620->479|1734->571|1776->586|1791->592|1921->701|1963->715|2158->879|2195->889
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|43->12|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|48->17|49->18|50->19|51->20
                  -- GENERATED --
              */
          