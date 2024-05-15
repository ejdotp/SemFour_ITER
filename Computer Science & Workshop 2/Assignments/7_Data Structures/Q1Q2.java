/*Write a program to add methods to the binary search tree created in Q1 for
 * traversing the tree in pre-order, in-order, and post-order. Invoke the above
 * methods for execution*/

class BSTNode {

    // inner class for node creation
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
    public BSTNode() {
        root = null;
    }

    public void insert(int val) {
        root = insertRec(root, val);
    }

    private Node insertRec(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (val < root.val)
            root.left = insertRec(root.left, val);
        else if (val > root.val)
            root.right = insertRec(root.right, val);
        return root;
    }

    // traversal using resursion

    // 1.In-order
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

    // 2.Pre-order
    public void preorderTraversal() {
        preorderTraversalRec(root);
        System.out.println();
    }

    private void preorderTraversalRec(Node root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preorderTraversalRec(root.left);
            preorderTraversalRec(root.right);
        }
    }

    // 3.Post-order
    public void postorderTraversal() {
        postorderTraversalRec(root);
        System.out.println();
    }

    private void postorderTraversalRec(Node root) {
        if (root != null) {
            postorderTraversalRec(root.left);
            postorderTraversalRec(root.right);
            System.out.print(root.val + " ");
        }
    }

    // Main method to call the methods
    public static void main(String[] args) {

        BSTNode bst = new BSTNode();
        bst.insert(10);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(50);

        System.out.println("Preorder traversal:");
        bst.preorderTraversal();

        System.out.println("Inorder traversal:");
        bst.inorderTraversal();

        System.out.println("Postorder traversal:");
        bst.postorderTraversal();
    }

}