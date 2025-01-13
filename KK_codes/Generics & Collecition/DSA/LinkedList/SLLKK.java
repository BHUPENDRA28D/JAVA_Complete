package DSA.LinkedList;

public class SLLKK {


    class Node {
        int item;
        Node next;

       public Node(){}
        public Node(int item){
            this.item = item;
        }
//        public Node() {
//            this.item = 0;
//            this.next = null;
//        }

        public Node(int item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

     Node head;
    private Node tail;
    private int size=0;

    public SLLKK(){
      this.size=0;
    }

    public void insertFirst(int data){
        Node n = new Node(data);
        n.next = head;
        head = n;

        if(tail == null){ // when both tail and head point at same value.
            tail = head;
        }
        size =+1;

    }

    public void insertAtLast(int data){
        Node n = new Node(data);
        n.next =null;
        if(head==null){
            head = tail = n;
            insertFirst(data);
            return;
        }

        tail.next =n;
        tail =n;
        size++;
    }

    public void insertAfterNode(int index,int data){
        if(index ==0){
            insertFirst(data);
            return;
        }
        else if(index == size){
            insertAtLast(data);
            return;

        }

        Node t = head;

        for(int i =1;i<index;i++){
            t= t.next;
        }

        Node n = new Node(data,t.next);
        t.next=n;
        size++;


    }

    public void display(){
        Node t = head;
        while(t!=null){
            System.out.print(t.item+"->");
            t =t.next;
        }
        System.out.println("END");
    }


    public int deleteFirst(){

        int val = head.item;

        if(head == null){
            tail =null;
            System.out.println("List is Empty");
        }
        head = head.next;
        size--;
        return val;
    }

    public Node get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }


    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size -1);
        int val = tail.item;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public Node  insertRecursive(int index,int data, Node current){

        if(index == 0){
            Node n = new Node(data,current);
            size++;
            return n;
        }
        current.next =insertRecursive(index-1,data,current.next);
        return current;

    }
    public  Node mergeSortedList(Node f, Node s){



        Node dummy = new Node();
        Node tail = dummy;

        while(f !=null && s!= null){
            if(f.item <= s.item){
                tail.next = f;
                f = f.next;
                tail = tail.next;
            }
            else{
                tail.next = s;
                s=s.next;
                tail=tail.next;
            }
        }
        tail.next = (f != null) ? f : s;
   return dummy.next;


    }

    // Middle of linkedList
    Node middleOfList(Node head){
        Node slow = head;
        Node fast = head;

        while(fast !=null && fast.next!=null){
            slow = slow.next;
            fast =fast.next.next;


        }
        return slow;
    }


    // happy number

    public boolean isHappy(int n) {
        int slow =n;
        int fast = n;

        do{
            slow =findSquare(n);
            fast =findSquare(findSquare(n));
        }while(slow !=fast);

        if(slow ==1){
            return true;
        }
        return false;
    }

    public int findSquare(int n){
        int ans =0;
        while(n!=0){
            int rem = n%10;
            ans =ans + rem*rem;
            n =n/10;
        }

        return ans;
    }


}
