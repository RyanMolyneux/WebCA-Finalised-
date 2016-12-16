
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/Game4Us/conf/routes
// @DATE:Fri Dec 16 11:32:22 GMT 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:43
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:38
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def count(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def adminMode(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "adminMode")
    }
  
    // @LINE:12
    def contactUs(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "contactUs")
    }
  
    // @LINE:33
    def deleteGame(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "delGame/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:20
    def adminMessages(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "adminMessages")
    }
  
    // @LINE:22
    def viewGames(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "viewGames")
    }
  
    // @LINE:10
    def purchase(chosenGame:Integer = 0): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "purchase" + queryString(List(if(chosenGame == 0) None else Some(implicitly[QueryStringBindable[Integer]].unbind("chosenGame", chosenGame)))))
    }
  
    // @LINE:6
    def index(chosenGenre:Integer = 0, chosenPlatform:Integer = 0, arg:String = ""): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + queryString(List(if(chosenGenre == 0) None else Some(implicitly[QueryStringBindable[Integer]].unbind("chosenGenre", chosenGenre)), if(chosenPlatform == 0) None else Some(implicitly[QueryStringBindable[Integer]].unbind("chosenPlatform", chosenPlatform)), if(arg == "") None else Some(implicitly[QueryStringBindable[String]].unbind("arg", arg)))))
    }
  
    // @LINE:35
    def updateGame(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "updateGame/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:29
    def addGame(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "addGame")
    }
  
    // @LINE:14
    def addMessageSubmit(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addMessageSubmit")
    }
  
    // @LINE:8
    def game(choseGame:Integer = 0): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "game" + queryString(List(if(choseGame == 0) None else Some(implicitly[QueryStringBindable[Integer]].unbind("choseGame", choseGame)))))
    }
  
    // @LINE:31
    def addGameSubmit(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addGameSubmit")
    }
  
    // @LINE:16
    def aboutUs(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "aboutUs")
    }
  
  }

  // @LINE:40
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def message(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:24
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def loginSubmit(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "loginSubmit")
    }
  
    // @LINE:27
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:24
    def login(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }


}
