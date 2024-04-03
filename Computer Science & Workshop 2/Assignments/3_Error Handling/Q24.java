/* Write a Java program to demonstrate a checked exception (e.g.,
FileNotFoundException) being thrown and caught using try-catch block. */

public class Q24 {
    public static void main(String[] args) {
        try {
            throw new java.io.FileNotFoundException("FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
