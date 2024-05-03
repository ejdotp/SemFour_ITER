// Java Program to Implement Strassen Algorithm

class StrassMan 
{
	public int[][] multiply(int[][] A, int[][] B)         // Function to multiply matrices
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

	public int[][] sub(int[][] A, int[][] B)   // Function to subtract two matrices
	{
		int n = A.length;
		int[][] C = new int[n][n];
                                               // Iterating over elements of 2D matrix using nested for loops
		for (int i = 0; i < n; i++)            // Outer loop for rows
			for (int j = 0; j < n; j++)        // Inner loop for columns
				C[i][j] = A[i][j] - B[i][j];   // Subtracting corresponding elements from matrices

		return C;                              // Returning the resultant matrix
	}

	public int[][] add(int[][] A, int[][] B)   // Function to add two matrices
	{
		int n = A.length;

		int[][] C = new int[n][n];             // Creating a 2D square matrix

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				C[i][j] = A[i][j] + B[i][j];   // Iterating over elements of 2D matrix
		return C;
	}

	
	public void split(int[][] P, int[][] C, int iB, int jB)      // Function to split parent matrix into child matrices
	{
		for (int i1 = 0, i2 = iB; i1 < C.length; i1++, i2++)
			for (int j1 = 0, j2 = jB; j1 < C.length; j1++, j2++)
				C[i1][j1] = P[i2][j2];
	}

	public void join(int[][] C, int[][] P, int iB, int jB)       // Function to join child matrices into (to) parent matrix
	{
		for (int i1 = 0, i2 = iB; i1 < C.length; i1++, i2++)
			for (int j1 = 0, j2 = jB; j1 < C.length; j1++, j2++)
				P[i2][j2] = C[i1][j1];
	}

	public static void main(String[] args)
	{
		StrassMan s = new StrassMan();                                      // Create an object of Strassen class

		int N = 4;                                              // Let size of matrix be 4

		int[][] A = { { 1, 2, 3, 4 },
					{ 4, 3, 0, 1 },
					{ 5, 6, 1, 1 },
					{ 0, 2, 5, 6 } };

		int[][] B = { { 1, 0, 5, 1 },
					{ 1, 2, 0, 2 },
					{ 0, 3, 2, 3 },
					{ 1, 2, 1, 2 } };

		int[][] C = s.multiply(A, B);

		System.out.println("\nProduct of matrices A and B : ");

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				System.out.print(C[i][j] + " ");
			System.out.println();
		}
	}
}

/*Product of matrices A and B : 
-55    7  -70  22 
-107 -47  -30  37 
-85   13   -1  24 
-98    1  -11  31 */
