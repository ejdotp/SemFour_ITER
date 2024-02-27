# [12. ](https://github.com/ejdotp/SemFour_ITER/tree/main/Computer%20Science%20%26%20Workshop%202/12_Object%20Oriented%20Programming)Object Oriented Programming

## Encapsulation:

* Hiding "sensitive" information/data fom outside access.
* It's a process of wrapping information/data into a single piece.
* Two Rules :
  1. Declare class attribute/variaqbles as private.
  2. Use GET & SET method to access &  update the private attributes/variables.
* Example: [TestEncapsulation.java](https://github.com/ejdotp/SemFour_ITER/blob/main/Computer%20Science%20%26%20Workshop%202/12_Object%20Oriented%20Programming/1_Encapsulation/TestEncapsulation.java)

## Inheritance:

* It's a mechanism in which one object aquires all the properties  and behaviors (attributes and methods) of a parent object.
* You can build a new class upon an existing class which will poses all the properties of parent class.
* Syntax: class SubClassName extends SuperClassName{//methods}
* Example: [Inheritance.java](https://github.com/ejdotp/SemFour_ITER/tree/main/Computer%20Science%20%26%20Workshop%202/12_Object%20Oriented%20Programming/2_Inheritance)
* 3 Types:
  1. Single Inheritance [class A] <-- [class B]
  2. Multilevel Inheritance [class A] <-- [class B] <-- [class C]
  3. Heirarchial Inheritance [class C] --> [class A] <-- [class B]

## Abstraction:

* It's the process in which we only show essential details/functionality to the user.
* The non-essential things are hidden from user.
* Two ways to achieve Abstraction:
  1. Abstract class -> (o - 100%)
  2. Interface -> (100%)
* An abstract class must be declared with an abstract keyword:
  > abstract class A{ //code }
  >
* Example: [Abstraction.java](https://github.com/ejdotp/SemFour_ITER/blob/main/Computer%20Science%20%26%20Workshop%202/12_Object%20Oriented%20Programming/3_Abstraction/Abstraction.java)

## Polymorphism:

* Poly -> Many ; Morph -> Forms (from Greek)
* Like: Woman -> Mother -> Sister -> Wife -> Daughter
* To perform a single action in different ways
* The ability of a message to be displayed in more than one form
* Two Types:
  1. Compile Time/Static Polymorphism
     + Function Overloading
     + Operator Overloading [Not supported by java]
  2. Run Time Polymorphism

## Interface:
  + Blue print of a class
  + It has static constants and abstract methods.
  + Interface can't be used to create objects.
  + "Implement" - used to achieve interface.
  + By default all attributes of interface are public, static & final.
  + One implementation - you must override all its methods.

    <pre>
    //Syntax:
          interface A{  
            static int a = 10; //declare constant fields.
            void move(); //declare abstract methods
          }</pre>
  + A class only extend to one class but can implement infinite interfaces.
  + Example: [testInterface1.java](https://github.com/ejdotp/SemFour_ITER/blob/main/Computer%20Science%20%26%20Workshop%202/12_Object%20Oriented%20Programming/5_Interface/testInterface1.java)
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
* <B>Coupling: </B>
  + Pairing, Interdependency
  + The extend to which a class knows about another class  
  + Two Types: 
    1. Loose Coupling
    2. Tight Coupling 
    
   ![alt text](https://static.javatpoint.com/tutorial/software-engineering/images/software-engineering-coupling-and-cohesion.png)