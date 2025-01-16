package DSA;



public class Stack {

    private int top;
    private int [] arr;
    private  int capacity;

    public  Stack(int cap){
        this.capacity =cap;
        this.top =-1;
        this.arr = new int[capacity];
    }


    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        System.out.println("The Stack is Full !");
        return top == capacity-1;
    }
    public void push(int data){
        if(isFull()){
            System.out.println("Stack Overflow!");
        }
        else{
            arr[++top] = data;
         }

    }

    public int pop(){
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

}
