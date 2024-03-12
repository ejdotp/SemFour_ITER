import java.util.*;
class ArreyListy
{
    public static void main(String[] args)
    {
        //Creating list:
        ArrayList<String> list = new ArrayList<String>();
        list.add("mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        //printing the array list
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("\nReturning element: " + list.get(1));
        list.set(1, "Dates");
        System.out.println("\nPrinting using for-if loop:- ");
        for(String i : list){
            System.out.println(i);
        }
    }
}
/*
mango
Apple
Banana
Grapes

Returning element: Apple

Printing using for-if loop:- 
mango
Dates
Banana
Grapes
 */