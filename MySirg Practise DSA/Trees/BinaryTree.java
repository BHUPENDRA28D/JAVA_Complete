package Trees;

import java.util.*;

public class BinaryTree {

    private static class Node {
        int item;
        Node left;
        Node right;

        public Node(int item) {
            this.item = item;
        }
    }

    private Node root;
    public Node getRoot(){
        return root;
    }

    // Insert elements
    public void insert(Scanner scanner) {
        // Insert logic here
        System.out.println("Enter the root Node: ");
        int data = scanner.nextInt();
        root = new Node(data);

        populate(scanner, root);
    }

    // Populate


    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left of " + node.item);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter left of " + node.item);
            int data = scanner.nextInt();
            node.left = new Node(data);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter right of " + node.item);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter right of " + node.item);
            int data = scanner.nextInt();
            node.right = new Node(data);
            populate(scanner, node.right);
        }
    }
/*
    // Display function
    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.item);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }*/


    // Display function
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




    //Breadth First Search BSF (Level Order Triversal). LeetCode 102.

    public List<List<Integer>> levelOrder(Node root) {

        List<List<Integer>> result = new ArrayList<>();

        if(root == null){
            return  result;
        }


        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();

            List<Integer> current_level = new ArrayList<>();
            for (int i =0;i<levelSize;i++){
                Node currentNode = queue.poll();
                current_level.add(currentNode.item);

                if(currentNode.left !=null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right !=null){
                    queue.offer(currentNode.right);
                }

            }
            result.add(current_level);
        }

        return result;
    }


    // Avrage on each level of node. Leetcode 637


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        bt.insert(sc);
        bt.display();
        System.out.println(bt.levelOrder(bt.getRoot()));
    }
}