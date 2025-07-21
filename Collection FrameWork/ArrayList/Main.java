package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        ArrayList<Integer> list
                = new ArrayList<>(11);

        System.out.println(list.size());

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


     list.trimToSize();



/* Object class ArrayList...
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

    }
}
