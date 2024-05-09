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
                matrix[i][j] = random.nextInt() / 1000; // Generate a number

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
            sb.append(Arrays.toString(arr[i]));
            if(i <  arr.length - 1)
                sb.append('\n');
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}

/*[[-1422397, -2063977, -712082]
[-1308465, 1416489, -250414]
[-1128396, -1730408, -637283]]*/
