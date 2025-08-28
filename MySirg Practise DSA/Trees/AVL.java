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

    // Get height of a node
    public int getHeight(Node n) {
        return (n == null) ? -1 : n.height;
    }

    // Check if tree is empty
    public boolean isEmpty() {
        return root == null;
    }

    // Get balance factor of a node
    public int getBalanceFactor(Node n) {
        return (n == null) ? 0 : getHeight(n.left) - getHeight(n.right);
    }

    // Rotate node to maintain AVL balance
    public Node rotate(Node node) {
        int balance = getBalanceFactor(node);

        // Left heavy
        if (balance > 1) {
            if (getBalanceFactor(node.left) >= 0) {
                // Left-Left case
                return rightRotate(node);
            } else {
                // Left-Right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        // Right heavy
        if (balance < -1) {
            if (getBalanceFactor(node.right) <= 0) {
                // Right-Right case
                return leftRotate(node);
            } else {
                // Right-Left case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node; // No rotation needed
    }

    // Right rotation
    public Node rightRotate(Node parent) {
        Node child = parent.left;
        Node t = child.right;

        child.right = parent;
        parent.left = t;

        parent.height = Math.max(getHeight(parent.left), getHeight(parent.right)) + 1;
        child.height = Math.max(getHeight(child.left), getHeight(child.right)) + 1;

        return child;
    }

    // Left rotation
    public Node leftRotate(Node parent) {
        Node child = parent.right;
        Node t = child.left;

        child.left = parent;
        parent.right = t;

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
    private Node insert(Node node, int item) {
        if (node == null) {
            return new Node(item);
        }

        if (item < node.item) {
            node.left = insert(node.left, item);
        } else if (item > node.item) {
            node.right = insert(node.right, item);
        } else {
            System.out.println("Duplicate value " + item + " not allowed.");
            return node;
        }

        // Update height and rotate if needed
        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
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
}-