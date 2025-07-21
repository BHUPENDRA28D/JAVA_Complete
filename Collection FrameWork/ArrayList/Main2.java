package ArrayList;

import javax.print.attribute.standard.NumberOfInterveningJobs;
import java.util.*;

public class Main2 {

    public static void main(String[] args) {


    List<String> list = new ArrayList<>();
        System.out.println(list.getClass().getName());

    List<String> list1 = Arrays.asList("Monday","Tuesday","Wedesnday");
        System.out.println(list1.getClass().getName());
    list1.set(1,"Thursdasy");

    // Arrays.asList(arr) used to convert array to list..
    String [] array = {"Apple","Banana","cherrey"};
    List<String> list2 = Arrays.asList(array);
        System.out.println(list.getClass().getName());


        List<String> list4 = new ArrayList<>(list2);
        list4.add("Mongo");
        System.out.println(list4);

        String [] arrFruits = list4.toArray(new String[0]);
//        System.out.println("converted to string array :"+Arrays.toString(arrFruits) );

        for(String a : arrFruits){
            System.out.println(a);
        }

        list4.remove(1);

        System.out.println(list4);

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(23);
        intList.add(63);
        intList.add(74);
        intList.add(29);
        intList.add(10);
        System.out.println(intList);
//
//        intList.remove(2);
//        System.out.println(intList);

        intList.remove(Integer.valueOf(74));
        System.out.println(intList);

        System.out.println(intList.size());

        Object intArr =  intList.toArray(new Integer[0]);


        //sorting list;
//        Collections.sort(intList);
//        List.sort(intList);   not work here.

        System.out.println(intList);



}
}
