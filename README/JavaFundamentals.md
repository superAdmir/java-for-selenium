## Java Fundamentals

## Agenda

Getting started with Java
* Installing Java
* Configure IDE
* Creating First java program

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
  == (equal to)
  != (not equal to)
  > (greater than)
  < (less than)
  >= (greater than or equal to)
  <= (less than or equal to)
* Logical operators are used to determine the logic between variables or values
  && - logical AND - Returns true if both statements are true
  || - logical OR  - Returns true if one of the statements is true
   ! - logical NOT - Reverse the result, returns false if the result is true
* Assignment operators are used to assign values to variables
  Operator  Example  Same As	
  =	      x = 5	   x = 5	
  +=	      x += 3	   x = x + 3	
  -=	      x -= 3	   x = x - 3	
  *=	      x *= 3	   x = x * 3	
  /=	      x /= 3	   x = x / 3	
  %=	      x %= 3	   x = x % 3	
  &=	      x &= 3	   x = x & 3	
  |=	      x |= 3	   x = x | 3	
  ^=	      x ^= 3   x = x ^ 3	
  >>=	  x >>= 3  x = x >> 3	
  <<=	  x <<= 3  x = x << 3

## Control flow statements

What is Control flow statements?

 * Control flow statements, would change or break the flow of execution by implementing decision making, looping, and branching your program to execute particular blocks of code     based on the conditions.
* Control flow statements in Java allow you to run or skip blocks of code when special conditions are met. 
* There are 3 types of control flow statements supported by the Java programming language.
  Decision-making: if-then, if-then-else, if else if, nested if else and switch
  Looping: for, while, do-while
  Branching: break, continue, return
  
 * Decision-making:
   1. The “if” statement in Java works exactly like in most programming languages. With the help of “if” you can choose to execute a specific block of code when a predefined  condition is met.
   2. The if-then-else statement provides a alternate path of execution when an if clause evaluates to false.
   3. In Java, it's possible to execute one block of code among many. For that, you can use if..else...if ladder.
   4. It's possible to have if..else statements inside a if..else statement in Java. It's called nested if...else statement.
   5. In Java, the if..else..if ladder executes a block of code among many blocks. The switch statement can a substitute for long if..else..if ladders which generally makes your code more readable.
   

