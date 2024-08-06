## Java OOPS Concept

## Agenda

Class and Object in Java
* What is OOP?
* Oops Concept
* What is an Object?
* What is a Class?
* How to Create an Object?

Methods in Java
* What is a Method?
* Built in methods
* User defined methods

Inheritance in Java
* What is Inheritance?
* Why we use Inheritance?
* Different terms associated with Inheritance
* Various Scenarios to create Parent/Child objects
* Usage of inheritance in Selenium

Polymorphism in Java
* What is Polymorphism?
* Method overloading
* Method overriding
* Types of Polymorphism

Abstraction and Interface in Java
* What is Abstraction?
* Abstract class
* What is an Interface?
* Multiple inheritance in Java by interface
* Abstract Class vs Interface

Encapsulation in Java
* What is Encapsulation?
* How to Achieve?
* Benefits

Constructors in Java
* What is Constructor?
* Basic rules
* Types of Constructors
* Constructor overloading
* Constructor vs Method

Static Keyword in Java
* What is static in Java?
* Static variable
* Static method
* Static block

This Keyword in Java
* What is this keyword in Java?
* This keyword usage

## Class and Object in Java

What is OOP?

* Object oriented programming – As the name suggests uses objects in programming. 
* Object oriented programming aims to implement real world entities like inheritance, hiding, polymorphism etc in programming. 
* The main aim of OOP is to bind together the data and the functions that operates on them so that no other part of code can access this data except that function.

Oops Concept

* Java is an Object-Oriented Language. 
* As a language that has the Object-Oriented feature, Java supports the following fundamental concepts (Polymorphism, Inheritance, Encapsulation, Abstraction, Classes, Objects, Methods)

What is an Object?

* In object oriented programming whenever you do something you need an object (print, calculate, execute, process, save and to return).
* Object don't do things individually.
* Basically object has couple of information.
* What object knows -> variables (to store values)
* What object does ->  methods (execute and process)
* Object are created using class. Objects and classes are interrelated to each other.
* If we consider the real-world, we can find many objects around us, cars, dogs, humans, etc. All these objects have a state and a behaviour.
* If we consider a dog, then its state is - name, breed, color, and the behaviour is - barking, wagging the tail, running.

What is a Class?

* A class is a blueprint or design from which individual objects are created.

```bash
   public class Dog {
   String breed;
   int age;
   String color;

   void barking() {
   }

   void hungry() {
   }

   void sleeping() {
   }
}
```

How to create an Object?

* In Java, an object is created from a class.


```bash
Syntax - <ClassName> Reference = new <ClassName()>;
```
* When an object of a class is created, the class is said to be instantiated. 
* All the instances share the attributes and the behaviour of the class. But the values of those attributes, i.e. the state are unique for each object. 
* A single class may have any number of instances.

## Methods in Java

What is a Method?

* A Java method is a set of statements or steps that are grouped together to perform an operation.
* Method are also known as functions
* When we use methods? – whenever we want to perform an operation multiple times
* Advantage of methods – code reusability
* Types of methods -  built in (predefined) and user defined

Built in methods

* Java has a library of classes and methods organised in packages.

```bash
Import java.io.Console
Import java.io.*
```
* In order to use built in methods we need to import packages or classes.
* Java.lang package is automatically imported in every java Built in methods categories
* String methods
* Array methods
* Number methods
* Character methods

User defined methods

* Different Method types: Method without returning any values, Method with returning values, Method using passing parameters
* Different ways to call Methods: Using Objects, Without Using object, Call external methods (from external class)

## Inheritance in Java

What is Inheritance?

* Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object.
* The process by which one class acquires the properties(data members) and functionalities(methods) of another class is called inheritance.
* Inheritance can be defined as the process where one class acquires the properties (methods and fields) of another.

Why we use Inheritance?

* Code re-usability : The biggest advantage of Inheritance is that the code that is already present in base class need not be rewritten in the child class.
* Avoid duplication in the code
* Method overriding

Different terms associated with Inheritance

* Class: A class is a group of objects which have common properties. It is a template or blueprint from which objects are created.
* Sub Class/Child Class: Subclass is a class which inherits the other class. It is also called a derived class, extended class, or child class.
* Super Class/Parent Class: Superclass is the class from where a subclass inherits the features. It is also called a base class or a parent class.
* Reusability: As the name specifies, reusability is a mechanism which facilitates you to reuse the fields and methods of the existing class when you create a new    class. You can use the same fields and methods already defined in the previous class. There are two ways we can do code reuse either by the implementation of inheritance (IS-A relationship), or object composition (HAS-A relationship)

```bash
class Subclass-name extends Superclass-name
	{
		//data members and methods
      }
```

Various Scenarios to create Parent/Child objects

* Sub(Child) Class reference and Sub(Child) Object: Allow you to access all the methods and data members of super class and sub class.
* Super(Parent) Class reference and Sub(Child) Class Object: Allow you to access all the methods and data members of Super class only.
* Super(Parent) Class reference and Super(Parent) Class Object: Allow you to access all methods and data members of super class only.
* Sub(Child) Class reference and Super(Parent) Class object: Child cannot hold parent object

Usage of inheritance in Selenium

* We create a Base Class in the Framework to initialize WebDriver interface, WebDriver waits, Property files, Excels, etc., in the Base Class.
* We extend the Base Class in other classes such as Tests and Utility Class.

## Polymorphism in Java

What is Polymorphism?

* Polymorphism in Java is a concept by which we can perform a single action in different ways.
* Polymorphism is derived from 2 Greek words: poly and morphs. The word "poly" means many and "morphs" means forms. So polymorphism means many forms.
* There are two types of polymorphism in Java: compile-time polymorphism and runtime polymorphism.
* Polymorphism can be achieved by method overloading and method overriding


