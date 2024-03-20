//FInd if two strings are anagrams.

class Anyagram
{
    static boolean areAnagram(String str1, String str2)
    {
        if (str1.length() != str2.length())
            return false;
        
        int count[] = new int[256]; //character range

        for (int i = 0; i < str1.length(); i++)
        {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++)
            if (count[i] != 0) 
                return false;
         
        return true;
    }

    public static void main(String[] args)
    {
        String str1 = "jaiphula";
        String str2 = "phulajai";

        if (areAnagram(str1, str2))
            System.out.print("Are anagrams.");
        else
            System.out.print("Nope.");
    }
}

/*Output:
Are anagrams.
 */