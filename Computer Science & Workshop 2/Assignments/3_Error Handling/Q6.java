/* Write a Java program to handle NumberFormatException. */

public class Q6 {
    public static void main(String[] args) {
        try {
            String str = "abc";
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught");
        }
    }
}