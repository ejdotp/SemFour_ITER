/* Design a Java program that performs matrix operations such as addition, multiplication,
and transpose. Introduce scenarios, where accessing elements beyond the bounds of the
matrix results in ArrayIndexOutOfBoundsException. Your task is to handle these
exceptions effectively and provide meaningful error messages indicating the nature of
the exception. */

public class Q21 {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] b = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] c = new int[2][3];
        try {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    c[i][j] = a[i][j] + b[i][j];
                }
            }
            System.out.println("Addition of two matrices is : ");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException : " + e.getMessage());
        }
        try {
            int[][] d = new int[2][2];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    d[i][j] = 0;
                    for (int k = 0; k < 3; k++) {
                        d[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            System.out.println("Multiplication of two matrices is : ");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(d[i][j] + " ");
                }
                System.out.println();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException : " + e.getMessage());
        }
        try {
            int[][] e = new int[3][2];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 2; j++) {
                    e[i][j] = a[j][i];
                }
            }
            System.out.println("Transpose of matrix is : ");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(e[i][j] + " ");
                }
                System.out.println();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException : " + e.getMessage());
        }
    }
}
