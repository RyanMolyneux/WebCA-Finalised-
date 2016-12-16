
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object viewGames_Scope0 {
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

class viewGames extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[models.Games],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(gameList : List[models.Games],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.57*/("""
"""),_display_(/*3.2*/main("Gamez4Us - Admin Game View",user)/*3.41*/ {_display_(Seq[Any](format.raw/*3.43*/("""
     """),format.raw/*4.6*/("""<div class="page-header">
	  <h2 id="cart-Header">Admin : Games - Views</h2>
	 </div>

	 """),_display_(/*8.4*/if(flash.containsKey("success"))/*8.36*/ {_display_(Seq[Any](format.raw/*8.38*/("""
		 """),format.raw/*9.4*/("""<div class="alert alert-success">
		 """),_display_(/*10.5*/flash/*10.10*/.get("success")),format.raw/*10.25*/("""
		 """),format.raw/*11.4*/("""</div>
	 """)))}),format.raw/*12.4*/("""
	 """),_display_(/*13.4*/for(game <- gameList) yield /*13.25*/ {_display_(Seq[Any](format.raw/*13.27*/("""

	 """),format.raw/*15.3*/("""<div class="row">
		 <div class="col-sm-12">
		  <div class="col-sm-8">
			 <h4>
				GAME : """),_display_(/*19.13*/game/*19.17*/.getGameTitle),format.raw/*19.30*/(""" """),format.raw/*19.31*/("""<br>-----------<br> PRICE : """),_display_(/*19.60*/game/*19.64*/.getGamePrice),format.raw/*19.77*/("""
			"""),format.raw/*20.4*/("""</h4>
		  </div>
		  <div class="col-sm-2">
		  </div>
		  <div class="col-sm-2">
			  
			  <a href=""""),_display_(/*26.16*/routes/*26.22*/.HomeController.deleteGame(game.getId)),format.raw/*26.60*/("""" class="btn-xs" onclick="return confirmDel();">
				  <span class="glyphicon glyphicon-trash" id="purple"></span>
			  </a>
			  <a href=""""),_display_(/*29.16*/routes/*29.22*/.HomeController.updateGame(game.getId)),format.raw/*29.60*/("""" class="btn">
				  <span class="glyphicon glyphicon-erase" id="purple"></span>
			  </a>
		  </div>
		 </div>
	 </div>
	 <hr>
	 	 
	
	 """)))}),format.raw/*38.4*/("""
	 """),format.raw/*39.3*/("""<a href=""""),_display_(/*39.13*/routes/*39.19*/.HomeController.addGame()),format.raw/*39.44*/("""">
		 <button class="btn" id="navigationStyle">Add Game</button>
	 </a>
	 <script>
	 	function confirmDel() """),format.raw/*43.26*/("""{"""),format.raw/*43.27*/("""
			 """),format.raw/*44.5*/("""return confirm('Are You sure you wish to remove game ?.');
		 """),format.raw/*45.4*/("""}"""),format.raw/*45.5*/("""
	 """),format.raw/*46.3*/("""</script>
""")))}),format.raw/*47.2*/("""
"""))
      }
    }
  }

  def render(gameList:List[models.Games],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(gameList,user)

  def f:((List[models.Games],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (gameList,user) => apply(gameList,user)

  def ref: this.type = this

}


}

/**/
object viewGames extends viewGames_Scope0.viewGames
              /*
                  -- GENERATED --
                  DATE: Fri Dec 16 10:34:54 GMT 2016
                  SOURCE: /home/wdd/webapps/Game4Us/app/views/viewGames.scala.html
                  HASH: 4903bb7abf52775b2412058673fe0b9edb5c6017
                  MATRIX: 783->3|933->58|961->61|1008->100|1047->102|1080->109|1199->203|1239->235|1278->237|1309->242|1374->281|1388->286|1424->301|1456->306|1497->317|1528->322|1565->343|1605->345|1638->351|1762->448|1775->452|1809->465|1838->466|1894->495|1907->499|1941->512|1973->517|2109->626|2124->632|2183->670|2353->813|2368->819|2427->857|2604->1004|2635->1008|2672->1018|2687->1024|2733->1049|2873->1161|2902->1162|2935->1168|3025->1231|3053->1232|3084->1236|3126->1248
                  LINES: 27->2|32->2|33->3|33->3|33->3|34->4|38->8|38->8|38->8|39->9|40->10|40->10|40->10|41->11|42->12|43->13|43->13|43->13|45->15|49->19|49->19|49->19|49->19|49->19|49->19|49->19|50->20|56->26|56->26|56->26|59->29|59->29|59->29|68->38|69->39|69->39|69->39|69->39|73->43|73->43|74->44|75->45|75->45|76->46|77->47
                  -- GENERATED --
              */
          