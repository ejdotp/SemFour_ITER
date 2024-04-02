/* Write a program to handle ClassCastException. */
public class Q27 {
    public static void main(String[] args) {
        try {
            Object obj = new Integer(100);
            System.out.println((String) obj);
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }
    }
}
// By :- Subhajyoti Prusty
// 2241016491
// CSE-44