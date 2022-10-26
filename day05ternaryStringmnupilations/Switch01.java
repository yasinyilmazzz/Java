package day05ternaryStringmnupilations;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        /*  Ask user to enter country name among "America, England, Germany, Turkey, India, Peru,
            Spain, Bulgaria, Albania, France"
            Type code to print abbreviation of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"*/

        System.out.println("enter the countr name");
        String country= input.nextLine().toLowerCase();

        switch (country) { //inside the switch paranthesis, you must use "int,byte,short,char and string data types
                            // boolean (we cant use &&, || in the cases), double and float couldn't be used
            case "america":
                System.out.println("US");
                break;
            case "england":
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("DE");
                break;
            case "turkey":
                System.out.println("TR");
                break;
            case "india":
                System.out.println("IN");
                break;
            case "peru":
                System.out.println("PE");
                break;
            case "spain":
                System.out.println("ES");
                break;
            case "bulgaria":
                System.out.println("BG");
                break;
            case "albania":
                System.out.println("AL");
                break;
            case "france":
                System.out.println("FR");
                break;
            default:
                System.out.println("No information about the countr");
        }

















    }
}
