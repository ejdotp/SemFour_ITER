/* Create a Java application that calculates the value of the expression sqrt(abs(sin(x) *
cos(x))) / (tan(x) + 1) for a given value of x. Handle cases where x leads to division
by zero or negative values inside the square root function. */
public class Q12 {
    public static void main(String[] args) {
        try {
            double x = Math.PI / 2;
            double result = Math.sqrt(Math.abs(Math.sin(x) * Math.cos(x))) / (Math.tan(x) + 1);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught");
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
}
//By :- Subhajyoti Prusty
//2241016491
//CSE-44