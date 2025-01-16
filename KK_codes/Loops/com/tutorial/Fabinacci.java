package com.tutorial;

import java.util.Scanner;

public class Fabinacci {
    private int a=0 ,b=1,n;
    int count =2;
    Scanner sc =new Scanner(System.in);

    void fabonacci(){
        System.out.println("Enter no. of fabbonaci no. to be printed: ");
        n= sc.nextInt();

          while (count<=n){
              int temp=b;
              b = b+a;
              a = temp;
              count++;

              System.out.println(b);
          }
    }


}
