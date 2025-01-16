package com.tutorial;

import java.util.Scanner;

public class Example {

    public static void main(String[] args) {

//        Largest largest = new Largest();
//        largest.findLargestNo();


//        Fabinacci fb = new Fabinacci();
//        fb.fabonacci();

//        CountOccurences countOccurences = new CountOccurences();
//        countOccurences.getCount(1385757879);

//        Reverse reverse = new Reverse();
//        reverse.reverse(234892);

        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n : ");
//        int n = sc.nextInt();
//
//        IsPrime prime = new IsPrime();
//      System.out.println(prime.isPrime(n));

        ArmstrongNo a = new ArmstrongNo();
//        System.out.println(" "+ a.isarm(n));

        for(int i =100; i<10000;i++){
            if(a.isarm(i)){
                System.out.println(i+"  ");
            }
        }
    }
}
