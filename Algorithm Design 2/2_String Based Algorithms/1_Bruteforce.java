//Brute force algorithm for string search & count the occurence

class Bruteforce
{
	public int bruteforce(String drop, String river)
	{
		int m = drop.length();
		int n = river.length();
		int count = 0;

		for (int i = 0; i <n-m; i++)
		{
			int j = 0;
			while ((j < m) && (river.charAt(i + j) == drop.charAt(j)))
				j++;
			
			if (j == m)
			{
				System.out.println("Found at index: " + (i+1) + " upto " + (i+m));
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args)
	{
		Bruteforce obj = new Bruteforce();
		// text
		String river = "Bro really said oh ethire the start position and end position duita jaga mention heichi. Let's add a random the here which we are to find.";
		// word that want to be matched in the text
		String drop = "the";
		
		int count = obj.bruteforce(drop, river);
		
		if (count == 0)
			System.out.println("Pattern is not matched in the text");
		else
			System.out.println(count==1? "Pattern found Once." : "Pattern found "+count+" times.");
	}
}

/*Output:
Found at index: 27 upto 29
Found at index: 109 upto 111
Pattern found 2 times. */