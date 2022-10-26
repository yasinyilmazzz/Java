package day05ternaryStringmnupilations;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //note: "ternary" does the same with "if else" by using more simple syntax

//If an integer is positive print "The integer is positive" otherwise print "The integer is not positive"
        //1.Way
        int i = 12;
        if (i>0) {
            System.out.println("int is positive");
        }else {
            System.out.println("int is not positive");
        }
        //2. Way
        String result = i>0 ? "Tenary is positive" : "int is not positive";
        System.out.println(result);

        // print minimum of 2 integer on console

        double d =1.2, e = 2.3;
        double dd = d>e ? e:d;  //":" is means "else"
        System.out.println(dd); //1.2


//Type code to calculate the absolute value of a number
        //For positive numbers and zero absolute value is the same with the number
        //For negative numbers to find absolute value multiply the number by -1

        double f =-12.4;
        double ff = f>=0 ? f: f*-1;
        System.out.println(ff);

//You have 2 integers;
//        If both of the integers are positive do multiplication
//        If one is negative the other one is positive return "I do not how to multiply"

        int a = 5, b = -2;
//objects data types can be used for all data types whenever we needs
        Object ww = a>0&&b>0 ? a*b:"I do not how to multiply";
        System.out.println(ww);














    }
}
