package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Exercise {
    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<>();

        arrList.add(28);
        arrList.add(28);
        arrList.add(20);
        arrList.add(14);
        arrList.add(2);
        arrList.add(12);
        arrList.add(30);

        System.out.println(arrList);

        Iterator iterator = arrList.iterator();
        while(iterator.hasNext()){
           Integer i = (Integer) iterator.next();

            if(i>10 && i<21)
                iterator.remove();
        }

        System.out.println(arrList);
        // Iterate all arraylist.
        for(int i : arrList){
            System.out.println(" "+i);
        }

        arrList.addFirst(31);

//        System.out.println(arrList.get(5));


                arrList.remove(2);

       if(arrList.contains(14)){
           System.out.println("Found Element");
    }else
           System.out.println("Not found element");

        Collections.sort(arrList);
        System.out.println(arrList);

        Collections.shuffle(arrList);
        System.out.println(arrList);



    }
}
