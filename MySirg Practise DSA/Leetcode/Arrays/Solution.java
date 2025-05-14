package Leetcode.Arrays;

import java.util.Arrays;

public class Solution {


    public static void main(String[] args) {

//        int [] arr = {10,20,30,20,70,70,10,20,10,90,100};

//        fequency(arr);

        int [][] arr={{1,1,0},{1,0,1},{0,0,0}};
        int [][] returnedArray = flipAndInvertImage(arr);

        for(int [] i : returnedArray){
            for(int j: i){
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }

    }

    public static void fequency(int [] nums){
         for(int i =0;i<nums.length;i++){

             int x =nums[i];
             int count =0;

             for(int j =0;j<nums.length;j++){
                 if(nums[i] == nums[j])
                     count++;

             }
             System.out.println("Frequency of "+nums[i]+" = "+count);
         }
    }



    //832. Flip an invert image.
    public static  int[][] flipAndInvertImage(int[][] image) {

        int len = image.length;
        int [][] result = new int[len][len];

        for(int i =0;i<len;i++){
            for(int j =0 ;j<len;j++){
                result[i][j] = image[i][(len-1)-j];

                result[i][j] = (result[i][j] == 1)?0 : 1;
            }
        }
        return result;
    }
}
