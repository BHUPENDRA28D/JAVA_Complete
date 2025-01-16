package Collections.ListLearnings;

import java.util.Stack;

public class StackColleciton {

    public static void main(String[] args) {
        Stack<Integer> marks = new Stack<>();

        marks.push(23);
        marks.push(25);
        marks.push(63);
        marks.push(36);
        marks.push(85);

        System.out.println(marks);

        System.out.println(marks.peek());

        marks.pop();
        marks.pop();

        System.out.println(marks);

    }
}
