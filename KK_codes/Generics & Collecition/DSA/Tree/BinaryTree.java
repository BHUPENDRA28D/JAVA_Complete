package DSA.Tree;

import org.w3c.dom.Element;

public class BinaryTree {

    class Node {
        int item;
        Node left;
        Node right;

        public Node(int item) {
            this.item = item;
        }
    }

    Node root;


    // Insertion Code
    public void insert(int data) {
        Node n = new Node(data);

        if (root == null) {
            root = n;
            System.out.println("Inserted root: " + data);
            return;
        }

        Node current = root;
        Node parent = null;

        while (true) {
            parent = current;

            if (data < current.item) { // Left Subtree
                if (current.left != null) {
                    current = current.left;
                } else {
                    current.left = n;
                    System.out.println("Inserted " + data + " to the left of " + parent.item);
                    break;
                }
            } else if (data>current.item){ // Right Subtree
                if (current.right != null) {
                    current = current.right;
                } else {
                    current.right = n;
                    System.out.println("Inserted " + data + " to the right of " + parent.item);
                    break;
                }
            }
            else { // Duplicate found
                System.out.println("Duplicate value " + data + " not allowed in BST.");
                return; // Ignore the duplicate
            }
        }
    }


//    //serach item
//    public Node search(int data) {
//        Node t = root;
//        while (t != null) {
//            if (t.item == data) {
//                return t; // Return the node if found
//            }
//            if (t.item > data) {
//                t = t.left; // Traverse the left subtree if the value is smaller
//            } else {
//                t = t.right; // Traverse the right subtree if the value is larger
//            }
//        }
//        return null; // Return null if the value is not found
//    }

    public  Node search(Node root , int data){
        if(isEmpty())
            return null;
        if(data == root.item)
            return root;
        if(data<root.item){
           return search(root.left,data);
        }
        else{
           return search(root.right,data);
        }

    }


    public boolean isEmpty() {
        return root == null;
    }

    // INORDER TRIVERSAL
    public void inorder(Node root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        System.out.print(" "+root.item);
        inorder(root.right);

    }
    // PreORDER TRIVERSAL
    public void preorder(Node root){
        if(root == null){
            return ;
        }System.out.print(" "+root.item);
        preorder(root.left);

        preorder(root.right);

    }

    //PostOrder


    public void postordre (Node root) {
        if (root == null) {
            return;
        }
        postordre(root.left);

        postordre(root.right);
        System.out.print(" " + root.item);

    }

    public void displayTree(Node root, String prefix, boolean isLeft) {
        if (root == null) {
            return;
        }
        // Print the current node with its prefix
        System.out.println(prefix + (isLeft ? "├── " : "└── ") + root.item);

        // Recurse to the left and right subtrees with updated prefixes
        displayTree(root.left, prefix + (isLeft ? "│   " : "    "), true);
        displayTree(root.right, prefix + (isLeft ? "│   " : "    "), false);


    }


//    public void deleteNode(int data){
//
//
//        Node ptr ,parptr;
//        if(isEmpty())
//             System.out.println("Tree is Empty");
//
//        ptr =root;
//        while(ptr !=null){
//            if(ptr.item ==data)
//                break;
//            if(data<ptr){
//                parptr =ptr;
//                ptr =ptr.left;
//            }
//
//            else {
//
//                parptr =ptr;
//                ptr = ptr.right;
//            }
//        }
//        if(ptr == null){
//            System.out.println("Data not found");
//        }
//
//        if(parptr ==null & ptr!=null){//root node to be deleted
//            if(ptr.left ==null && ptr.right ==null)
//                root =null;
//
//            else if (ptr.left && ptr.right){
//
//                //two children
//                Node suc,parentSuc;
//                suc = ptr.right;
//                parentSuc =ptr;
//                while (suc.left!=null){
//                    parentSuc=suc;
//                    suc=suc.left;
//                }
//                ptr.item=suc.item;
//                //now delete sucessor
//
//                if(suc == parentSuc.left)
//                    parentSuc.left=suc.right;
//                else
//                    parentSuc.right=suc.right;
//                delete suc;
//
//
//
//            }
//
//
//           else{// ONE CHILD
//
//                if(ptr.left){
//                    root =ptr.left;
//                }
//                else{
//                    root = ptr.right;
//                }
//
//            }
//
//        }
//
//        else{   //node to be deleted is not a root node.
//
//            if(ptr.left ==null && ptr.right ==null) //no child
//            {
//                if(ptr == parptr.left){
//                    parptr.left =null;
//                    delete ptr;
//                }
//                else{
//                    parptr.right =null;
//                    delete ptr;
//
//                }
//            }
//
//            else if(ptr.left && ptr.right) // two child.
//            {
//                Node suc,parentSuc;
//                suc = ptr.right;
//                parentSuc =ptr;
//                while (suc.left!=null){
//                    parentSuc=suc;
//                    suc=suc.left;
//                }
//                ptr.item=suc.item;
//                //now delete sucessor
//
//                    if(suc == parentSuc.left)
//                        parentSuc.left=suc.right;
//                    else
//                        parentSuc.right=suc.right;
//                    delete suc;
//
//
//            }
//
//            }
//            else {
//                if(ptr == parptr.left){
//                    if(ptr.left)
//                    parptr.left =ptr.left;
//                    else
//                        parptr.left=parptr.right;
//                    delete ptr;
//                }
//                else{
//                    p if(ptr == parptr.left){
//                        if(ptr.left)
//                            parptr.right =ptr.left;
//                        else
//                            parptr.right=parptr.right;
//                        delete ptr;
//
//                }
//
//            }
//
//        }
//    }




    public void deleteNode(int key) {
        root = deleteRec(root, key);
    }

    // Recursive method to delete a node
    private Node deleteRec(Node root, int key) {
        // Base case: if the tree is empty
        if (root == null) {
            System.out.println("Node with value " + key + " not found.");
            return root;
        }

        // If the key to be deleted is smaller than the root's key, then it lies in the left subtree
        if (key < root.item) {
            root.left = deleteRec(root.left, key);
        }
        // If the key to be deleted is larger than the root's key, then it lies in the right subtree
        else if (key > root.item) {
            root.right = deleteRec(root.right, key);
        }
        // If key is the same as root's key, then this is the node to be deleted
        else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.item = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteRec(root.right, root.item);
        }
        return root;
    }

    // Method to find the minimum value node in the right subtree
    private int minValue(Node root) {
        int minValue = root.item;
        while (root.left != null) {
            minValue = root.left.item;
            root = root.left;
        }
        return minValue;
    }

}
