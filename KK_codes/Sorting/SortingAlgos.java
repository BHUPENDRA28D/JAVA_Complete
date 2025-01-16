import java.util.Arrays;

import static java.util.Collections.swap;

public class SortingAlgos {

    //bubble sort algo

    public void bubbleSort(int [] arr){

        for(int i =0;i<arr.length;i++){
            for(int j=1;j<arr.length-1;j++){
                if(arr[j]<arr[j-1]){
                    int temp =arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }


    public  void selectionSort(int [] arr){
        for(int i =0; i<arr.length;i++){
            int minIndex = i;
            for(int j =i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex])
                    minIndex =j;

                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    public void insertionSort(int [] arr){


        for(int i =1;i<arr.length;i++) {
            int temp = arr[i];
            int j = i - 1;

            while(arr[j]>temp && j>=0){
                arr[j+1] = arr[j];
                j--;
            }

        }
        System.out.println(Arrays.toString(arr));

    }

    public  void cycleSort(int [] arr){
        int i =0;
        while(i<arr.length){
            int correct = arr[i]-1;

            if(arr[i]!= arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }

        }
        System.out.println(Arrays.toString(arr));


    }

    public void swap(int[] arr,int first ,int second ){
         int temp =arr[first];
         arr[first] =arr[second];
         arr[second] =temp;
    }

}
