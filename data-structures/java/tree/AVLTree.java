package tree;

public class AVLTree<T> extends BinarySearchTree<T> {
    void rightRotate(TreeNode<T> imbalancedNode) {
        TreeNode<T> temp = imbalancedNode;
        head = imbalancedNode.left;
        temp.left = imbalancedNode.left.right;
        head.right = temp;
    }

    void leftRotate(TreeNode<T> imbalancedNode) {
        TreeNode<T> temp = imbalancedNode;
        head = imbalancedNode.right;
        temp.right = imbalancedNode.right.left;
        head.left = temp;
    }
}