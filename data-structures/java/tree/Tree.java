package tree;

public class Tree<T> {
    TreeNode<T> head;

    public void inorderTraversal() {
        TreeNode<T> temp = this.head;
        inorderTraversalRecursive(temp);
    }

    void inorderTraversalRecursive(TreeNode<T> root) {
        if (root == null) {
            return;
        }
        inorderTraversalRecursive(root.left);
        System.out.println(root.value);
        inorderTraversalRecursive(root.right);
    }

    public void preorderTraversal() {
        TreeNode<T> temp = this.head;
        preorderTraversalRecursive(temp);
    }

    void preorderTraversalRecursive(TreeNode<T> root) {
        if (root == null) {
            return;
        }
        System.out.println(root.value);
        preorderTraversalRecursive(root.left);
        preorderTraversalRecursive(root.right);
    }

    public void postorderTraversal() {
        TreeNode<T> temp = this.head;
        postorderTraversalRecursive(temp);
    }

    void postorderTraversalRecursive(TreeNode<T> root) {
        if (root == null) {
            return;
        }
        postorderTraversalRecursive(root.left);
        postorderTraversalRecursive(root.right);
        System.out.println(root.value);
    }
}

class TreeNode<T> implements Comparable<T> {
    public TreeNode<T> left;
    public TreeNode<T> right;
    public T value;

    public TreeNode(T data) {
        this.value = data;
    }

    @Override
    public int compareTo(Object arg0) {
        return value.toString().compareTo(arg0.toString());
    }
}