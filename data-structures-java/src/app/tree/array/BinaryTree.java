package app.tree.array;

public class BinaryTree<T> {
    protected Object[] arr;
    private int size;

    protected int getSize() {
        return size;
    }

    public BinaryTree(int size) {
        this.size = size + 1;
        arr = new Object[this.size];
    }

    T getNode(int index) {
        if (index < 1) {
            return null;
        }
        return (T) arr[index];
    }

    int parent(int index) {
        return index / 2;
    }

    int left(int index) {
        return 2 * index;
    }

    int right(int index) {
        return (2 * index) + 1;
    }

    public void inorder() {
        inorderRecursive(1);
    }

    void inorderRecursive(int index) {
        if (arr[index] == null) {
            return;
        }
        inorderRecursive(left(index));
        System.out.println(arr[index]);
        inorderRecursive(right(index));
    }
}