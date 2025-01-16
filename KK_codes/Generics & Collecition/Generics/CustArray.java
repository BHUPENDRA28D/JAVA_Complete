package Generics;

import java.util.ArrayList;

public class CustArray {


    public static void main(String[] args) {
         ArrayList list = new ArrayList();
//        list.add(45);
//        list.add(23);
//        list.remove(0);
//        list.get(0);
//        list.set(1,4567);
//        list.size();
//        list.isEmpty();


//  Generic help in assigning parameterized type..
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("dfghi");
        list2.add("dfghi");
        list2.add("dfghi");
        list2.add("dfghi");
        System.out.println(list2);
    }
}
