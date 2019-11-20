package tree;

public class BinarySearchTree<T> extends Tree<T> {

    public TreeNode<T> search(T key) {
        TreeNode<T> temp = this.head;
        return searchRecursively(key, temp);
    }

    TreeNode<T> searchRecursively(T data, TreeNode<T> root) {
        if (root == null || root.equals(data)) {
            return root;
        }
        if (root.compareTo(data) <= 0) {
            return searchRecursively(data, root.left);
        }
        return searchRecursively(data, root.right);
    }

    public void insert(T data) {
        head = insertRecursively(data, head);
    }

    TreeNode<T> insertRecursively(T data, TreeNode<T> root) {
        if (root == null) {
            root = new TreeNode<T>(data);
            return root;
        }
        if (root.compareTo(data) <= 0) {
            root.left = insertRecursively(data, root.left);
        } else {
            root.right = insertRecursively(data, root.right);
        }
        return root;
    }
}