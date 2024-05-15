/* Remove node x from the binary search tree and reorganize the nodes to
 * maintain itsnecessary properties. There are three cases in the deletion
 * process. Let us denote the node that needs to be deleted as x:
 * Case 1: Node x has no children.
 * Case 2: Node x has one child.
 * Case 3: Node x has two children.*/

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    void deleteKey(int key) {
        root = deleteRec(root, key);
    }

    Node deleteRec(Node root, int key) {
        if (root == null)
            return root;

        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.key = minValue(root.right);

            root.right = deleteRec(root.right, root.key);
        }

        return root;
    }

    int minValue(Node root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }
}

class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal of the original tree:");
        tree.inorder();
        System.out.println();

        System.out.println("Deleting 20 from the tree:");
        tree.deleteKey(20);
        System.out.println("Inorder traversal of the modified tree:");
        tree.inorder();
        System.out.println();

        System.out.println("Deleting 30 from the tree:");
        tree.deleteKey(30);
        System.out.println("Inorder traversal of the modified tree:");
        tree.inorder();
        System.out.println();

        System.out.println("Deleting 50 from the tree:");
        tree.deleteKey(50);
        System.out.println("Inorder traversal of the modified tree:");
        tree.inorder();
    }
}