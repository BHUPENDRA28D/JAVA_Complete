package com.tutorial;

 class CountOccurences {
    int count = 0;
    public void getCount(int n) {

        int temp = n;

        while (temp != 0) {
            int x = temp % 10;
            if (x == 7) {
                count++;
            }
            temp = temp / 10; // Update temp to avoid infinite loop
        }
        System.out.println(count);
    }
}

class IsPrime{

    public  boolean isPrime(int n) {

//        int flag =0;
//
//        for(int i=2;i<=n/2;i++){
//            if(n%i==0){
//                flag =1;
//                break;
//            }
//        }
//        return (flag==1)?false:true;

//        If a number ( n ) is divisible by any number greater than its square root, it must also be divisible by a number smaller than its square root.

        if (n <= 1) return false;
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n; //or simple return true;

    }

}
