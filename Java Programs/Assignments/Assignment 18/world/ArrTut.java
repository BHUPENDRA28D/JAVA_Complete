package world;

import java.util.Scanner;

public class ArrTut {

    Scanner sc;

    {
        sc = new Scanner(System.in);
    }

    public void driver() {
        f1();
    }

    public void f1() {
        System.out.println("Enter Size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Element at Index " + i);
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at Index " + i + " is " + arr[i]);
        }
    }
}
