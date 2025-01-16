package com.kk;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    Scanner sc = new Scanner(System.in);

    public int []arr = new int[6];

    public void input(){int i =0;
        while(i<arr.length){
            System.out.print("Enter element "+i+" : ");
            arr[i] = sc.nextInt();i++; }}


    public void display(){
        System.out.println(Arrays.toString(arr));
    }

    //quick sort
    public void bubble_sort(){
        for(int i =0;i<arr.length;i++){
            int temp =0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp =arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    //Selection Sort
    public void selection_sort() {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Sorted Array !");
    }

//    Insertion Sort
public void insertion_sort() {
    for (int i = 1; i < arr.length; i++) {
        int temp = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > temp) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = temp;
    }
    System.out.println("Sorted Array!");
}


}
