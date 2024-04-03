/* Develop a program that performs complex mathematical (may have log, trigonometric
and algebraic functions) computations. Handle unchecked NullPointerException
gracefully using try-catch block and provide a meaningful error message. */

public class Q5 {
    public static void main(String[] args) {
        try {
            double x = 10;
            double y = 0;
            double z = x / y;
            System.out.println(z);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught");
        }
    }
}
