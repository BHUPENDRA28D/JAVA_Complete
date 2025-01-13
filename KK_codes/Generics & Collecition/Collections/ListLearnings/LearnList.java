package Collections.ListLearnings;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LearnList {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>(); //dynamic in nature...
//        List<Integer> list2 = new ArrayList<>(); //dynamic in nature...

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list.get(2));
        System.out.println(list.set(1,23)); // change in index 1.
        list.add(3,32);

        list.remove(4);

        System.out.println(list);


        List<Integer> subList = list.subList(1,3);
        System.out.println(subList);
//
//        list2.add(23);
//        list2.add(10);
//        list2.add(40);
//        list2.add(25);
//        list2.add(26);
//
////        System.out.println(list);
////        System.out.println(list.size());
////        System.out.println(list.contains(20));
////
////
//////        list.remove(1);
////        list.remove(Integer.valueOf(30));
////
//////        list.addAll(list2);
//        System.out.println(list);
//        System.out.println(list2);
//
//
////        System.out.println(list);
////        list.removeAll(list2);
//
//
//        list.retainAll(list2);
//        System.out.println(list);


    }
}
