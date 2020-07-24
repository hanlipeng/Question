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
        synchronized (queue) {
            while (queue.size() >= capacity) {
                queue.wait();
            }
            queue.offer(value);
            queue.notifyAll();
        }
    }

    public T poll() throws InterruptedException {
        synchronized (queue) {
            while (queue.isEmpty()) {
                queue.wait();
            }
            queue.notifyAll();
            return queue.poll();
        }
    }

    public int size() {
        synchronized (queue) {
            return queue.size();
        }
    }
}
