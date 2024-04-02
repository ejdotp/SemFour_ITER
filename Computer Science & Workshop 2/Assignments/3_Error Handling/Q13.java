/* Design a Java program that evaluates the value of the function (sin(x) * cos(x)) / (sin(x)
+ cos(x)) for a given value of x. Handle potential arithmetic exceptions that may arise
due to invalid mathematical operations. */
public class Q13 {  
    public static void main(String[] args) {
        try {
            double x = Math.PI / 2;
            double result = (Math.sin(x) * Math.cos(x)) / (Math.sin(x) + Math.cos(x));
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