
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object aboutUs_Scope0 {
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

class aboutUs extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""

"""),_display_(/*3.2*/main("Gamez4Us - AboutUs",user)/*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""
	"""),format.raw/*4.2*/("""<h2>About us</h2>
	<p>Gamez4Us is an online digital databank of alot of things video-game related. On this website you can find information
	on video-games like old classic games such as Super Mario Bros. and classic consoles such as the NES (the Nintendo Entertainment System) or 
	on modern games like Gears of War 4 and new consoles such as the PS4 or XBOX ONE.</p>
	<h3>Why we made this website</h3>
	<p>There are a great many reasons why we decided to make this website, the first and foremost reason is because, as time goes on the original games
	like Super Mario Bros. or Donkey Kong Country which use cartridges rather than disks or are downloaded break and stop working, so the chances of encountering these games becomes smaller and smaller. 
	We here ar Gamez4Us want to give the world a chance to find these games so that they are not forever lost to time.</p>	
""")))}),format.raw/*12.2*/("""	
	
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
object aboutUs extends aboutUs_Scope0.aboutUs
              /*
                  -- GENERATED --
                  DATE: Thu Dec 15 18:55:58 GMT 2016
                  SOURCE: /home/wdd/webapps/Game4Us/app/views/aboutUs.scala.html
                  HASH: 55e972f3daf3a41b6c85108c30537126a5b1c4a7
                  MATRIX: 760->1|880->26|910->31|949->62|988->64|1017->67|1931->951
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|43->12
                  -- GENERATED --
              */
          