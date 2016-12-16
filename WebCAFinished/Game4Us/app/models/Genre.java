package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;



@Entity
@Table(name="GENRE")

public class Genre extends Model
{
    //Variables
    @Id
    private Integer GenreId;
    @Constraints.Required
    private String GenreName;
    @OneToMany
    private List<Games> gameList = new ArrayList<>();
    //Constructors
     //Default
    public Genre()
    {

    }
    public Genre(Integer GenreId,String GenreName,List<Games> gameList)
    {
        this.GenreId = GenreId;
        this.GenreName = GenreName;
        this.gameList = gameList;
    }
    //Methods
     //Getters
    public Integer getGenreId()
    {
        return GenreId;
    }
    public String getGenre()
    {
        return GenreName;
    }
    public List<Games> getGames()
    {
        return gameList;
    }
    //Setter
    public void setGenreId(Integer GenreId)
    {
        this.GenreId = GenreId;
    }

    //Static Genric methods
    public  static Finder<Integer,Genre> find = new Finder<Integer,Genre>(Genre.class);

    //Finds all products im database with the selected Genre
    public static List<Genre> findAll()
    {
        return Genre.find.where().orderBy("genre_name desc").findList();
    }
    public static Map<String,String> options() 
    {
        LinkedHashMap<String,String> options = new LinkedHashMap<>();

        for(Genre genre: Genre.findAll())
        {
            
            options.put(genre.getGenreId().toString(),genre.getGenre());
        }
        return options;
    }



}