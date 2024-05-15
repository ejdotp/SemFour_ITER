// Q8. Write a program that creates a thread using a lambda expressionas the
// Runnable and prints "Hello, CSW2!" from the thread. Definealambda expression
// that implements the Runnable interface and prints"Hello, CSW2!". Create a
// thread using the lambda expression and start the thread.

public class Q8 {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Hello, CSW2!");
        Thread thread = new Thread(task);
        thread.start();
    }
}

// Output: Hello, CSW2!