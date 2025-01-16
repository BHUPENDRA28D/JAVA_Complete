package DSA.Stack;

public class StackArray {

    private int capacity;  // Maximum capacity of the stack
    private int top;       // Points to the topmost element in the stack
    private int[] ptr;     // Array to store stack elements

    // Constructor to initialize the stack with a given capacity
    public StackArray(int cap) {
        this.capacity = cap;
        this.top = -1;       // Stack is initially empty
        this.ptr = new int[capacity];
    }

    // Check if the stack is empty (underflow)
    public boolean underFlow() {
        return top == -1;
    }

    // Check if the stack is full (overflow)
    public boolean overFlow() {
        return top == capacity - 1;
    }

    // Push operation to insert an element into the stack
    public void push(int data) {
        if (overFlow()) {
            System.out.println("Stack Overflow");
            return;
        }
        ptr[++top] = data;  // Increment top and add the data
    }

    // Pop operation to remove the topmost element from the stack
    public void pop() {
        if (underFlow()) {
            System.out.println("Stack Underflow");
            return;
        }

        int val = ptr[top--];  // Retrieve and decrement the top
        System.out.println(val + " popped successfully from the stack");
    }

    // Peek operation to view the topmost element without removing it
    public void peek() {
        if (underFlow()) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Top element = " + ptr[top]);
    }

    // Display all elements in the stack without modifying it
    public void display() {
        if (underFlow()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements (top to bottom):");
        for (int i = top; i >= 0; i--) {
            System.out.println(ptr[i]);
        }
    }
}


class StackLinkedList{

    class Node{
        int item;
        Node next;

        Node(){}
        Node(int data){
            this.item =data;

        }

    }

    Node top;
    int size=0;

    //push the element

    public void push(int data){
        Node n  = new Node(data);
        n.next= top;
        top =n;
        size++;

    }

    public boolean isEmpty(){
        return  top==null;
    }

    public void pop(){
        if(top==null){
            System.out.println("Stack underflow");
        }

        int val = top.item;
        top =top.next;
        System.out.println(" Succesfully deleted"+val);
        size--;

    }

    public int peekk(){

        if(top==null){
            System.out.println("Stack underflow");
        }
        return top.item;
    }

    public void display(){

         if(isEmpty()){
             return;
         }
        Node t = top;
        while(t!=null){
            System.out.print(t.item+" -> ");
            t= t.next;
        }
        System.out.println("END");
    }

}