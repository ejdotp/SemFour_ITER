### Index:

* [13. Generics](#13-generics)

  + [1. Generic Class](#generic-class)
  + [2. Generic Method](#generic-method)
  + [3. Overriding toString](#tostring-overriding)
  + [4. Overriding equals](#equals-overriding)
  + [5. Map Interface](#map-interface)
  + [6. Set Interface](#set-interface)
  + [7. List Interface](#list-interface)
  + [8. Queue Interface](#queue-interface-fifo)
  + [9. Stream API](#stream-api)

# 13. Generics:

* The java generics programming is introduced to deal with type-safe objects.
* It makes the code stable by detecting the bugs at compile time.
* Before generics you can store any type of objects in the collection i.e. non-generics.
  > [testNonGenerics1.java](https://github.com/ejdotp/SemFour_ITER/blob/main/Computer%20Science%20%26%20Workshop%202/Class%20Lectures/12_Object%20Oriented%20Programming/7_Generics/testNonGenerics1.java)
  >

```ruby
import java.util.ArrayList;
import java.util.List;
public class testNonGenerics1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10); //int
        list.add("20"); //string
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));  // loop printing
        }
        System.out.println(list.toString()); //direct printing
    }
}
```

* Now generics force the java programmer to store a specific type of objects.
* **Advantage of Generics:**
  1. Type-Safety :

     * You can hold a single type of objects in generics. It doesn't allow to store other objects.

     > [testGenerics1.java](https://github.com/ejdotp/SemFour_ITER/blob/main/Computer%20Science%20%26%20Workshop%202/Class%20Lectures/12_Object%20Oriented%20Programming/7_Generics/testGenerics1.java)
     >

```ruby
import java.util.ArrayList;
import java.util.List;

public class testGenerics1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10); //int
        // list.add("20"); "The method add(Integer) in the type List<Integer> is not applicable for the arguments (String)"
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));  // loop printing
        }
        System.out.println(list.toString()); //direct printing
    }
}
```

2. No Type Casting Required :

   * Before generics, we needed to typecast.
     + [Non Generic](https://github.com/ejdotp/SemFour_ITER/blob/main/Computer%20Science%20%26%20Workshop%202/Class%20Lectures/12_Object%20Oriented%20Programming/7_Generics/testNonGenerics2.java)
       ```ruby
       //Non generic typecasting

       import java.util.ArrayList;
       import java.util.List;

       public class testNonGeneric2 {
           public static void main(String[] args) {
               List list = new ArrayList();
               list.add("hello");
               String s = (String)list.get(0); //(string) typecasting needed
               System.out.println(s);
           }
       }
       ```
     + [Generic](https://github.com/ejdotp/SemFour_ITER/blob/main/Computer%20Science%20%26%20Workshop%202/Class%20Lectures/12_Object%20Oriented%20Programming/7_Generics/testGenerics2.java)
       ```ruby
       //generic typecasting

       import java.util.ArrayList;
       import java.util.List;

       public class testGenerics2 {
           public static void main(String[] args) {
               List<String> list = new ArrayList<String>();
               list.add("hello");
               String s = list.get(0); //no typecasting needed
               System.out.println(s);
           }
       }
       ```
3. It detects the bug in compile time.

   ```ruby
   List<String> list = newArrayList<String>();
   list.add("hello");
   list.add(32); //compiletime Error
   '''

   ```

## Generic class

* A class that can refer to any type is a generic class.
* You have to pass different parameters during the declaration of class.
* Types of parameters:
  1. T-Type
  2. E-Elements
  3. K-Key
  4. N-Number
  5. V-Values

```ruby
class MyGen<T>{
    T obj;
    void add(T obj){
      this.obj=obj;
    }
    T get(){
      return obj;
    }
  }
```

## Generic Method

```ruby
public class Test_Generic_Method{
    public static <T> void printArray(E[] elements){
      for(E element:elements){
        System.out.println(element;)
      }
    }
    public static void main(String[] args){
      Integer[] intArray = {10, 20, 30, 40, 50, 60};
      Character[] charArray = {'A', 'B', 'C', 'D', 'E'};
      printArray(intArray);
      printArray(charArray);
    }
  }
```

```ruby
class Test<T, U>{
    T obj1;
    U obj2;
    Test(T obj1, U obj2){
      this.obj1=obj1;
      this.obj2=obj2;
    }
    public static void print(){
      System.out.println(obj1);
      System.out.println(obj2);
    }
  }
  class Test_Generic{
    public static void main(String[] args){
      Test<String, Integer> obj = new Test<String, Integer>("Hello", 17);
      obj.print();
    }
  }
```

## toString Overriding

**The Problem: [kichhigote1.java](https://github.com/ejdotp/SemFour_ITER/blob/main/Computer%20Science%20%26%20Workshop%202/Class%20Lectures/13_Generics/1_toString%20Overriding/kichhigote1.java)**

```ruby
class complex
{
    private double re, in;
    public complex (double re, double in)
    {
        this.re = re;
        this.in = in;
    }
}

public class kichhigote
{
    public static void main(String[] args)
    {
        complex c1 = new complex(10.7, 15.9);
        System.out.println(c1);
    }
}

/*output:
complex@7ad041f3
*/
```

**The Solution: [ToString.java](https://github.com/ejdotp/SemFour_ITER/blob/main/Computer%20Science%20%26%20Workshop%202/Class%20Lectures/13_Generics/1_toString%20Overriding/ToString.java)**

```ruby
public class ToString
{
    public static void main(String[] args)
    {
        Complex c1 = new Complex(10, 15);
        System.out.println(c1);
    }
}

class Complex
{
    private double re, im;
    public Complex(double re, double im)
    {
        this.re = re;
        this.im = im;
    }

    //Generics
    public double getReal()
    {
        return this.re;
    }
    public double getImaginary()
    {
        return this.im;
    }
    public void setReal(double re)
    {
        this. re = re;
    }
    public void setImaginary(double im)
    {
        this.im = im;
    }
    //Overriding toSTring method of string class
    public String toString(){
        return this.re + " + " + this.im + "I";
    }
}
```

## Equals Overriding

**Problem: [kichhigote2.java](https://github.com/ejdotp/SemFour_ITER/blob/main/Computer%20Science%20%26%20Workshop%202/Class%20Lectures/13_Generics/2_Equals%20Overriding/kichhigote2.java)**

```ruby
class complex
{
    private double re, in;
    public complex (double re, double in)
    {
        this.re = re;
        this.in = in;
    }
}

public class kichhigote2
{
    public static void main(String[] args)
    {
        complex c1 = new complex(10.7, 15.9);
        complex c2 = new complex(10.7, 15.9);
        if(c1==c2)
            System.out.println("equal");
        else
            System.out.println("no no");
    }
}

/*output:
no no
*/
```

**Solution: [Equally.java](https://github.com/ejdotp/SemFour_ITER/blob/main/Computer%20Science%20%26%20Workshop%202/Class%20Lectures/13_Generics/2_Equals%20Overriding/Equally.java)**

```ruby
public class Equally
{
    public static void main(String[] args)
    {
        Complex c1 = new Complex(10, 15);
        Complex c2 = new Complex(10, 15);
        System.out.println(c1.equals(c2));
    }
}

class Complex
{
    private double re, im;
    public Complex(double re, double im)
    {
        this.re = re;
        this.im = im;
    }

    public boolean equals(Object o)
    {
        if(o == this)
            return true;
        if (!(o instanceof Complex))
            return false;
        Complex c = (Complex) o;
        return Double.compare(re, c.re) == 0 && Double.compare(im, c.im) == 0;
    }
}

/*
Output:
true
 */
```

## Map Interface:

+ Map is a key value pair.
+ id -> Details
+ Types:
  1. Hashmap
  2. Hash Table
  3. Tree Map
  4. Linked HashMap
+ Basic principle of hashing: protects your data and your privacy.
+ [Data] --Hashing--> [Hashcode]  (no otherway around)

### HashMap in Java:

+ It is collection class that uses the system of pairs, where one is the key and other is the value.
+ The objects that are stored in this collection don't have to be ordered as it is employed to find any value using corresponding key.

### Examples:

1. **[kichhigote3.java](https://github.com/ejdotp/SemFour_ITER/blob/main/Computer%20Science%20%26%20Workshop%202/Class%20Lectures/13_Generics/3_HashStuff/kichhigote3.java)**

   ```ruby
   import java.util.*;
   class HashMapExample
   {
       public static void main(String[] args)
       {
           HashMap<Integer, String> hmap1 = new HashMap<Integer, String>();

           hmap1.put(14, "George");
           hmap1.put(33, "Paul");
           hmap1.put(16, "Jane");
           hmap1.put(7, "Brian");
           hmap1.put(19, "Jack");

           Set set1 = hmap1.entrySet();
           Iterator iterator1 = set1.iterator();

           while (iterator1.hasNext())
           {
               Map.Entry ment1 = (Map.Entry) iterator1.next();
               System.out.println("The value is:" + ment1.getValue() + " and key is: " + ment1.getKey());
           }

           String va = hmap1.get(2);
           System.out.println("Index 2 has value of " + va);
           hmap1.remove(16);

           Set set2 = hmap1.entrySet();
           Iterator iterator2 = set2.iterator();

           while (iterator2.hasNext())
           {
               Map.Entry ment2 = (Map.Entry) iterator2.next();
               System.out.println("Now value is " + ment2.getValue() + "and key is: " + ment2.getKey());
           }
       }
   }

   /*The value is:Jane and key is: 16
   The value is:Paul and key is: 33
   The value is:Jack and key is: 19
   The value is:Brian and key is: 7
   The value is:George and key is: 14
   Index 2 has value of null
   Now value is Pauland key is: 33
   Now value is Jackand key is: 19
   Now value is Brianand key is: 7
   Now value is Georgeand key is: 14 */
   ```
2. Using [map.putIfAbsent(5,"abc");] to add a new element to hashmap.
3. [map1.putAll(map);] will copy all elements from map to map1.
4. [map.remove(key);] or [map.remove(key, "ABC");] removes that key.
5. [map1.replaceAll((key, oldValue) -> "Promgrenade");] replaces all values of map1 with "Promgrenade".
   **[kichhigote4.java :](https://github.com/ejdotp/SemFour_ITER/blob/main/Computer%20Science%20%26%20Workshop%202/Class%20Lectures/13_Generics/3_HashStuff/kichhigote4.java)**

   ```ruby
   class HashMap1
   {
       public static void main(String[] args) {
           HashMap<Integer, String> map = new HashMap<Integer, String>(); //Creating HashMap
           map.put(1, "Mango"); //Put elemnts on map
           map.put(2, "Apple"); 
           map.put(4, "Grapes");
           map.put(3, "Banana");

           map.putIfAbsent(5, "Pijuli"); //Adds if not in map
           map.putIfAbsent(2, "Apple"); //wont work
           map.putIfAbsent(6, "Apple"); //will work
           map.putIfAbsent(2, "Panasa"); //wont work

           System.out.println("Iterating Hashmap0...");
           for(Map.Entry m : map.entrySet())
               System.out.println(m.getKey() + " " + m.getValue());

           HashMap<Integer, String> map1 = new HashMap<Integer, String>();
           map1.put(7, "Kiwi");
           map1.putAll(map); //Copying all elements of map to map1

           System.out.println("\nIterating Hashmap1...");
           for(Map.Entry m : map1.entrySet())
               System.out.println(m.getKey() + " " + m.getValue());  

           map.putAll(map1);
           map.remove(2);//Removing element by only key
           map.remove(3, "Banana");//Removing element by key and value

           System.out.println("\nIterating Hashmap0...");
           for(Map.Entry m : map.entrySet())
               System.out.println(m.getKey() + " " + m.getValue());

           map1.replaceAll((key, oldValue) -> "Promgrenade"); //replaces all values of map1 with Promgrenade

           System.out.println("\nIterating Hashmap1...");
           for(Map.Entry m : map1.entrySet())
               System.out.println(m.getKey() + " " + m.getValue()); 
       }
   }

   /*Iterating Hashmap0...
   1 Mango
   2 Apple
   3 Banana
   4 Grapes
   5 Pijuli
   6 Apple

   Iterating Hashmap1...
   1 Mango
   2 Apple
   3 Banana
   4 Grapes
   5 Pijuli
   6 Apple
   7 Kiwi

   Iterating Hashmap0...
   1 Mango
   4 Grapes
   5 Pijuli
   6 Apple
   7 Kiwi

   Iterating Hashmap1...
   1 Promgrenade
   2 Promgrenade
   3 Promgrenade
   4 Promgrenade
   5 Promgrenade
   6 Promgrenade
   7 Promgrenade*/
   //Bro reorders itself cuz bro's a HashMap
   ```

### Hash Table:

+ Similar to HashMap.
+ It creates a table of keys and values resulting in the production of synchronized set of objects.
+ It doesn't reorders itself like hashmap.
+ Example: [HashTable.java](https://github.com/ejdotp/SemFour_ITER/blob/main/Computer%20Science%20%26%20Workshop%202/Class%20Lectures/13_Generics/3_HashStuff/HashTable.java) :
  ```ruby
  class SmashTable
  {
      public static void main(String[] args)
      {
          Hashtable<Integer, String> hm = new Hashtable<>();
          hm.put(100, "Amit");
          hm.put(102, "Ravi");
          hm.put(103, "Rahul");
          hm.put(101, "Vijay");

          for(Map.Entry m : hm.entrySet())
              System.out.println(m.getKey() + " " + m.getValue());  

          System.out.println(hm.getOrDefault(101, "Not Found"));  // Vijay
          System.out.println(hm.getOrDefault(110, "Not Found"));  //will return not found if not present
      }
  }

  /*103 Rahul
  102 Ravi
  101 Vijay
  100 Amit
  Vijay
  Not Found */
  ```

**Difference between Hashmap & Hashtable:**

| Hash Map                                     | Hash Table                           |
| -------------------------------------------- | ------------------------------------ |
| 1. Non-synchronized                          | 1. Synchronized                      |
| 2. Allows one null key multiple null values. | 2. Doesn't allow null key or values. |
| 3. Bro is fast                               | 3. Bro is slow                       |
| 4. Inherits from Abstract map class          | 4. Inhertis from dictionary class.   |

## Set Interface

+ Doesn't allow duplicates.
+ If two identical objects found, only one of them will get inserted.
+ Types:
  1. **Hashset:**
     + Used to create a collection that uses a hashtable for storage.
     + It inherits abstract class & implements set interface.
     + Allows null values.
     + Non Synchronized.
     + Doesn't maintain the insertion order.
     + Inserted basis of their hashcode.
     + Hashset is best for search operation.
     + Example: [HashSetter1.java](https://github.com/ejdotp/SemFour_ITER/blob/main/Computer%20Science%20%26%20Workshop%202/Class%20Lectures/13_Generics/3_HashStuff/HashSetter1.java)
       ```ruby
       import java.util.*;
       class SecondSmashSett
       {
           public static void main(String[] args) {
               HashSet<String> set=new HashSet<String>();
               set.add("Ravi");
               set.add("Vijay");
               set.add("Arun");
               set.add("Sumit");
               System.out.println("An initial list of elements: " + set);
               //Removing Specific element from hashset:
               set.remove("Ravi");
               System.out.println("After invoking remove(object) method: " + set);

               HashSet<String> set1 = new HashSet<String>();
               set1.add("Ajay");
               set1.add("Gaurav");
               set.addAll(set1);
               System.out.println("Updated List: " + set);
               //Removing all the new elements from the HashSet
               set.removeAll(set1);
               System.out.println("After invoking removeAll(Object) method: " + set);
               //removing elements on the basis of specific condition
               set.removeIf(str->str.contains("Vijay"));
               System.out.println("After invoking removeIf() method: " + set);
               //removing all elements available:
               set.clear();
               System.out.println("After invoking clear() method: " + set);
           }
       }
       /*An initial list of elements: [Vijay, Ravi, Arun, Sumit]
       After invoking remove(object) method: [Vijay, Arun, Sumit]
       Updated List: [Vijay, Arun, Gaurav, Sumit, Ajay]
       After invoking removeAll(Object) method: [Vijay, Arun, Sumit]
       After invoking removeIf() method: [Arun, Sumit]
       After invoking clear() method: [] */
       ```
  2. **LinkedHashSet:**
     + It's a hashtable & implementation of the set interface.
     + Inherits Hashset class and implements setInterface.
     + Contains unique like hashset.
     + Allows all set operations & null elements.
     + Non-Synchronized
     + Maintains Insertion Order.
     + Example: [MarriedSet.java](https://github.com/ejdotp/SemFour_ITER/blob/main/Computer%20Science%20%26%20Workshop%202/Class%20Lectures/13_Generics/3_HashStuff/MarriedSet.java)
       ```ruby
       import java.util.*;
       class MarriedSet {
           public static void main(String[] args) {
               LinkedHashSet<String> LS = new LinkedHashSet();
               LS.add("One");
               LS.add("Two");
               LS.add("Three");
               LS.add("Four");
               LS.add("Five");

               Iterator<String> i=LS.iterator();
               while(i.hasNext()){
                   System.out.println(i.next());
               } System.out.println(LS);

               //Removing Specific element from hashset:
               LS.remove("Ravi");
               System.out.println("After invoking remove(object) method: " + LS);

               HashSet<String> set1 = new HashSet<String>();
               set1.add("Ajay");
               set1.add("Gaurav");
               LS.addAll(set1);
               System.out.println("Updated List: " + LS);
               //Removing all the new elements from the HashSet
               LS.removeAll(set1);
               System.out.println("After invoking removeAll(Object) method: " + LS);
               //removing elements on the basis of specific condition
               LS.removeIf(str->str.contains("Vijay"));
               System.out.println("After invoking removeIf() method: " + LS);
               //removing all elements available:
               LS.clear();
               System.out.println("After invoking clear() method: " + LS);
           }
       }
       /*
       One
       Two
       Three
       Four
       Five
       [One, Two, Three, Four, Five]
       After invoking remove(object) method: [One, Two, Three, Four, Five]
       Updated List: [One, Two, Three, Four, Five, Gaurav, Ajay]
       After invoking removeAll(Object) method: [One, Two, Three, Four, Five]
       After invoking removeIf() method: [One, Two, Three, Four, Five]
       After invoking clear() method: []
       */
       ```
  3. **TreeSet:**
     + Implements the set Interface.
     + uses tree for storage
     + Inherits abstract set, implements the navigable set interface.
     + object stored in accending order.
     + Access and retrieval time is quite fast.
     + Doesn't allow null elements.
     + Example: [Gachha.java](https://github.com/ejdotp/SemFour_ITER/blob/main/Computer%20Science%20%26%20Workshop%202/Class%20Lectures/13_Generics/3_HashStuff/Gachha.java)
       ```ruby
       import java.util.*;
       class Gachha
       {
           public static void main(String[] args) {
               TreeSet<String> tr = new TreeSet<String>();
               tr.add("Ravi");
               tr.add("Vijay");
               tr.add("Ravi");
               tr.add("Ajay");
               tr.add("sastri");
               //Traversing elements:
               Iterator<String> itr = tr.iterator();
               while(itr.hasNext()){
                   System.out.println(itr.next());
               } System.out.println(tr);

               TreeSet<Integer> tr1 = new TreeSet<Integer>();
               tr1.add(1);
               tr1.add(2);
               tr1.add(3);
               tr1.add(4);
               tr1.add(5);
               System.out.println(tr1);
               Iterator<Integer> itr1 = tr1.descendingIterator(); //print in descending
               while(itr1.hasNext()){
                   System.out.println(itr1.next());
               }
               System.out.println("Lowest Value" + tr1.pollFirst());//pops element
               System.out.println("Highest Value" + tr1.pollLast());
               System.out.println(tr1.subSet(1, 4));
               System.out.println(tr1.headSet(3));
               System.out.println(tr1.tailSet(3));
               System.out.println(tr1.descendingSet());
           }
       }

       /*Ajay
       Ravi
       Vijay
       sastri
       [Ajay, Ravi, Vijay, sastri]
       [1, 2, 3, 4, 5]
       5
       4
       3
       2
       1
       Lowest Value1
       Highest Value5
       [2, 3]
       [2]
       [3, 4]
       [4, 3, 2]*/
       ```

## List Interface

+ Index based method to insert / update / delete / search
+ it can have duplicate elements.
+ it can have null elements.
+ Types:
  1. **Array List:**
     + It's a dynamic array, no size limit
     + Add / Remove elements anytime
     + It can have duplicate elements
     + Maintains the insertion order
     + Allows random access
     + You can't create an ArrayList of the primitive datatypes like int, float, etc.
     + Required to use wrapper classes:
       ``ArrayList<Integer> a = new ArrayList<>();``
     + Example: [ArreyListy.java](https://github.com/ejdotp/SemFour_ITER/blob/main/Computer%20Science%20%26%20Workshop%202/Class%20Lectures/13_Generics/4_List%20Interface/ArreyListy.java)
       ```ruby
       import java.util.*;
       class ArreyListy
       {
           public static void main(String[] args)
           {
               //Creating list:
               ArrayList<String> list = new ArrayList<String>();
               list.add("mango");
               list.add("Apple");
               list.add("Banana");
               list.add("Grapes");
               //printing the array list
               Iterator itr = list.iterator();
               while (itr.hasNext()){
                   System.out.println(itr.next());
               }
               System.out.println("\nReturning element: " + list.get(1));
               list.set(1, "Dates");
               System.out.println("\nPrinting using for-if loop:- ");
               for(String i : list){
                   System.out.println(i);
               }
           }
       }
       /*
       mango
       Apple
       Banana
       Grapes

       Returning element: Apple

       Printing using for-if loop:- 
       mango
       Dates
       Banana
       Grapes
       */
       ```
  2. **Vector:**
     + Like a dynamic array which can grow and shrink in size.
     + Similar to arraylist with two differences:
       1. Vector is Synchronized.
       2. Java vector contains many legacy methods that are not the part of collection framework.
     + Example 1: [VikramVector.java](https://github.com/ejdotp/SemFour_ITER/blob/main/Computer%20Science%20%26%20Workshop%202/Class%20Lectures/13_Generics/4_List%20Interface/VikramVector.java)
       ```ruby
       import java.util.*;
       class VikramVector {
           public static void main(String[] args) {
               Vector<String> v = new Vector<String>();
               v.add("Lion");
               v.add("Tiger");
               v.add("Dog");
               v.add("Elephant");
               v.addElement("Rat");
               v.addElement("Cat");
               v.addElement("Deer");
               System.out.println("Elements are: " + v);
               System.out.println("Size = " + v.size());
               System.out.println("Capacity = " + v.capacity());

               if(v.contains("Tiger"))
                   System.out.println("index of Tiger = " + v.indexOf("Tiger"));
               else
                   System.out.println("No Tiger :(");

               System.out.println("First = " + v.firstElement());
               System.out.println("Last = " + v.lastElement());
           }
       }
       /*
       Elements are: [Lion, Tiger, Dog, Elephant, Rat, Cat, Deer]
       Size = 7
       Capacity = 10
       index of Tiger = 1
       First = Lion
       Last = Deer
       */
       ```
     + Example 2: [VikashVector.java](https://github.com/ejdotp/SemFour_ITER/blob/main/Computer%20Science%20%26%20Workshop%202/Class%20Lectures/13_Generics/4_List%20Interface/VikashVector.java)
       ```ruby
       import java.util.Vector;
       class VikashVector
       {
           public static void main(String[] args)
           {
               Vector<Integer> in = new Vector<Integer>();
               in.add(200);
               in.add(400);
               in.add(500);
               in.add(600);
               in.add(700);
               in.add(800);

               System.out.println("Values in Vector: " + in);
               System.out.println("Remove first: " + in.remove((Integer)200));
               System.out.println("Values in Vector: " + in);
               System.out.println("Remove 4th: " + in.remove(4));
               System.out.println("Values in Vector: " + in);
               in.removeElement(5);
               System.out.println("Values in Vector: " + in);
               System.out.println("Hashcode of this Vector: " + in.hashCode());
               System.out.println("Element of 1st: " + in.get(1));
           }
       }
       /*
       Values in Vector: [200, 400, 500, 600, 700, 800]
       Remove first: true
       Values in Vector: [400, 500, 600, 700, 800]
       Remove 4th: 800
       Values in Vector: [400, 500, 600, 700]
       Values in Vector: [400, 500, 600, 700]
       Hashcode of this Vector: 13339721
       Element of 1st: 500
       */
       ```
  3. **Linked List:**
     + Contains duplicate element.
     + Maintains insertion order.
     + Non-Synchronized.
     + Fast manipulation, no shifting required.
     + Can be used as List, Stack & Queue.
     + Inherits from abstract list class.
     + Implements list & Dequeue Interface.
     + Example: [MarriedList.java](https://github.com/ejdotp/SemFour_ITER/blob/main/Computer%20Science%20%26%20Workshop%202/Class%20Lectures/13_Generics/4_List%20Interface/MarriedList.java)

       ```ruby
       import java.util.*;
       class MarriedList
       {
           public static void main(String[] args)
           {
               LinkedList<String> ll = new LinkedList<>();
               ll.add("Ravi");
               ll.add("Vijay");
               ll.add("Ravi");
               ll.add("Ajay");  
               Iterator<String> itr = ll.iterator();
               while(itr.hasNext()){
                   System.out.println(itr.next());
               }System.out.println("Linked List: " + ll);

               ll.add(1, "Gaurav");
               System.out.println("Linked List: " + ll);

               LinkedList<String> ll2 = new LinkedList<>();
               ll2.add("Sonoo");
               ll2.add("Hanumat");
               ll.addAll(ll2);
               System.out.println("Linked List: " + ll);
               ll.addFirst("Adarsh");
               ll.addLast("Harsh");
               System.out.println("Linked List: " + ll);
               ll.remove("Sonoo");
               ll.remove(2);
               ll.removeFirst();
               ll.removeLast();
               System.out.println("Linked List: " + ll);
               ll.removeAll(ll2);
               System.out.println("Linked List: " + ll);
           }
       }

       /*
       Ravi
       Vijay
       Ravi
       Ajay
       Linked List: [Ravi, Vijay, Ravi, Ajay]
       Linked List: [Ravi, Gaurav, Vijay, Ravi, Ajay]
       Linked List: [Ravi, Gaurav, Vijay, Ravi, Ajay, Sonoo, Hanumat]
       Linked List: [Adarsh, Ravi, Gaurav, Vijay, Ravi, Ajay, Sonoo, Hanumat, Harsh]
       Linked List: [Ravi, Vijay, Ravi, Ajay, Hanumat]
       Linked List: [Ravi, Vijay, Ravi, Ajay]
       */
       ```

## Queue Interface [FIFO]

**Priority Queue:**

+ Inherits method from Abstract Queue
+ Example: [PiiChan.java](https://github.com/ejdotp/SemFour_ITER/blob/main/Computer%20Science%20%26%20Workshop%202/Class%20Lectures/13_Generics/5_Queue%20Interface/PiiChan.java)
  ```ruby
  import java.util.*;

  class PiiChan
  {
      public static void main(String[] args)
      {
          PriorityQueue<String> pq = new PriorityQueue<>();

          pq.add("Hello");
          pq.add("How");
          pq.add("Have");
          pq.add("You");
          pq.add("Been");

          System.out.println("Initial PQ: " + pq);

          pq.remove("Have");
          System.out.println("After removing \"Have\": " + pq);

          System.out.println("Invoking poll method: " + pq.poll());

          System.out.println("Does the queue contain \"Hello\" ?" + pq.contains("Hello"));
          System.out.println("Size: " + pq.size());
          System.out.println("Final: " + pq);
          pq.clear();
          System.out.println("is it empty? " + pq.isEmpty());
      }
  }
  /*
  Initial PQ: [Been, Have, Hello, You, How]
  After removing "Have": [Been, How, Hello, You]
  Invoking poll method: Been
  Does the queue contain "Hello" ?true
  Size: 3
  Final: [Hello, How, You]
  is it empty? true
  */
  ```

## Stream API

+ Introduced in Java 8.
+ Used to process collection of objects.
+ A stream in Java is a sequence of objects that supports various methods which can be pipelined to produce various results.
+ It's uses are:
  1. It is a way to express and process collections of objects.
  2. Enables to perform operations like filtering, mapping, reducing & sorting.
+ Example: [Stream_API1.java](https://github.com/ejdotp/SemFour_ITER/blob/main/Computer%20Science%20%26%20Workshop%202/Class%20Lectures/13_Generics/6_Stream%20API/Stream_API1.java)

```ruby
    import java.util.*;

    class Product
    {
        int id;
        String name;
        float price;
        public Product(int id, String name, float price)
        {
            this.id = id;
            this.name = name;
            this.price = price;
        }
    }

    class Stream_API1
    {
        public static void main(String[] args)
        {
            List<Product>  productList = new ArrayList<Product>();
            //Adding Products:
            productList.add(new Product(1, "HP Laptop", 25000f));
            productList.add(new Product(2, "Dell Laptop", 30000f));
            productList.add(new Product(3, "Lenovo Laptop", 28000f));
            productList.add(new Product(3, "Sony Laptop", 28000f));
            productList.add(new Product(3, "Apple Laptop", 90000f));

            List<Float>  productPriceList = new ArrayList<Float>();
            for(Product p : productList)
                //filtering data of list
                if(p.price<30000)
                    productPriceList.add(p.price);

            System.out.println(productPriceList);
  
        }
    }
    /*
    [25000.0, 28000.0, 28000.0]
    */
```
