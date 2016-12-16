
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/Game4Us/conf/routes
// @DATE:Fri Dec 16 11:32:22 GMT 2016


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
