//Q15. Given an array of integers, print the repeating integers in the array with the help of a HashSet.  

import java.util.HashSet;

public class Q15 {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 4, 5, 6, 6, 7 };

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            if (set.contains(arr[i])) {
                System.out.println("Repeating integer: " + arr[i]);
            }

            set.add(arr[i]);
        }
    }
}
