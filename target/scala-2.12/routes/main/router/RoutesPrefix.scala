
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ike.lee/Documents/scala-play-skeleton/conf/routes
// @DATE:Sun Dec 03 20:06:50 PST 2017


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
