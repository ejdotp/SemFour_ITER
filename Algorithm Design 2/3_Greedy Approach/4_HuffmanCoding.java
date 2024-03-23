//Write java code to implement Huffman Coding using Greedy approach.

import java.util.Comparator;  
import java.util.HashMap;  
import java.util.Map;  
import java.util.PriorityQueue;  

class HuffmanNode
{  
    int data;  
    char c;  
    HuffmanNode left;  
    HuffmanNode right;  
}

class MyComparator implements Comparator<HuffmanNode>
{  
    public int compare(HuffmanNode x, HuffmanNode y)
    {  
        return x.data - y.data;  
    }  
}

class HuffmanCoding
{
    public static void main(String[] args)
    {
        int n = 6;
        char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' };
        int[] charFreq = { 5, 9, 12, 13, 16, 45 };

        PriorityQueue<HuffmanNode> q = new PriorityQueue<>(n, new MyComparator());
        for (int i = 0; i < n; i++)
        {
            HuffmanNode hn = new HuffmanNode();
            hn.c = charArray[i];
            hn.data = charFreq[i];
            hn.left = null;
            hn.right = null;
            q.add(hn);
        }

        HuffmanNode root = null;
        while (q.size() > 1)
        {
            HuffmanNode x = q.poll();
            HuffmanNode y = q.poll();
            HuffmanNode f = new HuffmanNode();
            f.data = x.data + y.data;
            f.c = '-';
            f.left = x;
            f.right = y;
            root = f;
            q.add(f);
        }

        Map<Character, String> huffmanCode = new HashMap<>();
        encode(root, "", huffmanCode);
        System.out.println("Huffman Codes are: " + huffmanCode);

        System.out.println("The original string is: ");
        String str = "abcdef";
        System.out.println(str);
        System.out.println("The encoded string is: ");
        String encodedString = "";
        for (int i = 0; i < str.length(); i++)
            encodedString += huffmanCode.get(str.charAt(i));
        
        System.out.println(encodedString);
        System.out.println("The decoded string is: ");
        int index = -1;
        while (index < encodedString.length() - 2)
            index = decode(root, index, encodedString);
        
    }

    public static void encode(HuffmanNode root, String s, Map<Character, String> huffmanCode)
    {
        if (root.left == null && root.right == null)
        {
            huffmanCode.put(root.c, s);
            return;
        }
        encode(root.left, s + "0", huffmanCode);
        encode(root.right, s + "1", huffmanCode);
    }

    public static int decode(HuffmanNode root, int index, String s)
    {
        if (root.left == null && root.right == null)
        {
            System.out.print(root.c);
            return index;
        }
        index++;

        if (s.charAt(index) == '0')
            index = decode(root.left, index, s);
        else
            index = decode(root.right, index, s);
        
        return index;
    }
}

/*
Huffman Codes are: {a=1100, b=1101, c=100, d=101, e=111, f=0}
The original string is: 
abcdef
The encoded string is:
110011011001011110
The decoded string is:
abcde
 */