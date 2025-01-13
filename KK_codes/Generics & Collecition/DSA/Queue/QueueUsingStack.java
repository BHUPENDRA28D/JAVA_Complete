package DSA.Queue;

import java.util.Stack;

public class QueueUsingStack {


    private Stack<Integer> input;
    private Stack<Integer> output;

    public QueueUsingStack(){
        input =new Stack<>();
        output =new Stack<>();
    }

    public void add(int data){
        input.push(data);
    }

    public int remove() throws Exception{
        while(!input.isEmpty()){
            output.push(input.pop());
        }

        int removed = output.pop();

        while(!output.isEmpty()){
            input.push(output.pop());
        }

        return removed;
    }

    public  int peek(){
        while(!input.isEmpty()){
            output.push(input.pop());
        }

        int peeked = output.peek();

        while(!output.isEmpty()){
            input.push(output.pop());
        }

        return peeked;
    }
    public boolean isEmpty(){
        return  input.isEmpty();
    }

}
