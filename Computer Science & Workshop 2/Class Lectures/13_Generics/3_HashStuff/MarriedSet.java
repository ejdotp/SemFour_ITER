import java.util.*;
class MarriedSet {
    public static void main(String[] args) {
        LinkedHashSet<String> LS = new LinkedHashSet();
        LS.add("One");
        LS.add("Two");
        LS.add("Three");
        LS.add("Four");
        LS.add("Five");

        Iterator<String> i=LS.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        } System.out.println(LS);

        //Removing Specific element from hashset:
        LS.remove("Ravi");
        System.out.println("After invoking remove(object) method: " + LS);

        HashSet<String> set1 = new HashSet<String>();
        set1.add("Ajay");
        set1.add("Gaurav");
        LS.addAll(set1);
        System.out.println("Updated List: " + LS);
        //Removing all the new elements from the HashSet
        LS.removeAll(set1);
        System.out.println("After invoking removeAll(Object) method: " + LS);
        //removing elements on the basis of specific condition
        LS.removeIf(str->str.contains("Vijay"));
        System.out.println("After invoking removeIf() method: " + LS);
        //removing all elements available:
        LS.clear();
        System.out.println("After invoking clear() method: " + LS);
    }
}
/*
One
Two
Three
Four
Five
[One, Two, Three, Four, Five]
After invoking remove(object) method: [One, Two, Three, Four, Five]
Updated List: [One, Two, Three, Four, Five, Gaurav, Ajay]
After invoking removeAll(Object) method: [One, Two, Three, Four, Five]
After invoking removeIf() method: [One, Two, Three, Four, Five]
After invoking clear() method: []
*/
