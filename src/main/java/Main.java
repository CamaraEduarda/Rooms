import Domain.Room;
import Domain.Student;
import Domain.Teacher;
import Enum.RoomType;
import Enum.UserType;
import System.Administration;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Administration adm = new Administration();

    Student aluno = new Student("Aluno", "Aluno", "qpmzj@example.com", "STUDENT");
    Student aluno2 = new Student("Aluno2", "Aluno2", "qpmzj@example.com", "STUDENT");

    Teacher professor = new Teacher("Professor", "Professor", "qpmzj@example.com", "TEACHER");

    Room sala1 = new Room(1, RoomType.CLASSROOM, 30, true);
    Room sala2 = new Room(2, RoomType.LABORATORY, 30, true);
    Room sala3 = new Room(3, RoomType.AUDITORIUM, 30, true);


    adm.creatRoom(sala1);
    adm.creatRoom(sala3);
    
    
    adm.exibirSalas();
 
    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}