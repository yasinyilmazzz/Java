package day06Modulus;

import java.util.Scanner;

public class Modulus {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        /*
        Modulus Operator:"%" returns the remainder in a division operator.
        */

        //ask user a number and exemine even or odd
        System.out.println("give a number,plz");
        int x = input.nextInt();
        String xx = x%2==0 ? "even":"odd";
        System.out.println(xx);//ternary
        // we should always consider boundry values: -1000,-99,-10,0 etc.
        // we should use Math.abs(variableName)
        // -1000, -10, 0==> We should always consider "Boundary values": -1000, -99, -10, 0, 10 and so on.

        int abdNum = Math.abs(x);
        System.out.println("is the number even?" + (abdNum%2==0) );//is the number even?true

        Scanner input2= new Scanner(System.in);

        System.out.println("enter a digit to check if it is an odd num");
        int checkOdd=input2.nextInt();
        int absCheckOdd=Math.abs((checkOdd));
        System.out.println("Is the number odd? " + (absCheckOdd%2 !=0));

        //Ask user to enter a 3 digits integer then find the sum of the digits.
        /*For Ex; when the user enters 237 into the system we should first use modulus method like; 237%10= 7 and then
         */
        Scanner input3= new Scanner(System.in);
        System.out.println("enter 3 digit");
        int sum = input3.nextInt();
        int asSum= Math.abs(sum);

        int first= asSum%10;
        asSum=asSum/10;
        int sec= asSum%10;
        asSum=asSum/10;
        int third= asSum;
        System.out.println(first+sec+asSum);


















    }
}
