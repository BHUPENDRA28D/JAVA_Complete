package String;

import java.util.Arrays;

public class String02 {
    public static void main(String[] args) {
//
//        String a ="Kunal";
//        String b ="Kunal";
//        System.out.println(a==b);
//        System.out.println(a.equals(b));


        String a = new String("Kunal");
        String b = new String("Kunal");
        System.out.println(a.equals(b));
        System.out.println(a==b);


        // using the Arrays class toString methode here

        System.out.println(Arrays.toString(new int []{2,4,5,6}));
        Integer nums = new Integer(45);
        System.out.println( nums.toString());






    }
}
