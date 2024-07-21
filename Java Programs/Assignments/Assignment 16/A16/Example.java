package  A16;

import java.time.LocalDate;
import java.util.Scanner;

public class Example {
    public static void main(String [] args){
 //Question 1.
   /*    Employee e1 = new Employee();
       e1.input();
       e1.display();

    */

//Question 3
     /*   Admin a = new Admin();
        a.setName("Bhupendra Makode");
        a.setAdminData("The Admin is the teacher is the Maths Teacher");
        System.out.println("\nAdmin Name : " +a.getName()+"\nAdmin Details : " +a.getAdminData());

        Learner l =new Learner();
        l.setActive_time(254);
        l.setActive(true);
        System.out.println("Active Time  : " +l.getActive_time()+"\nStatus  : " +l.isActive()); */

        //Question 4/

  /*       ThickCircle c = new ThickCircle();
        c.setRadius(5);
        c.setThickness(2);
        System.out.println("Hollow Area : "+c.getHallowArea()+"\nThickness Area : "+c.getThicknessArea());*/


        //Question 5
        DetailedContact dc = new DetailedContact();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : " );
        dc.setName(sc.nextLine());

        System.out.print("Enter Contact : ");
        dc.setContact(sc.nextLong());
        sc.nextLine(); // Consume the newline character

        System.out.print("Enter email : ");
        dc.setEmail(sc.nextLine());

        System.out.print("Enter DOB (yyyy-MM-dd): ");
        String dobInput  = sc.nextLine();
        dc.setDob(LocalDate.parse(dobInput));

        //Print
        System.out.println("Name : "+dc.getName()+"\nContact : "+dc.getContact()+"\nEmail : "+dc.getEmail()+"\nDOB : "+dc.getDob());

    }

}
