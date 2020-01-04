package app.tree.array;

public class MinHeap extends BinaryTree<Integer> {

    private int heapSize;

    public MinHeap(int size) {
        super(size);
        heapSize = 1;
    }

    public int getMin() {
        return getNode(1);
    }

    public void insert(int data) {
        if (heapSize == getSize()) {
            throw new StackOverflowError();
        }
        heapSize++;
        int pos = heapSize - 1;
        arr[pos] = data;
        while(pos != 1 && getNode(parent(pos)) > getNode(pos)) {
            swap(parent(pos), pos);
            pos = parent(pos);
        }
    }

    public void heapify(int index) {
        int l = left(index);
        int r = right(index);
        int smallest = index;
        if (l < heapSize && getNode(l) < getNode(smallest)) {
            smallest = l;
        }
        if (r < heapSize && getNode(r) < getNode(smallest)) {
            smallest = r;
        }
        if (smallest != index) {
            swap(smallest, index);
            heapify(smallest);
        }
    }

    void swap(int pos1, int pos2) {
        Object temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    public int pop() {
        int data = getNode(1);
        arr[1] = arr[heapSize - 1];
        heapSize--;
        heapify(1);
        return data;
    }

    public boolean isEmpty() {
        return heapSize == 1;
    }

}