package day08stringmanipulationsloops;

public class Exercises {
    public static void main(String[] args) {

        String y = "yasinyilmazzz";

        for (int i=0; i<y.length(); i++){
            if (y.indexOf(y.charAt(i))==y.lastIndexOf(y.charAt(i))){
                System.out.print(y.charAt(i));
            }
        }
        System.out.println();


        //slides page 88/ Ask user to enter a word which has 4 letters and output will be inverse of the word.
        //For example; if user enters “MARK” output will be “KRAM

        String m = "yasinyilmazzz";
        for (int p=m.length()-1; p>=0; p--)
            System.out.print(m.charAt(p));
        System.out.println();

        //1) Write a program to print counting numbers from 10 to 57 on the console by using for-loop.
        for (int i=10; i<58; i++){
            System.out.print(i+" ");
        } System.out.println();

        //2) Write a program to print even counting numbers from 100 to 43 on the console by using for-loop.

        for (int h=100; h>42;h--){
            if (h%2==0){
                System.out.print(h+" ");
            }
        }
        System.out.println();
        //3) Write a program to print odd counting numbers from 200 to 33 on the console by using for-loop

        int top=0;
        for (int i =200; i>32;i--){
            top=top+i;

        }System.out.print("sum "+top);
        System.out.println();

        int num = 10, count, total = 0;

        for(count = 1; count <= num; count++){
            total = total + count;
        }

        System.out.println("Sum of first 10 natural numbers is: "+total);

        for (int i=200;i>0;i--){
            if (i%5==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        String e="yasin Yılmaz";
        String isimbasharf= e.substring(0,1);
        String soybas= e.split(" ")[1].substring(0,1);
        System.out.println(isimbasharf+ " "+soybas);

        //1) Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line
        //with a space between two consecutive integer

        for (int i = 120; i>10; i--){
            if (i%6==0 && i%4==0){
                System.out.print(i+" ");
            }
        }System.out.println();

            }
        }

      //exp: is string palindrom














































