// Q4. Implement a program where two threads communicate with each other using
// wait() and notify() methods.One thread should print even numbers, and the
// other should print odd numbers in sequence

public class Q4 {
    private static final int N = 10; // Number of even/odd numbers to print
    private static final Object lock = new Object();
    private static int counter = 1;

    public static void main(String[] args) {
        Thread evenThread = new Thread(() -> printEvenNumbers());
        Thread oddThread = new Thread(() -> printOddNumbers());
        evenThread.start();
        oddThread.start();
    }

    private static void printEvenNumbers() {
        synchronized (lock) {
            while (counter <= N) {
                if (counter % 2 == 0) {
                    System.out.println("Even: " + counter);
                    counter++;
                    lock.notify(); // Notify the odd thread
                } else {
                    try {
                        lock.wait(); // Wait for the odd thread to notify
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private static void printOddNumbers() {
        synchronized (lock) {
            while (counter <= N) {
                if (counter % 2 != 0) {
                    System.out.println("Odd: " + counter);
                    counter++;
                    lock.notify(); // Notify the even thread
                } else {
                    try {
                        lock.wait(); // Wait for the even thread to notify
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
/*Odd: 1
Even: 2
Odd: 3
Even: 4
Odd: 5
Even: 6
Odd: 7
Even: 8
Odd: 9
Even: 10 */