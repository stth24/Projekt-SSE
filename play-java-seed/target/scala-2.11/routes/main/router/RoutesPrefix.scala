
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Stefan Theissl/servSE/projekt/Projekt-SSE/play-java-seed/conf/routes
// @DATE:Fri Mar 31 15:18:44 CEST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
