/* Create a custom checked exception class named CustomCheckedException. Use this
exception in your program to handle a specific error condition and demonstrate its usage
using try-catch block. */

public class Q22 {
    public static void main(String[] args) {
        try {
            throw new CustomCheckedException("Custom Checked Exception");
        } catch (CustomCheckedException e) {
            System.out.println(e);
        }
    }
}

class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}
