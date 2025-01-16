package kkRecursion;

import javax.xml.crypto.dsig.spec.XPathType;
import java.util.Arrays;

public class Recursion_Pattern_Sorts {
    public static void main(String[] args) {



//        pattern(4,0);

        int nums[] ={50,3,1,60,65,45,90,13,67};
        System.out.println(Arrays.toString(nums));

        bubbleSort(nums,nums.length-1,0);

//
//       System.out.println(minIndex(nums,1,0));
////       selectionSort(nums,0);
//        selectionSorT(nums, args.length,0,0);

//        int [] ans = mergeSort(nums);
//        System.out.println(Arrays.toString(ans));

//       quickSort(nums,0,nums.length-1);
//        sortQuick(nums,0,nums.length-1);
       System.out.println(Arrays.toString(nums));


    }


//    public static void pattern(int n){
//        for(int i=0;i<n;i++){
//            for(int j =0;j<n-i;j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//    }

    public static void pattern(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            pattern(r,c+1);

        }else{
            System.out.println();
            pattern(r-1,0   );
        }

    }

    public static void bubbleSort(int[] arr, int r,int c){
        if(r==c){
            return;
        }
        if (c<r){
            if(arr[c]>arr[c+1]){
                int t = arr[c];
                arr[c] =arr[c+1];
                arr[c+1] =t;
            }
           bubbleSort(arr,r,c+1);
        }

            bubbleSort(arr,r-1,c);
    }




  public static int minIndex(int [] arr,int index,int min){
        if(index ==arr.length)
            return min ;
        if(arr[index]<arr[min]){
            min =index;
        }
        return  minIndex(arr,index+1,min);
  }

  public static void selectionSort(int[]arr, int index){
        if(index ==arr.length)
            return;

        int minIndex = minIndex(arr,index,index);

        int t = arr[index];
        arr[index] = arr[minIndex];
        arr[minIndex] = t;

        selectionSort(arr,index+1);
  }

  static void selectionSorT(int[] arr, int r,int c, int max){

      if(r==0)
          return;
      if(c<r) {
          if (arr[c] > arr[max]) {
              selectionSorT(arr, r, c + 1, c);
          } else {
              selectionSorT(arr, r, c + 1, max);
          }
      }
      else{
              int temp = arr[max];

              arr[r-1] =arr[max];
              arr[max] = temp;

          }selectionSorT(arr,r-1,0,0);
      }


    public static int[] mergeSort(int[] arr) {
        if (arr.length < 2) { return arr; }
        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right); }



    private static int[] merge(int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
         int[] original = new int[left.length + right.length];

         // Merge from left and right array to the original array

        while (i < left.length && j < right.length)
        {
            if (left[i] < right[j]) {
            original[k++] = left[i++];
         } else { original[k++] = right[j++]; }
        }
        
        // Copy any remaining elements from the left array
        while (i < left.length) {
            original[k++] = left[i++];
        }
        // Copy any remaining elements from the right array
        while (j < right.length) {
            original[k++] = right[j++];
        }
        return original; }



    //Qick sort algo
    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            // Partition the array and get the pivot index
            int pivot = partition(arr, left, right);

            // Recursively sort the left and right subarrays
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = left; // Use the leftmost element as the pivot
        int temp;

        while (left < right) {
            // Move the right pointer until an element smaller than the pivot is found
            while (arr[right] >= arr[pivot] && left < right) {
                right--;
            }
            if (left < right) {
                temp = arr[pivot];
                arr[pivot] = arr[right];
                arr[right] = temp;
                pivot = right;
            }

            // Move the left pointer until an element larger than the pivot is found
            while (arr[left] <= arr[pivot] && left < right) {
                left++;
            }
            if (left < right) {
                temp = arr[pivot];
                arr[pivot] = arr[left];
                arr[left] = temp;
                pivot = left;
            }
        }

        return pivot; // Return the final position of the pivot
    }


    //quick sort kunal kushwaha
    public static void sortQuick(int[] arr, int low, int high) {
        if (low >= high) {
            return; // Base case: Stop recursion when the subarray has 1 or no elements
        }

        int s = low;
        int e = high;
        int mid = s + (e - s) / 2; // Calculate the middle index
        int pivot = arr[mid]; // Use the middle element as the pivot

        // Partitioning logic
        while (s <= e) {
            // Find elements out of place
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }

            // Swap elements if needed
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        // Recursively sort the left and right subarrays
        sortQuick(arr, low, e);
        sortQuick(arr, s, high);
    }



}