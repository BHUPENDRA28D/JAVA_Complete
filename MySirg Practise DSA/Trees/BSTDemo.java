package Trees;

import java.util.Scanner;

public class BSTDemo{

    public static void main(String[] args){

        BinarySearchTree binarySearchTree = new BinarySearchTree();

        System.out.println( binarySearchTree.height(binarySearchTree.root));
        System.out.println(binarySearchTree.isEmpty());

//        binarySearchTree.insert();
        binarySearchTree.insertByIteration( 10);
        binarySearchTree.insertByIteration( 5);
        binarySearchTree.insertByIteration( 2);
        binarySearchTree.insertByIteration( 7 );
        binarySearchTree.insertByIteration( 3);
        binarySearchTree.insertByIteration( 15);
        binarySearchTree.insertByIteration( 20);
        binarySearchTree.preOrder(binarySearchTree.root);
        System.out.println("\n");

//        BinarySearchTree.Node found = binarySearchTree.search(binarySearchTree.root, 5);
//        System.out.println(
//                (found !=null)
//                ?"Height of node "+found.item+" = "+binarySearchTree.height(found)
//                :"Node not found"
//        ) ;

      binarySearchTree.maxNode(binarySearchTree.root);
      binarySearchTree.minNode(binarySearchTree.root);
    }


}

 class BinarySearchTree {

     public static class  Node {
         int item;
         Node left, right;
         private int height;

         public Node(int item) {
             this.item = item;
         }

         //getValue method
         public int getItem() {
             return item;
         }

     }

     public Node root;


     // height;
     public int height(Node node) {
         if (node == null)
             return -1;

         return node.height;
     }

     // empty full.
     public boolean isEmpty() {
         return root == null;
     }

     //display ..
     public void preOrder(Node node) {
         if (node == null)
             return;

         System.out.print(node.item + " ");
         preOrder(node.left);
         preOrder(node.right);
     }

     // insertion
     public void insert() {

         Scanner sc = new Scanner(System.in);

         System.out.println("Enter no. of element to enter: ");
         int n = sc.nextInt();

         for (int i = 0; i < n; i++) {
             System.out.println("Enter element " + i);
             int data = sc.nextInt();
             root = insert(root, data);
         }


     }

     private Node insert(Node node, int data) {

         if (node == null) {
             node = new Node(data);
             return node;
         }
         if (data < node.item) {
             node.left = insert(node.left, data);

         } else if (data > node.item) {
             node.right = insert(node.right, data);
         }
         else {
             // 👇 duplicate found → print & ignore
             System.out.println("Duplicate value " + data + " not allowed in BST.");
             return node; // don't insert
         }

         node.height = Math.max(height(node.left),height(node.right))+1;

         return node;
     }

     // height of any Random Node
     public void anyNodeHeight(Node n ,int data){
         if (n == null) {
             return;  // base case
         }

         if (n.item == data) {
             System.out.println("Height of " + n.item + " = " + n.height);
             return;
         }

         anyNodeHeight(n.left, data);
         anyNodeHeight(n.right, data);
     }


     //search of any node

     public Node search(Node n , int data){
         if(n == null || n.item == data)
             return n;

        return  (data < n.item)
           ?  search(n.left,data)
           : search(n.right,data);
     }


     //balanced or not
     public boolean balancedOrNot(){
         return balanced(root);
     }
     private boolean balanced(Node node){
         if(node == null)
             return true;

         return Math.abs(height(node.left)-height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
     }


     // Insertion by Iteration
     public void insertByIteration(int data) {
         Node newNode = new Node(data);

         if (root == null) {
             root = newNode;   // directly set tree root
             return;
         }

         Node current = root;
         Node parent = null;

         while (current != null) {
             parent = current;
             if (data < current.item) {
                 current = current.left;
             } else if (data > current.item) {
                 current = current.right;
             } else {
                 System.out.println("Duplicate value not allowed..");
                 return;
             }
         }

         if (data < parent.item)
             parent.left = newNode;
         else
             parent.right = newNode;
     }



     // find max value of BST
     public Node maxNode(Node n){
         if(n == null)
             return n;
         Node temp = n;

         while(temp.right !=null)
             temp =temp.right;

         System.out.println("Max value is "+temp.item);
         return  temp;
     }

     public Node minNode(Node n){
         if(n == null)
             return n;
         Node temp = n;

         while(temp.left !=null)
             temp =temp.left;

         System.out.println("Minmum value is "+temp.item);
         return  temp;
     }
 }
