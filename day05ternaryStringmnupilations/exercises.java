package day05ternaryStringmnupilations;

import java.util.Scanner;

public class exercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       /* "Ask user to enter an integer. If the number has 3 digits," +
                " output will be “This number has 3 digits.” Otherwise, output will be “This number has no 3 digits.”

        System.out.println("enter an integer");
        String int3 = input.next();

        String is3Digit = int3.length()==3 ? "this number 3 digit" : "This number has no 3 digits.";
        System.out.println(is3Digit);

        System.out.println("enter number");
        double p = input.nextDouble();
        double pp = p>-1 && p<10 ? (p*p*p):(p*p);
        System.out.println(pp);*/
//_________________________________________________________________________________________
        //if the integer is even,
        //the output will be “The integer is even”. If the integer is odd, the output will be “The integer is odd”

/*        int exp3 = 21;
        String resultExp3 = exp3%2==0 ? "The integer is even":"he integer is odd";
        System.out.println(resultExp3);

        //Type java code by using ternary and if-else. Ask user to enter two integers
        //Write a program to print the minimum one on the console
        System.out.println("enter int");
        int first = input.nextInt();
        int sec = input.nextInt();
        int resultMim= first<sec ? first:sec;
        System.out.println(resultMim);

        //Type java code by using ternary.
        //Write a program to print absolute value of an integer entered by user

        int t = -2;
        int tt = t>0 ? t:t*-1;
        System.out.println(tt);

        //Type java code by using using ternary.
        //Take values of length and width of a rectangle from user and check if it is square or not.
        int len=15, wid=10;
        String res = len==wid ? "square": "rectangle";
        System.out.println(res);

        //Ask user to enter a String. If the String has 2 characters, output will be
        //“It is valid for state abbreviations” Otherwise, output will be “It is not valid for state abbreviations

        String abbr = "qwe";
        String res = abbr.length()==2 ? "valid":"invalid";
        System.out.println(res);

        //If the year is divisible by 100 then it must be divisible by 400.
        //If a year is not divisible by 100 then it must be divisible by 4
        int year = 2011;
        String isLeas = year%100==0 ? (year%400 == 0 ? "leap":"not leap"):(year%4==0?"leap":"not leap");
        System.out.println(isLeas);

        int i =124;
        Object res = i%10>4 ? ("round"+(i/10+1)*10):("round"+ (i/10)*10);
        System.out.println(res);

        char pre = '3';
        switch (pre){
            case '1':
                System.out.println(pre);
                break;
            case '2':
                System.out.println(pre);
                break;
            case '3':
                System.out.println(pre);
                break;
            default:
                System.out.println("not allowed");
        }
        // soru soruldu ve cevap c
        char q1 = 'b';
        switch (Character.toLowerCase(q1)){
            case 'c':
                System.out.println("yes");
            default:
                System.out.println("invalid");
        }

        //Type java code by using switch statement.
        //A school has following rules for grading system:
        //1. For 50 - C 2. For 80 - B. 4. For 100 - A

        int score = 101;
        if (score>-1&&score<50){
            score =1;
        } else if (score>49 && score<80) {
            score =2;
        } else if (score<100) {
            score= 3;
        }else {
            System.out.println("invalid");
        }
        switch (score){
            case 1:
                System.out.println("c");
                break;
            case 2:
                System.out.println("b");
                break;
            case 3:
                System.out.println("a");
                break;
        }
        char usa = 'f';
        switch (Character.toLowerCase(usa)){
            case 'u' :
                System.out.println("United");
                break;
            case 's' :
                System.out.println("State");
                break;
            case 'a' :
                System.out.println("America");
                break;
            default:
                System.out.println("invalid character");
        }
        //Type code to check the password
        // If it has more than 8 characters, initial should be 'i'
        // If it does not have more than 8 characters initial should be 'K'
        // Solve the task by using nested-ternary

        String pwd = "i234Y678";
        String isPwd = pwd.length()>8 ? (pwd.startsWith("i") ? "valid":"invalid") :
                        (pwd.charAt(0)== 'K' ? "valid":"invalid");
        //Ask user to enter a letter, if it is uppercase check it is before “F” or not in alphabetical order.
        //If it is before “F” in alphabetical order output will be “ Big before F”, otherwise output will be
        //“Big after F.”
        // If it is lowercase check it is before “h” or not in alphabetical order.
        //If it is before “h” in alphabetical order output will be “Small before h”, otherwise “Small after h

        char x= 'Y';
        Object xx = x>64 && x<91 ? (x<70 ? "Big before F":"Big after F" ) :(x<104 ? "Small before h":"Small after h" ) ;

        System.out.println(xx);

        String gender = "male";
        switch (gender.toLowerCase()){
            case "male":
                System.out.println("boy");
                break;
            case "female":
                System.out.println("girl");
                break;
            default:
                System.out.println("others");
        }
        //Type a code to display the number of days in a given month of a given year

        System.out.println("givenyear");
        int year = 2000;
        int month= 2;
        int numDay=0;

        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numDay=31;
                break;
            case 4: case 6: case 9: case 11:
                numDay=30;
                break;
            case 2:
                if (year%4==0 && !(year%100==0) || year%400==0){
                    numDay=29;
                }else{
                    numDay=28;
                }break;
            default:
                System.out.println("invalid month");
        }
        System.out.println("day number" + numDay);

        double z = 10;
        char x ='*';
        double c =20;

        switch (x){
            case '*':
                System.out.println(z*c);
                break;
            case '+':
                System.out.println(z+c);
                break;
            default:
                System.out.println("invalid op");

        }
        //Ask user ta enter his/her first and last name.
        // If the first name is longer output will be “First name is longer.”
        // If the length of last name is equal To the length of last name output will be “First name and last name
        //have same length.
        // ” Otherwise, output will be “Last name is longer

        String first = "Tom";
        String last = "Hanks";
        String result = first.length()>last.length() ? ("First name is longer"):
                (last.length()>first.length()?"Last name is longer": "equal" );
        System.out.println(result);

        String t = "MARK";
        int r =t.;
        System.out.println(r);

        //Ask user to enter password, if the password is okay for the following conditions output will be
        //“Your password is created successfully.” If the password is not okay for any of the following conditions
        //Output will be “Enter a new password according to the give conditions”
        //1.First letter must be uppercase
        //2.Last letter must be lowercase
        //3.Password must contain 6 character

        System.out.println("pass");
        String pwd = "Y2345o";
        String res = pwd.charAt(0)>64&&pwd.charAt(0)<91 ? (pwd.charAt(5)>96 && pwd.charAt(5)<123 ?(pwd.length()==6? "succesful":"invalid"):("invalid password")):("invalid password");
        System.out.println(res);

        //Ask user ta enter his/her first name, last name and Social Security Number.
        //Then type a program which makes
        //a) initials of the first name and the last name in uppercase,
        //other characters will be in lowercase.
        //b) all characters except last 4 characters of the Social Security Number “ * ”.

        String name = "suleyman";
        String nameTo= name.toLowerCase();
        String surname="alptekin";
        String surTo= surname.toLowerCase();
        String SSN = "12345678901";
        String ssn4= SSN.substring(SSN.length()-4);
        System.out.println((nameTo.substring(0, 1).toUpperCase() + nameTo.substring(1))+ " " +
                            (surTo.substring(0, 1).toUpperCase() + surTo.substring(1))+ " *******"+ssn4);

        String str = "Cat, caterpillar";
        String str1 = str.toUpperCase();
        String str2 = str.toLowerCase();
        String str3 = str.substring(4).toLowerCase();
        String str4 = str.substring(3,8).toUpperCase();
        String str5 = str.toUpperCase().toLowerCase();
        System.out.println(str5);*/

      /*  Type java code by using switch statement.
                A school has following rules for grading system:
        1. For 50 - C 2. For 80 - B. 4. For 100 - A
        Ask user to enter marks and print the corresponding grade*/

        int score = input.nextInt( );
        int scoreAbs = Math.abs(score);



        // String grade= scoreAbs<50 ? grade="C" :(scoreAbs<80? grade="B":(scoreAbs<101? grade="A":"Heyy"));

























    }

    }

