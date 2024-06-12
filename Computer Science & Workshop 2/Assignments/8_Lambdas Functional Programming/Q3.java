// Q3. Write a program that demonstrates lazy evaluation by creatingalazy
// sequence of prime numbers. Define a lazy sequence using lambdaexpressions
// that generates prime numbers. Demonstrate lazy evaluationby printing the
// first few prime numbers from the lazy sequence.

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Q3 {
    public static IntPredicate primeNumbersInRange(int start, int end) {
        return number -> {
            if (number <= 1)
                return false;
            if (number == 2)
                return true;
            if (number % 2 == 0)
                return false;
            for (int i = 3; i <= Math.sqrt(number); i += 2) {
                if (number % i == 0)
                    return false;
            }
            return true;
        };
    }

    public static void main(String[] args) {
        int start = 10;
        int end = 50;

        System.out.println("Prime numbers between " + start + " and " + end + ":");
        IntStream.rangeClosed(start, end)
                .filter(primeNumbersInRange(start, end))
                .forEach(System.out::println);
    }
}
/*
 * N.B: The primeNumbersInRange method returns an IntPredicate, which is a
 * functional interface representing a predicate (boolean-valued function) of
 * one int-valued argument. This lambda expression checks if a number is prime
 * by checking divisibility up to the square root of the number. In the main
 * method, we define the start and end of the range. We use
 * IntStream.rangeClosed(start, end) to generate a stream of integers from start
 * to end (inclusive). The stream is filtered using the primeNumbersInRange
 * predicate to retain only prime numbers. Finally, each prime number is printed
 * using forEach(System.out::println).
 */
