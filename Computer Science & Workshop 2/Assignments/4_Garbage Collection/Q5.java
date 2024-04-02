/* Demonstrate how garbage collectors can be used to remove anonymous objects from
the heap. */
public class Q5 {
    public static void main(String[] args) {
        // Anonymous Objects
        new Q5();
        System.gc();
    }
    
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collector called.");
    }
}
// By :- Subhajyoti Prusty
// 2241016491
// CSE-44