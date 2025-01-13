package DSA.Queue;

public class QueueLinkedList{

     class Node{
         int item;
         Node next;

         public Node(int item) {
             this.item = item;
         }
     }

     Node front;
     Node rear;

     public boolean isEmpty(){
         return front== null;

     }

     public void eneque(int data){
         Node n = new Node(data);
         if (isEmpty()){
             front =rear=n;
         }else{
             rear.next = n;
             rear =n;
         }

         System.out.println(data+ " Enqueued Succuesfully");


     }

     public void dequeue(){
         if (isEmpty()) {
             System.out.println("Queue is empty! Cannot dequeue.");
             return;
         }
         int item =front.item;
         front = front.next;
         if(front == null){
             rear =null;
         }
         System.out.println("Item dequeued: " + item);


     }

     public void display() {

         if (isEmpty()) {
             System.out.println("Queue is empty! Cannot dequeue.");
             return;
         }
         Node t = front;
         while (t != null) {
             System.out.print(t.item + "->");
             t = t.next;
         }
         System.out.print("END");
     }

}
class DequeClass extends QueueLinkedList{

    public void insertAtEnd(int data){
        Node n = new Node(data);
        if (isEmpty()) { // If the deque is empty
            front = rear = n;}

        n.next = rear.next;
        rear.next =n;
        rear =n;

    }

    public void deleteAtEnd(){
        Node   t=front;
        while(t.next !=rear){
            t =t.next;
        }
        t.next =rear.next;
        rear=t;

    }



}