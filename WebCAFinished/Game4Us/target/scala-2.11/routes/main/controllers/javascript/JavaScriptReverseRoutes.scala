
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/Game4Us/conf/routes
// @DATE:Fri Dec 16 11:32:22 GMT 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:43
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:38
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def adminMode: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.adminMode",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adminMode"})
        }
      """
    )
  
    // @LINE:12
    def contactUs: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.contactUs",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contactUs"})
        }
      """
    )
  
    // @LINE:33
    def deleteGame: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteGame",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delGame/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:20
    def adminMessages: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.adminMessages",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adminMessages"})
        }
      """
    )
  
    // @LINE:22
    def viewGames: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.viewGames",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewGames"})
        }
      """
    )
  
    // @LINE:10
    def purchase: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.purchase",
      """
        function(chosenGame0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "purchase" + _qS([(chosenGame0 == null ? null : (""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("chosenGame", chosenGame0))])})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function(chosenGenre0,chosenPlatform1,arg2) {
          return _wA({method:"GET", url:"""" + _prefix + """" + _qS([(chosenGenre0 == null ? null : (""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("chosenGenre", chosenGenre0)), (chosenPlatform1 == null ? null : (""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("chosenPlatform", chosenPlatform1)), (arg2 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("arg", arg2))])})
        }
      """
    )
  
    // @LINE:35
    def updateGame: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateGame",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateGame/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:29
    def addGame: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addGame",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addGame"})
        }
      """
    )
  
    // @LINE:14
    def addMessageSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addMessageSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addMessageSubmit"})
        }
      """
    )
  
    // @LINE:8
    def game: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.game",
      """
        function(choseGame0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "game" + _qS([(choseGame0 == null ? null : (""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("choseGame", choseGame0))])})
        }
      """
    )
  
    // @LINE:31
    def addGameSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addGameSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addGameSubmit"})
        }
      """
    )
  
    // @LINE:16
    def aboutUs: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.aboutUs",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aboutUs"})
        }
      """
    )
  
  }

  // @LINE:40
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:24
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def loginSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.loginSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "loginSubmit"})
        }
      """
    )
  
    // @LINE:27
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:24
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }


}
