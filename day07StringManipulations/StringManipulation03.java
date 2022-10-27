package day07StringManipulations;

public class StringManipulation03 {
    public static void main(String[] args) {

        //ex: How many punchtuation marks are used

        String str= "Ali is 13 years old, I like Ali, Ali does not like me!....";
        int numOfAllChars=str.length();
        int numOfAllCharsDiffFromPunchtuationMarks=str.replaceAll("\\p{Punct}","").length();
        System.out.println(numOfAllChars-numOfAllCharsDiffFromPunchtuationMarks);//7
        System.out.println( str.replaceAll("\\P{Punct}","").length());// 2. way

        //ex : Ask user  to enter his full name and fix if the user enters space at the beginning and at the end
        String  fullName= "        Tom Hanks        ";
        String fixedFullName=fullName.trim(); //
        System.out.println(fixedFullName);












    }
}
