package day06Modulus;

import java.util.Locale;
import java.util.Scanner;

public class exercises02 {
    public static void main(String[] args) {
        // firs and last character yasin yılmaz
        //char method
        String name = "yasin yılmaz";
        char first = name.charAt(0);
        char last= name.charAt(name.length()-1);
        System.out.println(""+first+last);

        String firstlast1 = name.substring(0,1);
        String firstlast2 = name.substring(name.length()-1);
        System.out.println(firstlast1+firstlast2);
        System.out.println(name.substring(4,7));
        System.out.println(name.replaceFirst("y","Y"));

        /*Ask user to enter his/her first name, last name and Social Security Number.
Then type a program which makes
a) initials of the first name and the last name in uppercase, other characters will be in lowercase.
b) all characters except last 4 characters of the Social Security Number " * ".
For example; Suleyman Alptekin *****5678*/

        Scanner input = new Scanner(System.in);

        String firstName = "süleyman";
        String lastName = "alptekin";
        String ssn= "12345678901";

        String result = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase()+" "+
                        lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase()+" "+
                        ssn.substring(0,8).replaceAll("[0-9]","*")+ssn.substring(8);
        System.out.println(result);

       /*)Ask user to enter password, if the password is okay for the following conditions output will be
"Your password is created successfully." If the password is not okay for any of the following conditions
Output will be "Enter a new password according to the give conditions"
        1.First letter must be uppercase
        2.Last letter must be lowercase
        3.Password must contain 6 characters*/
        String pwd = "Aı245a";
        String pwdScreen= pwd.charAt(0)>='A'&&pwd.charAt(0)<='Z' &&
                        pwd.charAt(pwd.length()-1)>='a'&& pwd.charAt(pwd.length()-1)<='z' &&
                                pwd.length()==6 ? "Your password is created successfully" :"Enter a new password according to the give conditions";
        System.out.println(pwdScreen);


















    }
}
