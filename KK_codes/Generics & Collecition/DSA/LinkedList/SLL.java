package DSA.LinkedList;

public class SLL {


        class Node {
            int item;
            Node next;

            public Node() {
                this.item = 0;
                this.next = null;
            }

            public Node(int item, Node next) {
                this.item = item;
                this.next = next;
            }
        }

        private Node start;

    public Node getStart() {
        return start;
    }
    public void setStart(Node start) {
        this.start = start;
    }
        public void insertAtStart(int data) {
            Node n = new Node();
            n.item = data;
            n.next = start;
            start = n;
        }

        public void insertAtEnd(int data) {
            Node n = new Node();
            n.item = data;
            n.next = null;

            if (start == null) { // If the list is empty
                start = n;
                return;
            }

            Node t = start;
            while (t.next != null) { // Traverse to the last node
                t = t.next;
            }
            t.next = n; // Add the new node at the end
        }

        public void insertAfterNode(Node ptr, int data) {
            if (ptr == null) {
                System.out.println("Cannot insert after a null node");
                return;
            }

            Node n = new Node();
            n.item = data;
            n.next = ptr.next;
            ptr.next = n;
        }

        public void deleteAtStart() {
            if (start == null) {
                System.out.println("List is empty");
            } else {
                start = start.next;
            }
        }

    public Node findNode(int value) {
        Node temp = start;

        while (temp != null) {
            if (temp.item == value) { // Check if the value matches
                return temp;
            }
            temp = temp.next;
        }

        return null; // Node not found
    }

        public void deletLast() {
            if (start == null) {
                System.out.println("List is empty");
                return;
            }

            if (start.next == null) { // If there is only one node
                start = null;
                return;
            }

            Node t = start;
            while (t.next.next != null) { // Traverse to the second-to-last node
                t = t.next;
            }
            t.next = null; // Remove the last node
        }

        public void deletAfterNode(Node ptr) {
            if (start == null) {
                System.out.println("List is empty");
                return;
            }

            if (ptr == null || ptr.next == null) { // Check if deletion is possible
                System.out.println("Deletion not possible");
                return;
            }

            ptr.next = ptr.next.next; // Bypass the node after `ptr`
        }

        public void display() {
            Node t = start;

            while (t != null) {
                System.out.print(t.item + " -> ");
                t = t.next;
            }
            System.out.println("END");
        }


        public Node reverseSLL(){
            Node t1=null;Node t2 =null;

            while(start != null){
                t2= start.next;
                start.next = t1;
                t1 =start;
                start =t2;
            }
            start =t1;
            return start;
        }

        public Node rev(Node start) {
            if (start == null || start.next == null){

                return start ;}


        Node newNode= rev(start.next);
         Node t = start.next;
         t.next =start;
         start.next =null;

         return newNode;

        }

    public void removeDuplicates() {
        Node current = start;

        while (current != null) {
            Node runner = current; // Runner starts from `current`
            while (runner.next != null) {
                if (runner.next.item == current.item) {
                    // Duplicate found, remove it
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    //merge two sorted List

    // Loop in the list
    public boolean hasCycle(Node start){
        Node fast = start;
        Node slow = start;

        while(fast !=null && fast.next !=null){
            fast =fast.next.next;
            slow =slow.next.next;

            if(fast == slow){
                return  true;
            }

        }
        return false;
    }

    //lenght of cyle
    public int lenghtOfCycle(Node starrt){
        Node fast = start;
        Node slow = start;
        int lenght =0;

        while(fast !=null && fast.next !=null){
            fast =fast.next.next;
            slow =slow.next;

            if(fast == slow){
                Node temp =slow;
                do{
                    temp =temp.next;
                    lenght++;
                }while (temp !=slow);
                return lenght;
            }

        }
        return 0;
    }


    // detect where cycle start

    public Node detectCYcle(Node start){
        Node fast = start;
        Node slow = start;
        int lenght = 0;


        while(fast !=null && fast.next !=null){
            fast =fast.next.next;
            slow =slow.next;

            if(fast== slow){
                lenght= lenghtOfCycle(slow);
            }

            }

        // No cycle detected
        if(lenght==0){
            return null;
        }

        // find start node first and start
        Node f =start;
        Node s =start;

        //Move one pointer `length` steps ahead
        while(lenght>0){
            s =s.next;
            lenght--;
        }
        while (f!=s){
            f= f.next;
            s=s.next;
        }
        return s;


    }

}





//    class Node{
//         int item;
//        Node next;
//    }
//    private Node start;
//
//    public void insertAtStart(int data){
//        Node n = new Node();
//        n.item = data;
//        n.next =start;
//        start = n;
//
//    }
//
//    public void insertAtEnd(int data){
//        Node t;
//        Node n = new Node();
//        n.item= data;
//        n.next =null;
//
//        t = start;
//
//        while(t!=null){
//            t =t.next;
//        }
//        t.next =n;
//
//    }
//
//    public void insertAfterNode(Node ptr,int data){
//        Node n = new Node();
//
//        n.item=data;
//        n.next = ptr.next;
//        ptr.next = n;
//    }
//
//    public  void deleteAtStart(){
//        if(start ==null)
//            System.out.println("List is empty");
//
//        else{
//            start =start.next;
//        }
//    }
//
//    public void deletLast(){
//        Node t;
//
//
//        if(start ==null)
//            System.out.println("List is empty");
//
//        else if(start.next == null){
//            start =null;
//        }
//    else{
//            t =start;
//
//            while(t.next.next != null)
//                t=t.next;
//
//            t.next =null;
//        }
//
//    }
//
//    public void deletAfterNode(Node ptr){
//        Node t;
//        if(start ==null){
//            System.out.println("List is empty");
//
//        }
//        else{
//            if(start == ptr){
//                start = ptr.next;
//
//            }
//            else{
//                t =start;
//                while((t.next != ptr))
//                    t =t.next;
//
//                t.next = ptr.next;
//            }
//
//        }
//    }
//
//    public void display(){
//        Node t = start;
//
//        while(t != null){
//            System.out.println(t.item+"->");
//            t= t.next;
//        }
//        System.out.println("END");
//
//    }


