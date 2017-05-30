
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Stefan Theissl/servSE/projekt/Projekt-SSE/projectmanagment-play/conf/routes
// @DATE:Tue May 30 15:12:44 CEST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:54
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:54
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:35
  class ReverseWorkerController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkerController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "worker"})
        }
      """
    )
  
    // @LINE:37
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkerController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "worker"})
        }
      """
    )
  
    // @LINE:38
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkerController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteworker/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:36
    def show: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkerController.show",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "worker/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }

  // @LINE:41
  class ReverseProjectController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project"})
        }
      """
    )
  
    // @LINE:43
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "project"})
        }
      """
    )
  
    // @LINE:44
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteproject/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:42
    def show: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.show",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseCustomerController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product"})
        }
      """
    )
  
    // @LINE:23
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "product"})
        }
      """
    )
  
    // @LINE:24
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteproduct/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:22
    def show: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerController.show",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }

  // @LINE:47
  class ReverseProjectHolderController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:47
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectHolderController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "projectholder"})
        }
      """
    )
  
  }

  // @LINE:48
  class ReverseProjectTaskController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:48
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectTaskController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "projecttask"})
        }
      """
    )
  
  }

  // @LINE:49
  class ReverseWorkerTaskController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:49
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WorkerTaskController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "wokertask"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseFormController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def addCustomer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FormController.addCustomer",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addCustomer"})
        }
      """
    )
  
    // @LINE:11
    def addProject: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FormController.addProject",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addProject"})
        }
      """
    )
  
    // @LINE:13
    def addWorker: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FormController.addWorker",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addWorker"})
        }
      """
    )
  
    // @LINE:12
    def addTask: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FormController.addTask",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addTask"})
        }
      """
    )
  
    // @LINE:16
    def addProjectHolder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FormController.addProjectHolder",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addProjectHolder"})
        }
      """
    )
  
    // @LINE:15
    def addProjectTask: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FormController.addProjectTask",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addProjectTask"})
        }
      """
    )
  
    // @LINE:17
    def addWorkerTask: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FormController.addWorkerTask",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addWorkerTask"})
        }
      """
    )
  
  }

  // @LINE:28
  class ReverseTaskController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "task"})
        }
      """
    )
  
    // @LINE:30
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "task"})
        }
      """
    )
  
    // @LINE:31
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deletetask/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:29
    def show: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TaskController.show",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "task/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }


}
