/* Determine if a given binary tree is a binary search tree. You will use an
 * 'isBST()' method, which takes the maximum and minimum range of the values of
 * the nodes.*/

class BST5 {

    class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
            left = null;
            right = null;
        }
    }

    Node root;

    // constructor for initializing the value to nodes and left , right direction
    // nodes
    public BST5() {
        root = null;
    }

    public BST5 createTreeMethod(int array[]) {
        BST5 b = new BST5();
        b.root = createTree(array, 0, array.length - 1);
        return b;
    }

    private Node createTree(int arr[], int start, int end) {
        if (start > end)
            return null;

        int mid = (start + end) / 2;
        Node root = new Node(arr[mid]);

        root.left = createTree(arr, start, mid - 1);

        root.right = createTree(arr, mid + 1, end);

        return root;
    }

    public void inorderTraversal() {
        inorderTraversalRec(root);
        System.out.println();
    }

    private void inorderTraversalRec(Node root) {
        if (root != null) {
            inorderTraversalRec(root.left);
            System.out.print(root.val + " ");
            inorderTraversalRec(root.right);
        }
    }

    public boolean isBST(BST5 b) {

        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean checkBST(Node root2, int low, int high) {
        if (root2 == null)
            return true;

        if (root2.val < low && root2.val > high)
            return false;

        return checkBST(root2.left, low, root2.val - 1) && checkBST(root2.right, root2.val + 1, high);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        BST5 b = new BST5();
        b = b.createTreeMethod(arr);
        b.inorderTraversal();
        System.out.println(b.isBST(b));
    }

}