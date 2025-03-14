package Trees;

import java.util.Scanner;

public class AVL {

        public   class Node {
            int item;
            private Node left;
            private Node right;
            private int height;

            public Node(int item) {
                this.item = item;
                this.height= 1;
            }
        }

        Node root;

        public int getHeight(Node n){

           return(n==null)?0:n.height;
        }

        public boolean isEmpty(){
            return  root ==null;
        }

        //get balance factor

       public int getBalanceFactor( Node n) {
            return (n==null)?0:getHeight(n.left)-getHeight(n.right);
       }

       //Rotate code


      private   Node rotate(Node node){

            if((getHeight(node.left)-getHeight(node.right)>1)){
                // left heavy

              if(getHeight(node.left.left)- getHeight(node.left.right) >0){
                  //left-left case
                  return rightRotate(node);
              }


             if(getHeight(node.left.left)- getHeight(node.left.right) <0){
              //left-right case
              node.left = leftRotate(node.left);
              return rightRotate(node);
          }}

          if((getHeight(node.left)-getHeight(node.right))>1){
              // right heavy

              if(getHeight(node.right.left)- getHeight(node.right.right) >0){
                  //right-right case
                  return leftRotate(node);
              }


              if(getHeight(node.right.left)- getHeight(node.right.right) <0){
                  //left-right case
                  node.right = rightRotate(node.right);
                  return rightRotate(node);
              }}

        return  node;
      }

      //Right Rotation.
    private Node rightRotate(Node p) {
            Node c = p.left;
            Node t = c.right;

            c.right = p;
            p.left = t;

            p.height = Math.max(getHeight(p.left),getHeight(p.right)+1);
            c.height = Math.max(getHeight(c.left),getHeight(c.right)+1);

            return c;
    }

 //Left Rotation.
    private Node leftRotate(Node c) {
            Node p =c.right ;
            Node t = p.left;

            p.left = c;
            c.right=t;

            p.height = Math.max(getHeight(p.left),getHeight(p.right)+1);
            c.height = Math.max(getHeight(c.left),getHeight(c.right)+1);

            return c;
    }


    // Insert a node into AVL tree
       public void insert(int item) {
           root = insert(root, item);
       }

    private Node insert(Node node, int item) {
        // Normal BST insert
        if (node == null) {
            return new Node(item);
        }
        if (item < node.item) {
            node.left = insert(node.left, item);
        } else if (item > node.item) {
            node.right = insert(node.right, item);
        } else {
            System.out.println("Duplicate values not allowed.");
            return node;
        }

        // Update height
        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        return rotate(node);  // Return unchanged node

    }


        //Display method
        public void display() {
            printTree(root, 0);
        }

        private void printTree( Node node, int level) {
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


        // main
        public static void main(String[] args) {


        }
    }


