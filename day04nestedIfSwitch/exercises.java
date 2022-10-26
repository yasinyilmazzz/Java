package day04nestedIfSwitch;

import java.util.Scanner;

public class exercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      /*  System.out.println("1.lenght of triangle");
        int a = input.nextInt();
        System.out.println("2.Lenght of triangle");
        int b = input.nextInt();
        System.out.println("3. lenght of triangle");
        int c=input.nextInt();

        if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
            }else if (a==b || b==c) {
            System.out.println("equilateral triangle");
            }else {
            System.out.println("Neither isosceles, nor equilateral");
        }*/
//_______________________________________________________________________________________________________
    /*   System.out.println("select operation:\n 1) converts mile to km,\n 2) second to hour,\n 3) fahrenheit to " +
                "celsius.");
        char opr = input.next().charAt(0);

    if (opr == '1'){
            System.out.println("Enter the value");
            double value =input.nextDouble();
            System.out.println(value/1.6);
        } else if (opr=='2') {
            System.out.println("Enter the value");
            double value =input.nextDouble();
            System.out.println(value/3600);
        } else if (opr=='3') {
            System.out.println("Enter the value");
            double value =input.nextDouble();
            System.out.println((value-32) * 0.55 );
        }else {
            System.out.println("Invalid parameters");

        switch (opr){
            case '1':
                System.out.println("Enter the value");
                double value =input.nextDouble();
                System.out.println(value/1.6);
                break;
            case '2':
                System.out.println("Enter the value");
                double value2 =input.nextDouble();
                System.out.println(value2/3600);
                break;
            case '3':
                System.out.println("Enter the value");
                double value3 =input.nextDouble();
                System.out.println((value3-32) * 0.55 );
                break;
            default:
                System.out.println("Invalid parameters");
                        }
______________________________________________________________________________*//*

        System.out.println("enter BMI");
        double bmi = input.nextDouble();

        switch (bmi){
            case (bmi<0):
                System.out.println("Invalid parameter");
                break;
            case (bmi<18.6):
                System.out.println("underweight");
                break;
            case (bmi>18.5 && bmi<25):
                System.out.println("normal");
                break;
            case (bmi>24.9 && bmi<30):
                System.out.println("overweight");
                break;
            default:
                System.out.println("obesity");

        }
________________________________________________________________________________*/
/*

        Type java code by using nested if statement,
                If a number is even then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
“Perfect even number” otherwise, the output will be “Good even number.”
        If the number is odd then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
“Perfect odd number” otherwise, the output will be “Good odd number.*/

        System.out.println("enter number");
        int num = input.nextInt();

        if (num%2==0){
            if (num%3==0){
                System.out.println("Perfect even number");
            }else {
                System.out.println("Good even number");
            }
        } else if (num%2==1 || num%2==-1) {
            if (num%3==0){
                System.out.println("Perfect odd number");
            }else {
                System.out.println("Good odd number");
            }

        }


    }
    }

