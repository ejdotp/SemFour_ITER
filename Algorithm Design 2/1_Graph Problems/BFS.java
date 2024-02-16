class BFS{
    static class Node
    {
        int value;
        Node left;
        Node  right;
        Node(int value)
        {
            this.value = value;
            left = null;
            right = null;
        }
    }
    public static Node root;
        
    private Node addrec(Node current, int value)
    {
        if(current = null)
            return new Node(value);
        if(value<current.value)
            current.left=addrec(current.left,value);
        else if(value > root.value)
            current.right = addrec(current.right, value);
        else
            return current;
    }

    public static void add(int value)
    {
        root = addrec(root,value);
    }

    


}