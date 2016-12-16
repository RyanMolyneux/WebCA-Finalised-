
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[List[models.Games],List[models.Genre],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(games: List[models.Games],genres : List[models.Genre],user: models.users.User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.107*/("""

"""),_display_(/*3.2*/main("Gamez4Us - Home",user)/*3.30*/ {_display_(Seq[Any](format.raw/*3.32*/("""

   
		"""),format.raw/*6.3*/("""<nav class="navbar" id="grayBackground">
			<div class="navbar-header">
				  <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#NavbarResponsive">
					<span class="icon-bar" id="purpleBackground"></span>
					<span class="icon-bar" id="purpleBackground"></span>
					<span class="icon-bar" id="purpleBackground"></span>
				  </button>
				<a class="navbar-brand" href=""""),_display_(/*13.36*/routes/*13.42*/.HomeController.index(0)),format.raw/*13.66*/("""" id="purple">All Games</a>
			</div>
			<div class="collapse navbar-collapse" id="NavbarResponsive">
				  <ul class="nav navbar-nav">
					 
					  """),_display_(/*18.9*/for(genre <- genres) yield /*18.29*/ {_display_(Seq[Any](format.raw/*18.31*/("""
				   		"""),format.raw/*19.10*/("""<li><a href=""""),_display_(/*19.24*/routes/*19.30*/.HomeController.index(genre.getGenreId)),format.raw/*19.69*/(""""  alt="Genre Link." id="purple">"""),_display_(/*19.103*/genre/*19.108*/.getGenre),format.raw/*19.117*/("""</a></li>
						""")))}),format.raw/*20.8*/("""

						"""),format.raw/*22.7*/("""<li class="dropdown">
				    <a class="dropdown-toggle" data-toggle="dropdown" href="" id="purple">Platform<span class="caret"></span></a>
				     <ul class="dropdown-menu">
					<li><a href=""""),_display_(/*25.20*/routes/*25.26*/.HomeController.index(0,1)),format.raw/*25.52*/("""" id="purple">xbox one</a></li>
					<li><a href=""""),_display_(/*26.20*/routes/*26.26*/.HomeController.index(0,2)),format.raw/*26.52*/("""" id="purple">ps4</a></li>
					<li><a href=""""),_display_(/*27.20*/routes/*27.26*/.HomeController.index(0,3)),format.raw/*27.52*/("""" id="purple">PC</a></li>
				     </ul>
				   </li>
				  </ul>
				<form class="navbar-form navbar-left" action=""""),_display_(/*31.52*/routes/*31.58*/.HomeController.index(0,0,"@arg")),format.raw/*31.91*/("""" method="GET">
				 <div class="form-group">
				  <input type="text" class="form-control" placeholder="Search Games" name="arg">
				 </div>
				 <button type="submit" class="btn" id="purpleBackground">Submit</button>
				</form>
				<ul class="nav navbar-nav ">
					<pre id="purpleBackground"> """),_display_(/*38.35*/user/*38.39*/.getName),format.raw/*38.47*/("""</pre>
				</ul>			
				</nav>
					<div class="row">
					<div class="col-sm-12">
				
						"""),_display_(/*44.8*/for(g <- games) yield /*44.23*/ {_display_(Seq[Any](format.raw/*44.25*/("""
						
						
							"""),format.raw/*47.8*/("""<h3>"""),_display_(/*47.13*/g/*47.14*/.getGameTitle),format.raw/*47.27*/("""</h3>
							"""),_display_(/*48.9*/if(env.resource("public/images/gameImages/"+g.getId+".jpg").isDefined)/*48.79*/ {_display_(Seq[Any](format.raw/*48.81*/("""
								"""),format.raw/*49.9*/("""<img class="image-responsive" src="/assets/images/gameImages/"""),_display_(/*49.71*/(g.getId +".jpg")),format.raw/*49.88*/(""""/>
							""")))}/*50.10*/else/*50.15*/{_display_(Seq[Any](format.raw/*50.16*/("""
								"""),format.raw/*51.9*/("""<img class="image-responsive" src="/assets/images/gameImages/noImage.png"/>
							""")))}),format.raw/*52.9*/("""
							"""),format.raw/*53.8*/("""<p>"""),_display_(/*53.12*/g/*53.13*/.getGameDetails),format.raw/*53.28*/("""</p>
							<h3>Rating</h3>
							<p>"""),_display_(/*55.12*/g/*55.13*/.getGameRating),format.raw/*55.27*/("""</p>
							<h3>Available on</h3>
							<p """),_display_(/*57.12*/if(g.getPc == false)/*57.32*/{_display_(Seq[Any](format.raw/*57.33*/("""class="hidden"""")))}),format.raw/*57.48*/("""><a href="index.html" alt="link to Sort by Pc">PC/Steam</a></p>
							<p """),_display_(/*58.12*/if(g.getPs4 == false)/*58.33*/{_display_(Seq[Any](format.raw/*58.34*/("""class="hidden"""")))}),format.raw/*58.49*/(""" """),format.raw/*58.50*/("""><a href="index.html" alt="link to Sort by ps4">PS4</a></p>
							<p """),_display_(/*59.12*/if(g.getXboxOne == false)/*59.37*/ {_display_(Seq[Any](format.raw/*59.39*/("""class="hidden"""")))}),format.raw/*59.54*/("""><a href="index.html" alt="link to Sort by Xbox One">Xbox One</p>	
    										
							<p><a href=""""),_display_(/*61.21*/routes/*61.27*/.HomeController.game(g.getId)),format.raw/*61.56*/("""" alt="link to Full Skyrim Page" class="btn" role="button" id="purpleBackground">Read More</a></p>
						""")))}),format.raw/*62.8*/("""
					"""),format.raw/*63.6*/("""</div>
					</div>



""")))}),format.raw/*68.2*/("""
"""))
      }
    }
  }

  def render(games:List[models.Games],genres:List[models.Genre],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(games,genres,user,env)

  def f:((List[models.Games],List[models.Genre],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (games,genres,user,env) => apply(games,genres,user,env)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Fri Dec 16 15:00:04 GMT 2016
                  SOURCE: /home/wdd/webapps/Game4Us/app/views/index.scala.html
                  HASH: 298004e64b0a4532fa84d944c90fc30dd93b1648
                  MATRIX: 815->1|1016->106|1046->111|1082->139|1121->141|1158->152|1595->562|1610->568|1655->592|1837->748|1873->768|1913->770|1952->781|1993->795|2008->801|2068->840|2130->874|2145->879|2176->888|2224->906|2261->916|2486->1114|2501->1120|2548->1146|2627->1198|2642->1204|2689->1230|2763->1277|2778->1283|2825->1309|2973->1430|2988->1436|3042->1469|3375->1775|3388->1779|3417->1787|3544->1888|3575->1903|3615->1905|3667->1930|3699->1935|3709->1936|3743->1949|3784->1964|3863->2034|3903->2036|3940->2046|4029->2108|4067->2125|4099->2139|4112->2144|4151->2145|4188->2155|4303->2240|4339->2249|4370->2253|4380->2254|4416->2269|4484->2310|4494->2311|4529->2325|4603->2372|4632->2392|4671->2393|4717->2408|4820->2484|4850->2505|4889->2506|4935->2521|4964->2522|5063->2594|5097->2619|5137->2621|5183->2636|5314->2740|5329->2746|5379->2775|5516->2882|5550->2889|5608->2917
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|44->13|44->13|44->13|49->18|49->18|49->18|50->19|50->19|50->19|50->19|50->19|50->19|50->19|51->20|53->22|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|62->31|62->31|62->31|69->38|69->38|69->38|75->44|75->44|75->44|78->47|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|81->50|81->50|81->50|82->51|83->52|84->53|84->53|84->53|84->53|86->55|86->55|86->55|88->57|88->57|88->57|88->57|89->58|89->58|89->58|89->58|89->58|90->59|90->59|90->59|90->59|92->61|92->61|92->61|93->62|94->63|99->68
                  -- GENERATED --
              */
          