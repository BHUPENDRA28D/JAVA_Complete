package SearchSortPackage;

import java.util.Arrays;
import java.util.Scanner;


public class Driver {

    public static void rundriver(){

//        OrderAgnosticBinarySearch or = new OrderAgnosticBinarySearch();
//        or.input();
//        or.display();
//        System.out.println("Item Found at"+or.orderAgnosticBS(75));

//        PostionInInfinteArray array = new PostionInInfinteArray();
//        array.input();
//        array.display();
//        System.out.println("Item fount at : "+array.setRange(15));

//      Array arr =new Array();
//      arr.input();
//      arr.display();
////      arr.maxProfit();


        Sorting array = new Sorting();
        array.input();
        array.display();
//        array.bubbleSort2();
//        array.selectionSort();
//        array.insertionSort();
        array.cyclicSort();
        array.display();

//
//        System.out.println("Item fount at : "+array.linerSearch(12));
//        array.bubble_Sort();
//        System.out.println("Item fount at : "+array.binarySearch(12));
    }



}

class Array{
    Scanner sc =new Scanner(System.in);


    int size=sc.nextInt();
    public int [] arr=new int[size];

    public void input(){
        for(int i =0;i< arr.length;i++){
            System.out.print("Enter element "+i+" :");

            arr[i] =  sc.nextInt();}
    }
    public void display(){
        System.out.println(Arrays.toString(arr));}

    //linear search
    public int linerSearch(int item){
        for(int i =0;i<arr.length;i++){
            if(arr[i] == item){
                return i;
            }
        }
        return -1;
    }

    // binary_Search
    public  int binarySearch(int item){

        int start =0;
        int end =arr.length-1;

        while(start<=end){
            int mid =start +(end -start)/2;
            if(arr[mid]< item)
                start =mid+1;
            else if (arr[mid]>item)
                end =mid-1;
            else return mid;

        }
        return -1;
    }

//    public int maxProfit() {
//        int buy=0;
//        int max =0;
//        for(int i =0;i< arr.length;i++){
//            if(arr[buy]>arr[i]){
//                buy =i;
//            }
//            int ans = arr[i] -arr[buy];
//            max= Math.max(max,ans);
//
//
//        }
//
//        return max;
//    }


}
class Sorting extends Array{
    //bubble sort
    public  void bubble_Sort(){
        for(int i=0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        System.out.println("Sorted the Array !");
    }


    //onother bubble sort

    public void bubbleSort2() {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                System.out.println("Array is already sorted.");
                break;
            }
        }
        System.out.println("Sorted array.");
    }

     // Selection Sort
    public void selectionSort(){
        for(int i =0;i<arr.length-1;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i]= temp;
                }
            }
        }
        System.out.println("Sorted array by Selection Sort.");

    }

    // insertion Sort

    public  void insertionSort(){

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;

            // Corrected the condition to check j >= 0 first
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = temp;
        }
        System.out.println("Sorted array by Insertion Sort.");

    }

    //Cyclic sort

    public void cyclicSort(){

        int i = 0;


        while(i<arr.length){
            int correctIndes = arr[i] -1;
            if(arr[i] != arr[correctIndes]){
                int temp = arr[correctIndes];
                arr[correctIndes] = arr[i];
                arr[i] =temp;
            }
            else
                i++;
        }
        System.out.println("Cyclic sort Runned:");
    }
}



class OrderAgnosticBinarySearch extends  Array{
    public  int orderAgnosticBS(int target){
        int start =0;
        int end =arr.length-1;

        //find whether the array is sorted in ascending or descending..
        boolean isAsec =arr[start ] < arr[end];

        while(start<=end){
            int mid =start +(end -start)/2;

            if(isAsec){
                if(arr[mid]< target)
                    start =start+1;
                else if (arr[mid]>target)

                end =mid-1;
                else
                    return mid;

         }else {
                if(arr[mid]< target)
                    end =mid-1;
                else if (arr[mid]>target)
                    start =start+1;
                else
                    return mid;
            }

        }
        return -1;
    }


}
