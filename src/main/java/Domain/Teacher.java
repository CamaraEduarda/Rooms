package Domain;

import Enum.UserType;

public class Teacher extends User{
  private String id;
  
  public Teacher(String name, String lastname, String email, String id){
    super(name, lastname, email, UserType.TEACHER);
    this.id = id;
  }

  public String getId() {
    return this.id;
  }
  
}