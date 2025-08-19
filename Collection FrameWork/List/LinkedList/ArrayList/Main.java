package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {


    public static void main(String[] args) {

  /*
        ArrayList<Integer> list
                = new ArrayList<>(11);

        System.out.println(list.size());*/

        List<Integer> list =new ArrayList<>();


        list.add(1);
        list.add(5);
        list.add(41);
        list.add(32);
        list.add(80);
        list.add(25);
        list.add(266);
        list.add(12);
        list.add(47);
        list.add(331);
        list.add(55);
        list.add(74);
        list.add(85);
        System.out.println(list.size());


        for(int n: list){
            System.out.print(" "+n);
        }

   list.sort(new MyComparator());
        System.out.println(list);

//     list.trimToSize();



 /*Object class ArrayList...
        ArrayList<Object> objectArrayList = new ArrayList<>();
        objectArrayList.add("hello");
        objectArrayList.add(123);
        objectArrayList.add(null);
        objectArrayList.add(12.342);

        System.out.println("ArrayList : " +objectArrayList);
*/

//        System.out.println("");
//        for(int n: list){
//            System.out.print(" "+n);
//        }


      /*  list.add(2,50);
        list.set(2,30);

        list.remove(6);
        list.removeAll(list);
        list.remove(5);
        System.out.println("\n "+list.size());
        System.out.println(list.get(2));

        System.out.println(list.contains(32));
        System.out.println(list.contains(44));*/


        List<String> words = Arrays.asList("banana", "apple", "date");

//        words.sort(null);

//         words.sort(new StringLenghComprator());
//        System.out.println(words);
    }
}

class StringLenghComprator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return 0;
    }
}

class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
//        return o1-o2;  //asending
        return o2-o1;
    }
}
//5,3 o1-o2;
//3,5 o1-o2;