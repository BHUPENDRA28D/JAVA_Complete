package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        System.out.println(linkedList);

        System.out.println( linkedList.get(2));  //o(n)

        linkedList.addLast(33);
        linkedList.addFirst(1); //O(1)
        System.out.println(linkedList);
        System.out.println( linkedList.get(2));  //o(n)

        linkedList.getFirst();
        linkedList.getLast();

        linkedList.remove(); //remove first node item..
        System.out.println(linkedList);

        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);
        linkedList.remove(2);
        System.out.println(linkedList);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("cat","Dog","lion"));
        LinkedList<String> animalstoRemove = new LinkedList<>(Arrays.asList("cat","Dog"));

        System.out.println(animals);
        System.out.println(animalstoRemove);
        animals.removeAll(animalstoRemove);
        System.out.println(animals);
    }
}
