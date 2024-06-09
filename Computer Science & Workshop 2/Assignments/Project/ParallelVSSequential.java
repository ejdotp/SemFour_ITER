import java.util.Random;
import java.util.Arrays;
import java.util.List;

public class ParallelVSSequential
{
    public static void main(String[] args)
    {
        Integer[] arr = new Integer[100];
        Random random = new Random();

        System.out.print("{ ");
        for (int i = 0; i < 100; i++) {
            arr[i] = 9000 + random.nextInt(999);
            System.out.print(arr[i] + ", ");
        }
        System.out.print("} \n");

        List<Integer> num = Arrays.asList(arr);

        // Sequential processing
        long ST = System.nanoTime(); // Start Time
        long STm = System.currentTimeMillis();
        long sequential = SequentiallyProcess(num);
        long sTime = System.nanoTime() - ST;
        long sTimem = System.currentTimeMillis() - STm;
        System.out.println("Sequential result: " + sequential);
        System.out.println("Time taken for sequential processing: " + sTime + " nanoseconds or  " + sTimem + " milliseconds\n");

        // Parallel processing
        ST = System.nanoTime();
        long PTm = System.currentTimeMillis();
        long parallel = ParallellyProcess(num);
        long pTime = System.nanoTime() - ST;
        long pTimem = System.currentTimeMillis() - PTm;
        System.out.println("Parallel result: " + parallel);
        System.out.println("Time taken for parallel processing: " + pTime + " nanoseconds or  " + pTimem + " milliseconds\n");

        // Compare performance
        System.out.println("Performance difference: " + Math.abs(sTime - pTime) + " nanoseconds or  " + (Math.abs(sTimem - pTimem)) + " milliseconds");
    }

    public static long SequentiallyProcess(List<Integer> num) {
        return num.stream()
                .mapToLong(i -> GoteBadaTask(i))
                .sum();
    }

    public static long ParallellyProcess(List<Integer> num) {
        return num.parallelStream()
                .mapToLong(i -> GoteBadaTask(i))
                .sum();
    }

    public static long GoteBadaTask(int num) {
        return num * num * num * num;
    }
}

/*
 * { 9033, 9818, 9239, 9196, 9085, 9130, 9192, 9104, 9062, 9143, 9498, 9257,
 * 9946, 9499, 9373, 9578, 9131, 9400, 9082, 9190, 9363, 9008, 9082, 9603, 9715,
 * 9083, 9968, 9546, 9213, 9050, 9737, 9960, 9089, 9491, 9213, 9059, 9958, 9558,
 * 9343, 9895, 9606, 9155, 9552, 9986, 9854, 9461, 9739, 9436, 9669, 9766, 9397,
 * 9011, 9800, 9325, 9703, 9034, 9459, 9430, 9613, 9846, 9280, 9144, 9467, 9644,
 * 9179, 9876, 9629, 9878, 9527, 9249, 9654, 9990, 9275, 9157, 9900, 9194, 9757,
 * 9194, 9092, 9173, 9963, 9056, 9861, 9184, 9764, 9625, 9010, 9849, 9734, 9731,
 * 9459, 9304, 9823, 9146, 9734, 9606, 9879, 9080, 9174, 9177, }
 * 
 * Sequential result: 1001723168
 * Time taken for sequential processing: 4779762 nanoseconds or 5 milliseconds
 * 
 * Parallel result: 1001723168
 * Time taken for parallel processing: 2543027 nanoseconds or 2 milliseconds
 * 
 * Performance difference: 2236735 nanoseconds or 3 milliseconds
 */