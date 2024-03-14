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

        pq.remove("Have");
        System.out.println("After removing \"Have\": " + pq);

        System.out.println("Invoking poll method: " + pq.poll());

        System.out.println("Does the queue contain \"Hello\" ?" + pq.contains("Hello"));
        System.out.println("Size: " + pq.size());
        System.out.println("Final: " + pq);
        pq.clear();
        System.out.println("is it empty? " + pq.isEmpty());
    }
}
/*
Initial PQ: [Been, Have, Hello, You, How]
After removing "Have": [Been, How, Hello, You]
Invoking poll method: Been
Does the queue contain "Hello" ?true
Size: 3
Final: [Hello, How, You]
is it empty? true
 */