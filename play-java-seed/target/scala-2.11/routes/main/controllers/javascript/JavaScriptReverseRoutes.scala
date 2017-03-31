
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Stefan Theissl/servSE/projekt/Projekt-SSE/play-java-seed/conf/routes
// @DATE:Fri Mar 31 15:18:44 CEST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

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

  // @LINE:21
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseMitarbeiterController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def getInfo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MitarbeiterController.getInfo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mitarbeiter"})
        }
      """
    )
  
    // @LINE:17
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MitarbeiterController.delete",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "mitarbeiter/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:13
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MitarbeiterController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mitarbeiter"})
        }
      """
    )
  
    // @LINE:15
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MitarbeiterController.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "mitarbeiter/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }


}
