// Q6. Write a Java program that generates prime numbers up to a given limit
// using multiple threads. Eachthread should generate a subset of the prime
// numbers.

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrimeGenerator {
    private static final int LIMIT = 100; // Set the limit here
    private static List<Integer> primeNumbers = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(4); // Set the number of threads here
        for (int i = 0; i < LIMIT / 25 + 1; i++) {
            final int start = i * 25 + 1;
            executor.submit(() -> findPrimes(start, start + 24));
        }
        executor.shutdown();
        executor.awaitTermination(1, java.util.concurrent.TimeUnit.HOURS);
        System.out.println("Prime numbers up to " + LIMIT + ":");
        primeNumbers.forEach(n -> System.out.print(n + " "));
    }

    private static void findPrimes(int start, int end) {
        for (int i = start; i <= end && i < LIMIT; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// Output:- Prime numbers up to 100:
// 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97