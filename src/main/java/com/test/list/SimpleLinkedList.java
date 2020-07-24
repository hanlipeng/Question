package com.test.list;

/**
 * @author hanlipeng
 * @date 2020/7/24
 */
public class SimpleLinkedList<T> {

    public void add(T obj) {
    }

    public T get(int i) {
        return null;
    }

    public int size() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }

    public static class Node<T>{
        private final T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return null;
        }
    }
}
