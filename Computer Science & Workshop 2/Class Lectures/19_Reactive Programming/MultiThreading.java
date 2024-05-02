class Mained extends Thread{
    public static void main(String[] args) {
        Mained ob = new Mained();
        ob.start();
    }

    public void run(){
        System.out.println("Thread is Running....");
    }
}

/*Thread is Running.... */