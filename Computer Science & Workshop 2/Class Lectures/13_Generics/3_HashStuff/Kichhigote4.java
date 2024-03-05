import java.util.*;

class HashMap1
{
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>(); //Creating HashMap
        map.put(1, "Mango"); //Put elemnts on map
        map.put(2, "Apple"); 
        map.put(4, "Grapes");
        map.put(3, "Banana");

        map.putIfAbsent(5, "Pijuli"); //Adds if not in map
        map.putIfAbsent(2, "Apple"); //wont work
        map.putIfAbsent(6, "Apple"); //will work
        map.putIfAbsent(2, "Panasa"); //wont work

        System.out.println("Iterating Hashmap0...");
        for(Map.Entry m : map.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());

        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(7, "Kiwi");
        map1.putAll(map); //Copying all elements of map to map1

        System.out.println("\nIterating Hashmap1...");
        for(Map.Entry m : map1.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());  

        map.putAll(map1);
        map.remove(2);//Removing element by only key
        map.remove(3, "Banana");//Removing element by key and value

        System.out.println("\nIterating Hashmap0...");
        for(Map.Entry m : map.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());

        map1.replaceAll((key, oldValue) -> "Promgrenade");  //Replacing all values with Promgrenade

        System.out.println("\nIterating Hashmap1...");
        for(Map.Entry m : map1.entrySet())
            System.out.println(m.getKey() + " " + m.getValue()); 
    }
}

/*Iterating Hashmap0...
1 Mango
2 Apple
3 Banana
4 Grapes
5 Pijuli
6 Apple

Iterating Hashmap1...
1 Mango
2 Apple
3 Banana
4 Grapes
5 Pijuli
6 Apple
7 Kiwi

Iterating Hashmap0...
1 Mango
4 Grapes
5 Pijuli
6 Apple
7 Kiwi

Iterating Hashmap1...
1 Promgrenade
2 Promgrenade
3 Promgrenade
4 Promgrenade
5 Promgrenade
6 Promgrenade
7 Promgrenade*/
//Bro reorders itself cuz bro's a HashMap