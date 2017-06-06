
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Stefan Theissl/servSE/projekt/Projekt-SSE/projectmanagment-play/conf/routes
// @DATE:Tue Jun 06 04:36:44 CEST 2017

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
  // @LINE:10
  FormController_3: controllers.FormController,
  // @LINE:17
  CustomerController_6: controllers.CustomerController,
  // @LINE:24
  TaskController_5: controllers.TaskController,
  // @LINE:31
  WorkerController_2: controllers.WorkerController,
  // @LINE:37
  ProjectController_1: controllers.ProjectController,
  // @LINE:44
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:10
    FormController_3: controllers.FormController,
    // @LINE:17
    CustomerController_6: controllers.CustomerController,
    // @LINE:24
    TaskController_5: controllers.TaskController,
    // @LINE:31
    WorkerController_2: controllers.WorkerController,
    // @LINE:37
    ProjectController_1: controllers.ProjectController,
    // @LINE:44
    Assets_4: controllers.Assets
  ) = this(errorHandler, HomeController_0, FormController_3, CustomerController_6, TaskController_5, WorkerController_2, ProjectController_1, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, FormController_3, CustomerController_6, TaskController_5, WorkerController_2, ProjectController_1, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addCustomer""", """controllers.FormController.addCustomer()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addProject""", """controllers.FormController.addProject()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addTask""", """controllers.FormController.addTask()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addWorker""", """controllers.FormController.addWorker()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product""", """controllers.CustomerController.list()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product/""" + "$" + """id<[^/]+>""", """controllers.CustomerController.show(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product""", """controllers.CustomerController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteproduct/""" + "$" + """id<[^/]+>""", """controllers.CustomerController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """task""", """controllers.TaskController.list()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """task/""" + "$" + """id<[^/]+>""", """controllers.TaskController.show(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """task""", """controllers.TaskController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deletetask/""" + "$" + """id<[^/]+>""", """controllers.TaskController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """worker""", """controllers.WorkerController.list()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """worker/""" + "$" + """id<[^/]+>""", """controllers.WorkerController.show(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """worker""", """controllers.WorkerController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteworker/""" + "$" + """id<[^/]+>""", """controllers.WorkerController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project""", """controllers.ProjectController.list()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/""" + "$" + """id<[^/]+>""", """controllers.ProjectController.show(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projectsearch/""" + "$" + """name<[^/]+>""", """controllers.ProjectController.search(name:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project""", """controllers.ProjectController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteproject/""" + "$" + """id<[^/]+>""", """controllers.ProjectController.delete(id:Long)"""),
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

  // @LINE:10
  private[this] lazy val controllers_FormController_addCustomer1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addCustomer")))
  )
  private[this] lazy val controllers_FormController_addCustomer1_invoker = createInvoker(
    FormController_3.addCustomer(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FormController",
      "addCustomer",
      Nil,
      "GET",
      """Forms""",
      this.prefix + """addCustomer"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_FormController_addProject2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addProject")))
  )
  private[this] lazy val controllers_FormController_addProject2_invoker = createInvoker(
    FormController_3.addProject(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FormController",
      "addProject",
      Nil,
      "GET",
      """""",
      this.prefix + """addProject"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_FormController_addTask3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addTask")))
  )
  private[this] lazy val controllers_FormController_addTask3_invoker = createInvoker(
    FormController_3.addTask(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FormController",
      "addTask",
      Nil,
      "GET",
      """""",
      this.prefix + """addTask"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_FormController_addWorker4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addWorker")))
  )
  private[this] lazy val controllers_FormController_addWorker4_invoker = createInvoker(
    FormController_3.addWorker(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FormController",
      "addWorker",
      Nil,
      "GET",
      """""",
      this.prefix + """addWorker"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_CustomerController_list5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product")))
  )
  private[this] lazy val controllers_CustomerController_list5_invoker = createInvoker(
    CustomerController_6.list(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "list",
      Nil,
      "GET",
      """Customer""",
      this.prefix + """product"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_CustomerController_show6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CustomerController_show6_invoker = createInvoker(
    CustomerController_6.show(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "show",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """product/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_CustomerController_create7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product")))
  )
  private[this] lazy val controllers_CustomerController_create7_invoker = createInvoker(
    CustomerController_6.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """product"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_CustomerController_delete8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteproduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CustomerController_delete8_invoker = createInvoker(
    CustomerController_6.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """deleteproduct/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_TaskController_list9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("task")))
  )
  private[this] lazy val controllers_TaskController_list9_invoker = createInvoker(
    TaskController_5.list(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskController",
      "list",
      Nil,
      "GET",
      """Task""",
      this.prefix + """task"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_TaskController_show10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("task/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TaskController_show10_invoker = createInvoker(
    TaskController_5.show(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskController",
      "show",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """task/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_TaskController_create11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("task")))
  )
  private[this] lazy val controllers_TaskController_create11_invoker = createInvoker(
    TaskController_5.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """task"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_TaskController_delete12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletetask/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TaskController_delete12_invoker = createInvoker(
    TaskController_5.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """deletetask/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_WorkerController_list13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("worker")))
  )
  private[this] lazy val controllers_WorkerController_list13_invoker = createInvoker(
    WorkerController_2.list(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkerController",
      "list",
      Nil,
      "GET",
      """Worker""",
      this.prefix + """worker"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_WorkerController_show14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("worker/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WorkerController_show14_invoker = createInvoker(
    WorkerController_2.show(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkerController",
      "show",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """worker/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_WorkerController_create15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("worker")))
  )
  private[this] lazy val controllers_WorkerController_create15_invoker = createInvoker(
    WorkerController_2.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkerController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """worker"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_WorkerController_delete16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteworker/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WorkerController_delete16_invoker = createInvoker(
    WorkerController_2.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkerController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """deleteworker/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_ProjectController_list17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project")))
  )
  private[this] lazy val controllers_ProjectController_list17_invoker = createInvoker(
    ProjectController_1.list(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "list",
      Nil,
      "GET",
      """Project""",
      this.prefix + """project"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_ProjectController_show18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_show18_invoker = createInvoker(
    ProjectController_1.show(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "show",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """project/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_ProjectController_search19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projectsearch/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_search19_invoker = createInvoker(
    ProjectController_1.search(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "search",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """projectsearch/""" + "$" + """name<[^/]+>"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_ProjectController_create20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project")))
  )
  private[this] lazy val controllers_ProjectController_create20_invoker = createInvoker(
    ProjectController_1.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """project"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_ProjectController_delete21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteproject/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_delete21_invoker = createInvoker(
    ProjectController_1.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """deleteproject/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_Assets_versioned22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned22_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
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
  
    // @LINE:10
    case controllers_FormController_addCustomer1_route(params) =>
      call { 
        controllers_FormController_addCustomer1_invoker.call(FormController_3.addCustomer())
      }
  
    // @LINE:11
    case controllers_FormController_addProject2_route(params) =>
      call { 
        controllers_FormController_addProject2_invoker.call(FormController_3.addProject())
      }
  
    // @LINE:12
    case controllers_FormController_addTask3_route(params) =>
      call { 
        controllers_FormController_addTask3_invoker.call(FormController_3.addTask())
      }
  
    // @LINE:13
    case controllers_FormController_addWorker4_route(params) =>
      call { 
        controllers_FormController_addWorker4_invoker.call(FormController_3.addWorker())
      }
  
    // @LINE:17
    case controllers_CustomerController_list5_route(params) =>
      call { 
        controllers_CustomerController_list5_invoker.call(CustomerController_6.list())
      }
  
    // @LINE:18
    case controllers_CustomerController_show6_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CustomerController_show6_invoker.call(CustomerController_6.show(id))
      }
  
    // @LINE:19
    case controllers_CustomerController_create7_route(params) =>
      call { 
        controllers_CustomerController_create7_invoker.call(CustomerController_6.create())
      }
  
    // @LINE:20
    case controllers_CustomerController_delete8_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CustomerController_delete8_invoker.call(CustomerController_6.delete(id))
      }
  
    // @LINE:24
    case controllers_TaskController_list9_route(params) =>
      call { 
        controllers_TaskController_list9_invoker.call(TaskController_5.list())
      }
  
    // @LINE:25
    case controllers_TaskController_show10_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TaskController_show10_invoker.call(TaskController_5.show(id))
      }
  
    // @LINE:26
    case controllers_TaskController_create11_route(params) =>
      call { 
        controllers_TaskController_create11_invoker.call(TaskController_5.create())
      }
  
    // @LINE:27
    case controllers_TaskController_delete12_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TaskController_delete12_invoker.call(TaskController_5.delete(id))
      }
  
    // @LINE:31
    case controllers_WorkerController_list13_route(params) =>
      call { 
        controllers_WorkerController_list13_invoker.call(WorkerController_2.list())
      }
  
    // @LINE:32
    case controllers_WorkerController_show14_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkerController_show14_invoker.call(WorkerController_2.show(id))
      }
  
    // @LINE:33
    case controllers_WorkerController_create15_route(params) =>
      call { 
        controllers_WorkerController_create15_invoker.call(WorkerController_2.create())
      }
  
    // @LINE:34
    case controllers_WorkerController_delete16_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkerController_delete16_invoker.call(WorkerController_2.delete(id))
      }
  
    // @LINE:37
    case controllers_ProjectController_list17_route(params) =>
      call { 
        controllers_ProjectController_list17_invoker.call(ProjectController_1.list())
      }
  
    // @LINE:38
    case controllers_ProjectController_show18_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProjectController_show18_invoker.call(ProjectController_1.show(id))
      }
  
    // @LINE:39
    case controllers_ProjectController_search19_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_ProjectController_search19_invoker.call(ProjectController_1.search(name))
      }
  
    // @LINE:40
    case controllers_ProjectController_create20_route(params) =>
      call { 
        controllers_ProjectController_create20_invoker.call(ProjectController_1.create())
      }
  
    // @LINE:41
    case controllers_ProjectController_delete21_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProjectController_delete21_invoker.call(ProjectController_1.delete(id))
      }
  
    // @LINE:44
    case controllers_Assets_versioned22_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned22_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
