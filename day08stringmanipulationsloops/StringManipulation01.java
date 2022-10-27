package day08stringmanipulationsloops;

public class StringManipulation01 {
    public static void main(String[] args) {

        String str="Java is easy. Java is OOP.";

        String result1=str.replaceFirst("Java","Apex");
        System.out.println(result1);//Apex is easy. Java is OOP.
        String result2 =str.replace("Java","apex");
        System.out.println(result2);//apex is easy. apex is OOP.

    /*String shirtPrice = ‘$12.99’;
      String bookPrice = ‘$35.99’;
      Type code to find the sum of the shirt and book prices.
       */

        String shirtPrice = "$12.99";
        String bookPrice = "$35.99";

        String shirts=shirtPrice.replace("$","");
        String book= bookPrice.replace("$","");
        System.out.println(Double.valueOf(shirts) +(Double.valueOf(book)) );


        //valueOf() method converts String data type to numeric data type
        //Note: To be able to use valueOf() method, String must be in numeric format





        /* swap the integers
        a=12   b=23 ==> a=23   b=12
         */
        int a=12, b=23;
        int temp =0;
        //1. way
        temp=b;
        b=a;
        a=temp;
        System.out.println(a);
        System.out.println(b);
        //2.way without using third variable
        int x=14, y=25;
        y=y-x;//11
        x=y+x;//25
        b=x-y;//14


















    }
}
