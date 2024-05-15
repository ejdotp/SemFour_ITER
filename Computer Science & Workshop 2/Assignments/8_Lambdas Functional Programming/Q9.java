// Q9. Write a program that implements the producer-consumer problemusing lambda
// expressions and threads. Define a bounded buffer classthat implements a
// queue. Create producer and consumer classes thatuse lambda expressions to
// produce and consume items from the boundedbuffer. Create and start multiple
// producer and consumer threadstodemonstrate the producer-consumer problem.

import java.util.LinkedList;
import java.util.Queue;

public class Q9 {
  public static void main(String[] args) {
    BoundedBuffer<Integer> buffer = new BoundedBuffer<>(5);
    Thread producer1 = new Thread(() -> {
      for (int i = 1; i <= 10; i++) {
        try {
          buffer.put(i);
          System.out.println("Producer 1 produced: " + i);
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
      }
    });
    Thread producer2 = new Thread(() -> {
      for (int i = 11; i <= 20; i++) {
        try {
          buffer.put(i);
          System.out.println("Producer 2 produced: " + i);
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
      }
    });
    Thread consumer1 = new Thread(() -> {
      for (int i = 0; i < 10; i++) {
        try {
          int value = buffer.take();
          System.out.println("Consumer 1 consumed: " + value);
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
      }
    });
    Thread consumer2 = new Thread(() -> {
      for (int i = 0; i < 10; i++) {
        try {
          int value = buffer.take();
          System.out.println("Consumer 2 consumed: " + value);
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
      }
    });
    producer1.start();
    producer2.start();
    consumer1.start();
    consumer2.start();
  }
}

class BoundedBuffer<T> {
  private final Queue<T> queue = new LinkedList<>();
  private final int maxSize;

  public BoundedBuffer(int maxSize) {
    this.maxSize = maxSize;
  }

  public synchronized void put(T item) throws InterruptedException {
    while (queue.size() == maxSize) {
      wait();
    }
    queue.add(item);
    notifyAll();
  }

  public synchronized T take() throws InterruptedException {
    while (queue.isEmpty()) {
      wait();
    }
    T item = queue.poll();
    notifyAll();
    return item;
  }
}

//ArithmeticException caught