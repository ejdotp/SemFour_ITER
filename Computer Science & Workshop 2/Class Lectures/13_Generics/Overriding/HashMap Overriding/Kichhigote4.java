import java.util.*;

class HashMap1
{
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>(); //Creating HashMap
        map.put(1, "Mango"); //Put elemnts on map
        map.put(2, "Apple"); 
        map.put(4, "Grapes");
        map.put(3, "Banana");

        System.out.println("Iterating Hashmap...");
        for(Map.Entry m : map.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());
    }
}

/*Iterating Hashmap...
1 Mango
2 Apple
3 Banana
4 Grapes */
//Bro reorders itself cuz bro's a HashMap