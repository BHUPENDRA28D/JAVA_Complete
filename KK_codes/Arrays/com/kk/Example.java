package com.kk;

public class Example {

    public static void main(String[] args) {
//        Driver.runDriver();
//
//        ArrayADT arrayADT = new ArrayADT(6);
//        arrayADT.append(16);
//        arrayADT.append(15);
//        arrayADT.append(4);
//        arrayADT.append(13);
//        arrayADT.append(2);
//        arrayADT.append(1);
//
//
//        arrayADT.display();
//     System.out.println(" " + arrayADT.search(1));
//        arrayADT.del(4);
//
//        arrayADT.insert(1,23);
//        arrayADT.display();

//        Sorting sort  =new Sorting();
//        sort.input();
//        sort.display();
////        sort.selection_sort();
//        sort.insertion_sort();
//        sort.display();
//
        Searching searching =new Searching();
        searching.input();
        searching.display();
        searching.min_No();
        searching.max_No();
        System.out.println("Item found :  "+searching.linear_search(13));
        searching.ceiling(13);


    }
}
