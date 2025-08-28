package Trees;

import java.util.ArrayList;

public class BST{
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(bst.root);

        bst.preOrder(bst.root);
        System.out.println();
        bst.inOrder(bst.root);
        System.out.println();
        
        bst.postOrder(bst.root);
        System.out.println();

        System.out.println(bst.isEmpty(bst.root));
        System.out.println(bst.height(bst.root));

        bst.minValueNode(bst.root);

        Node found = bst.search(bst.root,13);
        if(found != null){
            System.out.println("Found in tree");
        }else
            System.out.println("Not Found in tree");


    }
    //Node class.
    public static class Node {
       private   int item,height;
       private Node left,right;

        public Node(int item){this.item =item;}
    }

    public Node root;

    // isEmpty
    public boolean isEmpty(Node root){
        if(root== null) return true;
        return false;
    }

    //height
    public int height(Node node){
        if(node ==null) return -1;
        return node.height;
    }

    // insert recursively

    public void insert(Node n){
        int [] bstElements = new int[]{24,12,5,4,6,19,15,13,20,30,50};
        for(int i :bstElements){
            root= insert(root,i);
        }
    }
    private Node insert(Node node,int data){
        if (node== null){
           node= new Node(data);
          return node;
        }

        if(data<node.item)
            node.left = insert(node.left,data);

        else if (data>node.item)
            node.right =insert(node.right,data);

        else{
            System.out.println("Duplicate Data "+data+" or invalid data not allowed");
            return node;
        }

        node.height = Math.max(height(node.left),height(node.right))+1;
        return node;
    }


    //insert by iteration

    public void insertByIteration(int data){

        Node newNode = new Node(data);

        if(root == null){
            root = newNode;
            return ;
        }

        Node current = root;
        Node parent = null;

        while(current != null){
            parent = current;
            if(data< current.item){
                current=current.left;
                }
           else if(data> current.item){
                current=current.right;
            }
           else{
                System.out.println("Duplicate and invalid value not allowed");
                return;
            }
        }

      if (data < parent.item)
          parent.left = newNode;
      else
          parent.right =newNode;

    }


    // Treversing Techniques

    public void preOrder(Node node){
        if(node == null)
            return ;

        System.out.print(node.item+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(Node node){
        if(node == null)
            return ;

        inOrder(node.left);
        System.out.print(node.item+" ");
        inOrder(node.right);
    }


    public void postOrder(Node node){
        if(node == null)
            return ;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.item+" ");
    }


    //Minimum Value in Tree.
    public Node minValueNode(Node node){
        if(node == null)
            return  node;

        while(node.left!=null)
            node= node.left;

        System.out.println("minimum element = "+node.item);
        return node;
    }

    //Maximum Value of Tree.
    public Node maxValueNode(Node node){
        if(node == null) return node;
        while(node.right!=null)
            node= node.right;

        System.out.println("Maximum element = "+node.item);
        return node;
    }

    //Search
    public Node search (Node n, int data){
        if(n== null) return n;

       return (data<n.item) ?search(n.left,data):search(n.right,data);

    }

    //delete by Recursion

    public Node deleteNode(Node n , int data){
        if(n == null)
            return n;

        Node current = n;
        Node parent = null;

        while(current !=null && current.item!=data){
            current =(data<current.item)?current.left: current.right;

        }

        if(current == null){
            System.out.println("Node Not found");
            return n;
        }

        if(current.left == null && current.right ==null){
                if(parent == null ) return  null;
                if(parent.left==current) parent.left =null;
                parent.right =null;
            }

        else if(current.left!=null  && current.right!=null){

            Node child = (current.left!=null)? current.left :current.right;

            if (parent ==null) return null;
            else if(parent.left==current) parent.left =child;
            else parent.right =child;
        }

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
        root = delete(root,data);
    }
    public Node delete(Node n ,int data){

        if(n == null)
            return null;

        if(data<n.item)
            n.left =deleteNode(n.left,data);
        else if (data>n.item)
            n.right =deleteNode(n.right,data);

        else{
            // Case 1 . No child
            if(n.left ==null && n.right ==null){
                return null;
            }
            // Case 2: One child
            else if (n.left == null) {
                return n.right;
            }
            else if (n.right == null) {
                return root.left;
            }

            //Case 3: 2 Child

                Node succsorNode = minValueNode(n);
                n.item = succsorNode.item;
                n.right = deleteNode(n.right,succsorNode.item);

        }


        return n;

    }

    public  boolean balancedorNot(){
      return  balanced(root);
    }
    public boolean balanced(Node node){
        if(node ==  null) return true;

        return Math.abs(height(node.left) - height(node.right))<=1 && balanced(node.right) && balanced(node.left);
    }

}