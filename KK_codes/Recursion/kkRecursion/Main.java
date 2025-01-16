package kkRecursion;

public class Main
{

    public static void main(String[] args) {

//       System.out.println( fabonaci(6));

       int [] arr = new int[]{12,34,56,78,99,95};
//       int target = 95;
//
//       System.out.println(binarySearch(arr,target,0,arr.length));





//       printNatural(10);
//       System.out.println();
//       printNaturalReverse(10);
//
//
////       System.out.println("\nMultiple of 5 no. is "+multiple(5));
//        System.out.println("\nSum of the digits of number : "+sumOfDigits(1342));
//        System.out.println("\nProduct of the digits of number : "+productOfDigits(1342));

//        passNum(5);

        System.out.println(reversDigit(4281,0));
        System.out.println(isPalandrome(12356));
        System.out.println("The No of zero : " + countNoOfZero(0012005420,0));
    }





    //Binary Search

    static int binarySearch(int [] arr, int target, int s,int e){

     if(s>e){
         return -1;
     }
     int m = s+(e-s)/2;
     if(arr[m] == target){
         return m;
     }
     if(arr[m]>target){
      return     binarySearch(arr,target,s,m-1);
     }
     return binarySearch(arr,target,m+1,e);


    }
    //FABONAACI SERIES

    static  public int  fabonaci(int n){
        if(n<2)
            return n;
        return fabonaci(n-1)+ fabonaci(n-2);

    }

    //Write a recursive function to print first N natural numbers
    static  void printNatural(int n ){

        if(n>1)
            printNatural(n-1);
             System.out.print(" "+n);

    }

    //Write a recursive function to print first N natural numbers reversily.
    static  void printNaturalReverse(int n ){
           if(n>0){
               System.out.print(" "+n);
               printNaturalReverse(n-1);
           }
    }

    //factorial of n
    static int multiple(int n ){
        int ans=1;
        if(n==1){
            return 1;
        }

        ans = n* multiple(n-1);
        return ans;
    }

//    Sum of digits
    static int sumOfDigits(int n){
        int sum =0;
        if(n==0)
            return 0;

        return sum =n%10 + sumOfDigits(n/10);
    }

    static int productOfDigits(int n){
        int product =1;
        if(n==0)
            return 1;

        return product=n%10 *productOfDigits(n/10);
    }


    // first n odd no
    static  void oddNumber(int n){
        if(n%2==0){

        }
    }


    //pasing no

    static void passNum(int n){
        if(n==0){
            return;}
        System.out.println(n);
        passNum(--n);
    }

    static int  reversDigit(int n,int rev){

        if(n ==0)
            return rev;

        rev =rev*10+(n%10);

        return reversDigit(n/10,rev);



        }

        static boolean isPalandrome(int n){

           if(reversDigit(n,0) == n){
               return true;
           }
           else return false;
        }

        static int countNoOfZero(int n ,int count){

          if(n ==0){
              return count;
          }
          if(n%10 ==0){
             count++;
          }
          return countNoOfZero(n/10,count);

        }
}
