package pack1;
import p2.Student;

public class Example {
    public static void main(String[] args) {

         Student s1 = new Student();
         s1.setRollNo(23242);
         s1.setName("Rinki Randi");
         System.out.println("Stundent RollNO : "+s1.getRollNo());
         System.out.println("Stundent Name   : "+s1.getName());
    }
}