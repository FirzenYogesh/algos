import tree.*;

class Driver {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(10);
        bst.insert(5);
        bst.insert(12);
        bst.insert(10);
        System.out.println("inorder");
        bst.inorderTraversal();
        System.out.println("preorder");
        bst.preorderTraversal();
        System.out.println("postorder");
        bst.postorderTraversal();
    }
}