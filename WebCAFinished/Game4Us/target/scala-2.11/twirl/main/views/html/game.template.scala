
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object game_Scope0 {
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

class game extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Games,models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(game: Games,user: models.users.User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.65*/("""
"""),_display_(/*3.2*/main("Gamez4Us - Game",user)/*3.30*/ {_display_(Seq[Any](format.raw/*3.32*/("""
   """),format.raw/*4.4*/("""<div class="page-header" id="gameHeader">
	<h2>"""),_display_(/*5.7*/game/*5.11*/.getGameTitle),format.raw/*5.24*/("""</h2>
   </div>
    <div class="row">
    
    <div class="col-sm-8" id ="gameImg">
		"""),_display_(/*10.4*/if(env.resource("public/images/gameImages/"+game.getId+".jpg").isDefined)/*10.77*/ {_display_(Seq[Any](format.raw/*10.79*/("""
					"""),format.raw/*11.6*/("""<img class="image-responsive" src="/assets/images/gameImages/"""),_display_(/*11.68*/(game.getId +".jpg")),format.raw/*11.88*/(""""/>
		""")))}/*12.5*/else/*12.10*/{_display_(Seq[Any](format.raw/*12.11*/("""
					"""),format.raw/*13.6*/("""<img class="image-responsive" src="/assets/images/gameImages/noImage.png"/>
		""")))}),format.raw/*14.4*/("""
    """),format.raw/*15.5*/("""</div>
    </div>
    <div class="co-sm-4">
    </div>
   <div class="row">
   <div class="col-sm-3">
   </div>
   <div class="col-sm-6" id="gameDetails">

    <a href=""""),_display_(/*24.15*/routes/*24.21*/.HomeController.purchase(game.getId)),format.raw/*24.57*/("""" class="btn" id="purpleBackground" >Purchase</a>
    <h3>About This Game</h3>
    <h5><strong>Genre</strong></h5>
     <pre> """),_display_(/*27.13*/game/*27.17*/.getGenre.getGenre),format.raw/*27.35*/(""" """),format.raw/*27.36*/("""</pre>
    <h5><strong>Developers</strong></h5>
     <pre> """),_display_(/*29.13*/game/*29.17*/.getGameDevs),format.raw/*29.29*/(""" """),format.raw/*29.30*/("""</pre>
    <h3>Details</h3>
    <hr>
    <p>	"""),_display_(/*32.10*/game/*32.14*/.getGameDetails),format.raw/*32.29*/("""</p>
    <hr>
        <h3>Rating</h3>
	<p>"""),_display_(/*35.6*/game/*35.10*/.getGameRating),format.raw/*35.24*/("""</p>
        <h5><strong>Release Date</strong></h5>
        <pre> """),_display_(/*37.16*/game/*37.20*/.getGameRelease),format.raw/*37.35*/("""</pre>
        <h3>Available on</h3>
	<p """),_display_(/*39.6*/if(game.getPc == false)/*39.29*/{_display_(Seq[Any](format.raw/*39.30*/("""class="hidden"""")))}),format.raw/*39.45*/("""><a href="index.html" alt="link to Sort by Pc">PC/Steam</a></p>
	<p """),_display_(/*40.6*/if(game.getPs4 == false)/*40.30*/{_display_(Seq[Any](format.raw/*40.31*/("""class="hidden"""")))}),format.raw/*40.46*/(""" """),format.raw/*40.47*/("""><a href="index.html" alt="link to Sort by ps4">PS4</a></p>
	<p """),_display_(/*41.6*/if(game.getXboxOne == false)/*41.34*/ {_display_(Seq[Any](format.raw/*41.36*/("""class="hidden"""")))}),format.raw/*41.51*/("""><a href="index.html" alt="link to Sort by Xbox One">Xbox One</p>	
    					
   </div>
    <div class="col-sm-3">
    </div>
   </div>		
""")))}),format.raw/*47.2*/("""
"""))
      }
    }
  }

  def render(game:Games,user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(game,user,env)

  def f:((Games,models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (game,user,env) => apply(game,user,env)

  def ref: this.type = this

}


}

/**/
object game extends game_Scope0.game
              /*
                  -- GENERATED --
                  DATE: Fri Dec 16 15:00:04 GMT 2016
                  SOURCE: /home/wdd/webapps/Game4Us/app/views/game.scala.html
                  HASH: 2873e1c5ed4d9473c009cdf1681b04150b84340e
                  MATRIX: 781->3|939->66|967->69|1003->97|1042->99|1073->104|1147->153|1159->157|1192->170|1310->262|1392->335|1432->337|1466->344|1555->406|1596->426|1622->435|1635->440|1674->441|1708->448|1818->528|1851->534|2057->713|2072->719|2129->755|2286->885|2299->889|2338->907|2367->908|2456->970|2469->974|2502->986|2531->987|2607->1036|2620->1040|2656->1055|2728->1101|2741->1105|2776->1119|2872->1188|2885->1192|2921->1207|2991->1251|3023->1274|3062->1275|3108->1290|3204->1360|3237->1384|3276->1385|3322->1400|3351->1401|3443->1467|3480->1495|3520->1497|3566->1512|3740->1656
                  LINES: 27->2|32->2|33->3|33->3|33->3|34->4|35->5|35->5|35->5|40->10|40->10|40->10|41->11|41->11|41->11|42->12|42->12|42->12|43->13|44->14|45->15|54->24|54->24|54->24|57->27|57->27|57->27|57->27|59->29|59->29|59->29|59->29|62->32|62->32|62->32|65->35|65->35|65->35|67->37|67->37|67->37|69->39|69->39|69->39|69->39|70->40|70->40|70->40|70->40|70->40|71->41|71->41|71->41|71->41|77->47
                  -- GENERATED --
              */
          