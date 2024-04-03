/* Implement a Java program that performs complex manipulations on an array of
integers. The program should involve operations such as sorting, searching, and
accessing elements at various indices. Introduce scenarios, where accessing elements
beyond the bounds of the array leads to ArrayIndexOutOfBoundsException. Your
task is to handle these exceptions gracefully and ensure the program continues
execution without crashing. */

public class Q19 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        }
    }    
}
