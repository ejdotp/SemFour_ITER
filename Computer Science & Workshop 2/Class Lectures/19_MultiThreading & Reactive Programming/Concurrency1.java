import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Concurrency1
{
    public static void main(String[] args)
    {
        ExecutorService excalliber = Executors.newFixedThreadPool(5); // executor named excalliber
                                                                               // Creates a thread pool with 5 Threads
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread(" " + i);
            excalliber.execute(worker); // Execute the worker
        }
        excalliber.shutdown(); // shutdown the executor once tasks are completed

        while (!excalliber.isTerminated()) {

        }
        System.out.println("All tasks completed");
    }
}

class WorkerThread implements Runnable
{
    private String message;

    public WorkerThread(String s)
    {
        this.message = s;
    }

    public void run()
    {
        System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
        processMessage(); // Simulating some work

        System.out.println(Thread.currentThread().getName() + " (End)");
    }

    private void processMessage()
    {
        try {
            Thread.sleep(2800); // Sleep for 2.8 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

/*pool-1-thread-1 (Start) message =  0
pool-1-thread-3 (Start) message =  2
pool-1-thread-4 (Start) message =  3
pool-1-thread-2 (Start) message =  1
pool-1-thread-5 (Start) message =  4
pool-1-thread-1 (End)
pool-1-thread-1 (Start) message =  5
pool-1-thread-3 (End)
pool-1-thread-3 (Start) message =  6
pool-1-thread-2 (End)
pool-1-thread-2 (Start) message =  7
pool-1-thread-5 (End)
pool-1-thread-5 (Start) message =  8
pool-1-thread-4 (End)
pool-1-thread-4 (Start) message =  9
pool-1-thread-1 (End)
pool-1-thread-3 (End)
pool-1-thread-2 (End)
pool-1-thread-5 (End)
pool-1-thread-4 (End)
All tasks completed*/