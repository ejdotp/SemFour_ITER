import java.util.*;
class MarriedList
{
    public static void main(String[] args)
    {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ravi");
        ll.add("Ajay");  
        Iterator<String> itr = ll.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }System.out.println("Linked List: " + ll);

        ll.add(1, "Gaurav");
        System.out.println("Linked List: " + ll);

        LinkedList<String> ll2 = new LinkedList<>();
        ll2.add("Sonoo");
        ll2.add("Hanumat");
        ll.addAll(ll2);
        System.out.println("Linked List: " + ll);
        ll.addFirst("Adarsh");
        ll.addLast("Harsh");
        System.out.println("Linked List: " + ll);
    }
}

/*
Ravi
Vijay
Ravi
Ajay
Linked List: [Ravi, Vijay, Ravi, Ajay]
Linked List: [Ravi, Gaurav, Vijay, Ravi, Ajay]
Linked List: [Ravi, Gaurav, Vijay, Ravi, Ajay, Sonoo, Hanumat]
Linked List: [Adarsh, Ravi, Gaurav, Vijay, Ravi, Ajay, Sonoo, Hanumat, Harsh]
 */
