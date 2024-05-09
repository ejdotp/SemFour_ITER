import java.util.Arrays;
import java.util.Random;

public class MatrixMulStrassers
{   public static void main(String[] args)
    {
        int[][] m1 = generateMatrix(3, 4);
		System.out.println(Arrays.deepToString(m1));
        int[][] m2 = generateMatrix(2, 4);
		System.out.println(Arrays.deepToString(m2));
		int[][] m3 = multiply(m1, m2);
        System.out.println(Arrays.deepToString(m3));
    }

    public static int[][] generateMatrix(int rows, int columns)
    {
        int[][] matrix = new int[rows][columns];
        Random random = new Random();

        for(int i = 0; i < rows; i++)
            for(int j = 0; j < columns; j++)
                matrix[i][j] = random.nextInt() / 1000; // Generate a number

        return matrix;
    }

    public static int[][] multiply(int[][] A, int[][] B)         // Function to multiply matrices
	{
		int n = A.length;                                 // Order of matrix

		int[][] R = new int[n][n];                        // Creating a 2D square matrix with size n, n is input from the user

		if (n == 1)                                       // Base case, If there is only single element
			R[0][0] = A[0][0] * B[0][0];                  // Returning the simple multiplication of two elements in matrices
		else {
			int[][] a = new int[n / 2][n / 2];
			int[][] b = new int[n / 2][n / 2];
			int[][] c = new int[n / 2][n / 2];            // Dividing Matrix into parts by storing sub-parts to variables
			int[][] d = new int[n / 2][n / 2];
			int[][] e = new int[n / 2][n / 2];
			int[][] f = new int[n / 2][n / 2];
			int[][] g = new int[n / 2][n / 2];
			int[][] h = new int[n / 2][n / 2];

			split(A, a, 0, 0);
			split(A, b, 0, n / 2);                     //Dividing matrix A into 4 halves
			split(A, c, n / 2, 0);
			split(A, d, n / 2, n / 2);

			split(B, e, 0, 0);
			split(B, f, 0, n / 2);                     //Dividing matrix B into 4 halves
			split(B, g, n / 2, 0);
			split(B, h, n / 2, n / 2);

			int[][] M1 = multiply(a, sub(f, h));
			int[][] M2 = multiply(add(a, d), h);
			int[][] M3 = multiply(add(c, d), e);
			int[][] M4 = multiply(d, sub(g, c));
			int[][] M5 = multiply(add(a, d), add(e, h));
			int[][] M6 = multiply(sub(b, d), add(g, h));
			int[][] M7 = multiply(sub(a, c), add(e, f));

			int[][] C11 = add(sub(add(M5, M4), M2), M6);
			int[][] C12 = add(M1, M2);
			int[][] C21 = add(M3, M4);
			int[][] C22 = sub(sub(add(M1, M5), M3), M7);

			join(C11, R, 0, 0);
			join(C12, R, 0, n / 2);
			join(C21, R, n / 2, 0);
			join(C22, R, n / 2, n / 2);
		}
		return R;
	}

	public static int[][] sub(int[][] A, int[][] B)   // Function to subtract two matrices
	{
		int n = A.length;
		int[][] C = new int[n][n];
                                               // Iterating over elements of 2D matrix using nested for loops
		for (int i = 0; i < n; i++)            // Outer loop for rows
			for (int j = 0; j < n; j++)        // Inner loop for columns
				C[i][j] = A[i][j] - B[i][j];   // Subtracting corresponding elements from matrices

		return C;                              // Returning the resultant matrix
	}

	public static int[][] add(int[][] A, int[][] B)   // Function to add two matrices
	{
		int n = A.length;

		int[][] C = new int[n][n];             // Creating a 2D square matrix

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				C[i][j] = A[i][j] + B[i][j];   // Iterating over elements of 2D matrix
		return C;
	}

	
	public static void split(int[][] P, int[][] C, int iB, int jB)      // Function to split parent matrix into child matrices
	{
		for (int i1 = 0, i2 = iB; i1 < C.length; i1++, i2++)
			for (int j1 = 0, j2 = jB; j1 < C.length; j1++, j2++)
				C[i1][j1] = P[i2][j2];
	}

	public static void join(int[][] C, int[][] P, int iB, int jB)       // Function to join child matrices into (to) parent matrix
	{
		for (int i1 = 0, i2 = iB; i1 < C.length; i1++, i2++)
			for (int j1 = 0, j2 = jB; j1 < C.length; j1++, j2++)
				P[i2][j2] = C[i1][j1];
	}
}

/*[[1284596, 1241189, -37369, 1431078], [-42713, -54403, 177163, -468024], [-1669005, 571866, 294401, -756554]]
[[214010, -973222, -1390453, 38931], [-1161686, -1244825, 1907891, -1734330]]
[[-1978565063, -1358867437, 0], [1436987295, 1917263361, 0], [0, 0, 0]]*/
