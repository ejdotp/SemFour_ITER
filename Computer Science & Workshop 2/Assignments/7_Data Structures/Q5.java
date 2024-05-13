/* Construct a binary search tree (BST) from the given array of elements: {10,
 * 20, 30, 40, 50, 60, 70, 80, 90, 100}. Include a method called 'CreateTree' to
 * construct the binary search tree from a sorted array. This method takes an
 * array of integers as input and constructs the tree recursively using a binary
 * search algorithm.*/

class BST {
    BNode root;

    // BNode class and other methods are defined here...

    public void createTree(int[] arr) {
        root = createTreeRec(arr, 0, arr.length - 1);
    }

    private BNode createTreeRec(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        BNode node = new BNode(new Country(String.valueOf(arr[mid]), arr[mid]));

        node.left = createTreeRec(arr, start, mid - 1);
        node.right = createTreeRec(arr, mid + 1, end);

        return node;
    }

    // Other methods such as levelOrderTraversal, findMax, findMin are defined here...

    public static void main(String[] args) {
        BST bst = new BST();

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        bst.createTree(arr);

        System.out.println("Level order traversal of the tree created from sorted array:");
        bst.levelOrderTraversal();
    }
}
