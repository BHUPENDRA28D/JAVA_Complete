package Collections.LearningQueue;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {


    public static void main(String[] args) {
        Queue<Integer> queue =new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(40);
        queue.add(50);
        queue.add(60);

        queue.isEmpty();
        System.out.println(queue);

        queue.offer(45);
        System.out.println(queue.poll());

        System.out.println( queue.peek());
        queue.element();
        System.out.println(queue);
        System.out.println(queue.remove() );

    }
}
