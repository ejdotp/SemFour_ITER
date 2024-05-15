//Q1. Create a functional interface Calculator with methods foraddition, subtraction, multiplication, and division.
//Implement thesemethods using lambda expressions. Define the Calculator functionalinterface with methods for arithmetic
//operations. Implement theinterface methods using lambda expressions for basic arithmeticoperations.

interface Calculator {
    double calculate(double x, double y);
}

public class Q1 {
    public static void main(String[] args) {
        double a = 10;
        double b = 5;
        Calculator addition = (x, y) -> x + y;
        {
            System.out.println("Addition: " + addition.calculate(a, b));
        }
        ;
        Calculator subtraction = (x, y) -> x - y;
        {
            System.out.println("Subtraction: " + subtraction.calculate(a, b));
        }
        ;
        Calculator multiplication = (x, y) -> x * y;
        {
            System.out.println("Multiplication: " + multiplication.calculate(a, b));
        }
        ;
        Calculator division = (x, y) -> {
            if (y == 0) {
                throw new ArithmeticException("Division by zero!");
            }
            return x / y;
        };
        System.out.println("Division: " + division.calculate(a, b));
    }
}
// Output:
// Addition: 15.0
// Subtraction: 5.0
// Multiplication: 50.0
// Division: 2.0