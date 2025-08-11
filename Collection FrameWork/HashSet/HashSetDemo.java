package HashSet;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet hashSet = new HashSet<>(2,5);

        hashSet.add("Raipur");
        hashSet.add("Bhopal");
        hashSet.add("Delhi");
        hashSet.add("Noida");
        hashSet.add("Jaipure");
        hashSet.add("Indore");
        hashSet.add("Delhi");
        hashSet.add("Delhi");

        hashSet.add("Raipur");
        hashSet.add("Raipur");  //duplicate are not allowed..
        System.out.println(hashSet);
        System.out.println(hashSet.size());

    }
}
