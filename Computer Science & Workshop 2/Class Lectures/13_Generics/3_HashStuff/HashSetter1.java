import java.util.*;
class SecondSmashSett
{
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Arun");
        set.add("Sumit");
        System.out.println("An initial list of elements: " + set);
        //Removing Specific element from hashset:
        set.remove("Ravi");
        System.out.println("After invoking remove(object) method: " + set);

        HashSet<String> set1 = new HashSet<String>();
        set1.add("Ajay");
        set1.add("Gaurav");
        set.addAll(set1);
        System.out.println("Updated List: " + set);
        //Removing all the new elements from the HashSet
        set.removeAll(set1);
        System.out.println("After invoking removeAll(Object) method: " + set);
        //removing elements on the basis of specific condition
        set.removeIf(str->str.contains("Vijay"));
        System.out.println("After invoking removeIf() method: " + set);
        //removing all elements available:
        set.clear();
        System.out.println("After invoking clear() method: " + set);
    }
}
/*An initial list of elements: [Vijay, Ravi, Arun, Sumit]
After invoking remove(object) method: [Vijay, Arun, Sumit]
Updated List: [Vijay, Arun, Gaurav, Sumit, Ajay]
After invoking removeAll(Object) method: [Vijay, Arun, Sumit]
After invoking removeIf() method: [Arun, Sumit]
After invoking clear() method: [] */