/* Develop a recursive algorithm implemented in Java that traverses or manipulates
arrays. Introduce scenarios where the recursion reaches beyond the bounds of the array,
resulting in ArrayIndexOutOfBoundsException. Your task is to handle these
exceptions within the recursive algorithm and ensure proper termination of recursion. */
public class Q20 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try {
            printArray(arr, 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        }
    }

    public static void printArray(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }
        System.out.println(arr[index]);
        printArray(arr, index + 1);
    }
}
//By :- Subhajyoti Prusty
//2241016491
//CSE-44