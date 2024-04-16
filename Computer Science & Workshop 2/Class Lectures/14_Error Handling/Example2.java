class catch_finally {
    public static void main(String[] args) {
        int[] arr = new int[4];
        try {
            int k = 100/0;
            System.out.println("Inside try block");
        }
        catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("Exception caught in the catch block");
        }
        finally{
            System.out.println("Inside finally block");
        }
        System.out.println("Rest of the code");
    }    
}

/*java.lang.ArithmeticException: / by zero
Exception caught in the catch block
Inside finally block
Rest of the code */