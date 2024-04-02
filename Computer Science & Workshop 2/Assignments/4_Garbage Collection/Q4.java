/* What distinguishes anonymous objects from regular objects? Demonstrate how
anonymous objects can be used to successfully call and run methods */
public class Q4 {
    public static void main(String[] args) {
        // Anonymous Objects
        new Q4().display();
    }
    void display() {
        System.out.println("Anonymous Objects are objects that are instantiated but not stored in a reference variable.");
        System.out.println("They are used to call methods without creating a reference variable.");
        System.out.println("They are used to call methods that are not going to be used again.");
    }
}
// By :- Subhajyoti Prusty
// 2241016491
// CSE-44