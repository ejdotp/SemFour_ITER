/* Create a custom checked exception class named CustomCheckedException. Use this
exception in your program to handle a specific error condition and demonstrate its usage
using try-catch block. */

class Question22 {
    public static void main(String[] args) {
        try {
            divide(5, 0);
        } catch (CustomCheckedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void divide(int x, int y) throws CustomCheckedException {
        if (y == 0) {
            throw new CustomCheckedException("Division by zero is not allowed");
        }
        System.out.println(x / y);
    }
}

class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}
