/* Implement a Java program that performs complex manipulations on an array of
integers. The program should involve operations such as sorting, searching, and
accessing elements at various indices. Introduce scenarios, where accessing elements
beyond the bounds of the array leads to ArrayIndexOutOfBoundsException. Your
task is to handle these exceptions gracefully and ensure the program continues
execution without crashing. */

import java.util.Arrays;

public class Q19 {
    public static void main(String[] args) {
        int[] array = { 10, 5, 8, 3, 12 };

        try {
            Arrays.sort(array);
            System.out.println("Sorted Array: " + Arrays.toString(array));

            int key = 8;
            System.out.println("Element " + key + (binarySearch(array, key) ? " is " : " is not "));
            System.out.println("Element at index 3 : " + array[3]);
            System.out.println("Element at index 6 : " + array[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
    }

    public static boolean binarySearch(int[] a, int key) {
        int left = 0;
        int right = a.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == key)
                return true;
            else if (a[mid] < key)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }
}
