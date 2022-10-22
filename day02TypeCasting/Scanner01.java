package day02TypeCasting;

import java.util.Scanner;

/*
Scanner class is used to get the data fromm user into our codes.

How do we get the data from the user?
1.Step: Create an object from "Scanner Class".

Class Name     Object Name    Assignment Operator    new Keyword     Constructor==>Class Name +()
 Scanner        input             =                    new               Scanner(System.in);
                scan

 2.Step: Give a message to user about the data you ask
 */
public class Scanner01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name, plase");
        String userName =input.nextLine(); //Tom Hanks
        System.out.println(userName);

        System.out.println("Enter your adress");
        String address = input.nextLine();
        System.out.println(address);







    }






}
