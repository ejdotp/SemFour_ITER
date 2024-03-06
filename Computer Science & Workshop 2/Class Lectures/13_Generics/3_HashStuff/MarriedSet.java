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
    }
}
/*One
Two
Three
Four
Five
[One, Two, Three, Four, Five] */
