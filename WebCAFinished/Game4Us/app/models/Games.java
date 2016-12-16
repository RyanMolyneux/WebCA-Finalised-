package models;


import java.util.*;
import javax.persistence.*;


import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;


@Entity
@Table(name="GAMES")
public class Games extends Model
{
	
	 @Id
	 private Integer Id;
	 @Constraints.Required
	 private String GameTitle;
	 @Constraints.Required
	 private String GameDetails;
	 @Constraints.Required
	 private String GameRating;
	 @Constraints.Required
	 private String GameDevs;
	 @Constraints.Required
	 private String GameRelease;
	 @Constraints.Required
	 private double GamePrice;
	 private boolean xboxOne;
	 private boolean ps4;
	 private boolean pc;

	 //Mappings
	 @ManyToOne
	 private Genre genre = new Genre();
	
	//Constructors
	 //Default
	public Games() {
	}
	 //Overloaded
	public Games(Integer Id,String GameTitle,String
	GameDetails,String GameRating,String GameDevs,String GameRelease,double GamePrice,boolean xboxOne,boolean ps4,boolean pc,Genre genre){
	 this.Id = Id;
	 this.GameTitle = GameTitle;
	 this.GameDetails = GameDetails;
	 this.GameRating = GameRating;
	 this.GameDevs = GameDevs;
	 this.GameRelease = GameRelease;
	 this.GamePrice = GamePrice;
	 this.xboxOne = xboxOne;
	 this.ps4 = ps4;
	 this.pc = pc;
	 this.genre = genre;
	}
	//Methods
	 //Static methods
	public static Finder<Integer,Games> find = new Finder<Integer,Games>(Games.class);
	
	public static List<Games> findAll() {
	return Games.find.all();
	}	
	 //Getters
	
	public Integer getId()
	{
	 return Id;
	}
	public String getGameTitle() {
	 return GameTitle;
	}
	public String getGameDetails()
	{
	 return GameDetails;
	}
	public String getGameRating()
	{
	return GameRating;
	}
	public String getGameDevs()
	{
		return GameDevs;
	}
	public double getGamePrice()
	{
	 	return GamePrice;
	}
	public String getGameRelease()
	{
		return GameRelease;
	}
	public boolean getXboxOne()
	{
	 	return xboxOne;
	}
	public boolean getPs4()
	{
	 	return ps4;
	}
	public boolean getPc()
	{
		return pc;
	}
	public Genre getGenre()
	{
		return genre;
	}
	//Setters
	public void setId(Integer Id)
	{
		this.Id = Id;
	}
	public void setGameTitle(String GameTitle) {
		this.GameTitle = GameTitle;
	}
	public void setGameDetails(String GameDetails)
	{
		this.GameDetails =  GameDetails;
	}
	public void setGameRating(String GameRating)
	{
		this.GameRating = GameRating;
	}
	public void setGameDevs(String GameDevs)
	{
		this.GameDevs = GameDevs;
	}
	public void setGameRelease(String GameRelease)
	{
		this.GameRelease = GameRelease;
	}
	public void setGamePrice(double GamePrice)
	{
		this.GamePrice = GamePrice;
	}
	public void setXboxOne(boolean xboxOne)
	{
		this.xboxOne = xboxOne;
	}
	public void setPs4(boolean ps4)
	{
		this.ps4 = ps4;
	}
	public void setPc(boolean pc)
	{
		this.pc = pc;
	}
	public void setGenre(Genre genre)
	{
		this.genre = genre;
	}

	
}
