class Try_Catch{
    public static void main(String[] args) {
        int[] arr = new int[4];
        try{
            int i = arr[4];
            System.out.println("Inside try block");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("Exception caught in the catch block");
        }
        System.out.println("Outside try-catch clause");
    }
}

/*java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
Exception caught in the catch block
Outside try-catch clause */