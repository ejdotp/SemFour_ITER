/* Demonstration of use nested try-catch block. Write a Java program to handle
NumberFormatException in outer try-catch block and ArithmeticException inside
the inner try-catch block. */

public class Q15 {
    public static void main(String[] args) {
        try {
            String input = "abc";
            int number = Integer.parseInt(input); 

            try {
                System.out.println("Result: " + (100 / number));
            } catch (ArithmeticException e) {
                System.out.println("Error: "+e.toString());
            }
        }
         catch (NumberFormatException e) {
            System.out.println("Error: "+e.toString());
        }
    }
}
