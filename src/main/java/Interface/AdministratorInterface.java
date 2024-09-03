package Interface; 
import Domain.*;
import Enum.RoomType;

public interface AdministratorInterface{

// CRUD room
  
  void creatRoom(Room room);

  String researchRoom(Room room, int id);

  void updateRoom(Room room, int id, RoomType type, int capacity);
  
  void deleteRoom(Room room);
  

}