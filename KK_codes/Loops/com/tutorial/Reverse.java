package com.tutorial;

public class Reverse {

    public void reverse(int n){

        int temp =n;
        int result = 0;

        while(temp>0){
            int rem = temp%10;
            temp/=10;

            result = result *10+rem;

        }
        System.out.println("result = "+result);
    }

}
