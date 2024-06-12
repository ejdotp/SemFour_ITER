// Q7. Implement a Java program that demonstrates the use of CompletableFuture to performasynchronoustasks
//and handle their results. Create CompletableFuture instances to perform tasks such as fetchingdatafroma
//remote server or processing a large file asynchronously. Use thenApply() or thenCombine() to
//combinetheresults.

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

class CompletableFutureExample {
    public static void main(String[] args) {
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Task 1 started");
            Random random = new Random();
            int result = random.nextInt(1000);
            System.out.println("Task 1 completed with result: " + result);
            return result;
        });
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Task 2 started");
            Random random = new Random();
            int result = random.nextInt(1000);
            System.out.println("Task 2 completed with result: " + result);
            return result;
        });
        CompletableFuture<Integer> combinedFuture = future1.thenCombine(future2, (r1, r2) -> r1 + r2);
        try {
            System.out.println("Combined result: " + combinedFuture.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
// Output:- Task 1 started
// Task 2 started
// Task 1 completed with result: 456
// Task 2 completed with result: 789
// Combined result: 1245

/*import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

 class CompletableFutureDemo {
    public static void main(String[] args) {
        // Simulate fetching data from a remote server
        CompletableFuture<String> fetchData = CompletableFuture.supplyAsync(() -> {
            // Simulate delay
            sleep(2000);
            return "Data from remote server";
        });

        // Simulate processing a large file
        CompletableFuture<String> processFile = CompletableFuture.supplyAsync(() -> {
            // Simulate delay
            sleep(3000);
            return "Processed file content";
        });

        // Combine the results of both tasks
        CompletableFuture<String> combinedResult = fetchData.thenCombine(processFile, (data, file) -> {
            return "Combined result: " + data + " + " + file;
        });

        // Further process the combined result
        CompletableFuture<String> finalResult = combinedResult.thenApply(result -> {
            return result.toUpperCase();
        });

        // Print the final result
        System.out.println(finalResult.get());
    }

    private static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
} */