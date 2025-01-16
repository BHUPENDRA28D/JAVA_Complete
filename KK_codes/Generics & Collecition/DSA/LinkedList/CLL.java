package DSA.LinkedList;

public class CLL {
    private Node last;

    class Node{
        int item;
        Node next;

        public Node(int item) {
            this.item = item;
        }
        public Node(){}
    }

    public void insertStart(int data){
        Node n = new Node(data);

        if(last!=null){
        n.next = last.next;
        last.next =n;}

        else {
            n.next =n;
            last=n;   //Pointing back to itself for cicularity.
        }

    }
    public void insertLast(int data){

        Node n = new Node(data);
        n.next =last.next;
        last.next = n;
        last =n;

    }
}
