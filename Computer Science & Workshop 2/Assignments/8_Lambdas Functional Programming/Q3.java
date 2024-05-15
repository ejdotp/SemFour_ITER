// Q3. Write a program that demonstrates lazy evaluation by creatingalazy
// sequence of prime numbers. Define a lazy sequence using lambdaexpressions
// that generates prime numbers. Demonstrate lazy evaluationby printing the
// first few prime numbers from the lazy sequence.

import java.util.Iterator;

class LazyPrimeSequence implements Iterable<Integer> {
    public static void main(String[] args) {
        LazyPrimeSequence primeSequence = new LazyPrimeSequence();
        Iterator<Integer> primeIterator = primeSequence.iterator();
        for (int i = 0; i < 10; i++) {
            System.out.println(primeIterator.next());
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new PrimeIterator();
    }

    private static class PrimeIterator implements Iterator<Integer> {
        private int current = 1;

        @Override
        public boolean hasNext() {
            return true; // Infinite sequence of primes
        }

        @Override
        public Integer next() {
            current = nextPrime(current);
            return current;
        }

        private int nextPrime(int after) {
            int number = after + 1;
            while (!isPrime(number)) {
                number++;
            }
            return number;
        }

        private boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
// Output:
// 2
// 3
// 5
// 7
// 11
// 13
// 17
// 19
// 23
// 29