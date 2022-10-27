package day09forloops;

import java.util.Scanner;

public class exercises {
    public static void main(String[] args) {

//        //Example 1: Type code to reverse a String
//        //           For Example: Tom ==> moT
//        String name = "Mark";
//        String reverse="";
//        for (int i = name.length()-1; i>=0;i--){
//            char rev= name.charAt(i);
//            reverse=reverse+rev;
//        }
//        System.out.println(reverse);
//
//        //Example 2: Find the sum of the integers from 3 to 6
//        int sum = 0;
//        for (int i=3;i<7;i++){
//            sum=sum+i;
//        }
//        System.out.println(sum);
//
//        //Example 3: Find the multiplication of the integers from 3 to 6
//        int multi=1;
//        for (int i=3;i<7;i++){
//            multi=multi*i;
//        }
//        System.out.println(multi);
//
//        //Example 4: Type code to find the sum of the digits of an integer
//        //           584 ==> 5+8+4=17
//
//        int total=584;
//        int totDigit=0;
//        for (int i=total;i>0;i=i/10){
//            totDigit=totDigit+i%10;
//        }
//        System.out.println(totDigit);
//
//        //Example 1: Type code to print characters except "m" in a String
//        //           For example, Andromeda ==> Androeda
//
//        String str = "Andromeda";
//        for (int i =0;i<str.length();i++){
//            char ch=str.charAt(i);
//            if (ch=='m'){
//                continue;
//            }System.out.print(ch);
//        }
//        //Example 2: Type code to print characters before "m" in a String
//        //           Luxembourg ==> Luxe
//
//        String city="Luxemburg";
//        for (int i =0;i<city.length();i++){
//            char ch=city.charAt(i);
//            if (ch=='m'){
//                break;
//            }
//            System.out.print(ch);
//        }
//        System.out.println();
//        //Example 3: Type code to find the sum of the unique digits in an integer
//        //           For example, 1232 ==> 1+3 = 4
//
//        String input ="1232";
//        int sumDigit=0;
//
//       for (int i =0;i<input.length();i++){
//           String digit= input.substring(i,i+1);
//           if (input.indexOf(digit)==input.lastIndexOf(digit)){
//               sumDigit=sumDigit+ Integer.valueOf(digit);
//           }
//        }
//        System.out.println(sumDigit);

       //_______________________________________________________________________________________
                //Aşağıdaki şekli nested loop kullanarak oluşturun.

//        A A A A A A A A
//        A X X X X X X A
//        A X X X X X X A
//        A X X X X X X A

//        int rows=4,colums=8;
//
//        for (int i = 1; i <= rows; i++) {
//            if (i==1){
//                for (int j = 0; j <colums ; j++) {
//                    System.out.print("A");
//                }
//            }else {
//                System.out.print("A");
//                for (int j = 2; j <colums ; j++) {
//                    System.out.print("X");
//                }System.out.print("A");
//            }
//            System.out.println();
//Example 4: Type code to find the sum of the digits of an integer
//           584 ==> 5+8+4=17
//Example 3: Type code to find the sum of the unique digits in an integer
//           For example, 1232 ==> 1+3 = 4

        int r= 1232;
        String t=String.valueOf(r);
        int sum=0;
        for (int i = 0; i <t.length() ; i++) {
            if (t.indexOf(t.substring(i,i+1))==t.lastIndexOf(t.substring(i,i+1))){
                sum=sum+Integer.valueOf(t.substring(i,i+1));
            }

        }
        System.out.println(sum);



























}
    }
