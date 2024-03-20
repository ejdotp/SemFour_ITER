//FInd if two strings are anagrams.

class Anyagram
{
    private static int CHARACTER_RANGE= 256;

    static boolean areAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int count[] = new int[CHARACTER_RANGE];
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for (int i = 0; i < CHARACTER_RANGE; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        String str1 = "geeksforgeeks";
        String str2 = "forgeeksgeeks";
 
        // Function call
        if (areAnagram(str1, str2))
            System.out.print("The two strings are " + "anagram of each other");
        else
            System.out.print("The two strings are " + "not anagram of each other");
    }
}