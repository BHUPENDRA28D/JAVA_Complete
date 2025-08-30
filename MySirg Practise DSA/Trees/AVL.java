package Trees;

public class AVL {

    // Node class
    public class Node {
        int item;
        Node left;
        Node right;
        int height;

        public Node(int item) {
            this.item = item;
            this.height = 0; // New node starts with height 0
        }
    }

    Node root;

    //is empty
    public boolean isEmpty(){
        return  (root == null);
    }
    //height.
    public int getHeight(Node node){
        return (node == null) ?-1 : node.height;

    }

    // get Balance Factor

    public int getBalanceFactor(Node node){
        return getHeight(node.left)-getHeight(node.right);
    }

    // is Balanced or not
    public boolean isbalanced(){
        return isbalanced(root);
    }
    private boolean isbalanced(Node node){
        return (node ==null )?true :  Math.abs(getHeight(node.left) - getHeight(node.right))<=1 && isbalanced(node.right) && isbalanced(node.left);
    }



    // Rotate the AVL tree.
    public Node rotate(Node node) {
        int balance = getBalanceFactor(node);

        if (balance > 1) {
            if (getBalanceFactor(node.left) >= 0) {
                return rightRotate(node); // Left Left
            } else {
                node.left = leftRotate(node.left); // Left Right
                return rightRotate(node);
            }
        }

        if (balance < -1) {
            if (getBalanceFactor(node.right) <= 0) {
                return leftRotate(node); // Right Right
            } else {
                node.right = rightRotate(node.right); // Right Left
                return leftRotate(node);
            }
        }

        return node;
    }



    public Node rightRotate(Node parent){

        Node child = parent.left;
        Node temp = child.right;

        child.right= parent;
        parent.left = temp;

        //update heights of node.
        parent.height = Math.max(getHeight(parent.left), getHeight(parent.right)) + 1;
        child.height = Math.max(getHeight(child.left), getHeight(child.right)) + 1;


        return child;
    }

    public Node leftRotate(Node parent){

        Node child = parent.right;
        Node temp = child.left;

        child.left= parent;
        parent.right = temp;

        //update heights of node.
        parent.height = Math.max(getHeight(parent.left), getHeight(parent.right)) + 1;
        child.height = Math.max(getHeight(child.left), getHeight(child.right)) + 1;


        return child;
    }

    // Insert multiple values into AVL tree
    public void insertAll() {
        int[] arr = {35, 50, 40, 25, 20, 30, 60, 78, 20, 28};
        for (int i : arr) {
            root = insert(root, i);
        }
    }

    // Insert a single value into AVL tree

    public Node insert(Node node, int data){
       Node newNode = new Node(data);

       if(node == null){
           return newNode;
       }

       if(data < node.item)
           node.left = insert(node.left,data);
       else if(data> node.item)
           node.right = insert(node.right,data);
       else {
           System.out.println("Duplicate value are not allowed");
           return node;
       }

       node.height = Math.max(getHeight(node.left),getHeight(node.right)+1) ;
       return rotate(node);

    }


    // Display the tree structure
    public void display() {
        printTree(root, 0);
    }

    private void printTree(Node node, int level) {
        if (node == null) return;

        printTree(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++)
                System.out.print("|\t");
            System.out.println("|-------" + node.item);
        } else {
            System.out.println(node.item);
        }
        printTree(node.left, level + 1);
    }

    // Main method
    public static void main(String[] args) {
        AVL avltree = new AVL();

        avltree.insertAll();

        System.out.println("Is tree empty? " + avltree.isEmpty());
        System.out.println("Balance factor of root: " + avltree.getBalanceFactor(avltree.root));
        System.out.println("\nAVL Tree Structure:");
        avltree.display();
    }
}