// 1.Write a Java program that illustrates the difference between using string
// literals and the new keyword for creating String objects. Your program should
// demonstrate the memory usage implications and how string comparison behaves
// differently in each case.

class TestString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String(str1);

        System.out.println("Memory Usage: ");
        System.out.println("str1 uses literal \"" + str1 + "\", created at compile time.");
        System.out.println("str2 uses object \"" + str2 + "\", created at runtime.");

        System.out.println("\nComparison: ");
        if (str1 == str2) {
            System.out.println("str1 and str2 are reference to same object.");
        } else {
            System.out.println("str1 and str2 are not reference to same object.");
        }

        if (str1.equals(str2)) {
            System.out.println("The content of str1 and str2 are equal.");
        } else {
            System.out.println("The content of str1 and str2 are not equal.");
        }
    }
}
/*
 * Output:
 * Memory Usage:
 * str1 uses literal "Hello", created at compile time.
 * str2 uses object "Hello", created at runtime.
 * 
 * Comparison:
 * str1 and str2 are not reference to same object.
 * The content of str1 and str2 are not equal.
 */