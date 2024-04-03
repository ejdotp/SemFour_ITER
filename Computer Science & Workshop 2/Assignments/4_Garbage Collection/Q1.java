/* Write a program that initializes a lot of objects in a loop and observe how much time it
takes to crash the program. */

public class Q1 {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 1000000000; i++) {
                new Object();
            }
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryError: " + e.getMessage());
        }
    }
}
