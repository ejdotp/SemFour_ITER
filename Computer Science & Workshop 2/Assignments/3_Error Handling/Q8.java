//Arithmetic exception for square root of negative number

import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter an integer to find its square root: ");
        int number = obj.nextInt();
        try {                      
                if (number < 0) {
                    throw new ArithmeticException("cannot a negative number");
                }
                double squareRoot = Math.sqrt(number);
            System.out.println("Square root of " + number + " is: " + squareRoot);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: " + e.toString());
        }
    }
    
}
