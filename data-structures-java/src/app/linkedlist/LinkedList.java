package app.linkedlist;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {
    private Node<T> head, tail;

    private int size;

    protected Node<T> getHead() {
        return head;
    }

    protected Node<T> getTail() {
        return tail;
    }

    public LinkedList() {
        head = tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    private Node<T> createNode(T data) {
        size++;
        return new Node<>(data);
    }

    public void addFirst(T data) {
        Node<T> node = createNode(data);
        if (head == null) {
            tail = head = node;
        } else {
            head.prev = node;
            node.next = head;
            head = node;
        }
    }

    public void addLast(T data) {
        Node<T> node = createNode(data);
        if (head == null) {
            tail = head = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    private void addAtIndex(int index, T data) {
        Node<T> node = createNode(data);
        if (index < size / 2) {
            Node<T> temp = head;
            int counter = 0;
            while (counter < (index - 1)) {
                temp = temp.next;
                counter++;
            }
            node.next = temp.next;
            node.prev = temp;
            temp.next.prev = node;
            temp.next = node;
        } else {
            Node<T> temp = tail;
            int counter = size - 1;
            while (counter > (index + 1)) {
                temp = temp.prev;
                counter--;
            }
            node.next = temp;
            node.prev = temp.prev;
            temp.prev.next = node;
            temp.prev = node;
        }
    }

    public void add(T data) {
        addLast(data);
    }

    public void add(int index, T data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid Index");
        }
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            addAtIndex(index, data);
        }
    }

    public boolean contains(T data) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.equals(data)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid Index");
        }
        if (index < size / 2) {
            int counter = 0;
            Node<T> temp = head;
            while (counter != index) {
                temp = temp.next;
            }
            return temp.data;
        } else {
            int counter = size;
            Node<T> temp = tail;
            while (counter != index) {
                temp = temp.prev;
                counter++;
            }
            return temp.data;
        }
    }

    public T removeFirst() {
        if (head != null) {
            size--;
            T data = head.data;
            head = head.next;
            head.prev = null;
            return data;
        } else {
            return null;
        }
    }

    public T removeLast() {
        if (tail != null) {
            size--;
            T data = tail.data;
            tail = tail.prev;
            tail.next = null;
            return data;
        } else {
            return null;
        }
    }

    public T remove() {
        return removeFirst();
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid Index");
        }
        if (index < size / 2) {
            int counter = 0;
            Node<T> temp = head;
            while (counter != index) {
                temp = temp.next;
                counter++;
            }
            T data = temp.next.data;
            temp.next.next.prev = temp;
            temp.next = temp.next.next;
            return data;
        } else {
            int counter = 0;
            Node<T> temp = tail;
            while (counter != index) {
                temp = temp.prev;
                counter--;
            }
            T data = temp.prev.data;
            temp.prev.prev.next = temp;
            temp.prev = temp.prev.prev;
            return data;
        }
    }

    public void push(T data) {
        addLast(data);
    }

    public T pop() {
        return removeLast();
    }

    public T peek() {
        if (head != null) {
            return head.data;
        } else {
            return null;
        }
    }

    public T poll() {
        return removeFirst();
    }

    public T pollFirst() {
        return removeFirst();
    }

    public T pollLast() {
        return removeLast();
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator<T>(this);
    }
}

class ListIterator<T> implements Iterator<T> {

    private Node<T> current;

    public ListIterator(LinkedList<T> list) {
        current = list.getHead();
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        T data = current.data;
        current = current.next;
        return data;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}

class Node<T> {
    Node<T> prev, next;
    T data;

    public Node(T data) {
        this.data = data;
    }
}