/* Implement a method that reads an integer from the user but handles
InputMismatchException using try-catch block. */

public class Q25 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter an integer: ");
        try {
            int n = sc.nextInt();
            System.out.println("You entered: " + n);
        } catch (java.util.InputMismatchException e) {
            System.out.println("InputMismatchException: " + e.getMessage());
        }
        sc.close();
    }
}
