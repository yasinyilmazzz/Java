package day07StringManipulations;

public class StringManipulation01 {
    public static void main(String[] args) {

        String str ="Java is easy";

        boolean isExist=str.contains("a");// contains method returns boolean
        System.out.println(isExist);//true

        boolean result= str.startsWith("Java");
        System.out.println(result);//true

        //If you use startsWith() method with 2 parameters, second parameter means skip the first characters
        boolean res= str.startsWith("i",5);//skip firdt 5 character
        System.out.println(res);//true
//________________________________________________________________________________
        /*
    Example 1: Check if the given password
                i) has "A" in any position
                ii) has "xy" at yhe beginning
                iii) has "W" as 7th character
                iv) has 8 characters in total
 */
        String pwd = "xy1AmSW?";
        boolean firstRule= pwd.contains("A");
        boolean secRule= pwd.startsWith("xy");
        boolean thirdRule =pwd.startsWith("W",6);
        boolean fourthRule=pwd.length()==8;
        System.out.println(firstRule&&secRule&&thirdRule&&fourthRule);//true
//________________________________________________________________________________

        String s = "Do practice to be better";
        boolean rslt= s.endsWith("r");
        System.out.println(rslt);//true
//________________________________________________________________________________
        String t = s.concat("!").concat("...");//concat() method is same with the "+" in Java.
        //If you use multiple methods side by side, it is called "method chain"
        System.out.println(t);//Do practice to be better!...
//________________________________________________________________________________


















    }
}
