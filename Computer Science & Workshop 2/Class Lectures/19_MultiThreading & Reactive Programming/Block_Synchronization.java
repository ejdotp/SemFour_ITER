public class Block_Synchronization
{
    public static void main(String[] args)
    {
        Calculator og = new  Calculator();
        WorkerThread1 t1 = new WorkerThread1(og);
        WorkerThread2 t2 = new WorkerThread2(og);
        t1.start();
        t2.start();
    }
}

class Calculator {
    void multiplicationTable(int n)
    {
        //following block will ensure the method is accessible in synchronized manner
        synchronized (this){
            for (int i=1;i<=10;i++){
                System.out.println(Thread.currentThread().getName() + ": " + n*1);
                try { Thread.sleep(400);}
                catch (Exception e) { System.out.println(e);}
            }
        }
    }
}

class WorkerThread1 extends Thread {
    Calculator t;
    WorkerThread1(Calculator t) {
        this.t = t;
        this.setName("Worker Thread 1");
    }
    public void run() {
        t.multiplicationTable(3);
    }
}

class WorkerThread2 extends Thread {
    Calculator t;
    WorkerThread2(Calculator t) {
        this.t = t;
        this.setName("Worker Thread 2");
    }
    public void run() {
        t.multiplicationTable(40);
    }
}

/*Worker Thread 1: 3
Worker Thread 1: 3
Worker Thread 1: 3
Worker Thread 1: 3
Worker Thread 1: 3
Worker Thread 1: 3
Worker Thread 1: 3
Worker Thread 1: 3
Worker Thread 1: 3
Worker Thread 1: 3
Worker Thread 2: 40
Worker Thread 2: 40
Worker Thread 2: 40
Worker Thread 2: 40
Worker Thread 2: 40
Worker Thread 2: 40
Worker Thread 2: 40
Worker Thread 2: 40
Worker Thread 2: 40
Worker Thread 2: 40*/