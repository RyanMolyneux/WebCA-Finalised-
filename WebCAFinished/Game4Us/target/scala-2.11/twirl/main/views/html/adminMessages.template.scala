
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object adminMessages_Scope0 {
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

class adminMessages extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[models.ContactUs],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(messages: List[models.ContactUs] ,user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.61*/("""

"""),_display_(/*4.2*/main("Game4Us - Admin Messages",user)/*4.39*/ {_display_(Seq[Any](format.raw/*4.41*/("""
    """),format.raw/*5.5*/("""<div class="page-header" id="adminHeader">
        <h3>
           <span id="purple"> Admin </span>- Messages
        </h3>
    </div>
    <div class="row">
        <div class="col-sm-2">
        </div>
        <div class="col-sm-8">
            """),_display_(/*14.14*/for(message <- messages) yield /*14.38*/ {_display_(Seq[Any](format.raw/*14.40*/("""
                """),format.raw/*15.17*/("""<h4>Email : """),_display_(/*15.30*/message/*15.37*/.getEmail),format.raw/*15.46*/("""</h4>
                <br>
                <div class="well well-sm">
                 <h4 id="adminHeader">Message</h4>
                 <hr>
                 """),_display_(/*20.19*/message/*20.26*/.getContent),format.raw/*20.37*/("""
                """),format.raw/*21.17*/("""</div>
            """)))}),format.raw/*22.14*/("""
        """),format.raw/*23.9*/("""</div>
        <div class="col-sm-2">
        </div>
    </div>

""")))}))
      }
    }
  }

  def render(messages:List[models.ContactUs],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(messages,user)

  def f:((List[models.ContactUs],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (messages,user) => apply(messages,user)

  def ref: this.type = this

}


}

/**/
object adminMessages extends adminMessages_Scope0.adminMessages
              /*
                  -- GENERATED --
                  DATE: Fri Dec 16 11:17:21 GMT 2016
                  SOURCE: /home/wdd/webapps/Game4Us/app/views/adminMessages.scala.html
                  HASH: 2573a57f3538d141d1f28559dd2241498c36240b
                  MATRIX: 795->2|949->61|977->64|1022->101|1061->103|1092->108|1366->355|1406->379|1446->381|1491->398|1531->411|1547->418|1577->427|1765->588|1781->595|1813->606|1858->623|1909->643|1945->652
                  LINES: 27->2|32->2|34->4|34->4|34->4|35->5|44->14|44->14|44->14|45->15|45->15|45->15|45->15|50->20|50->20|50->20|51->21|52->22|53->23
                  -- GENERATED --
              */
          