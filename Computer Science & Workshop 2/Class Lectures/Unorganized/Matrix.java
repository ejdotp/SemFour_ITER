import java.util.Arrays;
import java.util.Random;

public class Matrix
{   public static void main(String[] args)
    {
        //System.out.println(Arrays.deepToString(generateMatrix(3, 3))); //driectly print but it will print in one line
        printArray(generateMatrix(3, 3)); 
    }

    public static int[][] generateMatrix(int rows, int columns)
    {
        int[][] matrix = new int[rows][columns];
        Random random = new Random();

        for(int i = 0; i < rows; i++)
            for(int j = 0; j < columns; j++)
                matrix[i][j] = random.nextInt() / 1000; // Generate a number between -1 and  1

        return matrix;
    }

    public static void printArray(int[][] arr)    //not necessary if printing directly
    {
        if (arr == null) {
            System.out.print("null");
            return;
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0 ; i < arr.length ; i++ ) {
            sb.append('\n');
            sb.append(Arrays.toString(arr[i]));
        }
        sb.append("\n]");
        System.out.println(sb.toString());
    }
}

/*[[-242341, -1785124, 728511], [414515, -1886714, -1863612], [1612101, 735169, -1749393]] */
