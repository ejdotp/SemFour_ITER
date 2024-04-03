/* Write a Java program that computes the value of the function log(sin(x) + cos(x)) /
(tan(x) - cot(x)) for a given value of x. Ensure proper handling of exceptions that may
occur due to invalid mathematical operations. */

public class Q11 {
    public static void main(String[] args) {
        try {
            double x = Math.PI / 2;
            double result = Math.log((Math.sin(x) + Math.cos(x)) / (Math.tan(x) - (1 / Math.tan(x))));
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught");
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
}
