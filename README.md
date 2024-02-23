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

- In our machine we have **_JVM_**(*_Java Virtual Machine_*).
- It makes the **_JAVA_** plateform independent.
- We can run our **_JAVA_** application only due to the **_JVM_**.
- But **_JVM_** is plateform dependent.
- It only understands byte codes.
- It runs our **_JAVA_** application which is in the byte code.
- A developer writes the program in `JAVA code` which is converted into `Byte code` by the **_`JAVAC`_**(*_JAVA Compiler_*).
- **_JVM_** starts the execution from the first file which must have the `main()` method.

```java
public void main() // it will take some arguements
```

- `javac hello.java` will output a `hello.class` file which is a byte code

- The file extentsion for byte code is `.class`.

## Note

- To run the byte code use `java hello`.
- If we include the file extension it will not run and throw an error.
