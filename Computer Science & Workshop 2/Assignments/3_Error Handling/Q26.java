/* Implement try-catch-finally blocks to handle ClassNotFoundException and
MethodNotFoundException. */

public class Q26 {
    public static void main(String[] args) {
        try {
            throw new ClassNotFoundException("ClassNotFoundException");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally block executed");
        }
        try {
            throw new MethodNotFoundException("MethodNotFoundException");
        } catch (MethodNotFoundException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally block executed");
        }
    }
}

class MethodNotFoundException extends Exception {
    MethodNotFoundException(String s) {
        super(s);
    }
}
