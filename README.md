# Java-Programs--Daily-updates
Daily Java Programming Practice – Learning Java from basics to advanced concepts with simple examples, coding exercises, and problem-solving programs. Updated regularly


# ☕ Java Zero to Hero – Complete Learning Guide

Welcome to **Java Zero to Hero!** 🚀

This repository is designed for students, beginners, and freshers who want to learn Java programming from basic to advanced level.

Every topic includes:
- Simple explanation
- Syntax
- Small example
- Expected output
- Interview preparation

**Goal:** Learn Java step by step, practise daily, and become interview-ready.

---

# 1. Introduction to Java

### What is Java?
Java is a high-level, object-oriented programming language used to develop web, mobile, desktop, and enterprise applications.

### Features of Java
1. Simple
2. Object-Oriented
3. Platform Independent
4. Secure
5. Robust
6. Multithreaded
7. Portable
8. High Performance (with JVM optimizations)

### Example

```java
class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Java");
    }
}
```

**Output:**
```text
Welcome to Java
```

### Interview Question
**Q: Why is Java platform independent?**

Answer: Java code is compiled into bytecode, which can run on any operating system with a compatible JVM.

---

# 2. History of Java

- Developed by James Gosling and his team at Sun Microsystems.
- Initially called Oak.
- Renamed Java in 1995.
- Oracle acquired Sun Microsystems in 2010.

### Interview Question
**Q: Who is known as the father of Java?**

Answer: James Gosling.

---

# 3. JDK vs JRE vs JVM

| Component | Meaning | Purpose |
|---|---|---|
| JDK | Java Development Kit | Develop Java applications |
| JRE | Java Runtime Environment | Provides runtime environment |
| JVM | Java Virtual Machine | Executes Java bytecode |

### Example

```java
class Main {
    public static void main(String[] args) {
        System.out.println("Java Architecture");
    }
}
```

**Remember:**
- JDK = Development
- JRE = Runtime
- JVM = Execution

---

# 4. First Java Program

### Syntax

```java
public class Main {
    public static void main(String[] args) {
        // Your code
    }
}
```

### Example

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}
```

**Output:**
```text
Hello Java
```

### Important terms
- `class`: Defines a class.
- `main()`: Starting point of a Java application.
- `public`: Access modifier.
- `static`: Allows calling main without creating an object.
- `void`: Returns no value.
- `System.out.println()`: Prints output with a new line.

---

# 5. Input and Output

Java uses the Scanner class to take input from users.

### Example

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Hello " + name);

        sc.close();
    }
}
```

**Sample Output:**
```text
Enter your name: Praveen
Hello Praveen
```

### Common Scanner methods

| Method | Purpose |
|---|---|
| nextInt() | Integer input |
| nextDouble() | Decimal input |
| nextFloat() | Float input |
| next() | Single word |
| nextLine() | Complete line |
| nextBoolean() | Boolean input |

---

# 6. Identifiers

Identifiers are names given to variables, methods, classes, and other program elements.

### Example

```java
class Main {
    public static void main(String[] args) {
        int age = 22;
        String studentName = "Praveen";

        System.out.println(age);
        System.out.println(studentName);
    }
}
```

### Rules
- Can contain letters, digits, `_` and `$`.
- Cannot start with a digit.
- Cannot use Java keywords.
- Java identifiers are case-sensitive.

---

# 7. Keywords

Keywords are reserved words with predefined meanings in Java.

Examples:

`class`, `public`, `static`, `void`, `int`, `if`, `else`, `for`, `while`, `return`, `new`, `this`, `super`, `extends`, `implements`.

### Example

```java
class Main {
    public static void main(String[] args) {
        int number = 10;

        if (number > 5) {
            System.out.println("Greater than 5");
        }
    }
}
```

**Output:**
```text
Greater than 5
```

---

# 8. Variables

A variable is a named memory location used to store data.

### Types of Variables

