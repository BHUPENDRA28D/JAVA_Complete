package Trees;

import java.util.Scanner;

public class BSTDemo{

    public static void main(String[] args){

        BinarySearchTree bst = new BinarySearchTree();

        System.out.println( bst.height(bst.root));
        System.out.println(bst.isEmpty());

//        bst.insert();
        bst.insertByIteration( 10);
        bst.insertByIteration( 5);
        bst.insertByIteration( 2);
        bst.insertByIteration( 7 );
        bst.insertByIteration( 3);
        bst.insertByIteration( 15);
        bst.insertByIteration( 20);
        bst.preOrder(bst.root);
        System.out.println("\n");

        bst.display();


//        BinarySearchTree.Node found = bst.search(bst.root, 5);
//        System.out.println(
//                (found !=null)
//                ?"Height of node "+found.item+" = "+bst.height(found)
//                :"Node not found"
//        ) ;

      bst.maxNode(bst.root);
      bst.minNode(bst.root);

//        System.out.println(bst.deletionByIteration(bst.root,2));
        bst.delete(2);
        bst.delete(20);
        bst.preOrder(bst.root);
        bst.display();

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
     //Display method
     public void display() { System.out.println("\n\n\n");
         printTree(root, 0);
     }

     private void printTree(Node node, int level) {
         if (node == null) {
             return;
         }

         printTree(node.right, level + 1);
         if (level != 0) {
             for (int i = 0; i < level - 1; i++)
                 System.out.print("|\t");
             System.out.println("|-------" + node.item);
         } else
             System.out.println(node.item);
         printTree(node.left, level + 1);

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

         while(n.right !=null)
             n =n.right;

         System.out.println("Max value is "+n.item);
         return  n;
     }

// find  minmum node .
     public Node minNode(Node n){
         if(n == null)
             return n;


         while(n.left !=null)
             n =n.left;

         System.out.println("Minmum value is "+n.item);
         return  n;
     }

     // deletion or items in bst

     public Node deletionByIteration(Node n ,int data){
         if(n == null)
             return null;

         Node current =n;
         Node parent =null;

         while(current !=null && current.item!=data){
             parent=current;
             current=  (data< current.item)?current.left:current.right;
         }

         if(current == null){
             System.out.println("Node Not found");
             return n;
         }

         // 🔹 Case 1: No child (leaf)
         if (current.left == null && current.right == null) {

            if(parent == null) return null;
            if(parent.left ==current) parent.left=null;
            else parent.right =null;
         }

         // * Case 2 Node with only one child.

         else if(current.left==null ||current.right == null){

             Node child = (current.left!=null )?current.left : current.right;

             if (parent ==null) return null;
             else if(parent.left==current) parent.left =child;
             else parent.right =child;
         }


         // Case 3 Node with 2  childs
         else{
             Node succsorParent = current;
             Node succsor = current.right;

             while(succsor.left !=null){
                 succsorParent=succsor;
                 succsor = succsor.left;

             }

             current.item =succsor.item;

             if (succsorParent.left == succsor) {
                 succsorParent.left = succsor.right;   // successor can only have right child
             } else {
                 succsorParent.right = succsor.right;
             }

         }

       return  n;
     }

     public void delete(int data){
         root =delete(root,data);
     }
     private Node delete(Node root, int data) {
         if (root == null) return null;

         if (data < root.item) {
             root.left = delete(root.left, data);
         }
         else if (data > root.item) {
             root.right = delete(root.right, data);
         }
         else {
             // Found node to delete

             // Case 1: No child
             if (root.left == null && root.right == null) {
                 return null;
             }

             // Case 2: One child
             else if (root.left == null) {
                 return root.right;
             }
             else if (root.right == null) {
                 return root.left;
             }

             // Case 3: Two children
             Node successor = minNode(root.right);
             root.item = successor.item;  // replace value
             root.right = delete(root.right, successor.item); // delete successor
         }
         return root;
     }



 }
