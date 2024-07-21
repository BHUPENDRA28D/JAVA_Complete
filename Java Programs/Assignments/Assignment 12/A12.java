import java.awt.*;
import  java.util.Scanner;
public class A12 {
    public  void driver(){
        printNnum();
        printReverse();
        printOdd();
        printOddReverse();
        printEven();
        printEvenReverse();
        printSqaure();
        printCube();
        printTable();

    }


//    Question 1.
    public void printNnum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the n : ");
        int x = sc.nextInt();
        for(int i =1;i<=x;i++){
            System.out.print(" "+i);
        }
    }

//    Question 2.
    public void printReverse( ){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the n : ");
        int x = sc.nextInt();
        for(int i=x; i>0;i--)
            System.out.print(" "+i);
    }
//    Question 3.
    public void printOdd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the n : ");
        int x = sc.nextInt();
        System.out.print(" Odd:: ");
        for(int i=0;i<=x;i++){
             System.out.print(" "+(2*i+1));
        }
    }

    //    Question 4.
    public void printOddReverse(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the n : ");
        int x = sc.nextInt();
        System.out.print(" Odd:: ");
        for(int i=x;i>0;i--){
             System.out.print(" "+(2*i+1));
        }
    }
    //    Question 5.
    public void printEvenReverse(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the n : ");
        int x = sc.nextInt();
        System.out.print(" Even :: ");
        for(int i=x;i>0;i--){
             System.out.print(" "+(2*i));
        }
    }

    //    Question 6.
    public void printEven(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the n : ");
        int x = sc.nextInt();
        System.out.print(" Even :: ");
        for(int i=1;i<=x;i++){
             System.out.print(" "+(2*i));
        }
    }

    public  void printSqaure(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the n : ");
        int x = sc.nextInt();
        System.out.print("Sqaure : : ");
        for(int i = 1;i<=x;i++){
            System.out.print("  "+i*i);
        }
    }


    public  void printCube(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the n : ");
        int x = sc.nextInt();
        System.out.print("Cube : : ");
        for(int i = 1;i<=x;i++){
            System.out.print("  "+i*i*i);
        }
    }

    public void printTable ( ){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the n : ");
        int x = sc.nextInt();
        System.out.println("Table of "+x);

        for(int i=1;i<=10;i++){
            System.out.println(""+x+" x "+i+" = "+x*i);
        }
    }



}
