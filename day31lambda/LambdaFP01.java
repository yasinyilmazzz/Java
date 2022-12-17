package day31lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaFP01 {

    /*
    The Lambda expression is used to provide the implementation of an interface which has functional interface.
    It saves a lot of code. In case of lambda expression, we don't need to define the method again for providing
     the implementation.
     A lambda expression is a short block of code which takes in parameters and returns a value.
     Lambda expressions are similar to methods, but they do not need a name and they can be implemented
     right in the body of a method.
     functional programming is called lambda . To type codes in functional programming is shorter and it is error free.
     In functional programming, we use the methods that were created by Java.
     The usage of structured programing is a longer way to type codes in Java.
     For ex; substring() is created by Java it is error free bec it was created by Java which means that it was tested
     thousands of times before it was deployed. Functioanl programming can be used for arrays, collections and maps
     but we cannot use maps directly in functional programmine directly. At the beginnig we should convert a map to a
     collection and then we can use maps for functional programming as weel ==>How to convert a map into a collection??

      by using entryset() we can convert a map into a set and set is collection then you can use Collections in functional programming.


     */

    public static void main(String[] args) {

        List<Integer> l=new ArrayList<>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);

        printElements(l);
        System.out.println();
        printsElementsFunctional(l);
        System.out.println();
        evenElements(l);
        squareOfOddElement(l);
        cubeOfOddElements(l);
        squareOfDistinctElements(l);
        productOfCubesOfDistinctEvenElement(l);
        getMaximumElement(l);

    }
    //1-Create a method to print the elements on the console in the same line with a space
    //between two consecutive elements.(Structured P.)

    public static void printElements(List<Integer> list){
        for (Integer w: list){
            System.out.print(w+" ");
        }
    }
    public static void printsElementsFunctional(List<Integer> list){
        list.stream().forEach(t-> System.out.print(t +" "));
    }

    //create a method to print the even elements in the list on the console in the same line with a space
    public  static void evenElements(List<Integer> list){
        System.out.print("Structure method :");
        for (int w:list){
            if(w%2==0){
                System.out.print(w + " ");
            }
        }
        System.out.println();
        System.out.print("Functional method: ");
        list.stream().filter(t-> t%2==0).forEach(t-> System.out.print(t+" "));
    }
    //create a method to print the square of odd list elements on console in the same line

    public static void squareOfOddElement(List<Integer> list){
        System.out.println();
        System.out.print("square of odd elements: ");
        list.stream().filter(t-> t%2!=0).map(t-> t*t).forEach(t-> System.out.print(t+" "));
    }

    //create a method to print the cube of distinct odd list elements om the console
    public  static void cubeOfOddElements(List<Integer> list){
        System.out.println();
        list.stream().distinct().filter(t-> t%2!=0).map(t-> t*t*t).forEach(t-> System.out.print(t+" "));
    }

    //create a method to calculate the sum of the squares of distinct even elements

    public static void squareOfDistinctElements(List<Integer> list){
        System.out.println("***");
        Integer sum= list.stream().distinct().filter(t-> t%2==0).map(t->t*t).reduce(0,(t,u)-> t+u);
        //0 stands for sum container; t and u the values that Java will add(square of the unique even numbers)
        // reduce() method will take the all squares and reduce them into a one single sum value
        System.out.println(sum);
    }
    //create a method to calculate the product of the cubes of distinct even elements
    public  static void productOfCubesOfDistinctEvenElement(List<Integer> list){
        Integer sum=list.stream().distinct().filter(t-> t%2==0).map(t-> t*t*t).reduce(1,(t,u)->t*u);
        System.out.println(sum);
    }
    //create a method to find the maximum value from the list elements
    public static void getMaximumElement(List<Integer> list){
        Integer maxValue=list.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)-> t>u ? t : u);
        Integer maxValueWay2=list.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(t,u)-> u);
        //Java will take the elements one by one with the help of stream() method
        //And then eliminate repeated ones the help of distinct() method
        //And then compare the elements with the Min Integer Value with the help of Integer Wrapper Class Min_Value() method
        //And then return  the greater value with the help of Ternary Structure
        System.out.println("1.way: "+maxValue);
        System.out.println("2.way: "+maxValueWay2);
    }

    //Homework: Find minimum value




}
