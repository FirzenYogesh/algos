package linkedlist;

public class SinglyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    private int size;

    public int getSize() {
        return size;
    }

    public SinglyLinkedList() {
        this.head = this.tail = null;
        this.size = 0;
    }

    private Node<T> createNode(T data) {
        size++;
        return new Node<>(data);
    }

    public void add(int position, T data) {
        if (position == 0) {
            addAtStart(data);
        } else if (position == size - 1) {
            addAtEnd(data);
        } else {
            addAtPosition(position, data);
        }
    }

    public void add(T data) {
        addAtEnd(data);
    }

    private void addAtStart(T data) {
        Node<T> node = createNode(data);
        if (tail == null) {
            tail = node;
        }
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    private void addAtEnd(T data) {
        Node<T> node = createNode(data);
        if (head == null) {
            head = node;
        }
        if (tail == null) {
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    private void addAtPosition(int position, T data) {
        Node<T> node = createNode(data);
        Node<T> temp = head;
        int count = 0;
        while (count < position && temp != null) {
            temp = temp.next;
            count++;
        }
        node.next = temp.next;
        temp.next = node;
    }

    public boolean exists(T key) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.compareTo(key) == 0) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public T get(int positon) {
        Node<T> temp = head;
        while (temp != null) {
        }
        return null;
    }

    public T remove(int position) {
        
        return null;
    }
}