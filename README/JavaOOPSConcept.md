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
