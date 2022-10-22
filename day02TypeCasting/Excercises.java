package day02TypeCasting;

import java.util.Scanner;

public class Excercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

      /*  int m= 14000;
        System.out.println(m);

        double d= m;
        System.out.println(d);

        int n = 15;
        byte b = (byte)n;
        System.out.println(b); //15

        long y = 123l;
        byte z = (byte) y;
        System.out.println(z);//123

        double q = 64.25;
        Double w = q;
        System.out.println(w);

        Double wt = 87.43;
        double p = wt;
        System.out.println("p is: " + p);

        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);*/



      //to calculate area of rectangle get data from user
      /*  System.out.println("value of width");
        double widht = scan.nextDouble();
        System.out.println("Value of hight");
        double hight = scan.nextDouble();
        System.out.println("Area of rectangle is " + (widht*hight));
*/
        //Type a program which calculates the area and the perimeter of a square
        //whose side length is entered by user.

        /*System.out.println("to calculate area of square  give me data");
        double square = scan.nextDouble();
        System.out.println("area of square" + square*square);
        System.out.println("perimeter of square"+square*4);

        System.out.println(" to calculate area of cube  give me data");
        double cube=scan.nextDouble();
        System.out.println("cube's area is"+cube*cube*cube);*/

 /*       System.out.println("lets convert km to mile");
        double kmtomile=scan.nextDouble();
        System.out.println(kmtomile*1.6+" mile");*/

/*        System.out.println("convert hour to second");
        long sec =scan.nextLong();
        System.out.println(sec*60*60+"second");*/

/*        System.out.println("type your name, surname, and address");

        String name = scan.nextLine();
        String surname = scan.nextLine();
        String address = scan.nextLine();

        System.out.println(name+" "+surname);
        System.out.println(address);*/

  /*      short q = 23;
        int w = q;
        System.out.println("1.q " + w);

        long z = 456;
        int x = (int) z;
        System.out.println("2.q " + x);

        double c = 54.7756475;
        float v = (float) c;
        System.out.println(v);

        System.out.println("Enter winght,lenght,hight");
        double winght = input.nextDouble();
        double lenght = input.nextDouble();
        double hight = input.nextDouble();

        System.out.println(" calculation of volume is: "+ winght*lenght*hight);
        System.out.println("calculation of total area is"+ (2*winght+2*hight+2*lenght));*/


        //get first, middle, last name and SSN from user then print them  the given format
        // Tom Jim Hanks
        // 234566784567

        System.out.println("Give me your first, middle,last name and SSN :)");
        String first = input.next();
        String middle = input.next();
        String last = input.next();
        String ssn = input.next();
        System.out.println(first+" "+middle+" "+last);
        System.out.println(ssn);






    }
}
