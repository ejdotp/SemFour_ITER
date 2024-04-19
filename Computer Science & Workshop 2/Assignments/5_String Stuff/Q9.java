//9.Word Replacement in Sentences: Request a sentence and two words from the user: one to search for and one to replace it with. Find the first occurrence of the search word in the sentence. Replace the word using substring operations and concatenation. Display the original and the modified sentences.  

import java.util.Scanner;

class WordReplacement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Request a sentence from the user
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Request a word to search for from the user
        System.out.print("Enter the word to search for: ");
        String searchWord = sc.next();

        // Request a word to replace it with from the user
        System.out.print("Enter the word to replace it with: ");
        String replaceWord = sc.next();

        // Find the first occurrence of the search word in the sentence
        int startIndex = sentence.indexOf(searchWord);
        int endIndex = startIndex + searchWord.length();

        // Replace the word using substring operations and concatenation
        String modifiedSentence = sentence.substring(0, startIndex) + replaceWord + sentence.substring(endIndex);

        // Display the original and the modified sentences
        System.out.println("\nOriginal sentence: " + sentence);
        System.out.println("Modified sentence: " + modifiedSentence);

        sc.close();
    }
}

/*Enter a sentence: Jai Phula is a Jai Phula 
Enter the word to search for: Jai  
Enter the word to replace it with: Gendu

Original sentence: Jai Phula is a Jai Phula
Modified sentence: Gendu Phula is a Jai Phula */