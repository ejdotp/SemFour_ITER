/* Does JVM guarantees that upon invoking gc() method, objects will be eligible for
immediate garbage collection? Justify your answer through code. */
public class Q8 {
    public static void main(String[] args) {
        Q8 obj = new Q8();
        obj = null;
        System.gc();
    }
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collector called.");
    }
}
// By :- Subhajyoti Prusty
// 2241016491
// CSE-44