1. Local Variable – Declared inside a method or block.
2. Instance Variable – Declared inside a class but outside methods.
3. Static Variable – Shared by all objects of a class.

### Example

```java
class Main {
    int age = 22;              // Instance variable
    static String college = "VIIT"; // Static variable

    public static void main(String[] args) {
        int number = 100;      // Local variable

        System.out.println(number);
        System.out.println(college);
        
        Main obj = new Main();
        System.out.println(obj.age);
    }
}
```

**Output:**
```text
100
VIIT
22
```

---

# 9. Data Types

Data types define what kind of value a variable can store.

### Primitive Data Types

| Data Type | Example | Typical Size |
|---|---|---|
| byte | 10 | 1 byte |
| short | 100 | 2 bytes |
| int | 1000 | 4 bytes |
| long | 10000L | 8 bytes |
| float | 10.5f | 4 bytes |
| double | 20.55 | 8 bytes |
| char | 'A' | 2 bytes |
| boolean | true | JVM-dependent representation |

### Non-Primitive Data Types
- String
- Arrays
- Classes
- Interfaces
- Enums

### Example

```java
class Main {
    public static void main(String[] args) {
        int age = 22;
        double salary = 15000.50;
        char grade = 'A';
        boolean isStudent = true;
        String name = "Praveen";

        System.out.println(age);
        System.out.println(salary);
        System.out.println(grade);
        System.out.println(isStudent);
        System.out.println(name);
    }
}
```

---

# 10. Type Casting

Type casting means converting one data type into another.

### Two Types

**1. Widening Casting:** Smaller type to larger compatible type.

```java
class Main {
    public static void main(String[] args) {
        int a = 100;
        double b = a;

        System.out.println(b);
    }
}
```

Output: `100.0`

**2. Narrowing Casting:** Larger type to smaller type. Explicit casting is required.

```java
class Main {
    public static void main(String[] args) {
        double a = 10.75;
        int b = (int) a;

        System.out.println(b);
    }
}
```

Output: `10`

---

# 11. Wrapper Classes

Wrapper classes convert primitive values into objects.

| Primitive | Wrapper |
|---|---|
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |
| char | Character |
| boolean | Boolean |

### Example

```java
class Main {
    public static void main(String[] args) {
        int a = 100;

        Integer obj = a; // Autoboxing
        int b = obj;     // Unboxing

        System.out.println(obj);
        System.out.println(b);
    }
}
```

Output:
```text
100
100
```

---

# 12. Operators

Operators perform operations on variables and values.

### 12.1 Arithmetic Operators

`+`, `-`, `*`, `/`, `%`

```java
class Main {
    public static void main(String[] args) {
        int a = 10, b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }
}
```

Output:
```text
13
7
30
3
1
```

### 12.2 Relational Operators

`==`, `!=`, `>`, `<`, `>=`, `<=`

```java
int a = 10, b = 20;
System.out.println(a < b);
```

Output: `true`

### 12.3 Logical Operators

`&&`, `||`, `!`

```java
int age = 22;

System.out.println(age >= 18 && age <= 60);
```

Output: `true`

### 12.4 Assignment Operators

`=`, `+=`, `-=`, `*=`, `/=`, `%=`

```java
int a = 10;
a += 5;

System.out.println(a);
```

Output: `15`

### 12.5 Unary Operators

`++`, `--`, `+`, `-`, `!`

```java
int a = 5;
System.out.println(++a);
System.out.println(a--);
System.out.println(a);
```

Output:
```text
6
6
5
```

### 12.6 Bitwise Operators

`&`, `|`, `^`, `~`, `<<`, `>>`, `>>>`

```java
int a = 5, b = 3;

System.out.println(a & b);
System.out.println(a | b);
System.out.println(a ^ b);
```

Output:
```text
1
7
6
```

### 12.7 Ternary Operator

Short form of if-else.

```java
int age = 20;

String result = age >= 18 ? "Eligible" : "Not Eligible";

System.out.println(result);
```

Output: `Eligible`






