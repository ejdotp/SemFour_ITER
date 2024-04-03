/* Create a program that divides two numbers input by the user. Handle the possibility of
division by zero using try-catch block to catch ArithmeticException. */

public class Q9 {
    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 0;
            int z = x / y;
            System.out.println(z);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught");
        }
    }
}
