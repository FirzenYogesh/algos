package app;

import app.linkedlist.LinkedList;
import app.stack.Stack;
import app.tree.array.MinHeap;

public class App {
    public static void main(String[] args) throws Exception {
        // linkedListTest();
        minHeapTest();
    }

    static void linkedListTest() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println();
        list.add(0, 1);
        list.add(list.size(), 2);
        list.add(list.size() - 1, 3);
        list.add(1, 4);
        list.add(list.size() / 2, 5);
        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println();
        list.pop();
        list.poll();
        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println();
        System.out.println(list.remove(3));
        // for (Integer integer : list) {
        // System.out.println(integer);
        // }
        // System.out.println();
    }

    static void testStack() {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i + 1);
        }
        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }
    }

    static void minHeapTest() {
        MinHeap heap = new MinHeap(12);
        heap.insert(1);
        heap.insert(10);
        heap.insert(5);
        heap.insert(4);
        heap.insert(3);
        heap.insert(6);
        //heap.inorder();
        while(!heap.isEmpty()) {
            System.out.println(heap.pop());
        }
    }
}