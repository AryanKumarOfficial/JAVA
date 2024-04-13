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
