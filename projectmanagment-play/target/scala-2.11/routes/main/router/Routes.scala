
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Stefan Theissl/servSE/projekt/Projekt-SSE/projectmanagment-play/conf/routes
// @DATE:Tue May 30 15:12:44 CEST 2017

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
  FormController_6: controllers.FormController,
  // @LINE:21
  CustomerController_9: controllers.CustomerController,
  // @LINE:28
  TaskController_8: controllers.TaskController,
  // @LINE:35
  WorkerController_5: controllers.WorkerController,
  // @LINE:41
  ProjectController_4: controllers.ProjectController,
  // @LINE:47
  ProjectHolderController_2: controllers.ProjectHolderController,
  // @LINE:48
  ProjectTaskController_1: controllers.ProjectTaskController,
  // @LINE:49
  WorkerTaskController_3: controllers.WorkerTaskController,
  // @LINE:54
  Assets_7: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:10
    FormController_6: controllers.FormController,
    // @LINE:21
    CustomerController_9: controllers.CustomerController,
    // @LINE:28
    TaskController_8: controllers.TaskController,
    // @LINE:35
    WorkerController_5: controllers.WorkerController,
    // @LINE:41
    ProjectController_4: controllers.ProjectController,
    // @LINE:47
    ProjectHolderController_2: controllers.ProjectHolderController,
    // @LINE:48
    ProjectTaskController_1: controllers.ProjectTaskController,
    // @LINE:49
    WorkerTaskController_3: controllers.WorkerTaskController,
    // @LINE:54
    Assets_7: controllers.Assets
  ) = this(errorHandler, HomeController_0, FormController_6, CustomerController_9, TaskController_8, WorkerController_5, ProjectController_4, ProjectHolderController_2, ProjectTaskController_1, WorkerTaskController_3, Assets_7, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, FormController_6, CustomerController_9, TaskController_8, WorkerController_5, ProjectController_4, ProjectHolderController_2, ProjectTaskController_1, WorkerTaskController_3, Assets_7, prefix)
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addProjectTask""", """controllers.FormController.addProjectTask()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addProjectHolder""", """controllers.FormController.addProjectHolder()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addWorkerTask""", """controllers.FormController.addWorkerTask()"""),
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
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project""", """controllers.ProjectController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteproject/""" + "$" + """id<[^/]+>""", """controllers.ProjectController.delete(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projectholder""", """controllers.ProjectHolderController.create()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projecttask""", """controllers.ProjectTaskController.create()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """wokertask""", """controllers.WorkerTaskController.create()"""),
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
    FormController_6.addCustomer(),
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
    FormController_6.addProject(),
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
    FormController_6.addTask(),
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
    FormController_6.addWorker(),
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

  // @LINE:15
  private[this] lazy val controllers_FormController_addProjectTask5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addProjectTask")))
  )
  private[this] lazy val controllers_FormController_addProjectTask5_invoker = createInvoker(
    FormController_6.addProjectTask(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FormController",
      "addProjectTask",
      Nil,
      "GET",
      """""",
      this.prefix + """addProjectTask"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_FormController_addProjectHolder6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addProjectHolder")))
  )
  private[this] lazy val controllers_FormController_addProjectHolder6_invoker = createInvoker(
    FormController_6.addProjectHolder(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FormController",
      "addProjectHolder",
      Nil,
      "GET",
      """""",
      this.prefix + """addProjectHolder"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_FormController_addWorkerTask7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addWorkerTask")))
  )
  private[this] lazy val controllers_FormController_addWorkerTask7_invoker = createInvoker(
    FormController_6.addWorkerTask(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FormController",
      "addWorkerTask",
      Nil,
      "GET",
      """""",
      this.prefix + """addWorkerTask"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_CustomerController_list8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product")))
  )
  private[this] lazy val controllers_CustomerController_list8_invoker = createInvoker(
    CustomerController_9.list(),
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

  // @LINE:22
  private[this] lazy val controllers_CustomerController_show9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CustomerController_show9_invoker = createInvoker(
    CustomerController_9.show(fakeValue[Long]),
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

  // @LINE:23
  private[this] lazy val controllers_CustomerController_create10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product")))
  )
  private[this] lazy val controllers_CustomerController_create10_invoker = createInvoker(
    CustomerController_9.create(),
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

  // @LINE:24
  private[this] lazy val controllers_CustomerController_delete11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteproduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CustomerController_delete11_invoker = createInvoker(
    CustomerController_9.delete(fakeValue[Long]),
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

  // @LINE:28
  private[this] lazy val controllers_TaskController_list12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("task")))
  )
  private[this] lazy val controllers_TaskController_list12_invoker = createInvoker(
    TaskController_8.list(),
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

  // @LINE:29
  private[this] lazy val controllers_TaskController_show13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("task/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TaskController_show13_invoker = createInvoker(
    TaskController_8.show(fakeValue[Long]),
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

  // @LINE:30
  private[this] lazy val controllers_TaskController_create14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("task")))
  )
  private[this] lazy val controllers_TaskController_create14_invoker = createInvoker(
    TaskController_8.create(),
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

  // @LINE:31
  private[this] lazy val controllers_TaskController_delete15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletetask/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TaskController_delete15_invoker = createInvoker(
    TaskController_8.delete(fakeValue[Long]),
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

  // @LINE:35
  private[this] lazy val controllers_WorkerController_list16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("worker")))
  )
  private[this] lazy val controllers_WorkerController_list16_invoker = createInvoker(
    WorkerController_5.list(),
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

  // @LINE:36
  private[this] lazy val controllers_WorkerController_show17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("worker/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WorkerController_show17_invoker = createInvoker(
    WorkerController_5.show(fakeValue[Long]),
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

  // @LINE:37
  private[this] lazy val controllers_WorkerController_create18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("worker")))
  )
  private[this] lazy val controllers_WorkerController_create18_invoker = createInvoker(
    WorkerController_5.create(),
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

  // @LINE:38
  private[this] lazy val controllers_WorkerController_delete19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteworker/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WorkerController_delete19_invoker = createInvoker(
    WorkerController_5.delete(fakeValue[Long]),
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

  // @LINE:41
  private[this] lazy val controllers_ProjectController_list20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project")))
  )
  private[this] lazy val controllers_ProjectController_list20_invoker = createInvoker(
    ProjectController_4.list(),
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

  // @LINE:42
  private[this] lazy val controllers_ProjectController_show21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_show21_invoker = createInvoker(
    ProjectController_4.show(fakeValue[Long]),
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

  // @LINE:43
  private[this] lazy val controllers_ProjectController_create22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project")))
  )
  private[this] lazy val controllers_ProjectController_create22_invoker = createInvoker(
    ProjectController_4.create(),
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

  // @LINE:44
  private[this] lazy val controllers_ProjectController_delete23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteproject/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_delete23_invoker = createInvoker(
    ProjectController_4.delete(fakeValue[Long]),
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

  // @LINE:47
  private[this] lazy val controllers_ProjectHolderController_create24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projectholder")))
  )
  private[this] lazy val controllers_ProjectHolderController_create24_invoker = createInvoker(
    ProjectHolderController_2.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectHolderController",
      "create",
      Nil,
      "POST",
      """ProjectHolder, ProjectTask, WorkerTask""",
      this.prefix + """projectholder"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_ProjectTaskController_create25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projecttask")))
  )
  private[this] lazy val controllers_ProjectTaskController_create25_invoker = createInvoker(
    ProjectTaskController_1.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectTaskController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """projecttask"""
    )
  )

  // @LINE:49
  private[this] lazy val controllers_WorkerTaskController_create26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("wokertask")))
  )
  private[this] lazy val controllers_WorkerTaskController_create26_invoker = createInvoker(
    WorkerTaskController_3.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkerTaskController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """wokertask"""
    )
  )

  // @LINE:54
  private[this] lazy val controllers_Assets_versioned27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned27_invoker = createInvoker(
    Assets_7.versioned(fakeValue[String], fakeValue[Asset]),
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
        controllers_FormController_addCustomer1_invoker.call(FormController_6.addCustomer())
      }
  
    // @LINE:11
    case controllers_FormController_addProject2_route(params) =>
      call { 
        controllers_FormController_addProject2_invoker.call(FormController_6.addProject())
      }
  
    // @LINE:12
    case controllers_FormController_addTask3_route(params) =>
      call { 
        controllers_FormController_addTask3_invoker.call(FormController_6.addTask())
      }
  
    // @LINE:13
    case controllers_FormController_addWorker4_route(params) =>
      call { 
        controllers_FormController_addWorker4_invoker.call(FormController_6.addWorker())
      }
  
    // @LINE:15
    case controllers_FormController_addProjectTask5_route(params) =>
      call { 
        controllers_FormController_addProjectTask5_invoker.call(FormController_6.addProjectTask())
      }
  
    // @LINE:16
    case controllers_FormController_addProjectHolder6_route(params) =>
      call { 
        controllers_FormController_addProjectHolder6_invoker.call(FormController_6.addProjectHolder())
      }
  
    // @LINE:17
    case controllers_FormController_addWorkerTask7_route(params) =>
      call { 
        controllers_FormController_addWorkerTask7_invoker.call(FormController_6.addWorkerTask())
      }
  
    // @LINE:21
    case controllers_CustomerController_list8_route(params) =>
      call { 
        controllers_CustomerController_list8_invoker.call(CustomerController_9.list())
      }
  
    // @LINE:22
    case controllers_CustomerController_show9_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CustomerController_show9_invoker.call(CustomerController_9.show(id))
      }
  
    // @LINE:23
    case controllers_CustomerController_create10_route(params) =>
      call { 
        controllers_CustomerController_create10_invoker.call(CustomerController_9.create())
      }
  
    // @LINE:24
    case controllers_CustomerController_delete11_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CustomerController_delete11_invoker.call(CustomerController_9.delete(id))
      }
  
    // @LINE:28
    case controllers_TaskController_list12_route(params) =>
      call { 
        controllers_TaskController_list12_invoker.call(TaskController_8.list())
      }
  
    // @LINE:29
    case controllers_TaskController_show13_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TaskController_show13_invoker.call(TaskController_8.show(id))
      }
  
    // @LINE:30
    case controllers_TaskController_create14_route(params) =>
      call { 
        controllers_TaskController_create14_invoker.call(TaskController_8.create())
      }
  
    // @LINE:31
    case controllers_TaskController_delete15_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TaskController_delete15_invoker.call(TaskController_8.delete(id))
      }
  
    // @LINE:35
    case controllers_WorkerController_list16_route(params) =>
      call { 
        controllers_WorkerController_list16_invoker.call(WorkerController_5.list())
      }
  
    // @LINE:36
    case controllers_WorkerController_show17_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkerController_show17_invoker.call(WorkerController_5.show(id))
      }
  
    // @LINE:37
    case controllers_WorkerController_create18_route(params) =>
      call { 
        controllers_WorkerController_create18_invoker.call(WorkerController_5.create())
      }
  
    // @LINE:38
    case controllers_WorkerController_delete19_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkerController_delete19_invoker.call(WorkerController_5.delete(id))
      }
  
    // @LINE:41
    case controllers_ProjectController_list20_route(params) =>
      call { 
        controllers_ProjectController_list20_invoker.call(ProjectController_4.list())
      }
  
    // @LINE:42
    case controllers_ProjectController_show21_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProjectController_show21_invoker.call(ProjectController_4.show(id))
      }
  
    // @LINE:43
    case controllers_ProjectController_create22_route(params) =>
      call { 
        controllers_ProjectController_create22_invoker.call(ProjectController_4.create())
      }
  
    // @LINE:44
    case controllers_ProjectController_delete23_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProjectController_delete23_invoker.call(ProjectController_4.delete(id))
      }
  
    // @LINE:47
    case controllers_ProjectHolderController_create24_route(params) =>
      call { 
        controllers_ProjectHolderController_create24_invoker.call(ProjectHolderController_2.create())
      }
  
    // @LINE:48
    case controllers_ProjectTaskController_create25_route(params) =>
      call { 
        controllers_ProjectTaskController_create25_invoker.call(ProjectTaskController_1.create())
      }
  
    // @LINE:49
    case controllers_WorkerTaskController_create26_route(params) =>
      call { 
        controllers_WorkerTaskController_create26_invoker.call(WorkerTaskController_3.create())
      }
  
    // @LINE:54
    case controllers_Assets_versioned27_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned27_invoker.call(Assets_7.versioned(path, file))
      }
  }
}
