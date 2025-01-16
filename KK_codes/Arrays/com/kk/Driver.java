package com.kk;

import java.util.Arrays;
import java.util.Scanner;

public class Driver {

    public static void runDriver(){
        Scanner sc = new Scanner(System.in);

       ArrayTutorial arrayTutorial =new ArrayTutorial();
      arrayTutorial.input();
      arrayTutorial.display();
//      System.out.println(" "+arrayTutorial.findNumbers());


//       int arr[] =new int[5];

//        for(int i =0;i<arr.length;i++){
//            System.out.print("Enter element 0 : ");
//            arr[i] = sc.nextInt();
//        }
/*           ChangeIndex changeIndex = new ChangeIndex();
        changeIndex.input();
        changeIndex.display();
        changeIndex.change(3,67);
        changeIndex.display();*/

//    MultiDemmensionalArray md = new MultiDemmensionalArray();
//    md.input();
//    md.display();
//   System.out.println("item found at : "+ md.search(18));


    }
}
class ArrayTutorial{
    Scanner sç= new Scanner(System.in);

     int [] arr = new int [5];

  void input() {
      System.out.println("Enter elements of array: ");
   for (int i =0; i<arr.length;i++){
       arr[i] = sç.nextInt();

   }}

    void display(){

//    for(int i : arr){
//        //for every element in array Print element.
//       System.out.print(i+" ");
//   }

        System.out.print(Arrays.toString(arr));
  }

    public int findNumbers() {
        int noCount =0;
        for(int i =0;i<arr.length;i++){
            int temp = arr[i];
            int count =0;

            while(temp!=0){
                temp =temp/10;
                count++;
            }
            if(count%2 == 0){
                noCount++;
            }

        }
        return noCount;
    }
}




class ChangeIndex extends ArrayTutorial {

    @Override
    void input() {
        super.input();
    }

    @Override
    void display() {
        super.display();
    }

    public  void  change(int n ,int x){
        arr[n] = x;

    }
}


class MultiDemmensionalArray{
    Scanner sc =new Scanner(System.in);

    int [] [] arr = new int[3][3];

//    int [][] arr2D={
//            {1,2,3},
//            {4,5,},
//            {7,8,9,10}
//    };

    //input
    public void input(){
        for(int row =0;row< arr.length;row++){
            for(int col =0; col< arr[row].length;col++){
                System.out.print("Enter the element for row "+row+" column "+ col+" : ");
                arr[row][col] = sc.nextInt();
            }
            System.out.println();

        }
    }
    public void display(){
//        for(int row =0;row< arr.length;row++){
//            for(int col =0; col< arr[row].length;col++){
//                System.out.print(arr[row][col]+"  " );
//
//            }
//            System.out.println();
//
//        }
        for(int row =0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }
 }

 public int[] search(int item){
        if(arr.length ==0)
            return new int[]{-1,-1};

        for(int row =0; row <arr.length; row++){
            for(int col =0;col<arr[row].length;col++){
               if (arr[row][col]==item){
                   return new int[]{row ,col};
               }
            }
        }
     return new int[]{-1,-1};

 }



}


