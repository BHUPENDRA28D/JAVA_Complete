package Vector;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
    //   Vector<Integer> vector = new Vector<>(5,3);
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(13);

        System.out.println(vector);
        System.out.println(vector.capacity());


        LinkedList ll = new LinkedList();
        ll.add(34);
        ll.add(34);
        ll.add(34);
        Vector<Integer> vector1 = new Vector<>(ll);
        System.out.println(vector1);

        ll.isEmpty();

        //Enumeration only avial for legecy classes like vector & stack..
        Enumeration e = vector.elements();

        while(e.hasMoreElements()){
            Integer integer = (Integer) e.nextElement();
            System.out.println(integer+25);
        }

/*        Vector<Integer> list = new Vector<>();

        Thread t1 = new Thread(()->{
            for(int i =0; i<1000;i++)
                list.add(i);
        });

        Thread t2 = new Thread(()->{
            for(int i =0; i<1000;i++)
                list.add(i);
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Size of List : "+list.size());*/


    }

}
