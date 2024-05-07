public class synchronization
{
    public static void main(String[] args)
    {
        Counter counter = new Counter();

        //Create multiple threads to access counter
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++)
                counter.increment();
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++)
                counter.decrement();
        });

        //Start both threads
        thread1.start();
        thread2.start();
    }
}

class Counter
{
    private int count = 0;

    public synchronized void increment()
    {
        count++;
        System.out.println("Increment count: " + count);
    }

    public synchronized void decrement()
    {
        count--;
        System.out.println("Decrement count: " + count);
    }

    public synchronized int getCount()
    {
        System.out.println("Synchronized count: " + count);
        return count;
    }
}

/*Increment count: 1
Increment count: 2
Increment count: 3
Increment count: 4
Increment count: 5
Increment count: 6
Increment count: 7
Increment count: 8
Increment count: 9
Increment count: 10
Decrement count: 9
Decrement count: 8
Decrement count: 7
Decrement count: 6
Decrement count: 5
Decrement count: 4
Decrement count: 3
Decrement count: 2
Decrement count: 1
Decrement count: 0*/