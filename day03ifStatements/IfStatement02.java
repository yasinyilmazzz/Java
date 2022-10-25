package day03ifStatements;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        /* Exp. 1: Type code to print "weekday" for weekday names, "weekend day" for the weekend days
           Monday -->
         */
        Scanner input = new Scanner(System.in);

// Create appripriate container/variable to put the data (==) to check equality of the numbers==>primitive data types
// Note: To compare Strings use "equals()"

        // in this exp. Java check first condition and second and going to find true value
        //Note: To compare Strings use "equals()", do not use "=="
        //1.Way: That code works, but it has many repetitions and Java does many tasks
        System.out.println("Enter the day name");
        String dayName = input.next();
        if (dayName.equals("Monday")) {
            System.out.println("Weekday");
        }
        if (dayName.equals("Tuesday")) {
            System.out.println("Weekday");
        }
        if (dayName.equals("Wednesday")) {
            System.out.println("Weekday");
        }
        if (dayName.equals("Thursday")) {
            System.out.println("Weekday");
        }
        if (dayName.equals("Friday")) {
            System.out.println("Weekday");
        }
        if (dayName.equals("Saturdayy")) {
            System.out.println("Weekend");
        }
        if (dayName.equals("Sunday")) {
            System.out.println("Weekend");
        } else {
            System.out.println("is it joke! get out the class ");
        }
        //2.way: if else statement ==> with or => || ==> this sign means "OR" operator in Java
        if (dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday") || dayName.equalsIgnoreCase("Wednesday") || dayName.equalsIgnoreCase("Thursday") || dayName.equalsIgnoreCase("Friday")) {
            System.out.println("Weekday");// equals.IgnoreCase()==> java doesn't care cases

        } else if (dayName.equalsIgnoreCase("Sunday") || dayName.equalsIgnoreCase("Saturday")) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid day");
        }

/*
Note: "OR" operator in Java ==> ||
"||" can be used just with booleans==> true or false.

To get false from "||" operator everything should be false.

Just a single "true" makes the result true.==>|| is optimistic
To get "false" from || every condition should be false
true || true ==> true
true || false ==> true
false || true ==> true
true || false ==> true
false || false ==> false
 */

        /*
                Beauty of if-else-if-statement
                After finding true Java does not check the other conditions
         */








    }
}
