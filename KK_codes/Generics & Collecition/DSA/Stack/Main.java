package DSA.Stack;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        StackArray  stackArray = new StackArray(5);
//        stackArray.createArray(5);
//        stackArray.push(23);
//        stackArray.push(25);
//        stackArray.push(96);
//        stackArray.push(36);
//        stackArray.push(52);
//
//        stackArray.display();
//
//        stackArray.pop();
//        stackArray.pop();
//        stackArray.peek();
//        stackArray.display();



        StackLinkedList sl = new StackLinkedList();

        System.out.println(sl.isEmpty());

      sl.push(23);
      sl.push(25);
      sl.push(96);
      sl.push(78);
      sl.display();

      sl.peekk();
      sl.pop();

      sl.display();
    }

    //StackArray class

}
