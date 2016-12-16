
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object contactUs_Scope0 {
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

     object contactUs_Scope1 {
import helper._

class contactUs extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.ContactUs],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(addMessageForm: Form[models.ContactUs],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.66*/("""


"""),_display_(/*5.2*/main("Gamez4Us - ContatUs",user)/*5.34*/ {_display_(Seq[Any](format.raw/*5.36*/("""

		"""),format.raw/*7.3*/("""<h2>Frequently Asked Questions</h2>
			
			<h3>Why we made this website</h3>
				<p>There are a great many reasons why we decided to make this website, the first and foremost reason is because, as time goes on the original games
					like Super Mario Bros. or Donkey Kong Country which use cartridges rather than disks or are downloaded break and stop working, so the chances of encountering these games becomes smaller and smaller. 
					We here ar Gamez4Us want to give the world a chance to find these games so that they are not forever lost to time.</p>
	
			<h3>What do we get from this?</h3>
				<p>This website is not designed to be for profit or to get as many hits as we can, no, all we get from this is the good feeling that because of us we could potentialy bring joy and entertainment
					to some of the younger generation or generations beyond by giving them the chance to experience some of the classic games or to find out information on modern games.</p>
	
	
	
	
		<h2>Didn't find the answer you were looking for?</h2>
		<h3>Have a suggestion for a game or console we missed?</h3>
		<h4>Send us a message and you could be put into our hall of contributors!</h4>
		
		
	
	"""),_display_(/*27.3*/form(action = routes.HomeController.addMessageSubmit(), 'role->"form")/*27.73*/ {_display_(Seq[Any](format.raw/*27.75*/("""

		"""),_display_(/*29.4*/inputText(addMessageForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*29.84*/("""	
		"""),format.raw/*30.3*/("""<label for="message">Message:</label>
      	<textarea class="form-control" name="content" id="message" rows="5" placeholder="Enter message"></textarea>

		<div class="actions">
			<input type="submit" value="Submit" class="btn btn-primary" id="navigationStyle">
				<a href=""""),_display_(/*35.15*/routes/*35.21*/.HomeController.index()),format.raw/*35.44*/(""""
					<button class="btn btn-warning" id="fontChange">Cancel</button>
				</a>
		</div>



	""")))}),format.raw/*42.3*/("""
	"""),_display_(/*43.3*/if(flash.containsKey("success"))/*43.35*/{_display_(Seq[Any](format.raw/*43.36*/("""
		"""),format.raw/*44.3*/("""<div class="alert alert-success">
			"""),_display_(/*45.5*/flash/*45.10*/.get("success")),format.raw/*45.25*/("""
		"""),format.raw/*46.3*/("""</div>
	""")))}),format.raw/*47.3*/("""
""")))}),format.raw/*48.2*/("""
"""))
      }
    }
  }

  def render(addMessageForm:Form[models.ContactUs],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(addMessageForm,user)

  def f:((Form[models.ContactUs],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (addMessageForm,user) => apply(addMessageForm,user)

  def ref: this.type = this

}


}
}

/**/
object contactUs extends contactUs_Scope0.contactUs_Scope1.contactUs
              /*
                  -- GENERATED --
                  DATE: Fri Dec 16 14:36:19 GMT 2016
                  SOURCE: /home/wdd/webapps/Game4Us/app/views/contactUs.scala.html
                  HASH: aef21df4d6234d59e0796bdbe1bc9137e69ebe7b
                  MATRIX: 835->19|994->83|1026->90|1066->122|1105->124|1137->130|2372->1339|2451->1409|2491->1411|2524->1418|2625->1498|2657->1503|2966->1785|2981->1791|3025->1814|3156->1915|3186->1919|3227->1951|3266->1952|3297->1956|3362->1995|3376->2000|3412->2015|3443->2019|3483->2029|3516->2032
                  LINES: 30->2|35->2|38->5|38->5|38->5|40->7|60->27|60->27|60->27|62->29|62->29|63->30|68->35|68->35|68->35|75->42|76->43|76->43|76->43|77->44|78->45|78->45|78->45|79->46|80->47|81->48
                  -- GENERATED --
              */
          