// Write a Java program that demonstrates the immutability of the String class
// and how it implements the CharSequence interface. Your program should
// illustrate the behaviours that highlight String immutability and its usage as
// a CharSequence. 

 class StringDemo {
    public static void main(String[] args) {
        // Immutability demonstration
        String originalString = "Hello, World!";

        // Attempt to modify using concatenation
        String modifiedString = originalString.concat(" Everyone"); //need another string to do modification. 
        // direct: soriginalString.concat(" Everyone"); wont work

        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);

        // Demonstrating that the original string remains unchanged
        System.out.println("Are the original and modified strings the same object? " + 
                           (originalString == modifiedString)); 

        // CharSequence usage
        System.out.println("\nIterating through characters using CharSequence methods:");
        for (int i = 0; i < originalString.length(); i++) {
            System.out.println("Character at index " + i + ": " + originalString.charAt(i));
        }
    }
}

/*Original String: Hello, World!
Modified String: Hello, World! Everyone
Are the original and modified strings the same object? false

Iterating through characters using CharSequence methods:
Character at index 0: H
Character at index 1: e
Character at index 2: l
Character at index 3: l
Character at index 4: o
Character at index 5: ,
Character at index 6:
Character at index 7: W
Character at index 8: o
Character at index 9: r
Character at index 10: l
Character at index 11: d
Character at index 12: ! */
