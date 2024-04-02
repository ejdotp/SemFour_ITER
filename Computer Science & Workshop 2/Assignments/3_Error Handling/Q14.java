/* Implement a Java application that computes the value of the expression log(abs(sin(x)
+ cos(x))) / (tan(x) - cot(x)) for a given value of x. Ensure proper error handling for
potential arithmetic exceptions and negative values inside the logarithmic function. */
public class Q14 {
    public static void main(String[] args) {
        try {
            double x = Math.PI / 2;
            double result = Math.log(Math.abs(Math.sin(x) + Math.cos(x))) / (Math.tan(x) - (1 / Math.tan(x)));
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