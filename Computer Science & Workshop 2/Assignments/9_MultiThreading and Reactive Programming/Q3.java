// Q3. Write a Java program to multiply two matrices using multithreading. Divide the taskof
// multiplying rows of the matrices among multiple threads to improve performance.
class MatrixMultiplier {
    public static void main(String[] args) {
        int[][] matrixA = {
                { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }
        };
        int[][] matrixB = {
                { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 }
        };
        int[][] result = multiplyMatrices(matrixA, matrixB);
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;
        int[][] result = new int[rowsA][colsB];
        Thread[] threads = new Thread[rowsA];
        for (int i = 0; i < rowsA; i++) {
            final int row = i;
            threads[i] = new Thread(() -> {
                for (int j = 0; j < colsB; j++) {
                    for (int k = 0; k < colsA; k++) {
                        result[row][j] += matrixA[row][k] * matrixB[k][j];
                    }
                }
            });
            threads[i].start();
        }
        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return result;
    }
}
// Output:- Resultant Matrix:
// 30 24 18
// 66 51 36
// 102 78 54