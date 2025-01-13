package Collections.LearinMaps;

import java.util.*;

public class LearnMap {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Map<String,String>  map = new HashMap<>();
       Vector<Integer> vector = new Vector<>();
        map.put("us","unitedState");
        map.put("in","India");
        map.put("pk","Pakistan");
        map.put("org","organizaztion");
        map.put("en","england");

        System.out.println(map);

        Set<String> keys = map.keySet();
//        Set<String> values = Set<String>)map.values();
        System.out.println(keys);

//        map.remove("org");
//
//        System.out.println(map.get("in"));
//
//        System.out.println(map.getOrDefault("pn","ohters"));
    }




}
