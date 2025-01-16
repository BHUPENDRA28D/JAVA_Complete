package DSA.Tree;

public class TreeDriver {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(12);
        bt.insert(9);
        bt.insert(9);

        bt.insert(15);
        bt.insert(14);
        bt.insert(21);
        bt.insert(11);
        bt.insert(1);

        // Call postorder traversal directly
//        System.out.print("Postorder Traversal: ");
//        bt.postordre(bt.root); // This will print the nodes in postorder

        bt.displayTree(bt.root,"",false);
    }
}
