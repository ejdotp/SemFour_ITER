class Main implements Runnable
{
    public static void main(String[] args)
    {
        Main ob = new Main();
        Thread t1 = new Thread(ob);
        t1.start();
    }

    public void run()
    {
        System.out.println("Thread in Runnable Interface");
        System.out.println(Thread.currentThread().getName());
    }
}

/*Thread in Runnable Interface
Thread-0 */
