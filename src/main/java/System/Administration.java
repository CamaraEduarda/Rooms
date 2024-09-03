package System;

import Interface.AdministratorInterface;
import java.util.ArrayList;
import Domain.*;
import Enum.RoomType;

/**
 * Administration
 */
public class Administration implements AdministratorInterface {

  private ArrayList<Room> roomes = new ArrayList<Room>();;
  
  public void creatRoom(Room room) {
    if(room != null){
      roomes.add(room);
    }

  }
  public String researchRoom(Room room, int id) {
    if(room.getId() == id){
      return "Sala existente";
    }
    return "Sala não existente";

  }
  
  public void updateRoom(Room room, int id, RoomType type, int capacity) {
    roomes.remove(room);
    roomes.add(new Room(id, type, capacity, true));

  }

  
  public void deleteRoom(Room room) {
   roomes.remove(room);

  }

  public void exibirSalas(){
    for (Room room : roomes){
      System.out.println("Room "+room.getType() + ":");

    }
  }
  

  
 
}