Method overloading

* Method Overloading is a feature that allows a class to have more than one method having the same name, if their argument lists are different.
* Signature should be different: number of parameters, data type of parameters, sequence of data type of parameters

Method overriding

* Method Overloading is a feature that allows a class to have more than one method having the same name, if their argument lists are different.
* Signature should be different: number of parameters, data type of parameters, sequence of data type of parameters

Types of Polymorphism
* Static Polymorphism (Static Binding - Early binding) is also known as compile time binding or compile time polymorphism -- Method Overloading in an example -- when type of object is determined at compiled time it is known as Static binding.
* Dynamic Polymorphism (Dynamic Binding - Late binding) is also known as runtime time binding or run time polymorphism -- example method overriding -- When type of object is determined at run time, it is known as dynamic binding.

## Abstraction in Java

What is Abstraction?

* Abstraction is a process of hiding the implementation details and showing only functionality to the user.
* In Abstraction only the essential details are displayed to the user. The trivial or the non-essentials units are not displayed to the user. Ex: A car is viewed as a car rather than its individual.
* There are two ways to achieve abstraction in Java: Abstract class (0 to 100%) and Interface (100%)

Abstract Class

* A class which is declared as abstract is known as an abstract class. It can have abstract and non-abstract methods. It needs to be extended and its method implemented.
* An abstract class must be declared with an abstract keyword.
* Abstract Class can have abstract and non-abstract methods.
* Abstract class cannot be instantiated.
* Abstract class can have constructors final and static methods also.
* Abstract class can have final methods
* If there is an abstract method in a class, that class must be abstract.

What is an Interface?

* An interface in java is a blueprint of a class. It has static constants and abstract methods.
* There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.
* It cannot be instantiated just like the abstract class.
* In interface we can have default and static methods.
* In interface we can have private methods.

Why we use Interface?
* It is used to achieve abstraction.
* By interface, we can support the functionality of multiple inheritance.

Multiple inheritance in Java by interface:

* If a class implements multiple interfaces, or an interface extends multiple interfaces, it is known as multiple inheritance.
* Multiple inheritance is not supported through class in java, but it is possible by an interface.

Abstract Class VS Interface

 ```bash
 Abstract class                                                            Interface      
    An abstract class can have both abstract and non abstract methods      The interface can have only abstract method
    It does not support multiple inheritances                              It support multiple inheritances
    It can provide the implementation of the interface                     It can not provide the implementation of the interface
    An abstract class can have protected and abstract public methods       An interface can have only public abstract method
    An abstract class can have final, static or static final variable      The interface can only have a public static final variable
    with any access specified

 ```
## Encapsulation in Java

What is Abstraction?

* Encapsulation in Java is a mechanism of wrapping the data (variables) and methods together as a single unit.
* In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.

How to Achieve?

* Declare the variables of a class as private.
* Provide public setter and getter methods to modify and view the variables values.

Benefits:

* The fields of a class can be made read-only (class which has only getter method) or write-only (class which has only setter method) .
* A class can have total control over what is stored in its fields.

## Constructors in Java

What is Constructor?

* It is called constructor because it constructs the value at the time of object creation.
* Block of code similar to method.
* It is called when an object of class is created.
* At the time of calling constructor, memory for the object is allocated in the memory.
* It is used to initialize the object.
* Java compiler created the default constructor if your class doesn't have any constructor.

Basic rules

* Constructor name must be the same as its class name
* Must have no return type
* A Java constructor cannot be abstract, static, final, and synchronized

Types of Constructors

* Default or no arguments – Provides default values
* Parameterized constructor

Types of Constructors

* Default or no arguments – Provides default values
* Parameterized constructor

Constructor Overloading

* Having more than one constructor with different parameter lists.

Constructor vs Method

 ```bash
 Java Constructor                                                          Java Method      
 It is used to initialize the state of an object                           It is used to expose the behavior of an object
 A constructor must not have a return type                                 A method must not have a return type
 Invoked implicitly                                                        Invoked explicitly
 The Java compiler provides a default constructor if you don't             The method is not provided by the compiler in any case.
 have any constructor in a class
 The constructor name must be same as its class name                       Not same as its class name
 ```
## Static Keyword in Java

What is static in Java?

* The static keyword in Java is used for memory management
* The static keyword belongs to the class than an instance of the class.
* Static can be : Variable, Method, Block , Nested class

Static variable

* Static variable is used to fulfil the common requirement. For Example company name of employees, college name of students etc. Name of the college is common for all students
* Static variable gets memory only once in the class area at the time of class loading.

Static method

* A static method belongs to the class rather than the object of a class.
* A static method can be invoked without the need for creating an instance of a class.
* A static method can access static data member and can change the value of it.
* Restrictions: The static method can not use non static data member or call non-static method directly, This and super cannot be used in static context.

Why main method is static?

* It is because the object is not required to call a static method. If it were a non-static method, JVM creates an object first then call main() method that will lead the problem of extra memory allocation.

Difference between static and final keyword

* Static keyword always fixed the memory that means that will be located only once in the program where as final keyword always fixed the value that means it makes variable values constant

Java static Block

* Is used to initialize the static data member.
* It is executed before the main method at the time of class loading.

## This Keyword in Java

What is this in Java?
* This is a reference variable that refers to the current object.

This keyword usage:
* to refer current class instance variable
* to invoke current class method
* to invoke current class constructor
* this can be passed as an argument in the method call
* this can be used to return the current class instance from the method
* this can be passed as an argument in the constructor call

