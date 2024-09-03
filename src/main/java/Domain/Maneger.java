package Domain;

import Enum.UserType;

public class Maneger extends User{
  private String id;

  public Maneger(String name, String lastname, String email, String id){
    super(name, lastname, email, UserType.MANAGER);
    this.id = id;
  }
  
  public String getId() {
    return this.id;
  }

 
}