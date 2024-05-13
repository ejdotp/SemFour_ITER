/* Extend the BST created in Q3 by adding methods to traverse the tree in level
 * order, find the node with the maximum population (find-max), and find the
 * node with the minimum population (find-min). Invoke these methods for
 * execution.*/

 import java.util.LinkedList;
 import java.util.Queue;
 
class BST {
     BNode root;
 
     public BST() {
         root = null;
     }
 
     public void insert(Country country) {
         root = insertRec(root, country);
     }
 
     private BNode insertRec(BNode root, Country country) {
         if (root == null) {
             root = new BNode(country);
             return root;
         }
 
         if (country.population < root.info.population) {
             root.left = insertRec(root.left, country);
         } else if (country.population > root.info.population) {
             root.right = insertRec(root.right, country);
         }
 
         return root;
     }
 
     public void levelOrderTraversal() {
         if (root == null) {
             return;
         }
 
         Queue<BNode> queue = new LinkedList<>();
         queue.add(root);
 
         while (!queue.isEmpty()) {
             BNode current = queue.poll();
             System.out.println(current.info.name + ": " + current.info.population);
 
             if (current.left != null) {
                 queue.add(current.left);
             }
             if (current.right != null) {
                 queue.add(current.right);
             }
         }
     }
 
     public Country findMax() {
         if (root == null) {
             return null;
         }
 
         BNode current = root;
         while (current.right != null) {
             current = current.right;
         }
         return current.info;
     }
 
     public Country findMin() {
         if (root == null) {
             return null;
         }
 
         BNode current = root;
         while (current.left != null) {
             current = current.left;
         }
         return current.info;
     }
 
     public static void main(String[] args) {
         BST bst = new BST();
 
         bst.insert(new Country("USA", 328_200_000));
         bst.insert(new Country("China", 1_394_015_977));
         bst.insert(new Country("India", 1_366_417_754));
         bst.insert(new Country("Brazil", 211_049_527));
         bst.insert(new Country("Pakistan", 216_565_318));
 
         System.out.println("Level order traversal:");
         bst.levelOrderTraversal();
         System.out.println();
 
         System.out.println("Country with maximum population:");
         Country maxCountry = bst.findMax();
         if (maxCountry != null) {
             System.out.println(maxCountry.name + ": " + maxCountry.population);
         } else {
             System.out.println("Tree is empty.");
         }
 
         System.out.println("Country with minimum population:");
         Country minCountry = bst.findMin();
         if (minCountry != null) {
             System.out.println(minCountry.name + ": " + minCountry.population);
         } else {
             System.out.println("Tree is empty.");
         }
     }
 }
 