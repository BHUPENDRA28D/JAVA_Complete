package Collections.LearnSets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

    public static void main(String[] args) {

//        Set<Integer> set = new HashSet<>();O(1).
//
//        set.add(10);
//        set.add(20);
//        set.add(90);
//        set.add(30);
//        set.add(20);
//
//
//        System.out.println(set);
//
//
//        Set<Integer> set1 = new LinkedHashSet<>();//O(n)
//
//        set1.add(10);
//        set1.add(20);
//        set1.add(90);
//        set1.add(30);
//        set1.add(20);
//
//
//        System.out.println(set1);
        Set<Integer> set = new TreeSet<>(); // Implement binarySearch tree internaly..//O(logN).
        set.add(10);
        set.add(20);
        set.add(90);
        set.add(30);
        set.add(20);


        System.out.println(set);


   }
}
