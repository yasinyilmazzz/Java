package day07StringManipulations;

public class Exercises {
    public static void main(String[] args) {

/*    Example 1: Check if the given password
                i) has "A" in any position
                ii) has "xy" at yhe beginning
                iii) has "W" as 7th character
                iv) has 8 characters in total*/

        String pwd = "xy1AmSW?";
        boolean i = pwd.contains("A");
        boolean ii= pwd.startsWith("xy");
        boolean iii=pwd.startsWith("W",6);
        boolean iv= pwd.length()>7;
        System.out.println(i&&ii&&iii&iv);
//___________________________________________________________________________
        /*Type code to check if a password is valid or not for the following conditions;
            Password must have at least 8 characters different from space character
            Password must have at least 1 symbol*/
        String t ="!1a23 b4? es";
        boolean t1=t.replaceAll("\\s","").length()>7;
        boolean t2= t.replaceAll("^\\p{Punct}","").length()>0;
        System.out.println(t1&&t2);
        System.out.println(t.replaceAll("\\P{Punct}",""));

        //ex: How many punchtuation marks are used

        String str= "Ali is 13 years old, I like Ali, Ali does not like me!....";
        int punc= str.replaceAll("\\P{Punct}","").length();
        System.out.println(punc);

        //ex : Ask user  to enter his full name and fix if the user enters space at the beginning and at the end

        String fullname = "   yasin yilmaz     ";
        System.out.println(fullname.trim());

                /* turkish citizen id
        1)must be 11 digit
        2) only numeretic
        3) first digit must be nonzero and last digit must be even
         */

        String tckn= "23458993014";
        boolean lenghtTckn=tckn.length()==11;
        boolean num=tckn.replaceAll("[0-9]","").length()==0;
        boolean isEvenFirst= tckn.substring(0,1).replaceAll("[0]","").length()>0;
        boolean isEvenLast=tckn.substring(tckn.length()-1).replaceAll("[2,4,6,8,0]","").length()==0;
        System.out.println("tckn is " +(lenghtTckn&&num&&isEvenFirst&&isEvenLast));

        /*
        Pasaport Serial Number
        1- first two digit must be uppercase letter and after than a space
        2- 6 digit numeretic serial number
        3- secand character of numeretic base is last digit of multiplication of first and last digit
         */



















    }
}
