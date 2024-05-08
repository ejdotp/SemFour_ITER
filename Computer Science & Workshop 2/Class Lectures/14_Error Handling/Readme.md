### Index:

* [14. Error Handling](#14-error-handling)
  + [1. Logical Error](#1-logical-error)
  + [2. Syntactical Error](#2-syntactical-error)
  + [3. Semantic Error](#3-semantic-error)
  + [4. Exception Handling](#exception-handling)

# 14. Error Handling

### 1. Logical Error:

- Most difficult type of error.
- It doesn't show the error statements but the code works properly.
- The code / program runs smoothly but the expected output is comming wrong.
- Example:

```ruby
int c;
for(c=0; c<=10; c++);{
    System.out.print("Counter is: " + c);      //here expected result is
}                                              //to print counter 10
//output: counter is: 11
```

```ruby
public class error_handling{
    public static void main(String[] args){
        int var1 = 5+4*3/2;
        int var2 = (5+4)*3/2;
        int var3 = (5+4)*(3/2);
        int var4 = (5+(4*3))/2;
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
    }
}
/* Output
var1 = 11           here output is different with same integer input i.e. we
var2 = 13           are not getting the output. This type of error where the
var3 = 9            code will run without any error but with wrong output if
var4 = 8            called as Logical Error */
```

* Handling Logical Error:
  * Debugging - check program line by line
  * Proofreading - check program again and again

### 2. Syntactical Error:

* Wrong Language or Wrong Syntax.
* Examples:
  * Capitalization
  * Splitting Strings
  * Not importing classes
  * Different methods
  * Curly Braces

### 3. Semantic Error:

* Depends on use of the code.
* Example: Improper missing declaration, Wrong use of Operator.
  ```ruby
    for(i = 0; i< 10; i++){ //improper or missing declaration
        System.out.println(i);
    }
    m = 0;  // wrong use of operator.
    //output: i cannot be resolved to a variable. (error)  

    boot b;
    b++;
    //output: boot cannot be resolved to a type (error)
  ```
* Scope of the variable:
  ```ruby
  public static void main(String[] args){
      int var1;
      fun1(){
          int var2;  //var2 only has scope inside this func
      }
      fun2(){
          float var3;
          var3 = var2 + 10; //hence can't be accessed here.  
      }
  }
  ```

### Importance of Error Handling:

1. Ensures smooth operation
2. Guarantees code will never malfunction
3. Desired result will always come
4. Ensures error and other problems dont get carried forward in ease of large codes.

### Exception Handling:

* Exception is an event that disrupts the normal flow of program.
* It is a mechanism to handle the runtime error/exception such as ClassNotFound/IOException, SQL Exception, etc. to ensure the normal flow of the program.
* **Try-Catch-Finally:**
  - Control flow in try-catch
  - **Case 1:** Exception occurs in the try block and get handled in the catch block.
  - **Case 2:** Exception occurs in the try block and it is not handled in the catch block.
  - **Case 3:** Exception doesn't occur.
  - Example 1 - [ArrayIndexOutOfBoundsException](https://github.com/ejdotp/SemFour_ITER/blob/main/Computer%20Science%20%26%20Workshop%202/Class%20Lectures/14_Error%20Handling/Example1.java) :
    ```ruby
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
    ```
  - Example 2 - [ArithmeticException](https://github.com/ejdotp/SemFour_ITER/blob/main/Computer%20Science%20%26%20Workshop%202/Class%20Lectures/14_Error%20Handling/Example2.java) :
    ```ruby
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
    ```
  - Example 3 - [NullPointerException](https://github.com/ejdotp/SemFour_ITER/blob/main/Computer%20Science%20%26%20Workshop%202/Class%20Lectures/14_Error%20Handling/Example3.java) :
    ```ruby
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
    ```
  - Example 4 - [NumberFormatException](https://github.com/ejdotp/SemFour_ITER/blob/main/Computer%20Science%20%26%20Workshop%202/Class%20Lectures/14_Error%20Handling/Example4.java) :
    ```ruby
    class CatchyIWillRickYou {
        public static void main(String[] args) {
            try{
                String str = "123s";
                int num =  Integer.parseInt(str);
                System.out.println("Inside try block");
            }
            catch(NumberFormatException e){
                System.out.println("Catch block executed...");
            }
            System.out.println("Outside try-catch block");
        }  
    }
    /*
    if(str="123")
        Output: Catch block executed...
                Outside try-catch block 
    else if(str="123s" or any other alphabet is added)
        Output: Inside try block
                Outside try-catch block
    */
    ```
* **Checked Exceptions :**
  - That are checked in compile time.
  - The exception throws with the keyboard.
  - Example : IOException, SQLException etc.
    ```ruby
    import java.io.*;
    class somethingsomething{
        public static void main(String []args) {
            FileReader file = new FileReader("C:\\test\\a.txt");
            BufferedReader fileinput = new BufferedReader(file);
            for(int counter = 0; counter < 3; counter++)
                System.out.print(fileinput.readLine());
            fileinput.close();
        }
    }
    /*Error:
    FileNotFoundException*/
    ```
* **Unchecked Exceptions (Runtime Exception):**
  * That are not checked in compile time.
  * They are caught in runtime.
  * It throws with the exception keyword.
  * Example: //int m=10; int n = 0; int k=m/nA
