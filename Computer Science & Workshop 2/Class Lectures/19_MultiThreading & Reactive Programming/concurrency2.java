import java.util.concurrent.atomic.AtomicInteger;

public class concurrency2
{
    public static void main(String[] args)
    {
        AtomicInteger count = new AtomicInteger(5);
        count.incrementAndGet();
        System.out.println("Count: " + count.get());
    }
}

//Count: 6