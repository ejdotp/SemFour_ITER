abstract class Bike
{
    abstract void run();
}

class Yamaha extends Bike
{
    void run()
    {
        System.out.println("running safely");
    }

    public static void main(String args[])
    {
        Bike b = new Yamaha();
        b.run();
    }
}