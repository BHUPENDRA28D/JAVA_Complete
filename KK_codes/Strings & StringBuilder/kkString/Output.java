package kkString;

import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
//        System.out.println(56);
//        Integer nums =  Integer.valueOf(96);
//        System.out.println(nums.toString());


        //System.out.println("Kunal");
//        System.out.println(Arrays.toString(new int []{2,3,4,5}));
//        String name = null;
//
//        System.out.println(name);
//
//
//        System.out.printf("pei: %.3f", Math.PI);
//        System.out.printf("\nHi i am %s and work in %s\n","Bhupendra", "Google");
//        System.out.println("a"+"b");
//        System.out.println('v'+'a');

//        StringBuilder builder = new StringBuilder();
////        for(int i =0;i<26;i++){
////            char ch = (char)('a'+i);
////        }
////        System.out.println(builder.toString());

        String str = "abcdcba";
        System.out.println(palindrome((str));
    }

    static boolean palindrome(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if (start != end) {
                return false;
            }
        }
        return true;
    }

}

