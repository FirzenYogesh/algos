package linkedlist;

public class Node<T> implements Comparable<T> {
    T data;
    Node<T> next;
    Node<T> prev;

    public Node(T data) {
        this.data = data;
        prev = next = null;
    }

    @Override
    public int compareTo(T arg0) {
        return this.data.toString().compareTo(arg0.toString());
    }
}