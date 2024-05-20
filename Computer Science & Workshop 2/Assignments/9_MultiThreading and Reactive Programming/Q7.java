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