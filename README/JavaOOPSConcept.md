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
