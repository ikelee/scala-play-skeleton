
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ike.lee/Documents/scala-play-skeleton/conf/routes
// @DATE:Sun Dec 03 20:06:50 PST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:8
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "asyncStatus")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def status(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "status")
    }
  
  }


}
