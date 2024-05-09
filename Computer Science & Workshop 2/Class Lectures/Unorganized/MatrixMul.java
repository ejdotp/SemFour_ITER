import java.util.Arrays;
import java.util.Random;

public class MatrixMul
{   public static void main(String[] args)
    {
        int[][] m1 = generateMatrix(3, 2);
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

    public static int[][] multiply(int[][] A, int[][] B)  // Function to multiply matrices
	{
		int r1 = A.length;
        int c1 = A[0].length;
        int r2 = B.length;
        int c2 = B[0].length;
        int[][] C = new int[r1][c2];
        for  (int i = 0; i < r1; i++)
            for(int j = 0; j < c2; j++){
                C[i][j] = 0;
                for(int k = 0; k < c1; k++)
                    C[i][j] += A[i][k]*B[k][j];
            }
        return C;
	}
}

/*[[1534084, 1093954], [-1612899, 1271157], [-48039, 394886]]
[[-23181, 765122, 1277753, -656997], [947750, 856612, 169854, -1408750]]
[[505922328, 2026599760, -1490752032, -2080676720], [882109925, 852719470, 1860502411, -928179127], [1704643807, 860679754, 1396022981, -748163505]]*/
