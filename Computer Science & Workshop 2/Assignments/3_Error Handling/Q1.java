//Implement a Java program to handle NullPointerException.

public class Q1
{
    public static void main(String[] args)
    {
        try {
            String str = null;
            System.out.println(str.length());
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
        }
    }
}

