package com.kk;

import java.util.ArrayList;

public class ArrayList_Tut {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(23);
        list.add(765);
        list.add(234);

        System.out.println(list);

        list.set(1,99);
        list.remove(0);
        System.out.println(list);

    }

}
