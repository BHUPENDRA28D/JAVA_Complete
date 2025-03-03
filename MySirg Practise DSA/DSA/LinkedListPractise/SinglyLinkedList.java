package DSA.LinkedListPractise;

public class SinglyLinkedList {

    class Node{
        int item;
        Node next;

        public Node(int item) {
            this.item = item;
        }
    }

    Node start;

    //isEmpty

    public boolean isEmpty(){
        return  start ==null;
    }

   public  void    insertAtStart(int data){
        Node n = new Node(data);
        n.next = start;
        start = n;
  }

  //display

    public  void showList(){
        if(isEmpty())
            System.out.println("List is empty!");

        else {
            Node t =start;



            System.out.println("\n_____________________\n");
            while(t !=null){
                System.out.print(t.item+" --> ");
                t =t.next;
            }
            System.out.println("END");
        }
    }

}
