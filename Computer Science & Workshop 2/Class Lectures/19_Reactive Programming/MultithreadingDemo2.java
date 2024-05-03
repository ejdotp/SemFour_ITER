class Mainnn
{
    public static void main(String[] args)
    {
        int n = 8; //Number of Threads
        for(int i = 0; i < n; i++)
        {
            MultiThreadingDemo object = new MultiThreadingDemo();
            object.start();
        }
    }
}
class MultiThreadingDemo extends Thread
{
    public void run()
    {
        try{
            //Displaying the thread that is running
            System.out.println("Thread " + Thread.currentThread().getId() + " is running.");
        } catch (Exception e) {
            //Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}

/*Thread 18 is running.
Thread 15 is running.
Thread 22 is running.
Thread 20 is running.
Thread 21 is running.
Thread 17 is running.
Thread 16 is running.
Thread 19 is running.*/