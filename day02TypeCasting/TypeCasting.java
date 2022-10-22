package day02TypeCasting;
/*

Type casting; converting a number primitive data type to another number primitive data type.For ex;
while using data type convert as 'byte' convert to 'int'. Normally it is byte but it will behave like
byte. (You can't change char or boolean data types, as they are not numeric data types).



byte - short - int - long - float-double

For ex;

**If you convert small data type to large dat type it is called 'Auto widening'.
**If you convert large data type to small data type it is called 'Explicit Narrowing'.

 */
public class TypeCasting {
    public static void main(String[] args) {
    //Auto-widening
        byte age=12;
        int myAge= age;
        System.out.println(myAge);

        short populationOfVillage=21000;
        int myPopulationOfMyVillage=populationOfVillage;

    //explicit Narrowing
        double x=23.45;
        long y= (long) x;
        System.out.println(x); //23.45
        System.out.println(y); //23  long doesn't contain decimals


    // Type casting
    int m=14;
    byte b=(byte) m;
        System.out.println(b);


















    }










}
