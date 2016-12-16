
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object purchase_Scope0 {
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

class purchase extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Games,models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(game: Games,user: models.users.User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.65*/("""
"""),_display_(/*2.2*/main("Gamez4Us - Purchase View",user)/*2.39*/ {_display_(Seq[Any](format.raw/*2.41*/("""
     """),format.raw/*3.6*/("""<div class="page-header">
	  <h2 id="cart-Header">Purchase</h2>
	 </div>
	 <div class="row">
	  <div class="col-sm-11" id="cart-item"> 
	   <div class="col-sm-2">

		"""),_display_(/*10.4*/if(env.resource("public/images/gameImages/"+game.getId+".jpg").isDefined)/*10.77*/ {_display_(Seq[Any](format.raw/*10.79*/("""
						"""),format.raw/*11.7*/("""<img class="image-responsive" src="/assets/images/gameImages/"""),_display_(/*11.69*/(game.getId +".jpg")),format.raw/*11.89*/(""""/>
		""")))}/*12.5*/else/*12.10*/{_display_(Seq[Any](format.raw/*12.11*/("""
						"""),format.raw/*13.7*/("""<img class="image-responsive" src="/assets/images/gameImages/noImage.png"/>
		""")))}),format.raw/*14.4*/("""
	   """),format.raw/*15.5*/("""</div>
       <div class="col-sm-8">	  
	    <p>"""),_display_(/*17.10*/game/*17.14*/.getGameTitle),format.raw/*17.27*/(""" """),format.raw/*17.28*/("""- """),_display_(/*17.31*/game/*17.35*/.getGamePrice),format.raw/*17.48*/("""<p>
	   </div>
	  </div>
	 </div>

	<div class="actions">
		<input type="submit" value="Checkout" class="btn" data-toggle="modal" data-target="#myModal" id="checkout">
		<div class="modal fade" id="myModal" role="dialog">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">Success!</h4>
					</div>
					<div class="modal-body">
						<p>Game successfully purchased. Press button to return to the home page</p>
					</div>
					<div class="modal-footer">

						<a href=""""),_display_(/*36.17*/routes/*36.23*/.HomeController.index()),format.raw/*36.46*/(""""
						<button type="button" class="btn btn-warning">Back to home</button>
						</a>
					</div>
				</div>

			</div>
		</div>
		<a href=""""),_display_(/*44.13*/routes/*44.19*/.HomeController.index()),format.raw/*44.42*/(""""
		<button class="btn btn-warning">Cancel</button>
		</a>
	</div>




""")))}))
      }
    }
  }

  def render(game:Games,user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(game,user,env)

  def f:((Games,models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (game,user,env) => apply(game,user,env)

  def ref: this.type = this

}


}

/**/
object purchase extends purchase_Scope0.purchase
              /*
                  -- GENERATED --
                  DATE: Fri Dec 16 14:59:00 GMT 2016
                  SOURCE: /home/wdd/webapps/Game4Us/app/views/purchase.scala.html
                  HASH: 7914ca06177def13d5b1db292cc6e2585853ba0d
                  MATRIX: 789->1|947->64|974->66|1019->103|1058->105|1090->111|1283->278|1365->351|1405->353|1439->360|1528->422|1569->442|1594->450|1607->455|1646->456|1680->463|1789->542|1821->547|1897->596|1910->600|1944->613|1973->614|2003->617|2016->621|2050->634|2702->1259|2717->1265|2761->1288|2930->1430|2945->1436|2989->1459
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|45->14|46->15|48->17|48->17|48->17|48->17|48->17|48->17|48->17|67->36|67->36|67->36|75->44|75->44|75->44
                  -- GENERATED --
              */
          