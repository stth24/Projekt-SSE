
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Stefan Theissl/servSE/projekt/Projekt-SSE/play-java-seed/conf/routes
// @DATE:Fri Mar 31 15:18:44 CEST 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }

  // @LINE:21
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:11
  class ReverseMitarbeiterController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def getInfo(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "mitarbeiter")
    }
  
    // @LINE:17
    def delete(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "mitarbeiter/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:13
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "mitarbeiter")
    }
  
    // @LINE:15
    def update(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "mitarbeiter/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
  }


}
