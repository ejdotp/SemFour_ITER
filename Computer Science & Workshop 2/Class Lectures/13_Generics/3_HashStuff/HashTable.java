import java.util.*;

public class HashTable
{
    public static void main(String[] args)
    {
        Hashtable<Integer, String> hm = new Hashtable<>();
        hm.put(100, "Amit");
        hm.put(102, "Ravi");
        hm.put(103, "Rahul");
        hm.put(101, "Vijay");

        for(Map.Entry m : hm.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());  

        System.out.println(hm.getOrDefault(101, "Not Found"));  // Vijay
        System.out.println(hm.getOrDefault(110, "Not Found"));  //will return not found if not present
    }
}
