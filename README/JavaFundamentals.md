
## Java Fundamentals

## Agenda

Getting started with Java
* Installing Java
* Configure IDE
* Creating First Java program

Understanding Different Types of variables
* Local
* Instance
* Static

Learning about different Data Types
* Primitive
* Non-Primitive

Learning about different Operators
* Arithmetic
* Relational
* Logical
* Assignment

Learning about Control flow statement
* if
* if-else
* if-else-if
* nested if-else
* switch

Learning about Loops
* for
* while
* do-while
* for-each

Learning about Modifiers
* Access
* Non-Access

Learning about String Classes and Built-in Methods in Java
* How to create a string object?
* Built-in Methods
* Different String methods

Why String is Immutable in Java?

Learning about Arrays
* What is an array?
* Array Types

## Variable

What is a variable?

Different definitions are given below:

* Variable is a name of memory location.
* A memory location to store temporary data within a Java program.
* A variable is a container that holds the value while the Java program is executed. A variable is assigned with a datatype.
* It is a combination of "vary + able", which means its value can be changed.

Types of Variables

* Local variable: used inside a method. Note: The local variable contains garbage value.
* Instance/global variable: used inside a class but outside method. Note: Global variable contain null or default value.
* Static variable: We will discuss it in a separate post.

What is a Datatype?

* Data types specify the different sizes and values that can be stored in the variable. 
* A data type is a classification of the type of data that a variable or object can hold.

There are two types of data types in Java:
* Primitive data types: The primitive data types include Boolean, char, byte, short, int, long, float and double.
* Non-primitive data types: The non-primitive data types include String, Arrays, Classes and Interfaces.

## Operators

What is an Operator?

* An operator in Java is a symbol that is used to perform operations. For example:

```bash
   +, -, *, / etc.
```

Types of Operators

* Arithmetic operators are used to perform addition, subtraction, multiplication, and division. They are used to perform basic mathematical operations.
* Relational operators return Boolean/Logical results.

```bash
   == (equal to)
   != (not equal to)
   >  (greater than)
   <  (less than)
   >= (greater than or equal to)
   <= (less than or equal to)
```
   
* Logical operators are used to determine the logic between variables or values.

 ```bash
    && (logical AND) - Returns true if both statements are true
    || (logical OR)  - Returns true if one of the statements is true
    !  (logical NOT) - Reverse the result, returns false if the result is true
  ```

* Assignment operators are used to assign values to variables.

 ```bash
 Operator     Example      Same As	
    =	      x = 5	       x = 5	
   +=	      x += 3	   x = x + 3	
   -=	      x -= 3	   x = x - 3	
   *=	      x *= 3	   x = x * 3	
   /=	      x /= 3	   x = x / 3	
   %=	      x %= 3	   x = x % 3	
   &=	      x &= 3	   x = x & 3	
   |=	      x |= 3	   x = x | 3	
   ^=	      x ^= 3       x = x ^ 3	
   >>=	      x >>= 3      x = x >> 3	
   <<=	      x <<= 3      x = x << 3
 ```

## Loops

What are loops?

* Loops are used to execute a set of instructions/functions repeatedly when some conditions become true.

Types of Loops

* for: If the number of iterations is fixed, it is recommended to use the for loop.
* while: If the number of iterations is not fixed, it is recommended to use a while loop.
* do-while: If the number of iterations is not fixed and you must execute the loop at least once, it is recommended to use the do-while loop.
* for-each: In Java, there is another form of for loop (in addition to the standard for loop) to work with arrays and collections, the enhanced for loop.

## Modifiers

What are modifiers?

* Modifiers are keywords in Java that are used to restrict or add access levels for classes, attributes, methods and constructors.

Types of Modifiers

* Access modifiers: default, Private, Protected, Public
* Non-Access modifiers: for classes (final, abstract), for methods or attributes (final, static, transient, synchronized, volatile)

## String Class and Built in Methods

What is a string?

*  In Java, a string represents a sequence of char values. An array of characters works the same as a Java string. For example:

 ```bash
 char[] h={'H','E','L','L','O'};
 String s=new String(h);
 String s=“HELLO";
```
* Java String class provides a lot of methods to perform operations on string.

How to create a string object?

 * The java.lang.String class is used to create a string object.
 * There are two ways to create String object:
 - By string literal:
 
  ```bash
- Java String literal is created by using double quotes. For example:
  String s1=“Selenium";
```
 - By new keyword:
 
 ```bash
  String s=new String(“Selenium");
```
 
 Built in method

 * Java has a library of classes and methods organized into packages.

 ```bash
Import java.io.console
Import java.io.*
```
 * To use built in methods we need to import packages or classes.
 * Java.lang package is automatically imported in every Java Built-in methods categories
   - String methods
   - Array methods
   - Number methods
   - Character methods
   
  Different String methods:

 ```bash
- compareTo: The Java String compareTo() method is used for comparing two strings lexicographically.
- boolean equals(): The java string equals() method compares the two given strings based on the content of the string (case sensitive)
- String concat(): concat two strings
- boolean equalsIgnoreCase(): The java string equals() method compares the two given strings based on the content of the string (not case sensitive)
- char charAt() - index position: The java string charAt() method returns a char value at the given index number.
- boolean contains()
- toUpperCase(): convert to upper case
- toLowerCase(): convert to lower case
- trim(): remove spaces from both sides of string
- substring(): returns part of string
- boolean endsWith(): starts with specified suffix or not
- boolean startWith(): ends with specified suffix or not
- int length()
- replace()
```

## Why String is Immutable in Java?

* In Java, string objects are immutable. Immutable simply means unmodified or unchangeable.
* Once a string object is created, its data or state can't be changed, but a new string object is created.

## Array in Java

What is an Array?
* An array is a collection of similar types of elements that have a contiguous memory location.
* The variables in the array are ordered and each has an index.
  
Array Types:
* Single Dimensional Array
* Multidimensional Array

Advantages: 
* Code optimization by storing data and we can retrieve or sort the data efficiently.
* We can get any data located at an index position.

Disadvantages: 
* Stores similar types of data.
* We can store only the fixed size of elements in the array. It doesn't grow its size at runtime.
