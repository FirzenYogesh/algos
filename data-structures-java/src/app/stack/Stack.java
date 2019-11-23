package app.stack;

public class Stack<T> {
    private Node<T> head, tail;
    private int size;

    protected Node<T> getHead() {
        return head;
    }

    protected Node<T> getTail() {
        return tail;
    }

    public Stack() {
        head = tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public void push(T data) {
        size++;
        Node<T> node = new Node<>(data);
        if (head == null) {
            tail = head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public T peek() {
        if (head == null) {
            throw new NullPointerException();
        }
        return head.data;
    }

    public T pop() {
        if (head == null) {
            throw new NullPointerException();
        }
        size--;
        T data = head.data;
        head = head.next;
        return data;
    }

}

class Node<T> {
    Node<T> prev, next;
    T data;

    public Node(T data) {
        this.data = data;
    }
}