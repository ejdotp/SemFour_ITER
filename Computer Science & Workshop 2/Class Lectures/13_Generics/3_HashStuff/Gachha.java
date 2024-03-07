import java.util.*;
class Gachha
{
    public static void main(String[] args) {
        TreeSet<String> tr = new TreeSet<String>();
        tr.add("Ravi");
        tr.add("Vijay");
        tr.add("Ravi");
        tr.add("Ajay");
        tr.add("sastri");
        //Traversing elements:
        Iterator<String> itr = tr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        } System.out.println(tr);

        TreeSet<Integer> tr1 = new TreeSet<Integer>();
        tr1.add(1);
        tr1.add(2);
        tr1.add(3);
        tr1.add(4);
        tr1.add(5);
        System.out.println(tr1);
        Iterator<Integer> itr1 = tr1.descendingIterator(); //print in descending
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
        System.out.println("Lowest Value" + tr1.pollFirst());
        System.out.println("Highest Value" + tr1.pollLast());
        System.out.println(tr1.subSet(1, 4));
        System.out.println(tr1.headSet(3));
        System.out.println(tr1.tailSet(3));
        System.out.println(tr1.reversed());
    }
}

/*Ajay
Ravi
Vijay
[Ajay, Ravi, Vijay]
[1, 2, 3]
3
2
1
Lowest Value1
Highest Value3*/