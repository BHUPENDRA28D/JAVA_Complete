package Assignment;
import  java.time.LocalDateTime;
import  java.time.format.DateTimeFormatter;
import java.lang.Math;
public class A11 {
    public void drivere(){

        A11.datePrint();
        A11.timePrint();
        A11.printRandom();
        A11.roots(1,-5,6);


    }

    public static void datePrint(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Date : "+formatter.format(now));

    }
    public static void timePrint(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("hh::mm::ss");
        System.out.println("Time : "+formatTime.format(now));
    }
    public static void printRandom(){
        double d1 = Math.random();
       d1 = d1*100+100;
      System.out.println((int)d1);

    }
    public static void roots(int a,int b,int c ){
        double x1,x2;
         x1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
         x2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
         System.out.println("Root 1 : "+x1+"\nRoot 2: "+x2);


    }



}
