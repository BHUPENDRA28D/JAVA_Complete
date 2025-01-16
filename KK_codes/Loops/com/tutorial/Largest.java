package com.tutorial;

import java.util.Scanner;

public class Largest {
    void findLargestNo(){
    // Create a new Scanner object
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number:");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int max = 0;
    // int max = Math.max(Math.max(a, b), c);
    // System.out.println("Max = "+max);

        if (a > b && a > c) {
        max = a;
    } else if (b > c) {
        max = b;
    } else {
        max = c;
    }
        System.out.println("Max : " + max);
}
}

class ArmstrongNo{
    public  boolean isarm(int n){
        int temp =n;
        int rem =0;
                int sum=0;
        while(temp!=0){
            rem  = temp%10;
            temp/=10;
            sum +=(rem*rem*rem);
        }
        return(sum == n)?true:false;
    }


}