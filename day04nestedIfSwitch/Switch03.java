package day04nestedIfSwitch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//Create a simple calculator which does addition, subtraction, multiplication, division, percentage calculation
        System.out.println("Enter the first number");
        double firstNum = input.nextDouble();
        System.out.println("Enter the second number");
        double secondNum = input.nextDouble();
        System.out.println("Enter the operation");
        char operation = input.next().charAt(0);

        switch (operation){
            case '+':
                System.out.println(firstNum+secondNum);
                break;
            case '-':
                System.out.println(firstNum-secondNum);
                break;
            case '*':
                System.out.println(firstNum*secondNum);
                break;
            case '/':
                System.out.println(firstNum/secondNum);
                break;
            case '%':
                System.out.println(firstNum*secondNum/100);
                break;
            default:
                System.out.println("That operation not supported");
        }












    }
}
