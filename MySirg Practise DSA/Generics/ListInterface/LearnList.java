package Generics.ListInterface;

import java.util.*;

public class LearnList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

//        for(int i =0;i<5;i++){
//            System.out.println("Enter the value of element : "+i );
//            int x = sc.nextInt();
//            list.add(x);
//        }

        list.add(13);
        list.add(21);
        list.add(20);
        list.add(36);
        list.add(56);

        list2.add(1);
        list2.add(2);
        list2.add(3);

        System.out.println(list);

        System.out.println(list.contains(20));
        list.remove(1);
        System.out.println(list);

        list.addAll(list2);
        System.out.println(list);
//        list.removeAll(list2);
//        System.out.println(list);

        //sort the list

        Collections.sort(list);
        System.out.println(list);

        //list to object array

        Object a[] = list.toArray();

        for(Object e:a){
            
        }


    }
}
