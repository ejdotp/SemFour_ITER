import java.util.Arrays;
import java.util.List;

public class ParallelVSSequential
{
    public static void main(String[] args)
    {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Sequential processing
        long ST = System.currentTimeMillis(); //Start Time
        long sequential = performTaskSequentially(num);
        long sTime = System.currentTimeMillis() - ST;
        System.out.println("Sequential result: " + sequential);
        System.out.println("Time taken for sequential processing: " + sTime + " miliseconds");

        // Parallel processing
        ST = System.currentTimeMillis();
        long parallel = performTaskInParallel(num);
        long pTime = System.currentTimeMillis() - ST;
        System.out.println("Parallel result: " + parallel);
        System.out.println("Time taken for parallel processing: " + pTime + " miliseconds");

        // Compare performance
        System.out.println("Performance difference: " + Math.abs(sTime - pTime) + " miliseconds");
    }

    public static long performTaskSequentially(List<Integer> num) {
        return num.stream()
                .mapToLong(i -> timeConsumingTask(i))
                .sum();
    }

    public static long performTaskInParallel(List<Integer> num) {
        return num.parallelStream()
                .mapToLong(i -> timeConsumingTask(i))
                .sum();
    }

    public static long timeConsumingTask(int num) {
        return num * num * num * num;
    }
}