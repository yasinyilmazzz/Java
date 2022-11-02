package day13arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //Example 3: Count the number of words starts with "a" in the String

        System.out.println("Enter a sentence...");
        String str = input.nextLine();
        int counter=0;

        String arr[]=str.split(" ");
        for (String w:arr){
            if (w.startsWith("a")){
                counter++;
            }
        }
        System.out.println(counter + " words start with 'a' ");

        String arr2[]=str.split(" ");
        Arrays.sort(arr2, Comparator.comparingInt(String::length));




























    }
}
