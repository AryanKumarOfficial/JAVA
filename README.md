- ***IDE*** stands for Integrated Development Environment.
- An Environment to wirte, run, compile and debug the code.

We need a `compiler` and need to install [***JDK***(*Java Development Kit*)](https://developers.redhat.com/products/openjdk/download/?sc_cid=701f2000000RWTnAAO).

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