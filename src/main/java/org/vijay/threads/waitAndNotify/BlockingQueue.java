package org.vijay.threads.waitAndNotify;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {

    private Queue<Integer> q;
    private int capacity;

    public BlockingQueue (int cap) {
        q = new LinkedList<>();
        capacity = cap;
    }

    public boolean add(int val) {
        synchronized (q) {
            while (q.size() == capacity) {
                try {q.wait();} catch (Exception e) {};
            }
            q.add(val);
            q.notifyAll();
            return true;
        }
    }

    public int remove () {
        synchronized (q) {
            while (q.size() == 0) {
                try {q.wait();} catch (Exception e) {};
            }
            int retVal = q.poll();
            q.notifyAll();
            return retVal;
        }
    }

}
