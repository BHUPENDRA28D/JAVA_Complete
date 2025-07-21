package Generics;

public class Pair <K,V>{

    private K key;
    private  V value;


    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}


/*
     T: Type
     E: Element (used in collections)
     K: Key(used in Maps)
     V: Value (used in maps)
     N: Number
*/