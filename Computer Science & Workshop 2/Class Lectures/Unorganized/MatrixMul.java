import java.util.Arrays;
import java.util.Random;

public class MatrixMul
{   public static void main(String[] args)
    {
        int[][] m1 = generateMatrix(3, 3);
		System.out.println(Arrays.deepToString(m1));
        int[][] m2 = generateMatrix(3, 3);
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
            for(int j = 0; j < c2; j++)
                for(int k = 0; k < c1; k++)
                    C[i][j] += A[i][k]*B[k][j];
        return C;
	}
}

/*[[1832729, -1809404, 923482], [1425858, 989987, -1321211], [1076079, 266859, -656609]]
[[567099, 1274952, 1346256], [368426, -697557, -399403], [397955, -235854, -2133496]]
[[1477209465, 857744456, -12066700], [-982988797, 127002091, 752557287], [583685376, 633772479, -1517902033]]*/
