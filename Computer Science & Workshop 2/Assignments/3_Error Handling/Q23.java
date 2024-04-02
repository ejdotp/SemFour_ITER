/* Write a program that reads data from a file and performs some processing. Handle
checked IOException by using try-catch block to catch and handle the exception. */
import java.io.IOException;
public class Q23 {
    public static void main(String[] args) {
        try {
            throw new IOException("IOException");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
// By :- Subhajyoti Prusty
// 2241016491
// CSE-44