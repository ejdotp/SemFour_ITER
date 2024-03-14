import java.util.*;

class PiiChan
{
    public static void main(String[] args)
    {
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Hello");
        pq.add("How");
        pq.add("Have");
        pq.add("You");
        pq.add("Been");

        System.out.println("Initial PQ: " + pq);
    }
}
