package day01veriables;

public class Variables01 {
    public static void main(String[] args) {

        // Data Type    Variable Name    = Value   ;
        //   int           age           =   27    ;

        //exp.
        double applePrize = 1.99;

        /* Data Types
        1) integer: its used for whole number(not decimal)
            The minimum value of integers is -2,147,483,648
            max. value of integers is 2,147,483,687
            integer variables use 32 bits in memory
        2) short: its used for whole numbers.
            The minimum value of shorts is -32,768
            The maximum value of shorts is 32,767
            short variables use 16 bits in memory
        3) byte: it is used for whole numbers.
            The minimum value of shorts is -128
            The maximum value of shorts is 127
            byte variables use 8 bits in memory
        4) long: it is used for whole numbers.
            The minimum value of shorts is -9,223,372,036,854,775,808
            The maximum value of shorts is 9,223,372,036,854,775,807
            long variables use 64 bits in memory

            Data types about decimal values
        1) float: its used for decimal values (like 12.99, 5.23)
            float values use 32 bits in memory
            when u create float values, u have to use "F" or "f" at the end
        2) double: its used for decimal values
            double uses 64 bits memory

            Data types releated with Numbers
            byte < short < int < long < fload < double

            Other data types
        1) boolean: its for "true" or "false" answers
            boolean uses just 1 bit
        2) char: its for just a single character.
            when use char data type, value is must be between' '
            chars use 16 bits in memory

    byte < short < int < long < fload < double and "boolean", "char" are called primitive Data Types
        if a variable contains just a value, its called "Primitive"
        String is non-primitive
        String must start "uppercase"

         */
        int populationOfGermany = 80000000;
        System.out.println(populationOfGermany);
/*
        int populationOfTheWorld = 7000000000;  //value is out of range
        long populationOfTheWorld = 7000000000L;  //to save memory java gives error,typing "L" solved its
        long populationOfChina = 1400000;  //volue is in the range. java sees no problem
        float prizeOfLaptop = 754.33F;  // 7 digit after comma
        double weightOfCell = 0.000002344;  //60 digit after comma
        boolean isRetired = true;
        char single = 'A';
    */

    //When you select any data type the volue must be in the range of the datatype

    //exp:
        int x = 32;
        double i = 43.12, m = 65.78;
        System.out.println(x+i+m);  //int ve double toplamada(matematiksel işlemde) problem yok.
                                    // Sonuç hiyerarşide double üstte olduğundan decimal çıkar
        //exp
        float q = 2.45F, w = 7.98F;
        short e =  76, r = 34,t = 64;
        double y = 90.43,u = 67.93;

        System.out.println(q+w+e+r+t+y+u);//342.78999267578126

        char char01 ='A';
        int s = 10;
        System.out.println(char01+s); //75 (because of ASCII volue)

        //exp
        String yasin = "yasin";
        int i5 = 4, i6 = 3;
        System.out.println(yasin+i5+i6);



        }


    }


