/*Given N number of ropes of various length. You need to join these rope to make a single rope.
The cost of joining two ropes of length A and B is (A+B) which is their combined length. You
need to find the minimum cost of joining all the ropes. The minimum cost of joining rope is 
obtained when we always join the two smallest rope.*/

import java.util.PriorityQueue;

class RopeCombiner
{
    public static int minCost(int ropes[], int n)
    {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int rope : ropes)
            minHeap.offer(rope);
        int cost = 0;
        while (minHeap.size() > 1)
        {   int min1 = minHeap.poll();
            int min2 = minHeap.poll();
            int mergedRope = min1 + min2;
            cost += mergedRope;
            minHeap.offer(mergedRope);
        }
        return cost;
    }

    public static void main(String[] args)
    {
        int ropes[] = { 4, 3, 2, 6, 8, 12, 1, 9 };
        int n = ropes.length;

        int cost = minCost(ropes, n);
        System.out.println("Minimum cost of joining all ropes: " + cost);
    }
}

/*
Minimum cost of joining all ropes: 123
 */

