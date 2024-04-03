/* Create a method that takes a string input and converts it to an integer. Handle
NumberFormatException using try-catch block and prompt the user to enter a valid
number upon exception. */

public class Q8 {
    public static void main(String[] args) {
        try {
            String str = "abc";
            int num = convertToInt(str);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught");
        }
    }

    public static int convertToInt(String str) {
        return Integer.parseInt(str);
    }    
}
