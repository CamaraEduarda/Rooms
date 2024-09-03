package Domain;
import Enum.UserType;

public class User {

  private String name;
  private String lastname;
  private String email;
  private UserType usertype;
  

  public User(String name, String lastname, String email, UserType userType){
    this.name = name;
    this.lastname = lastname;
    this.email = email;
    this.usertype = userType;
  }
  
  public String getName() {
    return this.name;
  }
  public String getLastname() {
    return this.lastname;
  }

  

}