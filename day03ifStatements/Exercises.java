package day03ifStatements;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //slide book q.15
        double q = 100.235;
        int w = (int) q;
        System.out.println(w); //100

        //slide book q.16
        int e = 5;
        double r = 6.2;
        System.out.println(e+r); //11.2

        //slide book page 54 q.1 -The remainder when you divide the first by the second will be the width,
        //and the sum of the two numbers will be the length of a rectangle.
        //Then calculate the area and the perimeter of the rectangle, and print them
        //on the console
/*        System.out.println("enter two integer values, the first will be greater than the second");
        int first = input.nextInt();
        int second = input.nextInt();
        int windth = first/second;
        int lenght = first+second;
        System.out.println("Area of rectangle is:" + lenght*windth);
        System.out.println("Perimater of rectangle is: "+ 2*(lenght+windth));*/

        System.out.println("Give me a number, i will say u even or odd");
        int even = input.nextInt();

        if (even%2==0){
            System.out.println("its even");
        }else {
            System.out.println("its odd");
        }

        System.out.println("enter the initial of the day of a week,");
        String initial = input.next();
        boolean dayS = initial.equalsIgnoreCase("s"), dayT=initial.equalsIgnoreCase("t"),
                dayM=initial.equalsIgnoreCase("m"),dayW=initial.equalsIgnoreCase("w"),
                dayF=initial.equalsIgnoreCase("f");

        if (dayS){
            System.out.println("sunday,saturday,");
        } else if (dayT) {
            System.out.println("tuesday,thursday");
        } else if (dayM) {
            System.out.println("Monday");
        } else if (dayW) {
            System.out.println("wednesday");
        } else if (dayF) {
            System.out.println("friday");
        } else {
            System.out.println("type only one character or initial of the day of a week");
        }







    }
}
