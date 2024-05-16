// Java program for matrix chain multiplication using memoization 

import java.util.*;

class Question4
{
    static int[][] m = new int[100][100];

    static int matrixChain(int[] d, int i, int j)
    {
        if (i == j)
            return 0;
        
        if (m[i][j] != -1)
            return m[i][j];
        
        m[i][j] = Integer.MAX_VALUE;
        for (int k = i; k < j; k++)
            m[i][j] = Math.min(m[i][j], matrixChain(d, i, k) + matrixChain(d, k + 1, j) + d[i - 1] * d[k] * d[j]);

        return m[i][j];
    }

    static int MatrixChainOrder(int[] d, int n) {
        int i = 1, j = n - 1;
        return matrixChain(d, i, j);
    }

    public static void main(String[] args)
    {
        int[] arr = { 3, 2, 4, 2, 5 };
        int n = arr.length;

        for (int[] row : m)
            Arrays.fill(row, -1);

        System.out.println("Minimum number of multiplications is " + MatrixChainOrder(arr, n));
    }
}
