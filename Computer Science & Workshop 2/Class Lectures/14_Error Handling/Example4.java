class CatchyIWillRickYou {
    public static void main(String[] args) {
        try{
            String str = "123s";
            int num =  Integer.parseInt(str);
            System.out.println("Inside try block" + num);
        }
        catch(NumberFormatException e){
            System.out.println("Catch block executed...");
        }
        System.out.println("Outside try-catch block");
    }    
}
/*Catch block executed...
Outside try-catch block */
