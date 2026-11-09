# Java-Programs--Daily-updates
Daily Java Programming Practice – Learning Java from basics to advanced concepts with simple examples, coding exercises, and problem-solving programs. Updated regularly

 Java Basics – Complete Interview Preparation
1. JDK vs JRE vs JVM
2. Term	Full Form	Purpose
JDK	Java Development Kit	Develop and run Java programs
JRE	Java Runtime Environment	Provides environment to run Java programs
JVM	Java Virtual Machine	Executes Java bytecode

Simple explanation:
- JDK: Used by developers to write, compile and run Java programs.
- JRE: Provides libraries and environment to run Java applications.
- JVM: Converts bytecode into machine-understandable instructions.
Interview questions:
1. What is JVM?
2. What is JDK?
3. What is JRE?
4. What is the difference between JDK and JRE?
5. Is Java platform independent? Why?
2. Input and Output in Java
Input means taking data from the user.

Output means displaying data on the screen.

Output example:
class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        System.out.print("Welcome");
    }
}


Output:
Hello Java
Welcome


Input example using Scanner:
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");

        String name = sc.nextLine();

        System.out.println("Hello " + name);
    }
}


Important Scanner methods:
Method	Purpose
nextInt()	Read integer
nextFloat()	Read float
nextDouble()	Read double
next()	Read one word
nextLine()	Read complete line
nextBoolean()	Read boolean

Interview questions:
1. What is Scanner in Java?
2. What is System.out.println()?
3. Difference between print() and println()?
4. How do you take user input in Java?
5. What is System.in?
3. Identifiers in Java
Identifiers are names given to variables, methods, classes and other program elements.

Example:
class Student {
    int age = 22;

    void display() {
        System.out.println(age);
    }
}


Here:
- Student – Class identifier.
- age – Variable identifier.
- display – Method identifier.
Rules of identifiers:
1. Can contain letters, digits, _ and $.
2. Cannot start with a digit.
3. Cannot use Java keywords.
4. Cannot contain spaces.
5. Java identifiers are case-sensitive.
Examples:
int age = 22;       // Valid
int student1 = 10;  // Valid
int _number = 20;   // Valid

// int 1student = 10; // Invalid
// int class = 20;    // Invalid


Interview questions:
1. What is an identifier?
2. What are the rules of identifiers?
3. Is Java case-sensitive?
4. Can an identifier start with a number?
4. Keywords in Java
Keywords are reserved words that have predefined meanings in Java.

Examples:
int age = 22;

if (age >= 18) {
    System.out.println("Eligible");
}


Here, int and if are keywords.

Important Java keywords:
Keyword	Purpose
class	Create a class
public	Access modifier
static	Belongs to class
void	No return value
int	Integer data type
if	Conditional statement
else	Alternative condition
for	Loop
while	Loop
return	Return a value
new	Create an object
this	Current object reference
extends	Inheritance
implements	Implement interface
final	Restrict modification or inheritance

Interview questions:
1. What are keywords in Java?
2. How many reserved keywords are there?
3. Can we use keywords as variable names?
4. Is main a keyword?
Answer: No. main is a method name, not a Java keyword.
5. Variables in Java
A variable is a named memory location used to store data.

Example:
class Main {
    public static void main(String[] args) {

        int age = 22;
        String name = "Praveen";
        double salary = 15000.50;

        System.out.println(age);
        System.out.println(name);
        System.out.println(salary);
    }
}


Types of variables:








medium.com


Type	Explanation
Local variable	Declared inside a method or block
Instance variable	Declared inside a class, outside methods, without static
Static variable	Declared using static keyword

Example:
class Student {

    int age = 22;             // Instance variable
    static String college = "VIIT"; // Static variable

    void display() {
        int marks = 90;       // Local variable

        System.out.println(age);
        System.out.println(college);
        System.out.println(marks);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}


Interview questions:
1. What is a variable?
2. What are the types of variables in Java?
3. What is a local variable?
4. What is an instance variable?
5. What is a static variable?
6. Difference between local and instance variables?
6. Data Types in Java
Data types specify what type of value a variable can store.

Java has two main categories:








astikanand.github.io


A. Primitive Data Types (8)
Data Type	Size	Example
byte	1 byte	byte a = 10;
short	2 bytes	short b = 100;
int	4 bytes	int c = 1000;
long	8 bytes	long d = 10000L;
float	4 bytes	float e = 10.5f;
double	8 bytes	double f = 20.55;
char	2 bytes	char g = 'A';
boolean	JVM-dependent	boolean h = true;

B. Non-Primitive Data Types

Examples:
- String
- Array
- Class
- Interface
- Object
Example:
class Main {
    public static void main(String[] args) {

        int age = 22;
        String name = "Praveen";

        int[] numbers = {10, 20, 30};

        System.out.println(age);
        System.out.println(name);
        System.out.println(numbers[0]);
    }
}


Interview questions:
1. How many primitive data types are there in Java?
2. What is the difference between primitive and non-primitive data types?
3. What is the size of int?
4. What is the difference between float and double?
5. Is String a primitive data type?
6. What is the default value of an instance int variable?
