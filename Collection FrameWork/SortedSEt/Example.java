package SortedSEt;

import java.util.SortedSet;
import java.util.TreeSet;

public class Example {
    public static void main(String[] args) {


        /*SortedSet Interface have 6 methods..

        1. first()  ->Returns first element of set.
        2. last()    ->Returns last element of set.
        3. headSet(E to Element) ->Returns  a view of the portionof this set whose element are strictly less than toElement.
        4. tailSet(E to Element) ->Returns  a view of portion of  this set whose element are greater than equalto fromElement.
        5. subSet(E to Element)  ->
        6. comparator()
         */

 /*       TreeSet treeSet = new TreeSet<>();

        treeSet.add("D");
        treeSet.add("A");

        treeSet.add("d");
        treeSet.add("x");

        treeSet.add("B");
        treeSet.add("C");

        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.headSet("C"));
        System.out.println(treeSet.tailSet("D"));
        System.out.println(treeSet.subSet("B","d"));
        System.out.println(treeSet.comparator()); */

        Example2.demo();
    }
}

class Example2{

    public static void demo(){

        TreeSet<String> ns = new TreeSet<>();

        ns.add("D");
        ns.add("F");
        ns.add("E");
        ns.add("B");
        ns.add("A");
        ns.add("A");
        ns.add("A");
        ns.add("C");

        System.out.println(ns);

        System.out.println(ns.ceiling("B"));
        System.out.println(ns.floor("G"));

        System.out.println(ns.higher("C"));
        System.out.println(ns.lower("D"));

        System.out.println(ns.pollFirst());
        System.out.println(ns.pollLast());




    }
}
