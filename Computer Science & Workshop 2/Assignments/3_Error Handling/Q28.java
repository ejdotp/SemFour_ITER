/* Implement a Java program to handle StackOverflowError. */
public class Q28 {
    public static void main(String[] args) {
        try {
            recursiveMethod(1);
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError: " + e.getMessage());
        }
    }

    public static void recursiveMethod(int i) {
        System.out.println(i);
        recursiveMethod(i + 1);
    }
}
// By :- Subhajyoti Prusty
// 2241016491
// CSE-44