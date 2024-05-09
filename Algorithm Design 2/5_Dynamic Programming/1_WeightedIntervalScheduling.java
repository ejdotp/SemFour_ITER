//implement weighted interval scheduling using java

import java.util.*;
class WeightedIntervalScheduling
{
    public static void main(String args[])
	{
		int m = 4;
		Job arr[] = new Job[m];
		arr[0] = new Job(3, 10, 20);
		arr[1] = new Job(1, 2, 50);
		arr[2] = new Job(6, 19, 100);
		arr[3] = new Job(2, 100, 200);
		int n = arr.length;
		System.out.println("The optimal profit is " + findMaxProfit(arr, n));
	}

	static class Job
    {
		int start, finish, profit;                              // A job has start time, finish time and profit.
		Job(int start, int finish, int profit)
		{
			this.start = start;
			this.finish = finish;
			this.profit = profit;
		}
	}

	static int latestNonConflict(Job arr[], int i)
	{
		for (int j = i - 1; j >= 0; j--) {
			// finish before next is started
			if (arr[j].finish <= arr[i - 1].start)
				return j;
		}
		return -1;
	}

	static int findMaxProfitDP(Job arr[], int n)
	{
        int[] table = new int[n];                          //store profits
		table[0] = arr[0].profit;

		for (int i = 1; i < n; i++)
        {                                                  // Fill entries in M[] using recursive property
			
			int inclProf = arr[i].profit;                  // Find profit including the current job
			int l = latestNonConflict(arr, i);
			if (l != -1)
				inclProf += table[l];

			table[i] = Math.max(inclProf, table[i - 1]);   // Store maximum of including and excluding
		}

		int result = table[n - 1];                         // Store result and free dynamic memory is allocated for table[]

		return result;
	}

	static int findMaxProfit(Job arr[], int n)             // returns the maximum possible profit
	{
		// Sort jobs according to finish time
		Arrays.sort(arr, new Comparator<Job>() {
			public int compare(Job j1, Job j2)
			{
				return j1.finish - j2.finish;
			}
		});

		return findMaxProfitDP(arr, n);
	}

}

// The optimal profit is 250
