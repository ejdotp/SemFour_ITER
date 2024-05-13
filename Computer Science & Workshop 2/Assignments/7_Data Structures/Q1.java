/*Create a class BSTNode that contains a member 'info' to store a number, with
 * 'left' referring to the left child and 'right' referring to the right child.
 * Provide the necessary constructor. Additionally, create a method to insert a
 * node into a binary search tree.*/

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
}

public class Q1{
    public static void main(String[] args) {
        BSTNode root = new BSTNode(50);  // Root of the Binary Search Tree
        root.insert(20);                       
        root.insert(60);    

        System.out.print(root.left.info + " " + root.info + " " + root.right.info); 
    }
}

//20 50 60
