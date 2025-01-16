package DSA.LinkedList;

public class DLL {

    class Node{
        int item;
        Node next;
        Node prev;

        public Node(){}

        public Node(int item) {
            this.item = item;
        }


    }

    private Node start;

    public void insertAtStart(int data){

        Node n = new Node(data);

            n.next = start;
            n.prev = null;

            if(start != null)
                start.prev =n;

            start =n;


    }

    public void display(){
        if(start == null){
            System.out.println("Empty List");
           return;}

        System.out.print("NULL");
        Node t = start;
        while(t!=null){
         System.out.print(" <- "+t.item+"->");
            t = t.next;
        }
        System.out.println("END");

    }

    public void insertAtLast(int data){

        Node n = new Node(data);
        n.next = null;

        if(start == null) {
            insertAtStart(data);return;
        }


         Node t =start;
         while(t.next != null){
             t =t.next;
         }
         t.next =n;
         n.prev= t;
    }


    public Node find(int value){
        Node t =start;
        while(t !=null){
            if(t.item == value){
                return t;
            }
            t =t.next;
        }
        return null;
    }

    public void insertAfterNode(int data, Node ptr){
        if (ptr == null)
        { System.out.println("The Node not found");
            return;
        }
        else{
            Node n = new Node(data);
            n.next = ptr.next;
            n.prev = ptr;

            if(ptr.next !=null){
                ptr.next.prev =n;
            }
            ptr.next =n;
        }
    }

    public void deleteAtStart(){
        if(start != null){
            if(start.next !=null)
                start.next.prev = start.prev;

            start =start.next;
        }
        else{
            System.out.println("the list is empty");
        }
    }

    public void deleteLast(){
        if(start == null){
            System.out.println("Empty list");
        }
        if(start.next == null){
            start = null;
//            deleteAtStart();
        }
        else{
            Node t;
            t = start;
            while(t.next.next != null){
                t =t.next;
            }
            t.next = null;
        }
    }

    public void deleteNode(Node ptr){
        if (ptr == null)
        { System.out.println("The Node not found");
            return;
        }

        if(start ==null){
            System.out.println("Empty list");
        }  if(start.next ==null){
            deleteAtStart();
        }
        else{
            ptr.prev.next = ptr.next;
            ptr.next.prev = ptr.prev;
        }
    }

}
