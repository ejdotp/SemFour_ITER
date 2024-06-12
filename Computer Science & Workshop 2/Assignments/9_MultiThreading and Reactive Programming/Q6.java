// Q6. Write a Java program that generates prime numbers up to a given limit
// using multiple threads. Eachthread should generate a subset of the prime
// numbers.
/*
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
}*/

// Output:- Prime numbers up to 100:
// 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97

import java.util.*;

class PrimeNumberChecker implements Runnable {
    private List<Integer> primes;
    private int start;
    private int end;

    public PrimeNumberChecker(List<Integer> primes, int start, int end) {
        this.primes = primes;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                synchronized (primes) {
                    primes.add(i);
                }
                System.out.println("Prime: " + i);
            }
        }
    }

    private boolean isPrime(int number) {
        if (number <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {

            if (number % i == 0)
                return false;
        }
        return true;
    }
}

class PrimeGenerator {
    public static void main(String[] args) {
        List<Integer> primes = new ArrayList<>();
        int limit = 50;
        // Create a thread to check for primes from 1 to 25
        Thread thread1 = new Thread(new PrimeNumberChecker(primes, 1, 25));
        // Create a thread to check for primes from 26 to 50
        Thread thread2 = new Thread(new PrimeNumberChecker(primes, 26, 50));
        // Start the threads
        thread1.start();
        thread2.start();
        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Sort and print primes
        Collections.sort(primes);
        System.out.println("Prime numbers up to " + limit + ": " + primes);
    }
}
