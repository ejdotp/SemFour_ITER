class Bruteforce {
	// called function
	public int bruteforce(String drop, String river) {
		int m = drop.length();
		int n = river.length();

		// loop condition
		for (int i = 0; i <n-m; i++) {
			int j = 0;
			while ((j < m) && (river.charAt(i + j) == drop.charAt(j))) {
				j++;
			}
			if (j == m) {
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		Bruteforce obj = new Bruteforce();
		// text
		String river = "Bro really said oh ethire start position and end position duita jaga mention heichi. Let's adda random the here which we are to find.";
		// word that want to be matched in the text
		String drop = "and";
		// calling the function
		int start = obj.bruteforce(drop, river);
		// condition to check whether the pattern is matched are not
		if (start == -1) {
			System.out.println("Pattern is not matched in the text");
		} else {
			System.out.println("Found at position:" + (start));
			System.out.println("End at the position:" + (start + drop.length() - 1));
		}
	}
}