
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

"""),_display_(/*3.2*/main("Projekt Edit")/*3.22*/{_display_(Seq[Any](format.raw/*3.23*/("""
    """),format.raw/*4.5*/("""<div class="row">
        <div class="col-xs-12">
            <h1>Kunde: """),_display_(/*6.25*/customer/*6.33*/.getName()),format.raw/*6.43*/("""</h1>
        </div>
    </div>

    <div class="row">
        <div class="col-xs-12">
            <b>Infos</b>
            <div>"""),_display_(/*13.19*/customer/*13.27*/.getBranche()),format.raw/*13.40*/("""</div>
            <div></div>
        </div>
    </div>

    <div class="row add-item">
        <div class="col-xs-2">
            <a href=""""),_display_(/*20.23*/routes/*20.29*/.FormController.addProjectHolder()),format.raw/*20.63*/("""" class="btn btn-success"><i class="fa fa-plus-square fa-2x" aria-hidden="true"></i></a>
        </div>

    </div>
    <div class="row">
        <div class="col-xs-12">
            <table class="table table-striped">
                <thead>
                    <tr>

                        <td>ID</td>
                        <td>Name</td>
                        <td>Beschreibung</td>
                        <td>Projektdauer</td>
                    </tr>
                </thead>
                <tbody>
                """),_display_(/*37.18*/for(project <- customer.getProjectHolders()) yield /*37.62*/{_display_(Seq[Any](format.raw/*37.63*/("""
                    """),format.raw/*38.21*/("""<tr>
                        <td>"""),_display_(/*39.30*/project/*39.37*/.getProject().getId()),format.raw/*39.58*/("""</td>
                        <td>"""),_display_(/*40.30*/project/*40.37*/.getProject().getName()),format.raw/*40.60*/("""</td>
                        <td>"""),_display_(/*41.30*/project/*41.37*/.getProject().getBeschreibung()),format.raw/*41.68*/("""</td>
                        <td>"""),_display_(/*42.30*/project/*42.37*/.getProject().getProjektdauer()),format.raw/*42.68*/("""</td>


                    </tr>

                """)))}),format.raw/*47.18*/("""



                """),format.raw/*51.17*/("""</tbody>
            </table>
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
                  DATE: Tue May 30 15:12:46 CEST 2017
                  SOURCE: C:/Users/Stefan Theissl/servSE/projekt/Projekt-SSE/projectmanagment-play/app/views/customer.scala.html
                  HASH: aaccc899e75ef9c2a325e932161ded4a726e3779
                  MATRIX: 753->1|868->21|898->26|926->46|964->47|996->53|1098->129|1114->137|1144->147|1308->284|1325->292|1359->305|1535->454|1550->460|1605->494|2175->1037|2235->1081|2274->1082|2324->1104|2386->1139|2402->1146|2444->1167|2507->1203|2523->1210|2567->1233|2630->1269|2646->1276|2698->1307|2761->1343|2777->1350|2829->1381|2917->1438|2969->1462
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|37->6|37->6|37->6|44->13|44->13|44->13|51->20|51->20|51->20|68->37|68->37|68->37|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|78->47|82->51
                  -- GENERATED --
              */
          