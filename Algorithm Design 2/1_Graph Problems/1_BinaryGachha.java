class BinaryGachha
{
    public class node {
        public int data;
        node left;
        node right;

        public node(int d) {
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        BinaryGachha tree = new BinaryGachha();
        BinaryGachha.node root = tree.new node(1);
        root.left = tree.new node(2);
        root.right = tree.new node(3);
        root.left.left = tree.new node(4);
        root.left.right = tree.new node(7);
        /*
         * 1
         * / \
         * 2 3
         * / \
         * 4 7
         */
    }
}