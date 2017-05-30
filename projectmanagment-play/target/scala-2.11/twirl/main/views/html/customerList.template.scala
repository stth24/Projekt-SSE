
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object customerList_Scope0 {
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

class customerList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Customer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customerList: List[Customer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),_display_(/*3.2*/main("Customer")/*3.18*/{_display_(Seq[Any](format.raw/*3.19*/("""
    """),format.raw/*4.5*/("""<h1>Kunden</h1>
    """),_display_(/*5.6*/if(customerList.size() > 0)/*5.33*/ {_display_(Seq[Any](format.raw/*5.35*/("""

        """),format.raw/*7.9*/("""<div class="row">
            <div class="col-xs-12">
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <td>ID</td>
                            <td>Name</td>
                            <td>Branche</td>

                        </tr>
                    </thead>
                    <tbody>
                    """),_display_(/*19.22*/for(customer <- customerList) yield /*19.51*/{_display_(Seq[Any](format.raw/*19.52*/("""
                        """),format.raw/*20.25*/("""<tr>
                            <td>"""),_display_(/*21.34*/customer/*21.42*/.getId()),format.raw/*21.50*/("""</td>
                            <td>"""),_display_(/*22.34*/customer/*22.42*/.getName()),format.raw/*22.52*/("""</td>
                            <td>"""),_display_(/*23.34*/customer/*23.42*/.getBranche()),format.raw/*23.55*/("""</td>

                            <td>

                                <a href=""""),_display_(/*27.43*/routes/*27.49*/.CustomerController.show(customer.getId())),format.raw/*27.91*/("""" class="btn btn-danger"><i class="glyphicon glyphicon-pencil" aria-hidden="true"></i></a>
                                <a href=""""),_display_(/*28.43*/routes/*28.49*/.CustomerController.delete(customer.getId())),format.raw/*28.93*/("""" class="btn btn-danger"><i class="glyphicon glyphicon-remove" aria-hidden="true"></i></a>

                            </td>


                        </tr>

                    """)))}),format.raw/*35.22*/("""
                    """),format.raw/*36.21*/("""</tbody>
                </table>
            </div>







        </div>
    """)))}/*47.7*/else/*47.11*/{_display_(Seq[Any](format.raw/*47.12*/("""
        """),format.raw/*48.9*/("""<div class="warehouse-item">
            Keine Kunden vorhanden
        </div>
    """)))}),format.raw/*51.6*/("""

    """),format.raw/*53.5*/("""<div class="new-holder">
        <a href=""""),_display_(/*54.19*/routes/*54.25*/.FormController.addCustomer()),format.raw/*54.54*/("""" class="btn btn-success"><i class="fa fa-plus-square-o" aria-hidden="true"></i> Neuen Kunden anlegen</a>
    </div>

""")))}))
      }
    }
  }

  def render(customerList:List[Customer]): play.twirl.api.HtmlFormat.Appendable = apply(customerList)

  def f:((List[Customer]) => play.twirl.api.HtmlFormat.Appendable) = (customerList) => apply(customerList)

  def ref: this.type = this

}


}

/**/
object customerList extends customerList_Scope0.customerList
              /*
                  -- GENERATED --
                  DATE: Tue May 30 15:12:46 CEST 2017
                  SOURCE: C:/Users/Stefan Theissl/servSE/projekt/Projekt-SSE/projectmanagment-play/app/views/customerList.scala.html
                  HASH: b6fa75dc04beb510ef455852cf02cdb0f414319e
                  MATRIX: 767->1|892->31|922->36|946->52|984->53|1016->59|1063->81|1098->108|1137->110|1175->122|1613->533|1658->562|1697->563|1751->589|1817->628|1834->636|1863->644|1930->684|1947->692|1978->702|2045->742|2062->750|2096->763|2210->850|2225->856|2288->898|2449->1032|2464->1038|2529->1082|2747->1269|2797->1291|2906->1383|2919->1387|2958->1388|2995->1398|3112->1485|3147->1493|3218->1537|3233->1543|3283->1572
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|36->5|38->7|50->19|50->19|50->19|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|58->27|58->27|58->27|59->28|59->28|59->28|66->35|67->36|78->47|78->47|78->47|79->48|82->51|84->53|85->54|85->54|85->54
                  -- GENERATED --
              */
          