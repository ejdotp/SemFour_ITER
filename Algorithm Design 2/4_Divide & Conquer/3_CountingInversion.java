//Write a program to implement Counting Inversions using java (Simple)

class CountingInversion 
{ 
	static int getInvCount(int arr[], int n) 
	{ 
		int inv_count = 0; 
		for (int i = 0; i < n - 1; i++) 
			for (int j = i + 1; j < n; j++) 
				if (arr[i] > arr[j]) 
					inv_count++; 

		return inv_count; 
	} 

	public static void main(String[] args) 
	{ 
        int arr[] = new int[] {1, 20, 6, 4, 5}; 
		System.out.println("Number of inversions are " + getInvCount(arr, arr.length)); 
	} 
}

/*Number of inversions are 5 */

