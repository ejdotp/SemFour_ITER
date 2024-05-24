class LCS{
    static String X, Y;
    static int LCS = 0;

    static int LCSmethod(int i, int j)
    {
        if ( i == 0 || j == 0)
            return LCS;
        
        if (X.charAt(i-1) == Y.charAt(j-1))
            return 1 + LCSmethod(i-1, j-1);
        
        else
            return Math.max(LCSmethod(i-1, j), LCSmethod(i, j-1));
    }

    public static void main(String[] args)
    {
        X = "ABBBCDEABAB";  //INPUT 1
        Y = "BBCEAABBB";    //input 2

        System.out.println("LCS = " + LCSmethod(X.length(), Y.length()));
    }
}

// Output: LCS = 7