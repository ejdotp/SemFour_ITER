class Node
{
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}

class BinaryTree
{
    static Node root;

    static Node sortedArrayToBST(int arr[], int start, int end)
    {
        if (start > end)
            return null;

        int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);

        node.left = sortedArrayToBST(arr, start, mid - 1);

        node.right = sortedArrayToBST(arr, mid + 1, end);

        return node;
    }

    static void printInorder(Node node)
    {
        if (node == null)
            return;

        printInorder(node.left);
        System.out.print(node.data+ " ");
        printInorder(node.right);
    }

    public static void main(String[] args)
    {
        int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        root = sortedArrayToBST(arr, 0, n - 1);
        System.out.print("Inorder traversal of constructed BST: { ");
        printInorder(root);
        System.out.print("}\n");
    }
}

/*Inorder traversal of constructed BST: { 1 2 3 4 5 6 7 }*/