/*Create a class BSTNode that contains a member 'info' to store a number, with
 * 'left' referring to the left child and 'right' referring to the right child.
 * Provide the necessary constructor. Additionally, create a method to insert a
 * node into a binary search tree.*/

public class BSTNode {
    int info;
    BSTNode left;
    BSTNode right;

    public BSTNode(int info) {
        this.info = info;
        left = null;
        right = null;
    }

    public void insert(int value) {
        if (value < info) {
            if (left == null) {
                left = new BSTNode(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new BSTNode(value);
            } else {
                right.insert(value);
            }
        }
    }
}
