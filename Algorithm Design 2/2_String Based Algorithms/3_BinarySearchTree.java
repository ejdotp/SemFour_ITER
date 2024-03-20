//Implementation of binary search tree to store a string as a key and count the occurence of the word in text.

class Node
{
    String key;
    int count;
    Node left, right;

    public Node(String key)
    {
        this.key = key;
        this.count = 1; // Initialize count to 1 for a new word
        this.left = this.right = null;
    }
}

class BinarySearchTree
{
    Node root = null;

    // Inserts a word or increments the count if it exists
    public void insert(String key)
    {
        root = satareinsert(root, key);
    }

    private Node satareinsert(Node node, String key)
    {
        if (node == null)
            return new Node(key);

        int comparison = key.compareTo(node.key);

        if (comparison < 0)
            node.left = satareinsert(node.left, key);
        else if (comparison > 0)
            node.right = satareinsert(node.right, key);
        else
            // Word already exists, increment count
            node.count++;

        return node;
    }

    // Returns the count of occurrences of a word
    public int getCount(String key)
    {
        Node node = search(root, key);
        return (node != null) ? node.count : 0;
    }

    private Node search(Node node, String key)
    {
        if (node == null || node.key.equals(key))
            return node;

        if (key.compareTo(node.key) < 0)
            return search(node.left, key);
        else
            return search(node.right, key);
    }

    public static void main(String[] args)
    {
        BinarySearchTree bst = new BinarySearchTree();
        String text = "This is a sample text to demonstrate a binary search tree. A tree is good for the environment.";
    
        // Split the text into words
        String[] words = text.split("\\s+");
    
        // Insert each word into the tree
        for (String word : words)
            bst.insert(word.toLowerCase()); // Convert to lowercase for case-insensitivity 
    
        System.out.println("Count of 'a': " + bst.getCount("a"));
        System.out.println("Count of 'tree': " + bst.getCount("tree"));
        System.out.println("Count of 'wordthatdoesntexist': " + bst.getCount("wordthatdoesntexist")); 
    }
    
}

/*Output:
Count of 'a': 3
Count of 'tree': 1
Count of 'wordthatdoesntexist': 0
 */
