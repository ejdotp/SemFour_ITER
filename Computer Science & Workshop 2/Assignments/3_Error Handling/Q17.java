/* Implement a Java program that involves dynamic data structures such as linked lists or
trees, where elements are stored in arrays. Introduce scenarios, where accessing
elements beyond the bounds of the array backing the data structure results in
ArrayIndexOutOfBoundsException. Your task is to implement bounds checking and
handle these exceptions effectively while maintaining the integrity of the data structure. */

import java.util.LinkedList;

public class Q17 {
    public static void main(String[] args) {
        LinkedList<int[]> list = new LinkedList<>(); 
        list.add(new int[]{11, 12, 55});
        try {
            int[] arr1 = list.get(0);
            System.out.print("Array 1: ");
            for (int num : arr1)
                System.out.print(num + " ");
            System.out.println();
            int[] arr2 = list.get(2);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
    }
}
