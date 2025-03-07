package Trees;

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



    public void insert(int data){

    }

    private Node insert(int data,Node node){
        if(node == null){
            node = new Node(data);
            return node;
        }
        if(data <node.item){
            node.left= insert(data,node.left);
        }

        else if(data <node.item){
            node.right= insert(data,node.right);
        }
        else{
        System.out.println("Duplicate value " + data + " not allowed in BST.");
        return null;
        }

        node.height = Math.max(getHeight(node.left),getHeight(node.right)+1);
        return node;
    }
}
