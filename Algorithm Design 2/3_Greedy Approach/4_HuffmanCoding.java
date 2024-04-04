import java.util.*;

class huffmancoding { 

	public static void printCode(HuffmanNode root, String s) 
	{  
		if (root.left == null && root.right == null
			&& Character.isLetter(root.c)) { 

			// c is the character in the node 
			System.out.println(root.c + ":" + s); 

			return; 
		} 

		printCode(root.left, s + "0"); 
		printCode(root.right, s + "1"); 
	} 
 
	public static void main(String[] args) 
	{ 
// number of characters. 
		int n = 6; 
		char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' }; 
		int[] charfreq = { 5, 9, 14, 13, 16, 3 }; 

		// creating a priority queue q. 
		// makes a min-priority queue(min-heap). 
		PriorityQueue<HuffmanNode> q 
			= new PriorityQueue<HuffmanNode>( 
				n, new MyComparator()); 

		for (int i = 0; i < n; i++) { 

			// creating a Huffman node object 
			//add it to the priority queue. 
			HuffmanNode hn = new HuffmanNode(); 

			hn.c = charArray[i]; 
			hn.data = charfreq[i]; 

			hn.left = null; 
			hn.right = null; 

			// add the huffman node to the queue. 
			q.add(hn); 
		} 

		// create a root node 
		HuffmanNode root = null; 

		while (q.size() > 1) { 

			// first min extract. 
			HuffmanNode x = q.peek(); 
			q.poll(); 

			// second min extract. 
			HuffmanNode y = q.peek(); 
			q.poll(); 

			// new node f which is equal 
			HuffmanNode f = new HuffmanNode(); 

			f.data = x.data + y.data; 
			f.c = '-'; 

			// first extracted node as left child. 
			f.left = x; 

			// second extracted node as the right child. 
			f.right = y; 

			// marking the f node as the root node. 
			root = f; 

			// add this node to the priority-queue. 
			q.add(f); 
		} 

		// print the codes by traversing the tree 
		printCode(root, ""); 
	} 
} 

class HuffmanNode { 

	int data; 
	char c; 

	HuffmanNode left; 
	HuffmanNode right; 
} 

class MyComparator implements Comparator<HuffmanNode> { 
	public int compare(HuffmanNode x, HuffmanNode y) 
	{ 

		return x.data - y.data; 
	} 
}

/*d:00
c:01
e:10
f:1100
a:1101
b:111 */