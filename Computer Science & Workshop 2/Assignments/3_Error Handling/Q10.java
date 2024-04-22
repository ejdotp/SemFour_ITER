/* Implement a Java program that calculates the value of the expression (sin(x) + cos(x))
/ tan(x) for a given value of x. Handle scenarios where x is close to multiples of π/2 to
avoid division by zero errors. */

import java.util.*;

public class Q10 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the value of x in radians: ");
        double x = obj.nextDouble();
        try {
            if (x%90==0 || Math.round(x)==90) {
                throw new ArithmeticException(" Division by Zero.x is close to multiples of pi/2.");
            }
            System.out.println("Result: "+ (Math.sin(x) + Math.cos(x)) / Math.tan(x));
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }    
}

