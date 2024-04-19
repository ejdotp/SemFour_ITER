/*5. Create a Java program that compares the performance of StringBuilder and
StringBuffer when performing repeated string concatenations. The program should:

a.  Prompt the user to enter a base string and the number of times it should be
    concatenated to itself.
b.  Use StringBuilder to concatenate the string the specified number of times,
    tracking the time taken to complete the operation.
c.  Repeat the process using StringBuffer, again tracking the time taken.
d.  Output the time taken for each operation and the final length of the resulting
    strings to demonstrate both the time efficiency and the result of using
    StringBuilder and StringBuffer.

Example output of the program could look like this:
Enter the base string:
> Hello
Enter the number of concatenations:
> 10000

Using StringBuilder...
Time taken: 5 milliseconds
Final string length: 50000

Using StringBuffer...
Time taken: 6 milliseconds
Final string length: 50000

Comparison: StringBuilder was faster than StringBuffer by 1 millisecond.*/  

import java.util.Scanner;

class StringBuilderVsStringBuffer
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the base string and the number of concatenations
        System.out.print("Enter the base string: ");
        String base = sc.nextLine();
        System.out.print("Enter the number of concatenations: ");
        int count = sc.nextInt();
        
        // Using StringBuilder
        long stBuilder = System.currentTimeMillis();
        StringBuilder Buildered = new StringBuilder(base);
        for (int i = 1; i < count; i++)
            Buildered.append(base);
        long etBuilder = System.currentTimeMillis();
        
        // Using StringBuffer
        long stBuffer = System.currentTimeMillis();
        StringBuffer Buffered = new StringBuffer(base);
        for (int i = 1; i < count; i++)
            Buffered.append(base);
        long etBuffer = System.currentTimeMillis();
        
        // Output the time taken for each operation and the final length of the resulting strings
        System.out.println("\nUsing StringBuilder...");
        System.out.println("Time taken: " + (etBuilder - stBuilder) + " milliseconds");
        System.out.println("Final string length: " + Buildered.length() + "\n");
        
        System.out.println("Using StringBuffer...");
        System.out.println("Time taken: " + (etBuffer - stBuffer) + " milliseconds");
        System.out.println("Final string length: " + Buffered.length() + "\n");
        
        // Comparison
        long difference = Math.abs(etBuilder - stBuilder) - Math.abs(etBuffer - stBuffer);
        if (difference > 0)
            System.out.println("Comparison: StringBuilder was faster than StringBuffer by " + difference + " milliseconds.");
        else if (difference < 0)
            System.out.println("Comparison: StringBuffer was faster than StringBuilder by " + Math.abs(difference) + " milliseconds.");
        else
            System.out.println("Comparison: StringBuilder and StringBuffer took the same amount of time.");
        
        sc.close();
    }
}

/*Enter the base string: abcdefghijklmnopqrstuvwxyz
Enter the number of concatenations: 3

Using StringBuilder...
Time taken: 0 milliseconds
Final string length: 78

Using StringBuffer...
Time taken: 1 milliseconds
Final string length: 78

Comparison: StringBuffer was faster than StringBuilder by 1 milliseconds. */