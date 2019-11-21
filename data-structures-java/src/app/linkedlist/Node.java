package app.linkedlist;

public class Node<T> {
    Node<T> prev, next;
    T data;

    public Node(T data) {
        this.data = data;
    }
}