import java.util.*;

class SmashSet
{
    public static void main(String[] args)
    {
        HashSet<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");

        Iterator<String> i=set.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        } System.out.println("The set is: " + set);
    }
}

/*
Five
One
Four
Two
Three
The set is: [Five, One, Four, Two, Three]
 */