package Collections.ListLearnings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListMore {
    public static void main(String[] args) {
        List<String> fruits = new LinkedList<>();

        fruits.add("Kiwi");
        fruits.add("Papaya");
        fruits.add("Mango");
        fruits.add("Apple");

        List<String> subList = fruits.subList(0,2);
        System.out.println(subList);


        for(int i =0; i<fruits.size();i++){
            System.out.println("Fruits is " + fruits.get(i));
        }
        for(String fruit : fruits){
            System.out.println("for each"+fruit);
        }

        Iterator<String> fe = fruits.iterator();
        while(fe.hasNext()){
            System.out.println(fe.next());
        }

        Iterator<String> fle = fruits.listIterator();
        while(fe.hasNext()){
            System.out.println(fle.next());
        }
    }
}
