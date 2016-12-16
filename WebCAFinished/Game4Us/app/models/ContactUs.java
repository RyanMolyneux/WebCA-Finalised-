package models;

import java.util.*;
import javax.persistence.*;

import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity
public class ContactUs extends Model {

    @Id
    private int contactID;
    @Constraints.Required
    private String email;
    @Constraints.Required
    private String content;

    public ContactUs(){

    }

    public ContactUs(String email, String content, int contactID){
        this.email = email;
        this.content = content;
        this.contactID = contactID;
    }

    public static Finder<Integer,ContactUs> find = new Finder<Integer,ContactUs>(ContactUs.class);
	
	public static List<ContactUs> findAll() {
	return ContactUs.find.all();
	}	

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }

    public int getContactID(){
        return contactID;
    }

    public void setContactID(int contactID){
        this.contactID = contactID;
    }











}