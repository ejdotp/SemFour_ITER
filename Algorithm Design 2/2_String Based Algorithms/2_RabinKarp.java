//Rabin-Karp string matching algorithm

import java.util.*;

class RabinKarp
{
    public static int search(String text, String pattern)
    {
        char[] textArray = text.toCharArray();
        char[] patternArray = pattern.toCharArray();

        int n = text.length(), m = pattern.length(), prime = 101, pown = 1, textHash = 0, patternHash = 0, i, j;

        if (m == 0 || m > n)
            return -1;

        for (i = 0; i < m - 1; i++)
            pown = (pown << 1) % prime;

        for (i = 0; i < m; i++)
        {
            patternHash = ((patternHash << 1) + patternArray[i]) % prime;
            textHash = ((textHash << 1) + textArray[i]) % prime;
        }

        for (i = 0; i <= (n - m); i++)
        {
            if (textHash == patternHash)
            {
                for (j = 0; j < m; j++)
                    if (textArray[i + j] != patternArray[j])
                        break;

                if (j == m)
                    return i;

            }

            if (i < n - m)
            {
                textHash = (((textHash - textArray[i] * pown) << 1) + textArray[i + m]) % prime;
                if (textHash < 0)
                    textHash += prime;
            }
        }

        return -1;
    }

    public static void main(String[] args)
    {
        String river = "Bro really said oh ethire the start position and end position duita jaga mention heichi. Let's add a random the here which we are to find.";
        String drop = "the";
        int index = search(river, drop);
        if (index != -1)
            System.out.println("Pattern found at index: " + (index+1));
        else
            System.out.println("Pattern not found.");
    }
}

/*Output:
Pattern found at index: 27
*/