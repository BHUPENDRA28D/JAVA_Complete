package DSA;

public class SLL {

    private Node start;

    static class Node {
        int item;
        Node next;

        // Constructor
//        Node(int item) {
//            this.item = item;
//            this.next = null;
//        }
    }

    // Methods
    public void insertAtStart(int data) {
        Node n = new Node();
        n.item = data;
        n.next = start;
        start = n;
    }

    // Insert Last
    public void insertAtLast(int data) {
        Node temp;
        Node n = new Node();
        n.item = data;
        n.next = null;

        if (start == null) {
            start = n;
        } else {
            temp = start;
            while (temp.next != null)
                temp = temp.next;
            temp.next = n;
        }
    }

    // Show List
    public void showList() {
        Node temp = start;

        if (temp == null) {
            System.out.println("List is Empty");
        } else {
            while (temp != null) {
                System.out.print(" " + temp.item);
                temp = temp.next;
            }
            System.out.println();
        }

    }

    // Insert After Node
    public void insertAfterNode(int data, Node ptr) {
        Node n = new Node();
        n.item = data;
        n.next = ptr.next;
        ptr.next = n;
    }

    // Delete Last
    public void deleteLast() {
        Node temp;
        if (start == null) {
            System.out.println("List is Empty");
            return;
        }
        if (start.next == null) {
            start = null;
        } else {
            temp = start;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    // Delete First
    public void deleteFirst() {
        if (start == null) {
            System.out.println("List is Empty");
        } else {
            start = start.next;
        }
    }

    // Delete Node
    public void deletNode(Node ptr) {
        Node t;
        if (start == null) {
            System.out.println("List if Empty!");
            return;
        }

        if (start == ptr) {
            start = start.next;
            return;
        }

        Node temp = start;
        while (temp != null && temp.next != ptr) {
            temp = temp.next;
        }

        // If the node to delete is not present in the list!
        if (temp == null || temp.next == null) {
            System.out.println("Node does not exist in the list");
            return;
        }
        temp.next = ptr.next;
    }

    public void editNodAtPostion(int newData,int postion){
        if(start == null){
            System.out.println("List is Empty!");
            return;
        }
        Node temp =start;
        for(int i =0; i<postion && temp != null;i++){
            temp =temp.next;
        }

         if (temp ==null){
            System.out.println(("Posstion out of Bounds"));
        }
        else{
            temp.item =newData;
        }
    }

    public void search(int data){
        Node temp = start;
        while(temp != null){
            if(temp.item == data){
                System.out.println("The item found!");
               return;}
            temp = temp.next;

        }
        System.out.println("The item not found!");


    }
    public void countNode(){
        int count =0;
        Node temp = start;
        while(temp !=null){
            temp = temp.next;
            count++;
        }
        System.out.println("No of Nodes in SLL : "+count);
    }



    public static void main(String [] args) {
        SLL sll = new SLL();

        sll.showList();
        sll.insertAtStart(20);
        sll.insertAtStart(10);
        sll.insertAtStart(30);
        sll.insertAtStart(40);

        sll.showList();
        sll.insertAtLast(54);
        sll.showList();
        sll.deleteFirst();
        sll.showList();
        sll.deleteLast();
        sll.showList();
        sll.editNodAtPostion(89,2);
        sll.showList();
        sll.search(89);
        sll.countNode();
    }
}
