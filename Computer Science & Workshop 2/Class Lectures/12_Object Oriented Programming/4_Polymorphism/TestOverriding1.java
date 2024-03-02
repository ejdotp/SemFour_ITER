class Bike
{
    void run()
    {
        System.out.println("Running at 400 kmph");
    }
}

class Honda extends Bike
{
    void run()
    {
        System.out.println("More like 120kmph LOL");
    }
}
public class TestOverriding1
{
    public static void main(String[] args)
    {
        Bike b = new Honda();
        b.run();
    }
}
