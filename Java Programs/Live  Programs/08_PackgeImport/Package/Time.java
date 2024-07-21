import java.time.LocalDateTime;
import world.Student;

public class Time{

   public static void main(String [] args){
     //importing the required classes and packages
       LocalDateTime t = LocalDateTime.now();
       System.out.println(" Current Date Time: " +t+"\n");
       Student  s1 = new Student();
       s1.setId(123);
       s1.getId();
    }
}