
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/Game4Us/conf/routes
// @DATE:Fri Dec 16 11:32:22 GMT 2016

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
  HomeController_1: controllers.HomeController,
  // @LINE:24
  LoginController_4: controllers.LoginController,
  // @LINE:38
  CountController_0: controllers.CountController,
  // @LINE:40
  AsyncController_2: controllers.AsyncController,
  // @LINE:43
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:24
    LoginController_4: controllers.LoginController,
    // @LINE:38
    CountController_0: controllers.CountController,
    // @LINE:40
    AsyncController_2: controllers.AsyncController,
    // @LINE:43
    Assets_3: controllers.Assets
  ) = this(errorHandler, HomeController_1, LoginController_4, CountController_0, AsyncController_2, Assets_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, LoginController_4, CountController_0, AsyncController_2, Assets_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index(chosenGenre:Integer ?= 0, chosenPlatform:Integer ?= 0, arg:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """game""", """controllers.HomeController.game(choseGame:Integer ?= 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """purchase""", """controllers.HomeController.purchase(chosenGame:Integer ?= 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contactUs""", """controllers.HomeController.contactUs"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addMessageSubmit""", """controllers.HomeController.addMessageSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """aboutUs""", """controllers.HomeController.aboutUs"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adminMode""", """controllers.HomeController.adminMode"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adminMessages""", """controllers.HomeController.adminMessages"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewGames""", """controllers.HomeController.viewGames"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addGame""", """controllers.HomeController.addGame"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addGameSubmit""", """controllers.HomeController.addGameSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delGame/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteGame(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateGame/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateGame(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
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
    HomeController_1.index(fakeValue[Integer], fakeValue[Integer], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Seq(classOf[Integer], classOf[Integer], classOf[String]),
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_game1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("game")))
  )
  private[this] lazy val controllers_HomeController_game1_invoker = createInvoker(
    HomeController_1.game(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "game",
      Seq(classOf[Integer]),
      "GET",
      """This passes the Game id to the game view and displays extra details""",
      this.prefix + """game"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_purchase2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("purchase")))
  )
  private[this] lazy val controllers_HomeController_purchase2_invoker = createInvoker(
    HomeController_1.purchase(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "purchase",
      Seq(classOf[Integer]),
      "GET",
      """This passes the Game id to the purchase view for the user to purchase the game chosen.""",
      this.prefix + """purchase"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_contactUs3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contactUs")))
  )
  private[this] lazy val controllers_HomeController_contactUs3_invoker = createInvoker(
    HomeController_1.contactUs,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "contactUs",
      Nil,
      "GET",
      """This is the route for the Contact Us page.""",
      this.prefix + """contactUs"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_addMessageSubmit4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addMessageSubmit")))
  )
  private[this] lazy val controllers_HomeController_addMessageSubmit4_invoker = createInvoker(
    HomeController_1.addMessageSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addMessageSubmit",
      Nil,
      "POST",
      """This post's user query to database.""",
      this.prefix + """addMessageSubmit"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_aboutUs5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("aboutUs")))
  )
  private[this] lazy val controllers_HomeController_aboutUs5_invoker = createInvoker(
    HomeController_1.aboutUs,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "aboutUs",
      Nil,
      "GET",
      """This is the route for the About Us page.""",
      this.prefix + """aboutUs"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_adminMode6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adminMode")))
  )
  private[this] lazy val controllers_HomeController_adminMode6_invoker = createInvoker(
    HomeController_1.adminMode,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "adminMode",
      Nil,
      "GET",
      """This is a route to the admin mode view.""",
      this.prefix + """adminMode"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_adminMessages7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adminMessages")))
  )
  private[this] lazy val controllers_HomeController_adminMessages7_invoker = createInvoker(
    HomeController_1.adminMessages,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "adminMessages",
      Nil,
      "GET",
      """This is a routes to the admin view for all messages to db.""",
      this.prefix + """adminMessages"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_viewGames8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewGames")))
  )
  private[this] lazy val controllers_HomeController_viewGames8_invoker = createInvoker(
    HomeController_1.viewGames,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "viewGames",
      Nil,
      "GET",
      """This is the route for the admins view of all games in db.""",
      this.prefix + """viewGames"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_LoginController_login9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login9_invoker = createInvoker(
    LoginController_4.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      """Directs user to Login Controller then to SignUp page.""",
      this.prefix + """login"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_LoginController_loginSubmit10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit10_invoker = createInvoker(
    LoginController_4.loginSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginSubmit",
      Nil,
      "POST",
      """This submits the login form to the db.""",
      this.prefix + """loginSubmit"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_LoginController_logout11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout11_invoker = createInvoker(
    LoginController_4.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_HomeController_addGame12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addGame")))
  )
  private[this] lazy val controllers_HomeController_addGame12_invoker = createInvoker(
    HomeController_1.addGame,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addGame",
      Nil,
      "GET",
      """This is the route for the Add Games.""",
      this.prefix + """addGame"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_HomeController_addGameSubmit13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addGameSubmit")))
  )
  private[this] lazy val controllers_HomeController_addGameSubmit13_invoker = createInvoker(
    HomeController_1.addGameSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addGameSubmit",
      Nil,
      "POST",
      """This redirect it to the submit java controller""",
      this.prefix + """addGameSubmit"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_HomeController_deleteGame14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delGame/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteGame14_invoker = createInvoker(
    HomeController_1.deleteGame(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteGame",
      Seq(classOf[Integer]),
      "GET",
      """Delets Game from database.""",
      this.prefix + """delGame/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_HomeController_updateGame15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateGame/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateGame15_invoker = createInvoker(
    HomeController_1.updateGame(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateGame",
      Seq(classOf[Integer]),
      "GET",
      """Updates Game info.""",
      this.prefix + """updateGame/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_CountController_count16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count16_invoker = createInvoker(
    CountController_0.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_AsyncController_message17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message17_invoker = createInvoker(
    AsyncController_2.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_Assets_versioned18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned18_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
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
      call(params.fromQuery[Integer]("chosenGenre", Some(0)), params.fromQuery[Integer]("chosenPlatform", Some(0)), params.fromQuery[String]("arg", Some(""))) { (chosenGenre, chosenPlatform, arg) =>
        controllers_HomeController_index0_invoker.call(HomeController_1.index(chosenGenre, chosenPlatform, arg))
      }
  
    // @LINE:8
    case controllers_HomeController_game1_route(params) =>
      call(params.fromQuery[Integer]("choseGame", Some(0))) { (choseGame) =>
        controllers_HomeController_game1_invoker.call(HomeController_1.game(choseGame))
      }
  
    // @LINE:10
    case controllers_HomeController_purchase2_route(params) =>
      call(params.fromQuery[Integer]("chosenGame", Some(0))) { (chosenGame) =>
        controllers_HomeController_purchase2_invoker.call(HomeController_1.purchase(chosenGame))
      }
  
    // @LINE:12
    case controllers_HomeController_contactUs3_route(params) =>
      call { 
        controllers_HomeController_contactUs3_invoker.call(HomeController_1.contactUs)
      }
  
    // @LINE:14
    case controllers_HomeController_addMessageSubmit4_route(params) =>
      call { 
        controllers_HomeController_addMessageSubmit4_invoker.call(HomeController_1.addMessageSubmit)
      }
  
    // @LINE:16
    case controllers_HomeController_aboutUs5_route(params) =>
      call { 
        controllers_HomeController_aboutUs5_invoker.call(HomeController_1.aboutUs)
      }
  
    // @LINE:18
    case controllers_HomeController_adminMode6_route(params) =>
      call { 
        controllers_HomeController_adminMode6_invoker.call(HomeController_1.adminMode)
      }
  
    // @LINE:20
    case controllers_HomeController_adminMessages7_route(params) =>
      call { 
        controllers_HomeController_adminMessages7_invoker.call(HomeController_1.adminMessages)
      }
  
    // @LINE:22
    case controllers_HomeController_viewGames8_route(params) =>
      call { 
        controllers_HomeController_viewGames8_invoker.call(HomeController_1.viewGames)
      }
  
    // @LINE:24
    case controllers_LoginController_login9_route(params) =>
      call { 
        controllers_LoginController_login9_invoker.call(LoginController_4.login)
      }
  
    // @LINE:26
    case controllers_LoginController_loginSubmit10_route(params) =>
      call { 
        controllers_LoginController_loginSubmit10_invoker.call(LoginController_4.loginSubmit)
      }
  
    // @LINE:27
    case controllers_LoginController_logout11_route(params) =>
      call { 
        controllers_LoginController_logout11_invoker.call(LoginController_4.logout)
      }
  
    // @LINE:29
    case controllers_HomeController_addGame12_route(params) =>
      call { 
        controllers_HomeController_addGame12_invoker.call(HomeController_1.addGame)
      }
  
    // @LINE:31
    case controllers_HomeController_addGameSubmit13_route(params) =>
      call { 
        controllers_HomeController_addGameSubmit13_invoker.call(HomeController_1.addGameSubmit)
      }
  
    // @LINE:33
    case controllers_HomeController_deleteGame14_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_HomeController_deleteGame14_invoker.call(HomeController_1.deleteGame(id))
      }
  
    // @LINE:35
    case controllers_HomeController_updateGame15_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_HomeController_updateGame15_invoker.call(HomeController_1.updateGame(id))
      }
  
    // @LINE:38
    case controllers_CountController_count16_route(params) =>
      call { 
        controllers_CountController_count16_invoker.call(CountController_0.count)
      }
  
    // @LINE:40
    case controllers_AsyncController_message17_route(params) =>
      call { 
        controllers_AsyncController_message17_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:43
    case controllers_Assets_versioned18_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned18_invoker.call(Assets_3.versioned(path, file))
      }
  }
}
