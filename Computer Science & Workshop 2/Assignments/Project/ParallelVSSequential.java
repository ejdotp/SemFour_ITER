import java.util.Arrays;
import java.util.List;

public class ParallelVSSequential
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Sequential processing
        long startTime = System.nanoTime();
        long sequentialResult = performTaskSequentially(numbers);
        long sequentialTime = System.nanoTime() - startTime;
        System.out.println("Sequential result: " + sequentialResult);
        System.out.println("Time taken for sequential processing: " + sequentialTime + " nanoseconds");
        
        // Parallel processing
        startTime = System.nanoTime();
        long parallelResult = performTaskInParallel(numbers);
        long parallelTime = System.nanoTime() - startTime;
        System.out.println("Parallel result: " + parallelResult);
        System.out.println("Time taken for parallel processing: " + parallelTime + " nanoseconds");
        
        // Compare performance
        System.out.println("Performance difference: " + (sequentialTime - parallelTime) + " nanoseconds");
    }

    public static long performTaskSequentially(List<Integer> numbers) {
        return numbers.stream()
                      .mapToLong(i -> timeConsumingTask(i))
                      .sum();
    }

    public static long performTaskInParallel(List<Integer> numbers) {
        return numbers.parallelStream()
                      .mapToLong(i -> timeConsumingTask(i))
                      .sum();
    }

    public static long timeConsumingTask(int number) {
        // Simulate a time-consuming task, like a mathematical operation
        return number * number;
        
    }
}