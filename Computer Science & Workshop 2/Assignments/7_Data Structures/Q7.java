/* Remove node x from the binary search tree and reorganize the nodes to
 * maintain itsnecessary properties. There are three cases in the deletion
 * process. Let us denote the node that needs to be deleted as x:
 * Case 1: Node x has no children.
 * Case 2: Node x has one child.
 * Case 3: Node x has two children.*/

 public class BST {
    BNode root;

    // Other methods are defined here...

    public void delete(int value) {
        root = deleteRec(root, value);
    }

    private BNode deleteRec(BNode root, int value) {
        if (root == null) {
            return root;
        }

        if (value < root.info.population) {
            root.left = deleteRec(root.left, value);
        } else if (value > root.info.population) {
            root.right = deleteRec(root.right, value);
        } else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.info = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteRec(root.right, root.info.population);
        }

        return root;
    }

    private Country minValue(BNode root) {
        Country minv = root.info;
        while (root.left != null) {
            minv = root.left.info;
            root = root.left;
        }
        return minv;
    }

    // Other methods such as levelOrderTraversal, findMax, findMin are defined here...

    public static void main(String[] args) {
        BST bst = new BST();

        bst.insert(new Country("USA", 328_200_000));
        bst.insert(new Country("China", 1_394_015_977));
        bst.insert(new Country("India", 1_366_417_754));
        bst.insert(new Country("Brazil", 211_049_527));
        bst.insert(new Country("Pakistan", 216_565_318));

        System.out.println("Original tree:");
        bst.levelOrderTraversal();
        System.out.println();

        // Deleting a node
        bst.delete(211049527); // Deleting Brazil

        System.out.println("Tree after deletion:");
        bst.levelOrderTraversal();
    }
}
