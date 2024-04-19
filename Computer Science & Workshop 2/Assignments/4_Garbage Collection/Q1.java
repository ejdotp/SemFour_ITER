/* Write a program that initializes a lot of objects in a loop and observe how much time it
takes to crash the program. */

class ObjectInitialization
{
    public static void main(String[] args)
    {
        try {
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                Object obj = new Object();
            }
            long endTime = System.currentTimeMillis();
            System.out.println("Time taken: " + (endTime - startTime) + " milliseconds.");
        } catch (OutOfMemoryError e) { 
            System.out.println("Out of memory error occurred after initializing " + Integer.MAX_VALUE + " objects.");
        }
    }
}

//Time taken: 21 milliseconds.