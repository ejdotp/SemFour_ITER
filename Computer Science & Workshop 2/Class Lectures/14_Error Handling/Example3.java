class CatchityCatch {
    public static void main(String[] args) {
        int[] arr = null;
        try{
            System.out.println(arr.length);
        }
        catch(NullPointerException ex){
            System.out.println("Exception caught to catch block");
        }
        System.out.println("Outside try catch clause");
    }    
}
/*Exception caught to catch block
Outside try catch clause */
