package DSA.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Driver {
    public static void main(String[] args) {

        QueueArray qa = new QueueArray(5);
//        qa.isEmpty();
//
//        qa.enqueue(23);
//        qa.enqueue(16);
//        qa.enqueue(96);
//        qa.enqueue(56);
//
//        qa.display();
//        qa.dequeue();
//        qa.dequeue();
//        qa.display();
//
//      System.out.println(  qa.getRear());
//        System.out.println(  qa.getFront());
//        System.out.println(qa.peek());


        DequeClass ql = new DequeClass();
        ql.isEmpty();
        ql.eneque(23);
        ql.eneque(52);
        ql.eneque(96);
        ql.eneque(12);
        ql.display();

        ql.insertAtEnd(34);
        ql.insertAtEnd(77);

        ql.display();
        ql.deleteAtEnd();
        System.out.println();
        ql.display();
//       QueueLinkedList ql = new QueueLinkedList();
//        ql.isEmpty();
//        ql.eneque(23);
//        ql.eneque(52);
//        ql.eneque(96);
//        ql.eneque(12);
//        ql.display();
//
//        ql.dequeue();
//        ql.display();


//        Deque<Integer> deque = new ArrayDeque<>();
//        deque.add(89);
//        deque.addLast(56);
//        deque.add(21);
//        deque.add(21);
//
//        System.out.println(deque);
    }
}
