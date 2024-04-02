/* Demonstration of use nested try-catch block. Write a Java program to handle
NumberFormatException in outer try-catch block and ArithmeticException inside
the inner try-catch block. */
public class Q15 {
    public static void main(String[] args) {
        try {
            String str = "abc";
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught");
            try {
                double x = Math.PI / 2;
                double result = (Math.sin(x) * Math.cos(x)) / (Math.sin(x) + Math.cos(x));
                System.out.println(result);
            } catch (ArithmeticException e1) {
                System.out.println("ArithmeticException caught");
            }
        }
    }
}
//By :- Subhajyoti Prusty
//2241016491
//CSE-44