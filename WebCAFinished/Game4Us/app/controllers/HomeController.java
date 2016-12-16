package controllers;



import play.mvc.*;
import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;
import javax.inject.Inject;

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;
import java.io.File;
//File uploade and image editing dependencies/
import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;



import views.html.*;

import models.*;
import models.users.*;

import static play.mvc.Controller.flash;
import static play.mvc.Controller.session;
import static play.mvc.Results.badRequest;
import static play.mvc.Results.ok;
import static play.mvc.Results.redirect;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

 

    private User getUserFromSession()
	{
	 return User.getUserById(session().get("email"));
	}

    //Variables
	private FormFactory formFactory;
	private Environment env;
    //Constructors
     //Default
    @Inject
    public HomeController(FormFactory factory,Environment e)
    {
      this.formFactory = factory;
	  env = e;
    }
    @Security.Authenticated(Secured.class)
    //Methods
    public Result index(int chosenGenre,int chosenPlatform,String search)
	{
		
		// Gets List of Games In Database.
		List<Games> games = new ArrayList<Games>();
		//Passes in List of Genres In Database.
		List<Genre> genre = Genre.findAll();
		if(chosenGenre == 0)
		{	
			games = Games.findAll();

			
			if(chosenPlatform == 0)
			{
			 	if(!search.equals(""))
				{

				 ListIterator<Games> searchGame = games.listIterator();

				 while(searchGame.hasNext())
				  {	
					Games game = searchGame.next();
					if(!game.getGameTitle().equals(search))
					{
					 searchGame.remove();
					}
				  }


				}
				
			}
			
			else if(chosenPlatform == 1)
			{
			ListIterator<Games> gameItr = games.listIterator();
			while(gameItr.hasNext())
			{
			
			 if(gameItr.next().getXboxOne() == false)
			 {
			  gameItr.remove();
			 }
			}
				
			}
			else if(chosenPlatform == 2)
			{
			Iterator<Games> gameItr = games.iterator();
			while(gameItr.hasNext())
			{
			 
			 if(gameItr.next().getPs4() == false)
			 {
			  gameItr.remove();
			 }
			}
			}
			else if(chosenPlatform == 3)
			{
			 Iterator<Games> gameItr = games.iterator();
			 while(gameItr.hasNext())
			  {
			   
			    if(gameItr.next().getPc() == false)
			    {
			     gameItr.remove();
			    }
			  }
			}
		}
		else
		{
			games = Genre.find.ref(chosenGenre).getGames();
		}
	
        return ok(index.render(games,genre,getUserFromSession(),env));
	
    	}

	@Security.Authenticated(Secured.class)
    public Result game(int chosenGame)
	{
		Games selectedGame = Games.find.ref(chosenGame);
		return ok(game.render(selectedGame,getUserFromSession(),env));
	}

	@Security.Authenticated(Secured.class)
	public Result purchase(int chosenGame)
	{

		Games selectedGame = Games.find.ref(chosenGame);

		return ok(purchase.render(selectedGame,getUserFromSession(),env));

	}

	@Security.Authenticated(Secured.class)
       public Result contactUs()
	{
        Form<ContactUs> contactUsForm = formFactory.form(ContactUs.class);
		return ok(contactUs.render(contactUsForm,getUserFromSession()));
	}

	@Security.Authenticated(Secured.class)

	public Result addMessageSubmit() 
	{
	        Form<ContactUs> newContactUsForm = formFactory.form(ContactUs.class).bindFromRequest();

	        if (newContactUsForm.hasErrors())
		{
	            return badRequest(contactUs.render(newContactUsForm,getUserFromSession()));
	        }

	        ContactUs newContactUs = newContactUsForm.get();
      	        
			newContactUs.save();

            flash("success", "message sent");


		return redirect(controllers.routes.HomeController.index(0,0,""));
	}

	@Security.Authenticated(Secured.class)
    public Result aboutUs()
	{
	return ok(aboutUs.render(getUserFromSession()));
	}

	@Security.Authenticated(Secured.class)
	@With(AuthAdmin.class)
    public Result viewGames()
	{
		List<Games> gameList = Games.findAll();
		return ok(viewGames.render(gameList,getUserFromSession()));
	}

	@Security.Authenticated(Secured.class)
	@With(AuthAdmin.class)
    public Result addGame()
	{

	//Form Factory Instantiation
	Form<Games> addGameForm = formFactory.form(Games.class);
	
	return ok(addGame.render(addGameForm,getUserFromSession()));
	}
	@Security.Authenticated(Secured.class)
	public Result addGameSubmit()
	{
		String saveImageMsg;
		Form<Games> newGameForm = formFactory.form(Games.class).bindFromRequest();

		if(newGameForm.hasErrors()) 
		{
			return badRequest(addGame.render(newGameForm,getUserFromSession()));
		}

		Games newGame = newGameForm.get();

		if(newGame.getId() == null)
		{
			newGame.save();
		}
		else
		{
		newGame.update();
		}

		//These two lines get the image
		MultipartFormData data = request().body().asMultipartFormData();
		FilePart image = data.getFile("upload");
		//This saves the image file to the db
		saveImageMsg = saveFile(newGame.getId(),image);
		
		flash("Succes","Game "+newGame.getGameTitle()+" has been created or updated"+saveImageMsg);

		return redirect(controllers.routes.HomeController.viewGames());
	}
	public String saveFile(Integer id,FilePart<File> uploaded)
	{
		if(uploaded != null)
		{
			String mimeType = uploaded.getContentType();
			if(mimeType.startsWith("image/"))
			{
				File file = uploaded.getFile();
				ConvertCmd cmd = new ConvertCmd();
				IMOperation op = new IMOperation();

				op.addImage(file.getAbsolutePath());

				op.resize(300,200);
				op.addImage("public/images/gameImages/"+ id+".jpg");
				
				IMOperation thumb = new IMOperation();

				thumb.addImage(file.getAbsolutePath());
				thumb.thumbnail(60);

				thumb.addImage("public/images/gameImages/thumbnails/"+ id+".jpg");
				try{
					cmd.run(op);
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				return " Image has been added";
			}
		}
		return  "Image file missing.";
	}
	@Security.Authenticated(Secured.class) 
	@With(AuthAdmin.class)
   	 public Result adminMode()
		{
		 return ok(adminMode.render(getUserFromSession()));
		}
	@Security.Authenticated(Secured.class)
	@With(AuthAdmin.class)
	 public Result adminMessages()
	    {
		 List<ContactUs> messages = new ArrayList<ContactUs>();
		 messages = ContactUs.findAll();
		 return ok(adminMessages.render(messages,getUserFromSession()));
		}
	@Security.Authenticated(Secured.class) 
	public Result deleteGame(Integer id)
	{
		Games.find.ref(id).delete();
		flash("success","Game has been deleted.");
	
		return redirect(routes.HomeController.viewGames());
	}
	@Security.Authenticated(Secured.class)
	@With(AuthAdmin.class)
	@Transactional
	public Result updateGame(Integer id)
	{
		Games game;
		Form<Games> gameForm;

		try {
			game = Games.find.byId(id);

			gameForm = formFactory.form(Games.class).fill(game);
		} catch(Exception ex)
		{
			return badRequest("ERROR");
		}
		return ok(addGame.render(gameForm,getUserFromSession()));
	}
}
