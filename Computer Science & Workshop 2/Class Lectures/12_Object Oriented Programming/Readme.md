### Index:

* [12. Object Oriented Programming](#12-object-oriented-programming)

  + [1. Encapsulation](#encapsulation)
  + [2. Inheritance](#inheritance)
  + [3. Abstraction](#abstraction)
  + [4. Polymorphism](#polymorphism)
  + [5. Interface](#interface)
  + [6. Coupling &amp; Cohesion](#coupling-and-cohesion)

# 12. Object Oriented Programming

## Encapsulation:

* Hiding "sensitive" information/data fom outside access.
* It's a process of wrapping information/data into a single piece.
* Two Rules :
  1. Declare class attribute/variaqbles as private.
  2. Use GET & SET method to access &  update the private attributes/variables.
* Example: [TestEncapsulation.java](https://github.com/ejdotp/SemFour_ITER/blob/main/Computer%20Science%20%26%20Workshop%202/Class%20Lectures/12_Object%20Oriented%20Programming/1_Encapsulation/TestEncapsulation.java)

```ruby
class Person
{
	private int Age;
	private String Name;

	// We will employ get and set methods to use the class objects
	public String getName()
	{
		return Name;
	}

	public int getAge()
	{
		return Age;
	}

	public void setAge(int Age)
	{
		this.Age = Age;
	}

	public void setName(String Name)
	{
		this.Name = Name;
	}
}

public class TestEncapsulation
{
	public static void main(String args[])
	{
		Person obj = new Person();
		obj.setName("Mark");
		obj.setAge(30);
		System.out.println("Name is: " + obj.getName());
		System.out.println("Age is: " + obj.getAge());
	}
}
```

* | Advantages                                                                                        | Disadvantages                                      |
  | ------------------------------------------------------------------------------------------------- | -------------------------------------------------- |
  | code becomes more flexible. Programmer can change one part of code without affecting other parts. | It can lead to complex code, if not used properly. |
  | Attributes can be made read only or write only according to programmer's choice.                  | May limit the flexibility of implementation.       |
  | Increases security of data.                                                                       | It makes the code more difficult to understand.    |

## Inheritance:

* It's a mechanism in which one object aquires all the properties  and behaviors (attributes and methods) of a parent object.
* You can build a new class upon an existing class which will poses all the properties of parent class.
* Syntax: class SubClassName extends SuperClassName{//methods}
* Example: [Inheritance.java](https://github.com/ejdotp/SemFour_ITER/tree/main/Computer%20Science%20%26%20Workshop%202/Class%20Lectures/12_Object%20Oriented%20Programming/2_Inheritance)
* 3 Types:
  1. Single Inheritance [class A] <-- [class B]
  2. Multilevel Inheritance [class A] <-- [class B] <-- [class C]
  3. Heirarchial Inheritance [class C] --> [class A] <-- [class B]
* | Advantages                                                                              | Disadvantages                                                                             |
  | --------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
  | It makes the code reusable as the super class remains same for all subclass.            | Inheritance makes it difficult to make changes to super class without affecting subclass. |
  | Helps to implement, extend and maintain abstraction & runtime polymorphism.             | Multiple inheritance, etc make a code very complicated                                    |
  | It creates a class heirarchy which is more useful when dealing with real world objects. |                                                                                           |

## Abstraction:

* It's the process in which we only show essential details/functionality to the user.
* The non-essential things are hidden from user.
* Two ways to achieve Abstraction:
  1. Abstract class -> (o - 100%)
  2. Interface -> (100%)
* An abstract class must be declared with an abstract keyword:
  > abstract class A{ //code }
  >
* Example: [Abstraction.java](https://github.com/ejdotp/SemFour_ITER/blob/main/Computer%20Science%20%26%20Workshop%202/Class%20Lectures/12_Object%20Oriented%20Programming/3_Abstraction/Abstraction.java)
  ```ruby
  abstract class Bike
  {
      abstract void run();
  }

  class Yamaha extends Bike
  {
      void run()
      {
          System.out.println("running safely");
      }
  }

  public class Abstraction
  {
  	public static void main(String args[])
      {
          Bike b = new Yamaha();
          b.run();
      }
  }
  ```
* | Advantages                                                          | Disadvantages                                                                              |
  | ------------------------------------------------------------------- | ------------------------------------------------------------------------------------------ |
  | It protect the implementation of program from users.                | Over use of abstraction makes the code less optimal because of unneccessary layer of code. |
  | It provides flexibility as we can change the way we implement code. | It may limit the flexibility of implementation.                                            |
  | It makes code easier for debugging.                                 | It makes the code more difficult to understand.                                            |

## Polymorphism:

* Poly -> Many ; Morph -> Forms (from Greek)
* Like: Woman -> Mother -> Sister -> Wife -> Daughter
* To perform a single action in different ways
* The ability of a message to be displayed in more than one form
* Two Types:
  1. Compile Time/Static Polymorphism

     + Function Overloading
     + Operator Overloading [Not supported by java]
     + Example: [TestOverloading1.java](https://github.com/ejdotp/SemFour_ITER/blob/main/Computer%20Science%20%26%20Workshop%202/Class%20Lectures/12_Object%20Oriented%20Programming/4_Polymorphism/TestOverloading1.java)

     ```ruby
     class Multiplier {
         static int mul(int a, int b) {
             return a * b;
         }

         static int mul(int a, int b, int c) {
             return a * b * c;
         }

         static double mul(double a, double b) {
             return a * b;
         }
     }

     class TestOverloading1 {
         public static void main(String[] args) {
             System.out.println(Multiplier.mul(11, 11));
             System.out.println(Multiplier.mul(11, 11, 11));
             System.out.println(Multiplier.mul(11.1, 11.1));
         }
     }
     ```
  2. Run Time Polymorphism

     + Dynamic Method Dispatch
     + Override the function at runtime
     + Override is when the derived class has same definition of the functions of box class.
     + Example: [TestOverriding1.java](https://github.com/ejdotp/SemFour_ITER/blob/main/Computer%20Science%20%26%20Workshop%202/Class%20Lectures/12_Object%20Oriented%20Programming/4_Polymorphism/TestOverriding1.java)

     ```ruby
     class Bike
     {
         void run()
         {
             System.out.println("Running at 400 kmph");
         }
     }

     class Honda extends Bike
     {
         void run()
         {
             System.out.println("More like 120kmph LOL");
         }
     }
     public class TestOverriding1
     {
         public static void main(String[] args)
         {
             Bike b = new Honda();
             b.run();
         }
     }
     ```
* In Overloading -> functions are in same class
* In Overriding -> functions are in different class
* | Advantages                                                                             | Disadvantages                                                            |
  | -------------------------------------------------------------------------------------- | ------------------------------------------------------------------------ |
  | It enables the correct method to be called at runtime based on actual class of object. | It makes it more difficult to understand the behaviour of an object.     |
  | It supports different constructions which gives flexibility to code.                   | Requires more computation at runtime, so it leads to performance issues. |
  | It makes writing a code easier using generic data type                                 |                                                                          |

## Interface:

+ Blue print of a class
+ It has static constants and abstract methods.
+ Interface can't be used to create objects.
+ "Implement" - used to achieve interface.
+ By default all attributes of interface are public, static & final.
+ One implementation - you must override all its methods.

  ```ruby
  interface A{  
  static int a = 10; //declare constant fields.
  void move(); //declare abstract methods
  }
  ```
+ A class only extend to one class but can implement infinite interfaces.
+ Example: [testInterface1.java](https://github.com/ejdotp/SemFour_ITER/blob/main/Computer%20Science%20%26%20Workshop%202/Class%20Lectures/12_Object%20Oriented%20Programming/5_Interface/testInterface1.java)

  ```ruby
  interface MyInterface1 {
      public void method1();
  }

  interface MyInterface2{
      public void method2();
  }

  class DemoClass implements MyInterface1, MyInterface2{
      public void method1(){
          System.out.println("Method 1");
      }
      public void method2(){
          System.out.println("Method 2");
      }
  }

  public class testInterface1 {
      public static void main(String[] args) {
          DemoClass dc = new DemoClass();
          dc.method1(); // Call
          dc.method2(); // Call
      }
  }
  ```
+ [class] -- extends --> [class]
+ [class] -- implements --> [interface]
+ [Interface] -- extends --> [interface]
+ | Class                                                 | Interface                                                   |
  | ----------------------------------------------------- | ----------------------------------------------------------- |
  | Instantiate an object                                 | You can't instantiate an object                             |
  | class can have any method ( declaration & body )      | It can only have abstract method(only declaration, no body) |
  | The access specifiers are: Public Private & protected | Only Public                                                 |

## Coupling and Cohesion:

* It is used to solve complex problems.
* To deliver quality codes.
* Loose coupling and high cohesion is desirable for good practice of coding.
* **Coupling[interclass]:**
  + Pairing, Interdependency
  + The extend to which a class knows about another class
  + Two Types:
    1. Loose Coupling
       + when class A doesn't have public variables
       + class A can't be accessed by any other class.
       + Example: [testLooseCoupling1.java](https://github.com/ejdotp/SemFour_ITER/blob/main/Computer%20Science%20%26%20Workshop%202/Class%20Lectures/12_Object%20Oriented%20Programming/6_Coupling/testLooseCoupling1.java)
         ```ruby
         class A
         {
             private String name; //public data member of A class

             public String getName()
             {
                 if(name!=null) //checking a valid access of intance variable, "name"
                     return name;
                 else
                     return "not initialized";
             }

             public void setName(String s)
             {
                 if(s==null) //checking a valid setting of instance variable, "name"
                     System.out.println("cant initialize to a null dude");
                 else
                     name = s;
             }
         }

         class testLooseCoupling1
         {
             public static void main(String[] args) {
                 A a = new A();
                 a.setName(null);
                 System.out.println("Name is " + a.getName());
             }
         }
         /*output:
         cant initialize to a null dude
         Name is not initialized
          */
         ```
    2. Tight Coupling
       + when a class knows everything about another class.
       + If all the members are public, class B can access directly from class A using operators.
       + [class A] --Tight Coupling--> [class B]
       + Example: [testTightCoupling1.java](https://github.com/ejdotp/SemFour_ITER/blob/main/Computer%20Science%20%26%20Workshop%202/Class%20Lectures/12_Object%20Oriented%20Programming/6_Coupling/testTightCoupling1.java)
         ```ruby
         class A
         {
             public String name; //public data member of A class

             public String getName()
             {
                 if(name!=null) //checking a valid access of intance variable, "name"
                     return name;
                 else
                     return "not initialized";
             }

             public void setName(String s)
             {
                 if(s==null) //checking a valid setting of instance variable, "name"
                     System.out.println("cant initialize to a null dude");
                 else
                     name = s;
             }
         }

         class testTightCoupling1
         {
             public static void main(String[] args) {
                 A a = new A();
                 a.name = null;
                 System.out.println("Name is " + a.name);
             }
         }
         /*
         Name is null
          */
         ```
* **Cohesion[intraclass]:**
  + It refers to the extent which a class is defined to do a specific specialized task.
  + Two Types:
    1. High Cohesion [Bad Programming Style]
       * when a class is designed to do a specific specialized task.
       * Example:
         ```ruby
         class player_data{
           class coonect_toplayer{connect_toplayer ctp = new connect_toplayer};
           class details_player{...};
           class player_rankiing{...};
           class game_details{...};
           class player_travel{...};
         }
         ```
    2. Low Cohesion [Good Programming Style]
       * when a class is designed to many tasks rather than a single task, it's calles a "low cohesive" class.
       * Example:
         ```ruby
         class player_data{
           public void connect_toplayer();
           public void details_player();
           public void player_rankiing();
           public void game_details();
           public void player_travel();
         }
         ```
