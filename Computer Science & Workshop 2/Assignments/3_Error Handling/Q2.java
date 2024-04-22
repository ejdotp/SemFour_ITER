/*You are given a string containing alpha-numeric characters. Design a Java program that
displays the numeric characters if it is preceded by a vowel and consonant in the given
string. If such numeric characters are not present in the given string, display appropriate
message. If the input string is null or empty, throw a NullPointerException with an
appropriate error message. Ensure that the program handles any potential exceptions
gracefully.*/

public class Q2 {
    public static void main(String[] args) {
        String str = "A1bc2def3ghi4";
        try {
            boolean foundNumeric = false;
            for (int i = 2; i < str.length(); i++) {
                char current = str.charAt(i);
                char prev = str.charAt(i - 1);
                char prevprev = str.charAt(i - 2);

                if (Character.isDigit(current) && Character.isAlphabetic(prev) && Character.isAlphabetic(prevprev)) {
                    if (isVowel(prevprev) && !isVowel(prev)) {
                        System.out.println("Numeric character: " + current);
                        foundNumeric = true;
                    }
                }
            }
            if (!foundNumeric) 
                System.out.println("No numeric characters meeting the condition found.");
        } 
        catch (NullPointerException e) {
            e.printStackTrace(); }
    }

    public static boolean isVowel(char ch) 
    {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
