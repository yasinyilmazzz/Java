package day06Modulus;

import java.util.Scanner;

public class exercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //1.Example: Print the first and the last character of the given String on the console. "Java is easy" ==> Jy
        //1.way with char method
        String str = "Java is easy";
        char first = str.charAt(0);
        char sec = str.charAt(str.length()-1);
        System.out.println(first+sec);//195 Note: If you use "char" data type in a math operation,
                                        // Java uses ASCII values not the characters
        System.out.println(""+first+sec);//Note:When you put "" at the beginning
                                        // it will be concatenation operation, you will get String

        //2.way substring
        System.out.println(str.substring(0,1) + str.substring(str.length()-1));

        //value is "Java is Java" and print "a is j"
        String exp ="Java is Java";
        System.out.println(exp.substring(3,9));

        //2.Example: Print just the animal names from the String; "I like lion, horse, laptop and cat"
        String exp2 = "I like lion, horse, laptop and cat";
        String lion = exp2.substring(7,11);
        String horse= exp2.substring(13,18);
        String cat = exp2.substring(31);
        System.out.println(lion+horse+cat);

        //3.Example: Type code to get initials of the first name and the last name of a given name.
                    // Ali Can ==> AC, Mary Star ==> MS etc.
        String name1 = "Ali Can";
        String name2 = "Mary Star";
        System.out.println(name1.substring(0,1)+name1.split(" ")[1].substring(0,1));

        //4.Example: Type code to find the number of words in a String; "I like to move it, move it" ==> 7
        String word = "I like to move it, move it";
        System.out.println(word.split(" ").length);

        //Example 1: Type code to see the order number of the first occurrence of the character 'a'
        //            "I want to learn Java"
        String str33 = "I like to learn Java";
        int idx = str33.indexOf('a');//indexOf() method gives you the index of first occurrence of a specific character
        System.out.println(idx + 1);//13

        //Example 2: Type code to see the order number of the first occurrence of "Java"
        //            "I like to study Java, learn Java, earn money, Java is easy."

        String java = "I like to study Java, learn Java, earn money, Java is easy.";
        String javaWord=java.split(" ")[0];
        System.out.println(javaWord);// I

        int last= java.lastIndexOf("Java");
        System.out.println(last); //46

        //Example 5: Type code to check if a character is unique in a String or not
        //           "Hello" ==> H is unique, e is unique, o is unique

        String hello = "Hello";
        if (hello.indexOf("l")== hello.lastIndexOf("l")){
            System.out.println("unique");
        } else {
            System.out.println("not unique");
        }
        if (hello.contains("a")){
            System.out.println("contains a");
        }else {
            System.out.println("no a");
        }

        String deneme = "yasinyilmaz";
        //String yeni = deneme.replace("y","Y").substring(0);

        String yeni = deneme.substring(0,1).replace("y","Y");
        System.out.println(yeni.substring(0));






    }
}
