package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {

        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

//        A CopyOnWriteArrayList is a thread-safe variant of ArrayList in Java's java.util.concurrent package. It achieves thread safety by creating a fresh copy of the underlying array whenever a modifying operation (like add, set, or remove) is performed.


        //A CopyOnWriteArrayList is a thread-safe variant of ArrayList in Java's java.util.concurrent package. It achieves thread safety by creating a fresh copy of the underlying array whenever a modifying operation (like add, set, or remove) is performed.



        List<String> shopingList = new CopyOnWriteArrayList<>();

        shopingList.add("Mikl");
        shopingList.add("Egg");
        shopingList.add("bread");

        System.out.println("Initial List : "+shopingList);

        for(String item : shopingList){
            System.out.println(item);
            if(item.equals("Egg")){
                shopingList.add("Butter");
                System.out.println("added butter to the list");
            }

        }

        System.out.println("updated list : "+shopingList);
    }
}
