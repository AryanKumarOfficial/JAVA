- **_IDE_** stands for Integrated Development Environment.
- An Environment to wirte, run, compile and debug the code.

We need a `compiler` and need to install [**_JDK_**(_Java Development Kit_)](https://developers.redhat.com/products/openjdk/download/?sc_cid=701f2000000RWTnAAO).

# Check Java Installation

```bash
java --version

javac --version
```

## Introduction

### File Extension

- java files work with `.java` extentsion

### Compile

- `javac` is used to compile the java file.

### Run

- `java` is used to run the compiled file.

### Example

```bash
javac HelloWorld.java

java HelloWorld
```

### Note

- `javac` and `java` commands are used to compile and run the java files.

## JShell

- JShell is a Read-Eval-Print Loop (REPL) tool.

- It is used to test the java code without creating a file.

- It is used to test the code line by line.

- `jshell` command is used to start the JShell.

```bash
jshell
```

- It will start the JShell.

- We can write the code and test it.

- We can also use the `jshell` to test the code and then write it to the file.

### JSHELL Example

```java
jshell> System.out.println("Hello World")
Hello World
```

# JAVA Basics

## JVM

- In our machine we have **_JVM_**(_*Java Virtual Machine*_).
- It makes the **_JAVA_** plateform independent.
- We can run our **_JAVA_** application only due to the **_JVM_**.
- But **_JVM_** is plateform dependent.
- It only understands byte codes.
- It runs our **_JAVA_** application which is in the byte code.
- A developer writes the program in `JAVA code` which is converted into `Byte code` by the **_`JAVAC`_**(_*JAVA Compiler*_).
- **_JVM_** starts the execution from the first file which must have the `main()` method.

```java
public void main() // it will take some arguements
```

- `javac hello.java` will output a `hello.class` file which is a byte code

- The file extentsion for byte code is `.class`.

## Note

- To run the byte code use `java hello`.
- If we include the file extension it will not run and throw an error.

## JRE

- **_JRE_** stands for **_Java Runtime Environment_**.
- It is used to run the **_JAVA_** application.
- It contains the **_JVM_** and other libraries.

## JDK

- **_JDK_** stands for **_Java Development Kit_**.
- It is used to develop the **_JAVA_** application.
- It contains the **_JRE_** and other development tools.
- It contains the **_JVM_** and other libraries.
- It contains the **_JAVAC_** and other development tools.

## variables

- A variable is a container which holds the value.
- It is a name given to the memory location.
- It is used to store the data.
- It is used to store the data so that we can use it later.
- Variables in **_JAVA_** are strongly typed.
- We need to declare the type of the variable before using it.

### Example

```java
int a = 10;
```

## Data Types

- **_Data Types_** are used to define the type of the variable.
- It is used to define the type of the data that the variable can store.
- **_JAVA_** is a strongly typed language.
- We need to define the type of the variable before using it.
- **_JAVA_** has two types of data types:
  - **_Primitive Data Types_**
  - **_Non-Primitive Data Types_**

### Primitive Data Types

- **_Primitive Data Types_** are the basic data types.
- They are used to store the simple values.
- They are used to store the values directly.
- They are used to store the values in the memory.
- **_Primitive Data Types_** are:
  - **_Integer_** - stores the integer values.
    - **byte** - 1 byte - range -128 to 127
    - **short** - 2 bytes - range -32,768 to 32,767
    - **int** - 4 bytes - range -2,147,483,648 to 2,147,483,647
    - **long** - 8 bytes - range -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
  - **_Floating Point_** - stores the floating point values.
    - **float** - 4 bytes - range 3.4e-038 to 3.4e+038
    - **double** - 8 bytes - range 1.7e-308 to 1.7e+308 – default float in JAVA
  - **_Character_** - stores the character values.
    - **char** - 2 bytes - range 0 to 65,536
    - **String** - stores the string values.
  - **_Boolean_** - stores the boolean values.
    - **bool** - 1 bit - range true or false

### Non-Primitive Data Types

- **_Non-Primitive Data Types_** are the reference data types.
- They are used to store the reference of the data.
- They are used to store the address of the data.
- **_Non-Primitive Data Types_** are:
  - **_Arrays_**
  - **_Classes_**
  - **_Interfaces_**

## Literals

- **_Literals_** are the constant values.
- They are used to assign the values to the variables.
- **_JAVA_** has the following types of literals:
  - **_Integer Literals_**
  - **_Floating Point Literals_**
  - **_Character Literals_**
  - **_String Literals_**
  - **_Boolean Literals_**

### Integer Literals

- **_Integer Literals_** are used to assign the integer values.
- They can be assigned in the following ways:
  - **_Decimal_** - 10, 20, 30
  - **_Octal_** - 010, 020, 030
  - **_Hexadecimal_** - 0x10, 0x20, 0x30
  - **_Binary_** - 0b10, 0b20, 0b30

### Floating Point Literals

- **_Floating Point Literals_** are used to assign the floating point values.
- They can be assigned in the following ways:
  - **_Decimal_** - 10.5, 20.5, 30.5
  - **_Exponential_** - 10e2, 20e2, 30e2

### Character Literals

- **_Character Literals_** are used to assign the character values.
- They can be assigned in the following ways:
  - **_Single Character_** - 'a', 'b', 'c'
  - **_Escape Sequence_** - '\n', '\t', '\r'

### String Literals

- **_String Literals_** are used to assign the string values.
- They can be assigned in the following ways:
  - **_Double Quotes_** - "Hello", "World", "Java"

### Boolean Literals

- **_Boolean Literals_** are used to assign the boolean values.
- They can be assigned in the following ways:
  - **_true_** - true
  - **_false_** - false

# Type conversion and Type casting

- **_Type Conversion_** is used to convert the data from one type to another type.

- **_Type Conversion_** is of two types:
  - **_Implicit Type Conversion_**
  - **_Explicit Type Conversion_**

## Implicit Type Conversion

- **_Implicit Type Conversion_** is used to convert the data from lower data type to higher data type.

- **_Implicit Type Conversion_** is done automatically by the compiler.

- **_Implicit Type Conversion_** is also known as **_Widening Type Conversion_**.

- **_Implicit Type Conversion_** is done when:
  - The data is converted from lower data type to higher data type.
  - The data is converted from integer to floating point.
  - The data is converted from floating point to double.

### Example

```java
int a = 10;
float b = a;
```

## Explicit Type Conversion

- **_Explicit Type Conversion_** is used to convert the data from higher data type to lower data type.

- **_Explicit Type Conversion_** is done manually by the user.

- **_Explicit Type Conversion_** is also known as **_Narrowing Type Conversion_**.

- **_Explicit Type Conversion_** is done when:
  - The data is converted from higher data type to lower data type.
  - The data is converted from floating point to integer.
  - The data is converted from double to floating point.

### Example

```java
float a = 10.5;
int b = (int) a;
```

- **_Type Casting_** is used to convert the data from one type to another type.

- **_Type Casting_** is of two types:
  - **_Implicit Type Casting_**
  - **_Explicit Type Casting_**

## Implicit Type Casting

- **_Implicit Type Casting_** is used to convert the data from lower data type to higher data type.

- **_Implicit Type Casting_** is done automatically by the compiler.

- **_Implicit Type Casting_** is also known as **_Widening Type Casting_**.

- **_Implicit Type Casting_** is done when:
  - The data is converted from lower data type to higher data type.
  - The data is converted from integer to floating point.
  - The data is converted from floating point to double.

### Example

```java
int a = 10;
float b = a;
```

## Explicit Type Casting

- **_Explicit Type Casting_** is used to convert the data from higher data type to lower data type.

- **_Explicit Type Casting_** is done manually by the user.

- **_Explicit Type Casting_** is also known as **_Narrowing Type Casting_**.

- **_Explicit Type Casting_** is done when:
  - The data is converted from higher data type to lower data type.
  - The data is converted from floating point to integer.
  - The data is converted from double to floating point.

### Example

```java
float a = 10.5;
int b = (int) a;
```

## Type Promotion

- **_Type Promotion_** is used to convert the data from lower data type to higher data type.

- **_Type Promotion_** is done automatically by the compiler.

- **_Type Promotion_** is done when:
  - The data is converted from lower data type to higher data type.
  - The data is converted from integer to floating point.
  - The data is converted from floating point to double.

### Example

```java
byte a = 10;
byte b = 20;
float c = a*b;
```

# Operators

- **_Operators_** are used to perform the operations on the data.

- **_JAVA_** has the following types of operators:
  - **_Arithmetic Operators_**
  - **_Relational Operators_**
  - **_Logical Operators_**
  - **_Bitwise Operators_**
  - **_Assignment Operators_**
  - **_Conditional Operators_**
  - **_Unary Operators_**

## Arithmetic Operators

- **_Arithmetic Operators_** are used to perform the arithmetic operations on the data.

- **_JAVA_** has the following types of **_Arithmetic Operators_**:
  - **_Addition_** - +
  - **_Subtraction_** - -
  - **_Multiplication_** - \*
  - **_Division_** - /
  - **_Modulus_** - %
  - **_Increment_** - ++
  - **_Decrement_** - --

### Example

```java
int a = 10;
int b = 20;
int c = a+b;
int d = a-b;
int e = a*b;
int f = a/b;
int g = a%b;
int h = a++;
int i = b--;
```

## Relational Operators

- **_Relational Operators_** are used to perform the relational operations on the data.

- **_JAVA_** has the following types of **_Relational Operators_**:
  - **_Equal to_** - ==
  - **_Not Equal to_** - !=
  - **_Greater than_** - >
  - **_Less than_** - <
  - **_Greater than or Equal to_** - >=
  - **_Less than or Equal to_** - <=

### Example

```java
int a = 10;
int b = 20;
boolean c = a==b;
boolean d = a!=b;
boolean e = a>b;
boolean f = a<b;
boolean g = a>=b;
boolean h = a<=b;
```

## Logical Operators

- **_Logical Operators_** are used to perform the logical operations on the data.

- **_JAVA_** has the following types of **_Logical Operators_**:
  - **_Logical AND_** - &&
  - **_Logical OR_** - ||
  - **_Logical NOT_** - !

### Example

```java

boolean a = true;
boolean b = false;
boolean c = a && b;
boolean d = a || b;
boolean e = !a;
```

## Bitwise Operators

- **_Bitwise Operators_** are used to perform the bitwise operations on the data.

- **_JAVA_** has the following types of **_Bitwise Operators_**:
  - **_Bitwise AND_** - &
  - **_Bitwise OR_** - |
  - **_Bitwise XOR_** - ^
  - **_Bitwise Complement_** - ~
  - **_Left Shift_** - <<
  - **_Right Shift_** - >>

### Example

```java
int a = 10;
int b = 20;
int c = a & b;
int d = a | b;
int e = a ^ b;
int f = ~a;
int g = a << 2;
int h = a >> 2;
```

## Assignment Operators

- **_Assignment Operators_** are used to assign the values to the variables.

- **_JAVA_** has the following types of **_Assignment Operators_**:
  - **_Simple Assignment_** - =
  - **_Addition Assignment_** - +=
  - **_Subtraction Assignment_** - -=
  - **_Multiplication Assignment_** - \*=
  - **_Division Assignment_** - /=
  - **_Modulus Assignment_** - %=
  - **_Left Shift Assignment_** - <<=
  - **_Right Shift Assignment_** - >>=
  - **_Bitwise AND Assignment_** - &=
  - **_Bitwise OR Assignment_** - |=
  - **_Bitwise XOR Assignment_** - ^=

### Example

```java

int a = 10;
int b = 20;
a += b;
a -= b;
a *= b;
a /= b;
a %= b;
a <<= 2;
a >>= 2;
a &= b;
a |= b;
a ^= b;
```

## Conditional Operators

- **_Conditional Operators_** are used to perform the conditional operations on the data.

- **_JAVA_** has the following types of **_Conditional Operators_**:
  - **_Ternary Operator_** - ?:

### Example

```java
int a = 10;
int b = 20;
int c = (a>b)?a:b;
```

## Unary Operators

- **_Unary Operators_** are used to perform the unary operations on the data.

- **_JAVA_** has the following types of **_Unary Operators_**:
  - **_Unary Plus_** - +
  - **_Unary Minus_** - -
  - **_Increment_** - ++
  - **_Decrement_** - --
  - **_Logical NOT_** - !
  - **_Bitwise Complement_** - ~

### Example

```java
int a = 10;
int b = -a;
int c = ++a;
int d = --a;
boolean e = !a;
int f = ~a;
```

# Control Statements

- **_Control Statements_** are used to control the flow of the program.

- **_JAVA_** has the following types of **_Control Statements_**:
  - **_Selection Statements_**
  - **_Iteration Statements_**
  - **_Jump Statements_**

## Selection Statements

- **_Selection Statements_** are used to select the statements to execute.

- **_JAVA_** has the following types of **_Selection Statements_**:
  - **_if Statement_**
  - **_if-else Statement_**
  - **_if-else-if Statement_**
  - **_switch Statement_**

### if Statement

- **_if Statement_** is used to execute the statement only if the condition is true.

```java
if(condition)
{
    // code to be executed
}
```

### Example

```java
int a = 10;
if(a>5)
{
    System.out.println("a is greater than 5");
}
```

### if-else Statement

- **_if-else Statement_** is used to execute the statement if the condition is true otherwise execute the else statement.

```java
if(condition)
{
    // code to be executed
}
else
{
    // code to be executed
}
```

### Example

```java
int a = 10;
if(a>5)
{
    System.out.println("a is greater than 5");
}
else
{
    System.out.println("a is less than 5");
}
```

### if-else-if Statement

- **_if-else-if Statement_** is used to execute the statement if the condition is true otherwise execute the else statement.

```java
if(condition)
{
    // code to be executed
}
else if(condition)
{
    // code to be executed
}
else
{
    // code to be executed
}
```

### Example

```java
int a = 10;
if(a>5)
{
    System.out.println("a is greater than 5");
}
else if(a<5)
{
    System.out.println("a is less than 5");
}
else
{
    System.out.println("a is equal to 5");
}
```

### switch Statement

- **_switch Statement_** is used to execute the statement based on the value of the variable.

```java
switch(expression)
{
    case value1:
        // code to be executed
        break;
    case value2:
        // code to be executed
        break;
    default:
        // code to be executed
}
```

### Example

```java
int a = 10;
switch(a)
{
    case 5:
        System.out.println("a is equal to 5");
        break;
    case 10:
        System.out.println("a is equal to 10");
        break;
    default:
        System.out.println("a is not equal to 5 or 10");
}
```

## Iteration Statements

- **_Iteration Statements_** are used to execute the statement multiple times.

- **_JAVA_** has the following types of **_Iteration Statements_**:
  - **_for Loop_**
  - **_while Loop_**
  - **_do-while Loop_**

### for Loop

- **_for Loop_** is used to execute the statement multiple times.

```java

for(initialization; condition; increment/decrement)
{
    // code to be executed
}
```

### Example

```java

for(int i=0; i<5; i++)
{
    System.out.println(i);
}
```

### while Loop

- **_while Loop_** is used to execute the statement multiple times.

```java

while(condition)
{
    // code to be executed
}
```

### Example

```java

int i = 0;
while(i<5)
{
    System.out.println(i);
    i++;
}
```

### do-while Loop

- **_do-while Loop_** is used to execute the statement multiple times.

```java

do
{
    // code to be executed
}

while(condition);
```

### Example

```java

int i = 0;
do
{
    System.out.println(i);
    i++;
}


while(i<5);
```

## Jump Statements

- **_Jump Statements_** are used to jump from one statement to another statement.

- **_JAVA_** has the following types of **_Jump Statements_**:
  - **_break Statement_**
  - **_continue Statement_**
  - **_return Statement_**

### break Statement

- **_break Statement_** is used to jump from the loop.

```java

for(int i=0; i<5; i++)
{
    if(i==3)
    {
        break;
    }
    System.out.println(i);
}
```

### continue Statement

- **_continue Statement_** is used to skip the current iteration.

```java

for(int i=0; i<5; i++)
{
    if(i==3)
    {
        continue;
    }
    System.out.println(i);
}
```

### return Statement

- **_return Statement_** is used to return the value from the method.

```java

public int add(int a, int b)
{
    return a+b;
}
```

# JAVA OOPs Concepts

- **_OOPs_** stands for **_Object-Oriented Programming_**.

- **_OOPs_** is a programming paradigm.

- **_OOPs_** is used to design the program using the objects.

- **_OOPs_** has the following concepts:
  - **_Class_**
  - **_Object_**
  - **_Inheritance_**
  - **_Polymorphism_**
  - **_Abstraction_**
  - **_Encapsulation_**

## Class

- **_Class_** is a blueprint of the object.

- **_Class_** is used to create the object.

- **_Class_** is used to define the properties and behaviors of the object.

- **_Class_** is used to define the methods and variables.

### Example

```java
class Student
{
    int id;
    String name;
    void display()
    {
        System.out.println(id+" "+name);
    }
}
```

## Object

- **_Object_** is an instance of the class.

- **_Object_** is used to create the instance of the class.

- **_Object_** is used to access the properties and behaviors of the class.

- **_Object_** is used to access the methods and variables.

### Example

```java
Student s1 = new Student();
s1.id = 101;
s1.name = "John";
s1.display();
```

## Inheritance

- **_Inheritance_** is used to inherit the properties and behaviors of the class.

- **_Inheritance_** is used to create the new class from the existing class.

- **_Inheritance_** is used to reuse the code.

- **_Inheritance_** is used to create the parent-child relationship.

### Example

```java
class Animal
{
    void eat()
    {
        System.out.println("eating...");
    }
}

class Dog extends
Animal
{
    void bark()
    {
        System.out.println("barking...");
    }
}
```

## Polymorphism

- **_Polymorphism_** is used to perform the multiple operations.

- **_Polymorphism_** is used to perform the single operation in different ways.

- **_Polymorphism_** is used to perform the method overloading and method overriding.

### Method Overloading

- **_Method Overloading_** is used to create the multiple methods with the same name but different parameters.

- **_Method Overloading_** is used to perform the same operation in different ways.

### Example

```java

class Add
{
    int add(int a, int b)
    {
        return a+b;
    }
    int add(int a, int b, int c)
    {
        return a+b+c;
    }
}
```

### Method Overriding

- **_Method Overriding_** is used to create the method in the child class with the same name and same parameters as the parent class.

- **_Method Overriding_** is used to perform the different operations in the child class.

### Example

```java

class Animal
{
    void eat()
    {
        System.out.println("eating...");
    }
}

class Dog extends

Animal
{
    void eat()
    {
        System.out.println("barking...");
    }
}
```

## Abstraction

- **_Abstraction_** is used to hide the internal details and show only the necessary details.

- **_Abstraction_** is used to show the essential features and hide the non-essential features.

- **_Abstraction_** is used to create the abstract class and abstract methods.

### Example

```java

abstract class Animal
{
    abstract void eat();
}

class Dog extends

Animal
{
    void eat()
    {
        System.out.println("eating...");
    }
}
```

## Encapsulation

- **_Encapsulation_** is used to bind the data and methods into a single unit.

- **_Encapsulation_** is used to create the class with the private variables and public methods.

- **_Encapsulation_** is used to hide the data from the outside world.

### Example

```java

class Student
{
    private int id;
    private String name;
    public void setId(int id)
    {
        this.id = id;
    }
    public int getId()
    {
        return id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
}
```

# Arrays

- **_Arrays_** are used to store the multiple values in a single variable.

- **_Arrays_** are used to store the collection of similar type of elements.

- **_Arrays_** are used to store the collection of elements of the same data type.

- **_JAVA_** has the following types of **_Arrays_**:
  - **_Single Dimensional Array_**
  - **_Multi Dimensional Array_**

## Single Dimensional Array

- **_Single Dimensional Array_** is used to store the collection of elements of the same data type.

- **_Single Dimensional Array_** is used to store the collection of elements in a single row.

- **_Single Dimensional Array_** is used to store the collection of elements in a single column.

### Example

```java
int a[] = new int[5];
a[0] = 10;
a[1] = 20;
a[2] = 30;
a[3] = 40;
a[4] = 50;
```

## Multi Dimensional Array

- **_Multi Dimensional Array_** is used to store the collection of elements of the same data type.

- **_Multi Dimensional Array_** is used to store the collection of elements in multiple rows and columns.

- **_Multi Dimensional Array_** is used to store the collection of elements in multiple rows.

- **_Multi Dimensional Array_** is used to store the collection of elements in multiple columns.

### Example

```java
int a[][] = new int[2][2];
a[0][0] = 10;
a[0][1] = 20;
a[1][0] = 30;
a[1][1] = 40;
```
