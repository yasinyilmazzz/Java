package day04nestedIfSwitch;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        Scanner inpput = new Scanner(System.in);

        System.out.println("Enter Day number");
        byte dayNumber = inpput.nextByte();
    //Way1
        if (dayNumber==1){
            System.out.println("Sunday");
        } else if (dayNumber==2) {
            System.out.println("MOnday");
        }else if (dayNumber==3) {
            System.out.println("Tuesday");
        }else if (dayNumber==4) {
            System.out.println("Wednesday");
        }else if (dayNumber==5) {
            System.out.println("Tuesday");
        }else if (dayNumber==6) {
            System.out.println("Friday");
        }else if (dayNumber==7) {
            System.out.println("Saturday");
        }else {
            System.out.println("Invalid Number");
        }
        //2.Way "switch statment
        switch (dayNumber){

            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid number");

        }












    }
}
