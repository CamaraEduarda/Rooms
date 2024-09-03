package Domain;

import Enum.RoomType;

public class Room{

// atributos principais da sala 
  private int id;
  private RoomType type;
  private int capacity;
  private boolean isAvailable;


  public Room(int id, RoomType type, int capacity, boolean isAvailable){
    this.id = id;
    this.type = type;
    this.capacity = capacity;
    this.isAvailable = isAvailable;
  }
  
  public int getId() {
    return this.id;
  }
  public RoomType getType() {
    return this.type;
  }
  public int getCapacity() {
    return this.capacity;
  }

  public boolean isAvailable() {
    return isAvailable;
  }

  public void setAvailable(boolean isAvailable) {
    this.isAvailable = isAvailable;
  }

}