/* Create a Java program to handle ArrayIndexOutOfBoundsException. */
public class Q16 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[6] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        }
    }
}
//By :- Subhajyoti Prusty
//2241016491
//CSE-44