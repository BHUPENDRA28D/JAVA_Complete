package Collections.LearningQueue;

import java.lang.reflect.Array;
import java.util.ArrayDeque;

public class ArrayDequeClas {
    public static void main(String[] args) {

        String name ="Rahul";
        int code = name.hashCode();
        System.out.println(code);

//        ArrayDeque<Integer> dq = new ArrayDeque<>();
//
//        dq.offer(23);
//        dq.offerFirst(90);
//        dq.offerFirst(58);
//        dq.offerLast(30);
//
//        System.out.println(dq);
//
//        dq.poll();
//        dq.pollLast();
//        System.out.println(dq  );

        //Stack
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());


    }
}
