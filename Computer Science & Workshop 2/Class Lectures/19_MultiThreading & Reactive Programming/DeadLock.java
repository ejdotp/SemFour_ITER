public class DeadLock
{
    public static void main(String[] args)
    {
        final String firstResource  = "First Resource";
        final String secondResource = "Second Resource";

        //following code demonstrates thread 1 attempt to lock firstResource then secondResource
        Thread t1 = new Thread("First Thread") {
            public void run() {
                synchronized (firstResource) {
                    System.out.println(this.getName() + " : First Resource is Locked");
                    try {Thread.sleep(1000);}
                    catch(Exception e){}
                    synchronized (secondResource) {
                        System.out.println("Second Resource is Locked.");
                    }
                }
            }
        };

        //following code demonstrates thread  2 attempt to lock secondResource, and then  firstResource
        Thread t2 = new Thread("Second Thread") {
            public void run() {
                synchronized (secondResource) {
                    System.out.println(this.getName() + " : Second Resource is locked ");
                    try {Thread.sleep(1000);}
                    catch(Exception e){}
                    synchronized (firstResource) {
                        System.out.println("First Resource is locked");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}

/*
O/P: Second Thread : Second Resource is locked 
     First Thread : First Resource is Locked

The first synchronization in thread 1 already sets first resource to
locked, which is then suspended by using sleep. This means that the program proceeds to run thread 2, which produces the
screen output about second resource, while once again sleeping to allow thread 1 to run.

However, the program is now stuck due to deadlock because thread 1 must wait for second resource to be free of lock in
thread 2, which means that the next thread for processing is thread 2. The thread 2 faces a similar situation as first resource is
similarly locked by the thread 1, creating a condition where the program is logically stuck.*/