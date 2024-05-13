/*Create a class Country containing members for name and population, along with
 * a constructor and necessary methods. Additionally, create a class BNode with
 * a member 'info' to store a country object, 'left' to refer to the left child,
 * and 'right' to refer tothe right child. Provide the required constructor.
 * Finally, create another class BST with a member 'root', along with the
 * necessary constructor and a method to insert a node into the binary search
 * tree.*/

 public class Q3{
    public static void main(String[] args) {
        BST bst = new BST();
        Country c1 = new Country("USA", 320);
        Country c2 = new Country("Canada", 37);
        Country c3 = new Country("China", 140000000);
        // Insert nodes in ascending order of population
        bst.insert(c3);
        bst.insert(c1);
        bst.insert(c2);
        
        System.out.println(bst);
    }
 }

 class Country {
    String name;
    long population;

    public Country(String name, long population) {
        this.name = name;
        this.population = population;
    }
}

class BNode {
    Country info;
    BNode left;
    BNode right;

    public BNode(Country country) {
        this.info = country;
        left = null;
        right = null;
    }
}

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
}
