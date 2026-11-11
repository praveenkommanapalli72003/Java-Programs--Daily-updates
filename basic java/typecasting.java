class typecasting{
    public static void main(String args[]){

        /*Type casting are two types Auto and manual */
        short a = 10;
        int n = a;
        System.out.println(a);
        System.out.println(n);   /*This auto type in simple java are converted byte->short->int->long->float->double */


        /*manual type of type casting in java */
        int b = 20;
        /*byte x = b; /*error because are possible lossy conversation from into to byte */
        byte x = (byte) b;
        System.out.println(b);
        System.out.println(x);


        /*Another example are short to byte */
        short s = 129;
        byte y = (byte) s;  
        System.out.println(s);  /*129 */
        System.out.println(y);  /*127 because of range are that byte -127 to 127 */

        /*Another example are float to double on auto. */
        float f = 10.79f;
        double d = f;
        System.out.println(f);
        System.out.println(d);

        /*Another example are float to long on manual.  */
        float pi = 23.45f;
        long ll = (long) pi;
        System.out.println(pi);
        System.out.println(ll);

        /*type casting are sequence of store data types it automatically --->auto & <--- manual */


        /*ASCII values char to all data type convert */
        /*char to int->float->double->string */
        char ch ='A';
        int r = ch;
        System.out.println(ch); //A
        System.out.println(r);  //65

        int g = 97;
        char ch1 = (char)g;
        System.out.println(g);
        System.out.println(ch1);


    }
}