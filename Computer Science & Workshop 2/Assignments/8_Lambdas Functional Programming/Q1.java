//Q1. Create a functional interface Calculator with methods foraddition, subtraction, multiplication, and division.
//Implement thesemethods using lambda expressions. Define the Calculator functionalinterface with methods for arithmetic
//operations. Implement theinterface methods using lambda expressions for basic arithmeticoperations.

import java.util.*;

@FunctionalInterface
interface Calculator {
    double calculate(double a, double b);
}

public class Q1 {
    public static void main(String[] args) {

        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;
        Calculator multiply = (a, b) -> a * b;
        Calculator divide = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            return a / b;
        };
        double num1 = 10;
        double num2 = 5;
        System.out.println("Addition: " + add.calculate(num1, num2));
        System.out.println("Subtraction: " + subtract.calculate(num1, num2));
        System.out.println("Multiplication: " + multiply.calculate(num1, num2));
        System.out.println("Division: " + divide.calculate(num1, num2));
    }
}

// Output:
// Addition: 15.0
// Subtraction: 5.0
// Multiplication: 50.0
// Division: 2.0