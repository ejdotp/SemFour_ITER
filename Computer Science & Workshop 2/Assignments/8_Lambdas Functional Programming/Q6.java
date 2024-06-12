// Q6. Write a program that demonstrates a function returning anotherfunction,
// where the inner function calculates the square of a number.Define a function
// that returns another function. The inner functionshould calculate the square
// of a given number. Demonstrate the useofthe returned function to calculate
// squares

import java.util.function.Function;

class FunctionReturningFunction {
    // Define a function that returns another function
    public static Function<Integer, Integer> squareFunction() {
        return (Integer n) -> n * n;
    }

    public static void main(String[] args) {
        // Get the square function
        Function<Integer, Integer> squareFn = squareFunction();
        // Demonstrate the use of the returned function to calculate squares
        int number1 = 5;
        int number2 = 10;
        int square1 = squareFn.apply(number1);
        int square2 = squareFn.apply(number2);
        System.out.println("Square of " + number1 + " is: " + square1);
        System.out.println("Square of " + number2 + " is: " + square2);
    }
}

// Output:
// The square of 5 is: 25
// The square of 10 is: 100