package kkRecursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RecursionArray {

    public static void main(String[] args) {

//        int [] nums = {3,2,96,18,9,96,98,67,45,96,34};
        int [] nums = {6,18,25,39,48,78,96,128,135};

//      System.out.println( isSorted(nums,0));
//      System.out.println( "Item found on index : "+linearSearch(nums,96,0));
//
//     ArrayList<Integer> list = new ArrayList<>();
//
//      findAllIndex(nums,96,0);
//      System.out.println(list);

        System.out.println("Item found on index "+binarySearch(nums,78,nums.length,0));

    }

    public static boolean isSorted(int[] nums, int index) {
        // Base case: If we have reached the end of the array, it is sorted
        if (index >= nums.length - 1) {
            return true;
        }
        // If the current element is greater than the next element, it's not sorted
        if (nums[index] > nums[index + 1]) {
            return false;
        }
        // Recursively check the rest of the array
        return isSorted(nums, ++index);
    }

    //Liner Search
    public static int linearSearch(int []arr,int item,int index) {
        if (index > arr.length)
            return -1;
        if (arr[index] == item)
            return index;
        return linearSearch(arr, item, ++index);

    }


    // all index of duplicate number...
//    static ArrayList<Integer> list = new ArrayList<>();
//    public static void findAllIndex(int []arr,int item,int index) {
//        if (index == arr.length)
//            return;
//        if (arr[index] == item)
//             list.add(index);
//
//        findAllIndex(arr, item, ++index);
//
//    }


//    // all index of duplicate number...
//
//    public static ArrayList<Integer> findAllIndex(int []arr,int item,int index,ArrayList<Integer> list) {
//
//        if (index == arr.length)
//            return list;
//        if (arr[index] == item)
//            list.add(index);
//
//       return findAllIndex(arr, item, ++index,list);
//
//    }


    public static ArrayList<Integer> findAllIndex(int []arr,int item,int index) {
      ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length)
            return list;
        if (arr[index] == item)
            list.add(index);

       ArrayList<Integer> ansFromBelowCall =  findAllIndex(arr, item, ++index);

       list.addAll(ansFromBelowCall);
       return list;
    }


    public static int binarySearch( int []arr,int target,int e,int s){
        int m = s+(e-s)/2;

        if(s>e){
            return -1; //Base case : Element not found.
        }
        if(arr[m] == target)
            return m;
        if(arr[m]< target){
            s =m+1;
        }
        else{
            e =m-1;
        }
        return binarySearch(arr,target,e,s);
    }
}
