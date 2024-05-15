/*Create a class Country containing members for name and population, along with
 * a constructor and necessary methods. Additionally, create a class BNode with
 * a member 'info' to store a country object, 'left' to refer to the left child,
 * and 'right' to refer tothe right child. Provide the required constructor.
 * Finally, create another class BST with a member 'root', along with the
 * necessary constructor and a method to insert a node into the binary search
 * tree.*/

import java.util.LinkedList;
import java.util.Queue;

// Question 3,4

//Country class
class Country {
    private String name;
    private int population;

    // Constructor
    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for population
    public int getPopulation() {
        return population;
    }

    // Setter for population
    public void setPopulation(int population) {
        this.population = population;
    }
}

// BNode class
class BNode {
    private Country info;
    private BNode left;
    private BNode right;

    // Constructor
    public BNode(Country info) {
        this.info = info;
        this.left = null;
        this.right = null;
    }

    // Getters and setters for info, left, and right
    public Country getInfo() {
        return info;
    }

    public void setInfo(Country info) {
        this.info = info;
    }

    public BNode getLeft() {
        return left;
    }

    public void setLeft(BNode left) {
        this.left = left;
    }

    public BNode getRight() {
        return right;
    }

    public void setRight(BNode right) {
        this.right = right;
    }
}

// BST class
class BST {
    private BNode root;
    static BNode max, min;

    // Constructor
    public BST() {
        this.root = null;
    }

    // Method to insert a node into the BST
    public void insertNode(Country country) {
        root = insertRec(root, country);
    }

    // Recursive helper method to insert a node into the BST
    private BNode insertRec(BNode root, Country country) {
        if (root == null) {
            root = new BNode(country);
            return root;
        }

        // Recur down the tree
        if (country.getName().compareTo(root.getInfo().getName()) < 0) {
            root.setLeft(insertRec(root.getLeft(), country));
        } else if (country.getName().compareTo(root.getInfo().getName()) > 0) {
            root.setRight(insertRec(root.getRight(), country));
        }

        // Return the updated root
        return root;
    }

    // In-order traversal
    public void displayInOrder() {
        inOrderTraversal(root);
    }

    // Private recursive method for in-order traversal
    private void inOrderTraversal(BNode node) {
        if (node != null) {
            inOrderTraversal(node.getLeft());
            System.out.println(
                    "Country: " + node.getInfo().getName() + ", Population: " + node.getInfo().getPopulation());
            inOrderTraversal(node.getRight());
        }
    }

    // Question 4

    public void LOrderTraversal() {
        levelOrder(root);
    }

    private static void levelOrder(BNode node) {
        if (node == null)
            return;
        max = node;
        min = node;
        Queue<BNode> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            BNode tempNode = queue.poll();
            if (tempNode.getInfo().getPopulation() > max.getInfo().getPopulation())
                max = tempNode;
            if (tempNode.getInfo().getPopulation() < min.getInfo().getPopulation())
                min = tempNode;
            System.out.print(tempNode.getInfo().getName() + " ");

            if (tempNode.getLeft() != null)
                queue.add(tempNode.getLeft());

            if (tempNode.getRight() != null)
                queue.add(tempNode.getRight());
        }
    }

    public static void main(String args[]) {
        BST b = new BST();
        b.insertNode(new Country("India", 138));
        b.insertNode(new Country("USA", 331));
        b.insertNode(new Country("China", 144));
        b.insertNode(new Country("Brazil", 213));

        System.out.println("\nDisplaying the data using In-order traversal:-");
        b.displayInOrder();
        System.out.println("\nLevel Order Traversal:- ");
        b.LOrderTraversal();

        System.out.println("\n\nCountry with Max Population is " + max.getInfo().getName());
        System.out.println("\nCountry with Min Population is " + min.getInfo().getName());
    }
}