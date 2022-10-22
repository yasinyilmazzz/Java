package day02TypeCasting;

public class WrapperClass01 {
    public static void main(String[] args) {
/*
Wrapper Type

Primitive           Wrapper Class
byte                Byte
short               Short
int                 Integer
long                Long
float               Float
double              Double
boolean             Boolean
char                Character

 */

        int i=12;  //there is no method, just value
        Integer k=13; //there are many methods in the coding

//Autoboxing: To convert "primitive data" to "wrapper class"
        byte b = 23;
        Byte wb=b;

// Unboxing:
        Short ws=34;
        short s =ws;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);






















    }

}
