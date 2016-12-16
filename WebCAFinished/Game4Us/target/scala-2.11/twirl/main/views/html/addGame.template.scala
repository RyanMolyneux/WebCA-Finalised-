
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addGame_Scope0 {
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

     object addGame_Scope1 {
import helper._

class addGame extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.Games],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(addGameForm: Form[models.Games],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.59*/("""

"""),_display_(/*6.2*/main("Game4Us - Add Game",user)/*6.33*/ {_display_(Seq[Any](format.raw/*6.35*/("""

"""),format.raw/*8.1*/("""<div class="row">

 <div class="col-sm-4">
 </div>

 <div class="col-sm-4">
	 <div class="page-header">
		 <h3> Add Game</h3>
	 </div>

	 """),_display_(/*18.4*/form(action = routes.HomeController.addGameSubmit(), 'role->"form", 'enctype -> "multipart/form-data")/*18.106*/ {_display_(Seq[Any](format.raw/*18.108*/("""

		"""),_display_(/*20.4*/inputText(addGameForm("GameTitle"), '_label -> "Game Title :",'class -> "form-control")),format.raw/*20.91*/("""
		"""),format.raw/*21.3*/("""<label for="message">Game Details : </label>
      	<textarea class="form-control" name="GameDetails" id="message" rows="5" placeholder="Enter message"></textarea>
		"""),_display_(/*23.4*/inputText(addGameForm("GameRating"), '_label -> "Game Rating : ",'class -> "form-control")),format.raw/*23.94*/("""
		"""),_display_(/*24.4*/inputText(addGameForm("GameDevs"),'_label -> "Game Developer :",'class -> "form-control")),format.raw/*24.93*/("""
		"""),_display_(/*25.4*/inputText(addGameForm("GameRelease"),'_label -> "Game Release Date:",'class -> "form-control")),format.raw/*25.98*/("""
		"""),_display_(/*26.4*/inputText(addGameForm("GamePrice"),'_label -> "Game Price : ",'class -> "form-control")),format.raw/*26.91*/("""	

		"""),_display_(/*28.4*/inputText(addGameForm("Id"), '_label -> "", 'hidden ->"hidden")),format.raw/*28.67*/("""
		"""),_display_(/*29.4*/select(
			addGameForm("genre.GenreId"),

			options(Genre.options),
			'_label -> "Genre : ", '_default -> ">> Chose a Genre <<",
			'_showConstraints -> false, 'class -> "form-control"
		)),format.raw/*35.4*/("""
		
		"""),format.raw/*37.3*/("""<label>Xbox One</label>
		<input type="checkbox" name="xboxOne" value="true">
		<label>Ps4</label>
		<input type="checkbox" name="ps4" value="true">
		<label>PC</label>
		<input type="checkbox" name="pc" value="true">
		<br>
		<br>
		<label>Image Upload</label>
		<input class="btn" type="file" name="upload">
		<br>
		


	<div class="action">
		<input type="submit" value="Add Game" class="btn" id="navigationStyle">

		<a href=""""),_display_(/*54.13*/routes/*54.19*/.HomeController.viewGames()),format.raw/*54.46*/(""""
			<button class="btn btn-warning" id="fontChange">Cancel</button>		
		</a>
	</div>


	 """)))}),format.raw/*60.4*/("""

 """),format.raw/*62.2*/("""</div>

  <div class="col-sm-4">
 </div>
</div>


""")))}),format.raw/*69.2*/("""
"""))
      }
    }
  }

  def render(addGameForm:Form[models.Games],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(addGameForm,user)

  def f:((Form[models.Games],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (addGameForm,user) => apply(addGameForm,user)

  def ref: this.type = this

}


}
}

/**/
object addGame extends addGame_Scope0.addGame_Scope1.addGame
              /*
                  -- GENERATED --
                  DATE: Fri Dec 16 13:18:35 GMT 2016
                  SOURCE: /home/wdd/webapps/Game4Us/app/views/addGame.scala.html
                  HASH: 35c4d5f5daf6c5f598b976078aeb1bd93812f3d9
                  MATRIX: 825->20|977->77|1005->80|1044->111|1083->113|1111->115|1276->254|1388->356|1429->358|1460->363|1568->450|1598->453|1791->620|1902->710|1932->714|2042->803|2072->807|2187->901|2217->905|2325->992|2357->998|2441->1061|2471->1065|2681->1255|2714->1261|3172->1692|3187->1698|3235->1725|3356->1816|3386->1819|3467->1870
                  LINES: 30->4|35->4|37->6|37->6|37->6|39->8|49->18|49->18|49->18|51->20|51->20|52->21|54->23|54->23|55->24|55->24|56->25|56->25|57->26|57->26|59->28|59->28|60->29|66->35|68->37|85->54|85->54|85->54|91->60|93->62|100->69
                  -- GENERATED --
              */
          