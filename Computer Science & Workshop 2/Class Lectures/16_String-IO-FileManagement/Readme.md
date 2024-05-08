### Index:

* [16. String, IO &amp; File Handling](#16-strings-io-operations-and-file-management)
  + [1. IO Operations](#io-operations)
  + [2. String Stuff](#string-stuff)
  + [3. File Handling](#file-handling)

# 16. Strings, I/O Operations, and File Management

## I/O Operations :

* No notes, read this: https://www.geeksforgeeks.org/java-io-tutorial/
* Example:
  - In S3 & S4 it creates 2 new string object which have different memory location therefore it gives false as output even if the string value is same.
    ```ruby
    public class IOoperation
    {
        public static void main(String[] args)
        {
            String s1 = "abc";
            String s2 = "abc";
            System.out.println(s1 = =s2);
            String s3 = new String("xyz");
            String s4 = new String("xyz");
            System.out.println(s3 == s4);
        }
    }
    /*true
    false */
    ```

`<br></br>`

## String Stuff

### String Concatenation:

1. Concatenation using addition(+) operator
   ```ruby
   class KunuKunu
   {
       public static void main(String []args)
       {
           //Concatenation of two strings :
           String s1 = "Hello ";
           String s2 = "Section 44";
           s2 += s1;
           System.out.println(s2);

           //Concatenation of variable objects :
           String s1 = "Hello";
           String s2 = " World ";
           int s3 = 404;
           String s4 = s1+s2+s3;
           System.out.println(s4);
       }
   }
   //Output : Hello Section 44
   //         Hello World 404
   ```
2. Concatenation using concat() method
   ```ruby
   class KunuKunu
   {
       public static void main(String []args)
       {
           String s1 = "Hello ";
           s1 = s1.concat("Section 44");
           System.out.println(s1);
           String s2 = "Section 44";
           String s1 = s1.concat(s2);
           System.out.println(s1);
           String s3 = s1.concat(s2);
           System.out.println(s3);
       }
   }
   //Output: Hello Section 44
   //         Hello Section 44Section 44
   //         Hello Section 44Section 44Section 44
   ```

`<br></br>`

- Difference between Addition(+) & Concat:
  1. **Number of argument concat() and '+' operator take.**
     + Concat() takes only one argument to concat.
     + '+' operator can add more than two at a time.
     + ```
       S1 = "Hello ", S2 = "Section ", S3 = "44"  
       S1 + S2 + S3 will give output as Hello Section 44  
       S1.concat(S2).concat(S3) gives the same result but needs two calls  
       ```
  2. **Object Type Problem**
     + Concat() only take String arguments, else error.
     + '+' can add strings as well as variable objects.
     + ``string + string + int only possible with '+' method``
  3. **Exceptions**
     + concat() raises java.lang.NullPointerException  if any of its argument is null.
     + '+' does not raise NullPointerException if any of its argument is null.
     + ```
       String s1 = "Hello ";
       String s2 = null;
       s1 = s1.concat(s2); //Will raise null pointer exception
       String s3 = s1 + s2; //wont  
       ```
  4. **Different Soul they have**
     + '+' always creates a new string object.
     + concat() method take the String parameter and creates another string object if the string parameter has length greater than 0.
     + ```ruby
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
       ```
  5. **Performance :**
     - The concat method perform better as it doesn't create new object when that is not required.
       `<br></br>`
       `<br></br>`

### Splitting of strings:

1. **public String split(String regex)**
   - **regex -** A delimitting regular expression.
   - Example 1:
     ```ruby
     class Divorce
     {
         public static void main(String[] args)
         {
           String my_str = "ITER : A SOA University";
           String[] piece_str = my_str.split(":");
           for(String a : piece_str)
               System.out.println(a);
         }
     }
     /*ITER
     A SOA University*/
     ```
   - Example 2:
     ```ruby
     class Anullment
     {
         public static void main(String[] args)
         {
           String sr = "word1$[word2#word3]word4";
           String[] piece = sr.split("[$#]+");//Symbols wont get detected without []
           for(String b : piece)
               System.out.println(b);
         }
     }
     //word1
     [word2
     word3]word4
     ```
2. **public string[] split(String regex, int limit);**
   - **limit > 0 :**  The pattern will be applied atmost (limit-1) times, till it reaches the end of the string. The resulting array's length will not be greater than the original length of the array.
     ```ruby
     class Divorce
     {
         public static void main(String[] args)
         {
           String word = "hello#world#how#are#you";
           String[] cut = word.split("#", 2);
           for(String a : cut)
               System.out.println(a);
         }
     }
     /*hello
     how#are#you*/
     ```
   - **limit = 0 :**  The pattern will be applied as many times possible. The resultant array can be of any size and trailing empty strings will be discarded.
     ```ruby
     class Anullment
     {
         public static void main(String[] args)
         {
           String word = "hello#world#how#are#you###";
           String[] cut = word.split("#", 0);
           for(String b : cut)
               System.out.println(b);
           System.out.println(cut.length);
         }
     }
     /*hello
       world
       how
       are
       you
       5*/ 
     ```
   - **limit < 0 :**  The pattern will be applied as many times as possible. The resulting array can be of any size. Trailing empty strings are not discarded.
     ```ruby
     class Anullment
     {
         public static void main(String[] args)
         {
           String word = "hello#world#how#are#you###";
           String[] cut = word.split("#", -2);//any negative number
           for(String b : cut)
               System.out.println(b);
           System.out.println(cut.length);
         }
     }
     /*hello
       world
       how
       are
       you



       8*/ 
     ```

- Reference: https://www.geeksforgeeks.org/split-string-java-examples/
  `<br></br>`
  `<br></br>`

### String Buffer & String Builder :

| String Buffer                                                                                                         | String Builder                                                                                                          |
| --------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| i. Initially from Java                                                                                                | i. Introduced in Java5                                                                                                  |
| ii. Synchronized: multiple threads/process can't call String Buffer Simultaneously.                                   | ii. Asynchronized: multiple threads/processor can call String Builder Simultaneously.                                   |
| iii. Due to synchronization String Buffer is very slow.                                                               | iii. Due to Asynchronized String Builder is very fast.                                                                  |
| iv. Thread Safe.                                                                                                      | iv. Thread unsafe.                                                                                                      |
| StringBuffer g = new StringBuffer("hello");<br />g = g.append("you");<br />System.out.prntln(g);<br />//o/p: helloyou | StringBuilder h = new StringBuilder("hello");<br />h = h.append("you");<br />System.out.prntln(h);<br />//o/p: helloyou |

    - References: https://www.geeksforgeeks.org/stringbuffer-class-in-java/ ; https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/
