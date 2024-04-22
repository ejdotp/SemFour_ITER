/* Implement a method that reads an integer from the user but handles
InputMismatchException using try-catch block. */

import java.util.Scanner;
import java.util.InputMismatchException; 

public class Q25 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        try {
            System.out.println("Enter an integer: ");
            int integer = obj.nextInt();
            System.out.println("You entered: " + integer);
        } catch (InputMismatchException e) {
            System.out.println("Something went wrong, let's try that again.");
        }
    }
}
