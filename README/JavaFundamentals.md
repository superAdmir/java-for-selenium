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

Understanding different Data Types
* Primitive
* Non-Primitive

Understanding different Operators
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

Learning about String Class and Built in Methods in Java
* How to create string object?
* Built in Methods
* Different String methods

Why String is Immutable in Java?


## Variable

What is a variable?

Different definitions given below:

* Variable is a name of memory location.
* A memory location to store temporary data within a java program.
* A variable is a container which holds the value while the java program is executed. A variable is assigned with a datatype.
* It is a combination of "vary + able" that means its value can be changed.

Types of Variables

* Local variable: used inside a method
  Note: Local Variable contains garbage value
* Instance/global variable: used inside a class but outside method
  Note: Global variable contain null or default value
* Static variable: We will discuss in separate post.

What is a Datatype?

* Data types specify the different sizes and values that can be stored in the variable. 
* A data type is a classification of the type of data that a variable or object can hold.

There are two types of data types in Java:
* Primitive data types: The primitive data types include Boolean, char, byte, short, int, long, float and double.
* Non-primitive data types: The non-primitive data types include String, Arrays, Classes and Interfaces.
 
## Operators

What is an Operator?

* Operator in Java is a symbol that is used to perform operations. For example: +, -, *, / etc.

Types of Operators

* Arithmetic operators are used to perform addition, subtraction, multiplication, and division. They are used to perform basic mathematical operations.
* Relational operators returns Boolean/Logical result.
   1. == (equal to)
   2. != (not equal to)
   3. > (greater than)
   4. < (less than)
   5. >= (greater than or equal to)
   6. <= (less than or equal to)
   
* Logical operators are used to determine the logic between variables or values

  1. && - logical AND - Returns true if both statements are true
  2. || - logical OR  - Returns true if one of the statements is true
  3. ! - logical NOT - Reverse the result, returns false if the result is true
  
* Assignment operators are used to assign values to variables

 Operator  Example  Same As	
  1. =	      x = 5	   x = 5	
  2. +=	      x += 3	   x = x + 3	
  3. -=	      x -= 3	   x = x - 3	
  4. *=	      x *= 3	   x = x * 3	
  5. /=	      x /= 3	   x = x / 3	
  6. %=	      x %= 3	   x = x % 3	
  7. &=	      x &= 3	   x = x & 3	
  8. |=	      x |= 3	   x = x | 3	
  9. ^=	      x ^= 3   x = x ^ 3	
  10. >>=	  x >>= 3  x = x >> 3	
  11. <<=	  x <<= 3  x = x << 3

## Control flow statements

What is Control flow statements?

* Control flow statements, would change or break the flow of execution by implementing decision making, looping, and branching your program to execute particular blocks of code     based on the conditions.
* Control flow statements in Java allow you to run or skip blocks of code when special conditions are met. 
* There are 3 types of control flow statements supported by the Java programming language.
  1. Decision-making: if-then, if-then-else, if else if, nested if else and switch
  1. Looping: for, while, do-while
  3. Branching: break, continue, return
  
* Decision-making:
   1. The “if” statement in Java works exactly like in most programming languages. With the help of “if” you can choose to execute a specific block of code when a predefined  condition is met.
   2. The if-then-else statement provides a alternate path of execution when an if clause evaluates to false.
   3. In Java, it's possible to execute one block of code among many. For that, you can use if..else...if ladder.
   4. It's possible to have if..else statements inside a if..else statement in Java. It's called nested if...else statement.
   5. In Java, the if..else..if ladder executes a block of code among many blocks. The switch statement can a substitute for long if..else..if ladders which generally makes your code more readable.
   
## Loops

What are loops?

* Loops are used to execute a set of instructions/functions repeatedly when some conditions become true.

Types of Loops

* for - If the number of iteration is fixed, it is recommended to use for loop.
* while - If the number of iteration is not fixed, it is recommended to use while loop.
* do-while - If the number of iteration is not fixed and you must have to execute the loop at least once, it is recommended to use the do-while loop.
* for-each - In Java, there is another form of for loop (in addition to standard for loop) to work with arrays and collection, the enhanced for loop.

## Modifiers

What are modifiers?

* Modifiers are key words in Java that is used to restrict or add access level for classes, attributes, methods and constructors.

Types of Modifiers

* Access modifiers: default, Private, Protected, Public 
* Non-Access modifiers: for classes (final, abstract), for methods or attributes (final, static, transient, synchronized, volatile)

## String Class and Built in Methods

What is a string?

* In Java, string represents sequence of char values. An array of characters works same as Java string. For example:

 ```bash
 char[] h={'H','E','L','L','O'};
 String s=new String(h);
 String s=“HELLO";
```
* Java String class provides a lot of methods to perform operations on string

How to create string object?

 * The java.lang.String class is used to create a string object.
 * There are two ways to create String object:
 - By string literal - Java String literal is created by using double quotes. For Example:
 
  ```bash
String s1=“Selenium";
```
 - By new keyword - String s=new String(“Selenium");
 
 Built in method

 * Java has a library of classes and methods organized in packages

 ```bash
Import java.io.console
Import java.io.*
```
 * In order to use built in methods we need to import packages or classes
 * Java.lang package is automatically imported in every java Built in methods categories
   - String methods
   - Array methods
   - Number methods
   - Character methods
   
  Different String methods

 ```bash
compareTo - The Java String compareTo() method is used for comparing two strings lexicographically.
boolean equals() - The java string equals() method compares the two given strings based on the content of the string (case sensitive)
String concat() – concat two strings
boolean equalsIgnoreCase() - The java string equals() method compares the two given strings based on the content of the string (not casesensitive)
char charAt() – index position - The java string charAt() method returns a char value at the given index number.
boolean contains()
toUpperCase() – convert to upper case
toLowerCase() – convert to lower case
trim() – remove spaces from both sides of string
substring() --  returns part of string
boolean endsWith()
boolean startWith() – ends with specified suffix or not
int length()
replace()
```

## Why String is Immutable in Java?

* In java, string objects are immutable. Immutable simply means unmodified or unchangeable.
* Once string object is created its data or state can't be changed but a new string object is created.
   

