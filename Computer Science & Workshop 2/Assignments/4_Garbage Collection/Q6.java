/* You are tasked with designing a memory management system for a Java application
that heavily utilizes anonymous objects. Your goal is to implement a robust garbage
collection mechanism to ensure efficient memory usage and prevent memory leaks
caused by lingering anonymous objects. */
import java.lang.ref.WeakReference;
public class Q6 {
    public static void main(String[] args) {
        //Use Limited Scope for Anonymous Objects
        {
            new Q6();
        }
        System.gc();

        //Use try-with-resources
        try (Q6 obj = new Q6()) {
            System.out.println("Anonymous Object created using try-with-resources.");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.gc();

        //Use Weak References
        Q6 obj = new Q6();
        WeakReference<Q6> weakRef = new WeakReference<>(obj);
        obj = null;
        System.gc();
        System.out.println("Weak Reference: " + weakRef.get());

        // Introduce some delay before checking weak reference
        try {
            Thread.sleep(1000); // Sleep for 1 second
        } catch (InterruptedException e) {
            System.out.println("InterruptedException: " + e.getMessage());
        }

        System.out.println("Weak Reference: " + weakRef.get());
    }
}
// By :- Subhajyoti Prusty
// 2241016491
// CSE-44