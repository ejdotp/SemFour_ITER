class CreatesDiffObject
{
    public static void main(String[] args)
    {
        String s1 = "Hello";
        String s2 = "";

        //case 1
        String s3 = s1.concat(s2);

        System.out.print("During concat: ");
        if(s1 == s3)
            System.out.print("same");
        else
            System.out.print("different");

        //case 2
        String s4 = s1 + s2; 

        System.out.print("\nWith addition operator: ");
        if(s1 == s4)
            System.out.print("same");
        else
            System.out.print("different");
    }    
}

/*During concat: same
With addition operator: different */
