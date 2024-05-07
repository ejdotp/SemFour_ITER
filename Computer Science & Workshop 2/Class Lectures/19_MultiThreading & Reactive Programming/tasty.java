class runnableDemo implements Runnable
{
    private Thread t;
    private String threadName;

    runnableDemo(String name)
    {
        threadName = name;
        System.out.println("Creating: " + threadName);
    }

    public void run()
    {
        System.out.println("Running " + threadName);
        try{
            for(int i = 4; i > 0; i--)
            {   System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(50);
            }
        }catch(InterruptedException e){
            System.out.println("Thread " + threadName + " interrupted. ");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start()
    {
        System.out.println("Starting " + threadName);
        if( t == null )
        {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

public class tasty 
{
    public static void main(String[] args)
    {
        runnableDemo R1 = new runnableDemo("Thread-1");
        R1.start();
        runnableDemo R2 = new runnableDemo("Thread-1");
        R2.start();

    }
}

/*Creating: Thread-1
Starting Thread-1
Creating: Thread-1
Starting Thread-1
Running Thread-1
Running Thread-1
Thread: Thread-1, 4
Thread: Thread-1, 4
Thread: Thread-1, 3
Thread: Thread-1, 3
Thread: Thread-1, 2
Thread: Thread-1, 2
Thread: Thread-1, 1
Thread: Thread-1, 1
Thread Thread-1 exiting.
Thread Thread-1 exiting. */