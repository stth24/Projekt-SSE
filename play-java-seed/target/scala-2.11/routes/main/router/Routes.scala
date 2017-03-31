
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Stefan Theissl/servSE/projekt/Projekt-SSE/play-java-seed/conf/routes
// @DATE:Fri Mar 31 15:18:44 CEST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:11
  MitarbeiterController_2: controllers.MitarbeiterController,
  // @LINE:21
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:11
    MitarbeiterController_2: controllers.MitarbeiterController,
    // @LINE:21
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, MitarbeiterController_2, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, MitarbeiterController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mitarbeiter""", """controllers.MitarbeiterController.getInfo()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mitarbeiter""", """controllers.MitarbeiterController.create()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mitarbeiter/""" + "$" + """id<[^/]+>""", """controllers.MitarbeiterController.update(id:Integer)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mitarbeiter/""" + "$" + """id<[^/]+>""", """controllers.MitarbeiterController.delete(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_MitarbeiterController_getInfo1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mitarbeiter")))
  )
  private[this] lazy val controllers_MitarbeiterController_getInfo1_invoker = createInvoker(
    MitarbeiterController_2.getInfo(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MitarbeiterController",
      "getInfo",
      Nil,
      "GET",
      """student""",
      this.prefix + """mitarbeiter"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_MitarbeiterController_create2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mitarbeiter")))
  )
  private[this] lazy val controllers_MitarbeiterController_create2_invoker = createInvoker(
    MitarbeiterController_2.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MitarbeiterController",
      "create",
      Nil,
      "POST",
      """create""",
      this.prefix + """mitarbeiter"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_MitarbeiterController_update3_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mitarbeiter/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MitarbeiterController_update3_invoker = createInvoker(
    MitarbeiterController_2.update(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MitarbeiterController",
      "update",
      Seq(classOf[Integer]),
      "PUT",
      """update""",
      this.prefix + """mitarbeiter/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_MitarbeiterController_delete4_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mitarbeiter/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MitarbeiterController_delete4_invoker = createInvoker(
    MitarbeiterController_2.delete(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MitarbeiterController",
      "delete",
      Seq(classOf[Integer]),
      "DELETE",
      """delete""",
      this.prefix + """mitarbeiter/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Assets_versioned5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned5_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:11
    case controllers_MitarbeiterController_getInfo1_route(params) =>
      call { 
        controllers_MitarbeiterController_getInfo1_invoker.call(MitarbeiterController_2.getInfo())
      }
  
    // @LINE:13
    case controllers_MitarbeiterController_create2_route(params) =>
      call { 
        controllers_MitarbeiterController_create2_invoker.call(MitarbeiterController_2.create())
      }
  
    // @LINE:15
    case controllers_MitarbeiterController_update3_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_MitarbeiterController_update3_invoker.call(MitarbeiterController_2.update(id))
      }
  
    // @LINE:17
    case controllers_MitarbeiterController_delete4_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_MitarbeiterController_delete4_invoker.call(MitarbeiterController_2.delete(id))
      }
  
    // @LINE:21
    case controllers_Assets_versioned5_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned5_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
