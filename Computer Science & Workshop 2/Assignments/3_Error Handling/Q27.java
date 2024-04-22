/* Write a program to handle ClassCastException. */

public class Q27 {
    public static void main(String[] args)
    {
        try {
            Object o = new Object();
            String s = (String)o;
            System.out.println(s);
        }
        catch (ClassCastException e) {
            System.out.println(e);
        }
    }
}
