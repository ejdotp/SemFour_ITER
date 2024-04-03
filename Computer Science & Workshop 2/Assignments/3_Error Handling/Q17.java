/* Implement a Java program that involves dynamic data structures such as linked lists or
trees, where elements are stored in arrays. Introduce scenarios, where accessing
elements beyond the bounds of the array backing the data structure results in
ArrayIndexOutOfBoundsException. Your task is to implement bounds checking and
handle these exceptions effectively while maintaining the integrity of the data structure. */

import java.util.LinkedList;

public class Q17 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        try {
            System.out.println(list.get(5));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        }
    }
}
