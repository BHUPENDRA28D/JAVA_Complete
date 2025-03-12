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

       //
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
        return node;  // Return unchanged node

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


