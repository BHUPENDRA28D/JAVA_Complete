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

    //Insert at start
   public  void    insertAtStart(int data){
        Node n = new Node(data);
        n.next = start;
        start = n;
  }
//  insertAtEnd

    public void insertAtEnd(int data){
        Node n =new Node(data);
        n.next= null;
        if(start == null){

            start =n;
            return;
        }

            Node t = start;

            while(t.next !=null){
                t= t.next;}

            t.next =n;

    }

   // insert in Between
   public void insertAfterNode(Node ptr,int data){

       if (ptr == null) {
           System.out.println("Cannot insert after a null node");
           return;
       }

         Node  n = new Node(data);
         n.next= ptr.next;
         ptr.next =n;
   }

   //Get The address of node
    public Node getNode(int value){

        Node t = start;
        while(t != null){
            if(t.item == value){
            return t;}
            t=t.next;
        }
        return null;
    }



    //Delete at end.

    public void deleteAtEnd(){
        if(isEmpty()){
            System.out.println("Empty List !");
            return;
        }
        if(start.next == null){
            start =null;
            return;
        }

        Node t = start;
        while(t.next.next !=null){
            t=t.next;
        }
        t.next =null;
    }


    //delete at Start
    public void deleteAtStart(){
        if(isEmpty()){
            System.out.println("Empty List !");
            return;
        }
        start = start.next;
    }

    //delete after Node
    public void  deleteAfterNode(Node ptr){
        if(isEmpty()){
            System.out.println("Empty List !");
            return;
        }
        if(ptr==null || ptr.next == null){
            System.out.println("Deletion Not possible !");
            return;
        }

        ptr.next = ptr.next.next;
    }


    // searching Node

    public void search(int value){
        if(start ==null){
            System.out.println("List is empty!");
            return;
        }

        Node t = start;

        while(t !=null){
            if(t.item == value){
                System.out.println("Item is present in list");
                return;
            }

            t=t.next;
        }


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
