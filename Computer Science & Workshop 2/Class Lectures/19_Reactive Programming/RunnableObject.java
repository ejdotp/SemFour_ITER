class Mainn implements Runnable
{
    public static void main(String[] args)
    {
        Runnable r = new Mainn();
        Thread t = new Thread(r, "My Runnable Thread");
        t.start();
        String st = t.getName();
        System.out.println(st);
    }

    public void run()
    {
        System.out.println("Runnable Thread is Running.");
    }
}

/*My Runnable Thread
Runnable Thread is Running.*/
