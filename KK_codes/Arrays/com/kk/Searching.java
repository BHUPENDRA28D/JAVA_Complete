package com.kk;

public class Searching extends Sorting{



    public int linear_search(int data){
        if(arr.length==0)
            return -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == data)
                return i;
        }

          return -1;
    }
// liner search rangeWise.
//    public  int linear_search(int data ,int r1,int r2){
//        if(arr.length==0)
//            return 0;
//        for(int i=r1;i<=r2;i++){
//            if(arr[i] ==data)
//                return i;
//        }
//        return -1;
//    }




    public int binary_search(int data){
        insertion_sort();

        int start =0, end = arr.length-1;



        while(start<=end){
            int mid =start+end/2;

            if(arr[mid] == data){return mid;}
            else if (arr[mid]>data) { start=mid+1;}
            else if (arr[mid]<data) {end=mid-1;}


        }
            return -1;
    }

// Minimum Element.
    public void min_No(){
        int min =arr[0];
        for(int i =1;i<arr.length;i++){
            if(min>arr[i])
                min = arr[i];
        }
        System.out.println("Min element is : "+min);}

    // Maximum Element.
    public void max_No(){
        int max =arr[0];
        for(int i =1;i<arr.length;i++){
            if(max<arr[i])
                max = arr[i];
        }
        System.out.println("Min element is : "+max);
    }

//celling problem
public int ceiling( int target) {
    // Assuming insertion_sort() is defined elsewhere
    insertion_sort();

    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
        int mid = start + (end - start) / 2;

        if (arr[mid] < target) {
            start = mid + 1;
        } else if (arr[mid] > target) {
            end = mid - 1;
        } else {
            return mid;
        }
    }

    return start;
}

}