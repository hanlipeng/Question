package com.test.list;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author hanlipeng
 * @date 2020/7/24
 */
public class SimpleBlockingQueue<T> {

    private final int capacity;

    private final Queue<T> queue = new LinkedList<>();

    public SimpleBlockingQueue(int capacity) {
        this.capacity = capacity;
    }

    public void push(T value) throws InterruptedException {

    }

    public T poll() throws InterruptedException {
        return null;
    }

    public int size() {
        synchronized (queue) {
            return queue.size();
        }
    }
}
