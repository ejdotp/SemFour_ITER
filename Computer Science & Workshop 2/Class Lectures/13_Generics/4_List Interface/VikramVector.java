import java.util.*;
class VikramVector {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.add("Lion");
        v.add("Tiger");
        v.add("Dog");
        v.add("Elephant");
        v.addElement("Rat");
        v.addElement("Cat");
        v.addElement("Deer");
        System.out.println("Elements are: " + v);
        System.out.println("Size = " + v.size());
        System.out.println("Capacity = " + v.capacity());

        if(v.contains("Tiger"))
            System.out.println("index of Tiger = " + v.indexOf("Tiger"));
        else
            System.out.println("No Tiger :(");

        System.out.println("First = " + v.firstElement());
        System.out.println("Last = " + v.lastElement());
    }
}
/*
Elements are: [Lion, Tiger, Dog, Elephant, Rat, Cat, Deer]
Size = 7
Capacity = 10
index of Tiger = 1
First = Lion
Last = Deer
 */
