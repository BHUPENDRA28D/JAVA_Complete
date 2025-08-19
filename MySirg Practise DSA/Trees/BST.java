package Trees;

import java.util.Scanner;

public class BST {

    public   class Node {
           int item;
        private Node left;
        private Node right;
        private int height;

        public Node(int item) {
            this.item = item;
        }
    }

    private Node root;

    public int getHeight(Node n){
        if (n==null)
            return -1;

       return n.height;
    }

    public boolean isEmpty(){
        return  root ==null;
    }



    public void insert(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements to insert in BST:");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            root = insert(data, root);  // Insert each value
        }

        sc.close(); // Close scanner
    }

    private Node insert(int data,Node node){
        if(node == null){
            node = new Node(data);
            return node;
        }
        if(data <node.item){
            node.left= insert(data,node.left);
        }

        else if(data > node.item) {
            node.right = insert(data, node.right);
        }

        else{
        System.out.println("Duplicate value " + data + " not allowed in BST.");
        return node;
        }

        node.height = Math.max(getHeight(node.left),getHeight(node.right)+1);
        return node;
    }


    //Display method
    public void display() {
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


    // main
    public static void main(String[] args) {

        BST bst = new BST();

        System.out.println("BST Structure :--");
        bst.insert();
        bst.display();
    }



}
