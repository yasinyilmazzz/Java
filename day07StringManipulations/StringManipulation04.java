package day07StringManipulations;

public class StringManipulation04 {
    public static void main(String[] args) {

        String str = "String is a non-primitive data type in Java";

        boolean result1 = str.isEmpty();//isEmpty() method returns true if the String does not have any character, returns false if the String has any character
        //str.length()==0 and isEmpty() have same meaning but to check if a String is empty using isEmpty() is preferable
        System.out.println(result1);//true


        boolean result2 = str.isBlank();//isEmpty("")==>true, isEmpty(" ")==>false
        //isBlank("")==>true, isBlank(" ")==>true
        System.out.println(result2);//true


        //ex:
        String s="Learn Java earn money";
        boolean result3=s.replaceAll("[a-zA-Z ]","").isEmpty();
        System.out.println(result3);


        //ex:check SSN
        String ssn= "12345678A";

        boolean digit=ssn.replaceAll("[0-9]","").isEmpty();
        boolean lenght = ssn.length()==9;
        System.out.println(digit && lenght ? "Valid":"invalid");










    }
}
