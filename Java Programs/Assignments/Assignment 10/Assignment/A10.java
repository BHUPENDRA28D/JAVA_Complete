package Assignment;

public class A10 {

//     public  A10(String [] args){
//         //Question 1.
//
//         int a = Integer.parseInt(args[0]);
//         int b = Integer.parseInt(args[1]);
//         int c = a+b;
//         System.out.println("Sum = "+c+"\n");}//
//
//
//
         public  A10(String [] args){
         //Question 2.
             int sum =0;
             int x = Integer.parseInt(args[0]);
             for(int i =0; i<x;i++){
                 sum = sum+i;
             }

             System .out.print("Sum of "+x+" Numbers = "+sum+"\n");
         }



     public  void driver(){

     }



}
