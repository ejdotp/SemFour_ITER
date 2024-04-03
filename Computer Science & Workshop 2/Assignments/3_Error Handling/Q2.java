/*You are given a string containing alpha-numeric characters. Design a Java program that
displays the numeric characters if it is preceded by a vowel and consonant in the given
string. If such numeric characters are not present in the given string, display appropriate
message. If the input string is null or empty, throw a NullPointerException with an
appropriate error message. Ensure that the program handles any potential exceptions
gracefully.*/

public class Q2
{
    public static void main(String[] args)
    {
        try {
            String str = "a1b2c3d4e5";
            if (str == null || str.isEmpty())
                throw new NullPointerException("String is null or empty");
            
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                    if (i > 1 && Character.isLetter(str.charAt(i - 1)) && Character.isLetter(str.charAt(i - 2))) {
                        if (Character.isLetter(str.charAt(i - 1)) && Character.isLetter(str.charAt(i - 2))) {
                            System.out.println(str.charAt(i));
                        }
                    }
                }
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }        
    }
}
