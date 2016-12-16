
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object adminMode_Scope0 {
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

class adminMode extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),_display_(/*2.2*/main("Gamez4Us - Admin Mode",user)/*2.36*/ {_display_(Seq[Any](format.raw/*2.38*/("""
"""),format.raw/*3.1*/("""<div class="page-header" id="adminHeader">
	<h3><span id="purple">Admin</span> - Mode</h3>
</div>
 <div class="row">
	<div class="col-sm-3">
	</div>
	<div class="col-sm-9" id=>
	
	
				
		
			<a href=""""),_display_(/*14.14*/routes/*14.20*/.HomeController.addGame()),format.raw/*14.45*/("""" alt="Link to the admin add Games page." id="navigationStyle" class="btn">
				Add Game
			</a>
			
			 <a href=""""),_display_(/*18.15*/routes/*18.21*/.HomeController.viewGames()),format.raw/*18.48*/("""" alt="Link to the edit Games page." id = "navigationStyle" class="btn">
			  View Games
			 </a>
			 <a href=""""),_display_(/*21.15*/routes/*21.21*/.HomeController.adminMessages),format.raw/*21.50*/("""" alt="Link to the view the Contacts messages to the database." id="navigationStyle" class="btn">
			  View Messages
			 </a>

					
				
			
		
	</div>

 </div>

""")))}),format.raw/*33.2*/("""
"""))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object adminMode extends adminMode_Scope0.adminMode
              /*
                  -- GENERATED --
                  DATE: Fri Dec 16 14:34:43 GMT 2016
                  SOURCE: /home/wdd/webapps/Game4Us/app/views/adminMode.scala.html
                  HASH: a9e6bf1e26362b72c379ea3c1a92b30690af0d30
                  MATRIX: 764->1|884->26|911->28|953->62|992->64|1019->65|1248->267|1263->273|1309->298|1451->413|1466->419|1514->446|1653->558|1668->564|1718->593|1912->757
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|45->14|45->14|45->14|49->18|49->18|49->18|52->21|52->21|52->21|64->33
                  -- GENERATED --
              */
          