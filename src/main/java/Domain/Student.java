package Domain;

import Enum.UserType;

public class Student extends User{
  private String id;

  public Student(String name, String lastname, String email, String id){
    super(name, lastname, email, UserType.STUDENT);
    this.id = id;
  }
  public String getId() {
    return this.id;
  }
  
  
  
}