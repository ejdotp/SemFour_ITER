/* How do we make objects eligible for garbage collection? Discuss all possible ways
along with their implementation. */
public class Q3 {
    public static void main(String[] args) {
        // Setting References to Null
        Q3 obj = new Q3();
        obj = null; 

        // Reassigning References
        Q3 obj1 = new Q3();
        Q3 obj2 = new Q3();
        obj1 = obj2;

        // Anonymous Objects
        new Q3();

        //Class Unloading
        System.gc();
    }
}
// By :- Subhajyoti Prusty
// 2241016491
// CSE-44