package Stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(23);
        stack.push(15);
        stack.push(74);
        stack.push(55);
        System.out.println(stack);


        System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack.search(23));



        //LINKED LIST AS STACK

        LinkedList<Integer> ll =  new LinkedList<>();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);

        ll.removeLast();
        ll.size();
        ll.size();


        //arraylist as stack

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(11);
        arr.add(12);
        arr.add(13);

        arr.get(arr.size()-1);
        arr.remove(arr.size()-1);






    }
}
