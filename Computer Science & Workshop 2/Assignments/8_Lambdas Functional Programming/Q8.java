// Q8. Write a program that creates a thread using a lambda expressionas the
// Runnable and prints "Hello, CSW2!" from the thread. Definealambda expression
// that implements the Runnable interface and prints"Hello, CSW2!". Create a
// thread using the lambda expression and start the thread.

class LambdaThreadExample {
    public static void main(String[] args) {
        // Define a lambda expression as the Runnable
        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName() + " is running...");
            System.out.println("Hello, CSW2!");
        };
        // Create and start the thread using the lambda expression
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
