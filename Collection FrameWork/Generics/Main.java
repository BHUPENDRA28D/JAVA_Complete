package Generics;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Pair<String,Integer> pair = new Pair<>("Age",30);


        System.out.println(pair.getKey());
        System.out.println(pair.getValue());



 /*       Box<Integer> box = new Box();


        box.setValue(1);
        int i = box.getValue();
        System.out.println(i);
//        int i = (int)box.getValue();
//        String i = (String) box.getValue();


*/
    /*    ArrayList<String> list =  new ArrayList<>();  //not type safe here objects are stored and to return values we have to manually typecast the values..
        list.add("Hello");

        list.add("Bhupendra");

        list.get(1);
//        list.add(1234);
//        list.add(12.34);
//
//        String str = (String) list.get(0);
//
//        Object o = (Object) list.get(2);
//
//        String integer = (String) list.get(1);*/

    }
}
