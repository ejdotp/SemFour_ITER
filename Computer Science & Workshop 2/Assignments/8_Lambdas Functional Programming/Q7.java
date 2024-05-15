// Q7.Write a program that calculates factorial using a recursive
// lambdaexpression. Define a recursive lambda expression to calculatefactorial.
// Use the lambda expression to calculate factorial ofagiven number.

import java.util.function.Function;

public class Q7 {
    public static void main(String[] args) {
        Function<Integer, Integer> factorial = createFactorial();
        int number = 5;
        int result = factorial.apply(number);
        System.out.println("The factorial of " + number + " is: " + result);
    }

    private static Function<Integer, Integer> createFactorial() {
        final Function<Integer, Integer>[] factorialHolder = new Function[1];
        Function<Integer, Integer> factorial = n -> {
            if (n <= 1) {
                return 1;
            } else {
                return n * factorialHolder[0].apply(n - 1);
            }
        };
        factorialHolder[0] = factorial;
        return factorial;
    }
}

// Output:
// The factorial of 5 is: 120