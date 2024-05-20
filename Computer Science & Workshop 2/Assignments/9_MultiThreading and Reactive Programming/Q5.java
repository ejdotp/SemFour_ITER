/*
 * Q5. Implement a program that demonstrates the use of locks (e.g.,
 * ReentrantLock) for thread synchronization.Create a scenario where multiple
 * threads access a shared resource, and use locks to ensure that
 * onlyonethreadcan access the resource at a time.
 */

import java.util.concurrent.locks.ReentrantLock;

public class Q5 {
    private static final ReentrantLock lock = new ReentrantLock();
    private static int sharedResource = 0;

    public static void main(String[] args) {
        int numThreads = 5; // Number of threads accessing the shared resource
        for (int i = 0; i < numThreads; i++) {
            Thread thread = new Thread(() -> {
                accessSharedResource();
            });
            thread.start();
        }
    }

    private static void accessSharedResource() {
        try {
            lock.lock(); // Acquire the lock
            System.out.println("Thread " + Thread.currentThread().getId() + " is accessing the shared resource.");
            sharedResource++; // Modify the shared resource (e.g., increment by 1)
            System.out.println("Shared resource value: " + sharedResource);
        } finally {
            lock.unlock(); // Release the lock
        }
    }
}
/*Thread 15 is accessing the shared resource.
Shared resource value: 1
Thread 16 is accessing the shared resource.
Shared resource value: 2
Thread 17 is accessing the shared resource.
Shared resource value: 3
Thread 19 is accessing the shared resource.
Shared resource value: 4
Thread 18 is accessing the shared resource.
Shared resource value: 5 */
