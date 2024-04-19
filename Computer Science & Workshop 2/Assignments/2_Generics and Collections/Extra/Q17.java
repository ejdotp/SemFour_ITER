//Q17. Given an unsorted array of integers from 1 to 10, find smallest positive number missing in the array. Use a hash map HashMap<Integer, Integer> to keep track of elements.  

import java.util.HashMap;

public class Q17 {
    public static void main(String[] args) {

        int[] arr = { 5, -2, 10, 1, -1, 3 };

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] <= arr.length) {
                if (map.containsKey(arr[i])) {
                    map.put(arr[i], map.get(arr[i]) + 1);
                } else {
                    map.put(arr[i], 1);
                }
            }
        }

        int min = 1;
        for (int i = 0; i < arr.length; i++) {

            if (!map.containsKey(min)) {
                System.out.println("Smallest positive number missing: " +
                        min);
                return;
            }

            min++;
        }

        System.out.println("Smallest positive number missing: " + min);
    }
}
