
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
                            <td>Projekte</td>

                        </tr>
                    </thead>
                    <tbody>
                    """),_display_(/*20.22*/for(customer <- customerList) yield /*20.51*/{_display_(Seq[Any](format.raw/*20.52*/("""
                        """),format.raw/*21.25*/("""<tr>
                            <td>"""),_display_(/*22.34*/customer/*22.42*/.getId()),format.raw/*22.50*/("""</td>
                            <td>"""),_display_(/*23.34*/customer/*23.42*/.getName()),format.raw/*23.52*/("""</td>
                            <td>"""),_display_(/*24.34*/customer/*24.42*/.getBranche()),format.raw/*24.55*/("""</td>
                            <td>
                                <ul>
                                    """),_display_(/*27.38*/for(project <- customer.getProjects()) yield /*27.76*/{_display_(Seq[Any](format.raw/*27.77*/("""
                                        """),format.raw/*28.41*/("""<li>"""),_display_(/*28.46*/project/*28.53*/.getName()),format.raw/*28.63*/("""</li>
                                    """)))}),format.raw/*29.38*/("""
                                """),format.raw/*30.33*/("""</ul>
                            </td>

                            <td>

                                <a href=""""),_display_(/*35.43*/routes/*35.49*/.CustomerController.show(customer.getId())),format.raw/*35.91*/("""" class="btn btn-danger"><i class="glyphicon glyphicon-pencil" aria-hidden="true"></i></a>
                                <a href=""""),_display_(/*36.43*/routes/*36.49*/.CustomerController.delete(customer.getId())),format.raw/*36.93*/("""" class="btn btn-danger"><i class="glyphicon glyphicon-remove" aria-hidden="true"></i></a>

                            </td>


                        </tr>

                    """)))}),format.raw/*43.22*/("""
                    """),format.raw/*44.21*/("""</tbody>
                </table>
            </div>







        </div>
    """)))}/*55.7*/else/*55.11*/{_display_(Seq[Any](format.raw/*55.12*/("""
        """),format.raw/*56.9*/("""<div class="warehouse-item">
            Keine Kunden vorhanden
        </div>
    """)))}),format.raw/*59.6*/("""

    """),format.raw/*61.5*/("""<div class="new-holder">
        <a href=""""),_display_(/*62.19*/routes/*62.25*/.FormController.addCustomer()),format.raw/*62.54*/("""" class="btn btn-success"><i class="fa fa-plus-square-o" aria-hidden="true"></i> Neuen Kunden anlegen</a>
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
                  DATE: Tue Jun 06 03:02:18 CEST 2017
                  SOURCE: C:/Users/Stefan Theissl/servSE/projekt/Projekt-SSE/projectmanagment-play/app/views/customerList.scala.html
                  HASH: f1d91894817f6be89d5a743411a1bf0397b8272d
                  MATRIX: 767->1|892->31|922->36|946->52|984->53|1016->59|1063->81|1098->108|1137->110|1175->122|1660->580|1705->609|1744->610|1798->636|1864->675|1881->683|1910->691|1977->731|1994->739|2025->749|2092->789|2109->797|2143->810|2286->926|2340->964|2379->965|2449->1007|2481->1012|2497->1019|2528->1029|2603->1073|2665->1107|2814->1229|2829->1235|2892->1277|3053->1411|3068->1417|3133->1461|3351->1648|3401->1670|3510->1762|3523->1766|3562->1767|3599->1777|3716->1864|3751->1872|3822->1916|3837->1922|3887->1951
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|36->5|38->7|51->20|51->20|51->20|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|58->27|58->27|58->27|59->28|59->28|59->28|59->28|60->29|61->30|66->35|66->35|66->35|67->36|67->36|67->36|74->43|75->44|86->55|86->55|86->55|87->56|90->59|92->61|93->62|93->62|93->62
                  -- GENERATED --
              */
          