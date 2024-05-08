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
                    try {Thread.sleep(100);}
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
                    try {Thread.sleep(50);}
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

/*Second Thread : Second Resource is locked 
First Thread : First Resource is Locked */