/*Write a program to add methods to the binary search tree created in Q1 for
 * traversing the tree in pre-order, in-order, and post-order. Invoke the above
 * methods for execution*/

class BSTNode {
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

    public void preOrderTraversal() {
        System.out.print(info + " ");
        if (left != null) {
            left.preOrderTraversal();
        }
        if (right != null) {
            right.preOrderTraversal();
        }
    }

    public void inOrderTraversal() {
        if (left != null) {
            left.inOrderTraversal();
        }
        System.out.print(info + " ");
        if (right != null) {
            right.inOrderTraversal();
        }
    }

    public void postOrderTraversal() {
        if (left != null) {
            left.postOrderTraversal();
        }
        if (right != null) {
            right.postOrderTraversal();
        }
        System.out.print(info + " ");
    }
}

public class Q2{
    public static void main(String[] args) {
        BSTNode root = new BSTNode(50);
        root.insert(30);
        root.insert(70);
        root.insert(20);
        root.insert(40);
        root.insert(60);
        root.insert(80);

        System.out.println("Pre-order traversal:");
        root.preOrderTraversal();
        System.out.println("\n");

        System.out.println("In-order traversal:");
        root.inOrderTraversal();
        System.out.println("\n");

        System.out.println("Post-order traversal:");
        root.postOrderTraversal();
    }
}
