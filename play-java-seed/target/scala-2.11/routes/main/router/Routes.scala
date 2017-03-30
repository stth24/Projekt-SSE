
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Stefan Theissl/servSE/play-java-seed/conf/routes
// @DATE:Tue Mar 28 17:04:27 CEST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._
import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F
import controllers.MitarbeiterController

class Routes(
              override val errorHandler: play.api.http.HttpErrorHandler,
              // @LINE:6
              HomeController_0: controllers.HomeController,
              // @LINE:9
              ArticleController_2: controllers.ArticleController,
              // @LINE:24
              StudentController_3: MitarbeiterController,
              // @LINE:34
              Assets_1: controllers.Assets,
              val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
            // @LINE:6
            HomeController_0: controllers.HomeController,
            // @LINE:9
            ArticleController_2: controllers.ArticleController,
            // @LINE:24
            StudentController_3: MitarbeiterController,
            // @LINE:34
            Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, ArticleController_2, StudentController_3, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, ArticleController_2, StudentController_3, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """article""", """controllers.ArticleController.list()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """article/""" + "$" + """id<[^/]+>""", """controllers.ArticleController.show(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """article""", """controllers.ArticleController.create()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """article/""" + "$" + """id<[^/]+>""", """controllers.ArticleController.update(id:Int)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """article/""" + "$" + """id<[^/]+>""", """controllers.ArticleController.delete(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """article/""" + "$" + """filename<.+>""", """controllers.ArticleController.getFile(filename:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """student""", """controllers.MitarbeiterController.getInfo()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """student""", """controllers.MitarbeiterController.create()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """student/""" + "$" + """id<[^/]+>""", """controllers.MitarbeiterController.update(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """student/""" + "$" + """id<[^/]+>""", """controllers.MitarbeiterController.delete(id:Long)"""),
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

  // @LINE:9
  private[this] lazy val controllers_ArticleController_list1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("article")))
  )
  private[this] lazy val controllers_ArticleController_list1_invoker = createInvoker(
    ArticleController_2.list(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ArticleController",
      "list",
      Nil,
      "GET",
      """ get article""",
      this.prefix + """article"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_ArticleController_show2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("article/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ArticleController_show2_invoker = createInvoker(
    ArticleController_2.show(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ArticleController",
      "show",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """article/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_ArticleController_create3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("article")))
  )
  private[this] lazy val controllers_ArticleController_create3_invoker = createInvoker(
    ArticleController_2.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ArticleController",
      "create",
      Nil,
      "POST",
      """create""",
      this.prefix + """article"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_ArticleController_update4_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("article/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ArticleController_update4_invoker = createInvoker(
    ArticleController_2.update(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ArticleController",
      "update",
      Seq(classOf[Int]),
      "PUT",
      """update""",
      this.prefix + """article/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_ArticleController_delete5_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("article/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ArticleController_delete5_invoker = createInvoker(
    ArticleController_2.delete(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ArticleController",
      "delete",
      Seq(classOf[Int]),
      "DELETE",
      """delete""",
      this.prefix + """article/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_ArticleController_getFile6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("article/"), DynamicPart("filename", """.+""",false)))
  )
  private[this] lazy val controllers_ArticleController_getFile6_invoker = createInvoker(
    ArticleController_2.getFile(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ArticleController",
      "getFile",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """article/""" + "$" + """filename<.+>"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_StudentController_getInfo7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("student")))
  )
  private[this] lazy val controllers_StudentController_getInfo7_invoker = createInvoker(
    StudentController_3.getInfo(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MitarbeiterController",
      "getInfo",
      Nil,
      "GET",
      """student""",
      this.prefix + """student"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_StudentController_create8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("student")))
  )
  private[this] lazy val controllers_StudentController_create8_invoker = createInvoker(
    StudentController_3.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MitarbeiterController",
      "create",
      Nil,
      "POST",
      """create""",
      this.prefix + """student"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_StudentController_update9_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("student/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StudentController_update9_invoker = createInvoker(
    StudentController_3.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MitarbeiterController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      """update""",
      this.prefix + """student/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_StudentController_delete10_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("student/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StudentController_delete10_invoker = createInvoker(
    StudentController_3.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MitarbeiterController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      """delete""",
      this.prefix + """student/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_Assets_versioned11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned11_invoker = createInvoker(
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
  
    // @LINE:9
    case controllers_ArticleController_list1_route(params) =>
      call { 
        controllers_ArticleController_list1_invoker.call(ArticleController_2.list())
      }
  
    // @LINE:10
    case controllers_ArticleController_show2_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ArticleController_show2_invoker.call(ArticleController_2.show(id))
      }
  
    // @LINE:13
    case controllers_ArticleController_create3_route(params) =>
      call { 
        controllers_ArticleController_create3_invoker.call(ArticleController_2.create())
      }
  
    // @LINE:15
    case controllers_ArticleController_update4_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ArticleController_update4_invoker.call(ArticleController_2.update(id))
      }
  
    // @LINE:17
    case controllers_ArticleController_delete5_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ArticleController_delete5_invoker.call(ArticleController_2.delete(id))
      }
  
    // @LINE:20
    case controllers_ArticleController_getFile6_route(params) =>
      call(params.fromPath[String]("filename", None)) { (filename) =>
        controllers_ArticleController_getFile6_invoker.call(ArticleController_2.getFile(filename))
      }
  
    // @LINE:24
    case controllers_StudentController_getInfo7_route(params) =>
      call { 
        controllers_StudentController_getInfo7_invoker.call(StudentController_3.getInfo())
      }
  
    // @LINE:26
    case controllers_StudentController_create8_route(params) =>
      call { 
        controllers_StudentController_create8_invoker.call(StudentController_3.create())
      }
  
    // @LINE:28
    case controllers_StudentController_update9_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_StudentController_update9_invoker.call(StudentController_3.update(id))
      }
  
    // @LINE:30
    case controllers_StudentController_delete10_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_StudentController_delete10_invoker.call(StudentController_3.delete(id))
      }
  
    // @LINE:34
    case controllers_Assets_versioned11_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned11_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
