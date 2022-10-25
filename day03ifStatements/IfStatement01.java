package day03ifStatements;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Type code to print "negative" for the numbers less than zero, "non-negative" for the numbers greater than or equal to zero.
       // System.out.println("Hey! Give a number.");
        //double d = input.nextDouble();
        double d= -2.3;
        if (d<0){
            System.out.println("Negative");
        }
        if (d>0){
            System.out.println("positive");
        }

        // type code to print "Divisible by 5" if the number can be divided by 5, otherwise print "Not divisible by 5" if the number cannot be
        ////divided by 5. In java "==" means equals. % (modulus operator) ==> gives the remainder of a division operation. In java "=" is assignment operator.


       //1. Way: multiple if statements
        int i = 1506;
        if(i%5==0){
            System.out.println("Divisible by 5");
        }
        if(i%5!=0){
            System.out.println("not Divisible by 5");
        }

        // 2.Way: if else statements==> use if you have just two conditiions.
        //In the second way Java checks just 1 condition, but in the first Java checks 2 conditions.
        //If you type the code in the second firstly, you will prevent repetition and secondly Java will execute your code faster. int k = 15;

        int p=855;
        if(p%5==0){
            System.out.println("Divisible by 5");
        }else{
            System.out.println("not Divisible by 5");
        }










    }
}
