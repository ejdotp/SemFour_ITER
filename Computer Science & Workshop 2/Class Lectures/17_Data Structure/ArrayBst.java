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

    static Node searcher(Node root, int data)
    {
		// Base Cases: root is null or data is present at root
		if (root == null || root.data == data)
			return root;

		// data is greater than root's data
		if (root.data < data)
			return searcher(root.right, data);

		// data is smaller than root's data
		return searcher(root.left, data);
	}

    static void search(int x)
    {
        if (searcher(root, x) == null)
			System.out.println(x + " not found");
		else
			System.out.println(x + " found");
    }

    public static void main(String[] args)
    {
        int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        root = sortedArrayToBST(arr, 0, n - 1);
        System.out.print("Inorder traversal of constructed BST: { ");
        printInorder(root);
        System.out.print("}\n");
        search(6);
        search(60);
    }
}

/*
Inorder traversal of constructed BST: { 1 2 3 4 5 6 7 }
6 found
60 not found
*/