package com.test.list;

/**
 * @author hanlipeng
 * @date 2020/7/24
 */
public class SimpleLinkedList<T> {

    private Node<T> first;

    private Node<T> last;

    private int size = 0;

    public void add(T obj) {
        Node<T> tmp = new Node<>(obj);
        if (first == null) {
            first = tmp;
        } else {
            last.next = tmp;
        }
        last = tmp;
        size++;
    }

    public T get(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> tmp = first;
        for (; index > 0; index--) {
            tmp = tmp.next;
        }

        return tmp.value;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return first.toString();
    }

    public static class Node<T> {
        private final T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            if (next == null) {
                return value.toString();
            }
            return value + "," + next.toString();
        }
    }
}
