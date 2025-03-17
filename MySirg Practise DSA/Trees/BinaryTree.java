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



    // Function to create the tree automatically
    public void createTree() {
        root = new Node(3);
        root.left = new Node(4);
        root.right = new Node(8);

        root.left.left = new Node(12);
        root.left.right = new Node(14);

        root.left.right.left = new Node(36);
        root.left.right.right = new Node(9);

        root.right.left = new Node(7);
        root.right.right = new Node(11);

        root.right.right.left = new Node(2);
        root.right.right.left.right = new Node(44);
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


    // Avrage on each level of node. Leetcode- 637

    public List<Double> averageOfLevels(Node root) {

        List<Double> avg = new ArrayList<>();

        if(root.equals(null)){
            return avg;
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){

            int levelSize = q.size();
            double sum =0;

            for(int i =0;i<levelSize;i++){
                Node currentNode = q.poll();
                sum+=currentNode.item;

                if(currentNode.left!=null){
                    q.offer(currentNode.left);
                }
                if(currentNode.right !=null){
                    q.offer(currentNode.right);
                }

            }

            avg.add(sum/levelSize);
        }



        return avg;
    }


    //Right next node item google question.
    public Node findSuccessor(Node root, int key){

        if(root == (null)){
            return null;
        }

        Queue<Node> q =new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()){

            Node cn = q.poll();

            if(cn.left!=null){
                q.offer(cn.left);
            }
            if(cn.right!=null){
                q.offer(cn.right);
            }

            if(cn.item==key){
                break;
            }

        }


        return q.peek();

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
//        bt.insert(sc);
        bt.createTree();
        bt.display();
        System.out.println(bt.levelOrder(bt.getRoot()));
        System.out.println("\n"+bt.averageOfLevels(bt.getRoot()));


        //findsuccessor
        Node successor = bt.findSuccessor(bt.getRoot(), 14);
        if (successor != null) {
            System.out.println("\nSuccessor of 14: " + successor.item);
        } else {
            System.out.println("\nNo successor found.");
        }


    }
}