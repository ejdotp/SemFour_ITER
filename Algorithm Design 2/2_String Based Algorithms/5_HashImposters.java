//Remove duplicates in any array of numbers using hash table.

import java.util.Hashtable;

class Imposters
{
	static void eject(int[] a, int n)
	{
		Hashtable<Integer, Boolean> map = new Hashtable<>();

		for (int i = 0; i < n; ++i)
		{
			if (map.get(a[i]) == null)
			{
				System.out.print(a[i] + " ");
				map.put(a[i], true);
			}
		}
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 5, 1, 7, 2, 4, 2 };
		eject(arr, arr.length);
	}
}

/*Output:
1 2 5 7 4 
 */
