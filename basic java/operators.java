import java.util.Scanner;
public class operators {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        /*Arithmetic operator */
        System.out.println("Addition of two numbers:"+(a+b));
        System.out.println("Subtraction of two numbers:"+(a-b));
        System.out.println("multiplication of two numbers:"+(a*b));
        System.out.println("division of two numbers:"+(a/b));
        System.out.println("module of two numbers:"+(a%b));
        System.out.println("power of two numbers:"+(a^b));

        /*string concat and java mainly used are all operators */
        int x = 5;
        int y = 20;
        int z = 3;
        System.out.println(x+y+"hi"+z);
        System.out.println("Hello"+x+(y+z));
        System.out.println(y-z*x+"cv"+z);
        System.out.println(x+"ac"+y%z);
        System.out.println(y%(x+z)+"hello"+x);
        System.out.println("Hi"+y+"Hello"+x);

        /*Relational operator---> >,<,>=,<=,==,!= */
        int d = 15;
        int e = 6;
        int f = 4;
        System.out.println(d+e<f+e);
        System.out.println(d+e%f>=e+a%f);
        System.out.println(e+f==d+f);
        System.out.println(d+e!=f%e);

        /*Assignment operator --> =,+=,-=,*=,/-,%*/
        int h = 10;
        int g = 3;
        h=h+5;
        int i = h/4;
        i=i+g;
        g=h-i;
        System.out.println(h+" "+b+" "+g); 

        /*logical operator --> AND(&&), OR(||) */
        int age = 22;
        System.out.println(age >= 18 && age <= 60);
        System.out.println(age < 18 || age > 60);
        System.out.println(!(age >= 18));

        /*shift operators --> <<,>>*/
        int l = 8;
        System.out.println(l << 1);
        System.out.println(l >> 1);
        System.out.println(l >>> 1);

        /*unary operators-->increment(++) & decrement(--) */
        int s = 15;
        int m = s++;
        m++;
        int p = (m++)%(s++);
        s++;
        System.out.println(s+" "+m+" "+p);
    }
}

