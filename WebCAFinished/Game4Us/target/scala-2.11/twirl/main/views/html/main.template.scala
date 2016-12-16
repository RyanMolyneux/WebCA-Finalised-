
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(title: String,user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.56*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en-IE">
 <head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width , initial-scale=1">
  <title>"""),_display_(/*9.11*/title),format.raw/*9.16*/("""</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" media="screen" href=""""),_display_(/*13.48*/routes/*13.54*/.Assets.versioned("stylesheets/base.css")),format.raw/*13.95*/(""""
 
 </head>
 <body>
 
  

  <div class="container">
<div class="jumbotron" id="header">
    <h1><span id="green">Gamez</span><span id="orange">4</span>Us</h1>
  </div>  
   
  

   <div class="row">
   
   <nav class="col-sm-2">
  
    <ul class="nav nav-pills nav-stacked">
      """),_display_(/*32.8*/if(user != null)/*32.24*/{_display_(Seq[Any](format.raw/*32.25*/(""" 
      """),format.raw/*33.7*/("""<li>
       <a href=""""),_display_(/*34.18*/routes/*34.24*/.HomeController.index()),format.raw/*34.47*/("""" alt="link to home page." id="navigationStyle" >Home</a>
      </li>
    	""")))}),format.raw/*36.7*/("""
      """),format.raw/*37.7*/("""<li>
       <a href=""""),_display_(/*38.18*/routes/*38.24*/.LoginController.login),format.raw/*38.46*/("""" alt="Link to the Sign in page." id="navigationStyle">Sign In</a>
      </li>
      <li>
       <a href="" alt="Link to Sign up page." id="navigationStyle">Sign Up</a>
      </li>
      """),_display_(/*43.8*/if(user != null)/*43.24*/{_display_(Seq[Any](format.raw/*43.25*/(""" 
      """),format.raw/*44.7*/("""<li>
        <a href=""""),_display_(/*45.19*/routes/*45.25*/.LoginController.logout),format.raw/*45.48*/("""" alt="Link to Logout." id="navigationStyle">Logout</a>
      </li>
      <li>
       <a href=""""),_display_(/*48.18*/routes/*48.24*/.HomeController.contactUs()),format.raw/*48.51*/("""" alt="Link to the Contact information page." id="navigationStyle">ContactUs</a>
      </li>
      <li>
       <a href=""""),_display_(/*51.18*/routes/*51.24*/.HomeController.aboutUs()),format.raw/*51.49*/("""" alt="Link to the about us page." id="navigationStyle">AboutUs</a>
      </li>
      
      """),_display_(/*54.8*/if(user.getRole.equals("admin"))/*54.40*/  {_display_(Seq[Any](format.raw/*54.43*/("""
      """),format.raw/*55.7*/("""<li>
       <a href=""""),_display_(/*56.18*/routes/*56.24*/.HomeController.adminMode),format.raw/*56.49*/("""" alt="Link to the Admins editing view." id="navigationStyle">AdminMode</a>
      </li>
      """)))}),format.raw/*58.8*/(""" 
      
      """)))}),format.raw/*60.8*/("""   
     """),format.raw/*61.6*/("""</ul>
   </nav>
   <div class="col-sm-10" id="content">
	




	"""),_display_(/*69.3*/content),format.raw/*69.10*/("""







		
				
	"""),format.raw/*79.2*/("""</div>

  </div>


  <div class="row">
    <div class="col-sm-12" id="footer">
     <h6>www.<span id="green">gamez</span><span id="orange">4</span>us.ie</h6>
    </div>
   </div>
  
  </div> 
 </body>
</html>
"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Fri Dec 16 10:15:10 GMT 2016
                  SOURCE: /home/wdd/webapps/Game4Us/app/views/main.scala.html
                  HASH: 7216a405b03a4ef7484d3b1d696d101dd2186fda
                  MATRIX: 766->3|915->57|945->61|1127->217|1152->222|1527->570|1542->576|1604->617|1932->919|1957->935|1996->936|2032->945|2082->968|2097->974|2141->997|2249->1075|2284->1083|2334->1106|2349->1112|2392->1134|2611->1327|2636->1343|2675->1344|2711->1353|2762->1377|2777->1383|2821->1406|2947->1505|2962->1511|3010->1538|3161->1662|3176->1668|3222->1693|3345->1790|3386->1822|3427->1825|3462->1833|3512->1856|3527->1862|3573->1887|3700->1984|3748->2002|3785->2012|3883->2084|3911->2091|3965->2118
                  LINES: 27->2|32->2|34->4|39->9|39->9|43->13|43->13|43->13|62->32|62->32|62->32|63->33|64->34|64->34|64->34|66->36|67->37|68->38|68->38|68->38|73->43|73->43|73->43|74->44|75->45|75->45|75->45|78->48|78->48|78->48|81->51|81->51|81->51|84->54|84->54|84->54|85->55|86->56|86->56|86->56|88->58|90->60|91->61|99->69|99->69|109->79
                  -- GENERATED --
              */
          