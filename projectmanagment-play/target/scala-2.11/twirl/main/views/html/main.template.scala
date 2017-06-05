
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>

        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.versioned("images/favicon.png")),format.raw/*15.104*/("""">
        <link rel="stylesheet" href=""""),_display_(/*16.39*/routes/*16.45*/.Assets.versioned("lib/bootstrap/css/bootstrap.css")),format.raw/*16.97*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*17.54*/routes/*17.60*/.Assets.versioned("font-awesome/css/font-awesome.min.css")),format.raw/*17.118*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*18.54*/routes/*18.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*18.101*/("""">
    <script type="text/javascript" src=""""),_display_(/*19.42*/routes/*19.48*/.Assets.versioned("/javascripts/jquery-3.2.1.min.js")),format.raw/*19.101*/(""""></script>
    </head>
    <body>
        """),format.raw/*23.31*/("""
        """),format.raw/*24.9*/("""<div class="container-fluid">

                    <div class="row header">
                        <div class="col-xs-12">
                        """),_display_(/*28.26*/header()),format.raw/*28.34*/("""
                        """),format.raw/*29.25*/("""</div>

            </div>

                    <div class="row">
                        <div class="col-sm-3 navigation">
                        """),_display_(/*35.26*/navigation()),format.raw/*35.38*/("""
                        """),format.raw/*36.25*/("""</div>
                        <div class="col-sm-9 content">
                        """),_display_(/*38.26*/content),format.raw/*38.33*/("""
                        """),format.raw/*39.25*/("""</div>

            </div>

                    <div class="row footer">
                        <div class="col-xs-12">
                        """),_display_(/*45.26*/footer()),format.raw/*45.34*/("""
                        """),format.raw/*46.25*/("""</div>
                    </div>

        </div>

        <script type='text/javascript' src='"""),_display_(/*51.46*/routes/*51.52*/.Assets.versioned("lib/jquery/jquery.min.js")),format.raw/*51.97*/("""'></script>
        <script type='text/javascript' src='"""),_display_(/*52.46*/routes/*52.52*/.Assets.versioned("lib/bootstrap/js/bootstrap.js")),format.raw/*52.102*/("""'></script>
        <script src=""""),_display_(/*53.23*/routes/*53.29*/.Assets.versioned("javascripts/main.js")),format.raw/*53.69*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Tue Jun 06 01:42:21 CEST 2017
                  SOURCE: C:/Users/Stefan Theissl/servSE/projekt/Projekt-SSE/projectmanagment-play/app/views/main.scala.html
                  HASH: 38760744fbb36c0b10b20e15671c329bcdbf4f75
                  MATRIX: 997->255|1122->285|1150->287|1230->392|1266->401|1301->409|1327->414|1422->482|1437->488|1498->527|1566->568|1581->574|1654->626|1737->682|1752->688|1832->746|1915->802|1930->808|1993->849|2064->893|2079->899|2154->952|2225->1084|2261->1093|2437->1242|2466->1250|2519->1275|2695->1424|2728->1436|2781->1461|2895->1548|2923->1555|2976->1580|3149->1726|3178->1734|3231->1759|3354->1855|3369->1861|3435->1906|3519->1963|3534->1969|3606->2019|3667->2053|3682->2059|3743->2099
                  LINES: 32->7|37->7|39->9|42->12|43->13|43->13|43->13|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|52->23|53->24|57->28|57->28|58->29|64->35|64->35|65->36|67->38|67->38|68->39|74->45|74->45|75->46|80->51|80->51|80->51|81->52|81->52|81->52|82->53|82->53|82->53
                  -- GENERATED --
              */
          