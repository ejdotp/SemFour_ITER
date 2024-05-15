// Q6. Write a program that demonstrates a function returning anotherfunction,
// where the inner function calculates the square of a number.Define a function
// that returns another function. The inner functionshould calculate the square
// of a given number. Demonstrate the useofthe returned function to calculate
// squares

import java.util.function.Function;

public class Q6 {
    public static void main(String[] args) {
        Function<Integer, Integer> squareFunction = getSquareFunction();
        int number1 = 5;
        int number2 = 10;
        System.out.println("The square of " + number1 + " is: " + squareFunction.apply(number1));
        System.out.println("The square of " + number2 + " is: " + squareFunction.apply(number2));
    }

    public static Function<Integer, Integer> getSquareFunction() {// Inner function
        class SquareFunction implements Function<Integer, Integer> {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        }
        return new SquareFunction();
    }
}

// Output:
// The square of 5 is: 25
// The square of 10 is: 100