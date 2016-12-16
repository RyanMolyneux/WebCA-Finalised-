
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signInAndsignUp_Scope0 {
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

class signInAndsignUp extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.users.Login],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.63*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Game4Us - SignIn & Sign Up",user)/*4.41*/ {_display_(Seq[Any](format.raw/*4.43*/("""
  """),format.raw/*5.3*/("""<div class="row">
    <div class="col-sm-4">
    </div>
    <div class="col-sm-4">
  <div class="page-header">
   <h1><span id="purple">S</span>ign In</h1> 
  </div>
 <div class="well well-sm">
     """),_display_(/*13.7*/if(loginForm.hasGlobalErrors)/*13.36*/{_display_(Seq[Any](format.raw/*13.37*/("""
         """),format.raw/*14.10*/("""<p class="alert alert-warning">
         """),_display_(/*15.11*/loginForm/*15.20*/.globalError.message),format.raw/*15.40*/("""
         """),format.raw/*16.10*/("""</p>
     """)))}),format.raw/*17.7*/("""
     """),_display_(/*18.7*/if(flash.containsKey("error"))/*18.37*/{_display_(Seq[Any](format.raw/*18.38*/("""
         """),format.raw/*19.10*/("""<div class="alert alert-warning">
             """),_display_(/*20.15*/flash/*20.20*/.get("loginRequired")),format.raw/*20.41*/("""
         """),format.raw/*21.10*/("""</div>
     """)))}),format.raw/*22.7*/("""

  """),_display_(/*24.4*/helper/*24.10*/.form(action = routes.LoginController.loginSubmit())/*24.62*/ {_display_(Seq[Any](format.raw/*24.64*/("""
   """),format.raw/*25.4*/("""<div class="form-group">
       """),_display_(/*26.9*/inputText(loginForm("email"), '_label -> "",
       'class -> "form-control", 'placeholder -> "Email")),format.raw/*27.58*/("""
   """),format.raw/*28.4*/("""</div>

    <div class="form-group">
        """),_display_(/*31.10*/inputPassword(loginForm("password"), '_label -> "",
        'class -> "form-control", 'placeholder -> "Password")),format.raw/*32.62*/("""
    """),format.raw/*33.5*/("""</div>

        <div class="form-group">
            <input type="submit" value="Sign In" id="purpleBackground"class="btn ">
        </div>
        <div class="checkbox">

            <label><input type="checkbox">Remember me</label>
        </div>
    
    </form>
 </div>
        """)))}),format.raw/*45.10*/(""" 


  """),format.raw/*48.3*/("""<div id="option">
   <h3><span id="orange">O</span><span id="purple">R</span></h3>
  </div>




     <div class="page-header">
      <h1><span id="orange">S</span>ign Up</h1>
     </div>
     <div class="well well-sm">
      <form action="" method="post">
       <div class="form-group">
        <label for="firstname">First Name : </label>
         <input type="text" class="form-control" name="firstname" placeholder="Enter First Name"> 
       </div>
       <div class="form-group">
        <label for="lastname">Last Name : </label>
         <input type="text" class="form-control" name="lastname" placeholder="Enter Last Name">
       </div>
       <div class="form-group">
        <label for="email">Email : </label>
         <input type="text" class="form-control" name="email" placeholder="Enter Email">
       </div>
       <div class="form-group">
        <label for="password">Password : </label>
         <input type="password" class="form-control" name="passowrd" placeholder="Enter Password">
       </div>
       <div class="form-group">
        <label for="confirm_password">Confirm Password : </label>
         <input type="password" class="form-control" name="confirm_password" placeholder="Enter Confirmation Password">
       </div>
       <button type="submit" class="btn" id="purpleBackground">Submit</button>
      </form>
     </div>
    </div>
    <div class="col-sm-4">
    </div>
   </div>
""")))}),format.raw/*87.2*/("""
"""))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.users.Login],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


}

/**/
object signInAndsignUp extends signInAndsignUp_Scope0.signInAndsignUp
              /*
                  -- GENERATED --
                  DATE: Thu Dec 15 21:13:30 GMT 2016
                  SOURCE: /home/wdd/webapps/Game4Us/app/views/signInAndsignUp.scala.html
                  HASH: b857152ee314bbd73e2ee196d6df47e24fb5ccc1
                  MATRIX: 801->1|972->62|999->80|1026->82|1073->121|1112->123|1141->126|1367->326|1405->355|1444->356|1482->366|1551->408|1569->417|1610->437|1648->447|1689->458|1722->465|1761->495|1800->496|1838->506|1913->554|1927->559|1969->580|2007->590|2050->603|2081->608|2096->614|2157->666|2197->668|2228->672|2287->705|2410->807|2441->811|2514->857|2648->970|2680->975|2994->1258|3027->1264|4475->2682
                  LINES: 27->1|32->1|33->3|34->4|34->4|34->4|35->5|43->13|43->13|43->13|44->14|45->15|45->15|45->15|46->16|47->17|48->18|48->18|48->18|49->19|50->20|50->20|50->20|51->21|52->22|54->24|54->24|54->24|54->24|55->25|56->26|57->27|58->28|61->31|62->32|63->33|75->45|78->48|117->87
                  -- GENERATED --
              */
          