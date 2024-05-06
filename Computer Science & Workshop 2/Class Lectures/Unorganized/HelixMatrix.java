public class HelixMatrix
{   
    public static void main(String[] args)
    {
        int[][] a = { { 1, 2, 3, 4, }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int k=0;
        int m[]=new int[16];
        for (int i = 0; i < 4; i++)
        {   if(i%2==0)
            {   for(int j=0;j<4;j++)
                {   m[k]=a[i][j];
                    System.out.println(m[k]);
                    k++;
                }
            }
            else
            {   for(int l=3;l>=0;l--)
                {   m[k]=a[i][l];
                    System.out.println(m[k]);
                    k++;
        }   }   } 

        for(int i=0;i<16;i++)
            System.out.print(m[i]);
    }
}