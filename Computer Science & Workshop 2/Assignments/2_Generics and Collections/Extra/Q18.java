//Q18. Declare an array of integers. int[] arr = {1,2,10,8,7,3,4,6,5,9};. Then create a min heap of elements from the array using Priority Queue class. Again Dequeue elements of Priority Queue using appropriate methods.  

import java.util.PriorityQueue;

public class Q18 {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 10, 8, 7, 3, 4, 6, 5, 9 };

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}