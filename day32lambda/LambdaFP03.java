package day32lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaFP03 {
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
        evenElements(l);
        squareOfOddElement(l);
        cubeOfOddElements(l);
        squareOfDistinctElements(l);
        productOfCubesOfDistinctEvenElement(l);
        getMaximumElement(l);
        minimumValueGreaterSeven(l);
        getHalfAndReverse(l);
        getHalfAndReverse(l);
    }

    //Create a method to print the elements on the console in the same line with a space
    //between two consecutive elements.(Structured P.)

    public static void printElements(List<Integer> list){
        System.out.println("\n ===print the elements===");
        list.stream().forEach(System.out::println);
        //2.Way
        System.out.println("\n 2.Way");
        list.stream().forEach(UtilsClass::printInTheSameLineWithASpace);
        //create own method to print elements
    }

    //create a method to print the even elements in the list on the console in the same line with a space
    public  static void evenElements(List<Integer> list){
        System.out.println("\n ===even elements====");
        list.stream().filter(t-> t%2==0).forEach(UtilsClass::printInTheSameLineWithASpace);
        //2.Way
        System.out.println("\n 2.Way");
        list.stream().filter(UtilsClass::checkToBeEven).forEach(UtilsClass::printInTheSameLineWithASpace);
        //in 2. way we create own method to filter even numbers and use already created print method
    }

    //create a method to print the square of odd list elements on console in the same line
    public static void squareOfOddElement(List<Integer> list){
        System.out.println("\n ===Square of elements====");
        list.stream().filter(t-> t%2!=0 ).map(t-> t*t).forEach(t-> System.out.print(t+" "));
        //2.Way
        System.out.println("\n 2.Way");
        list.stream().filter(UtilsClass::checkToBeOdd).map(UtilsClass::getSquare).forEach(UtilsClass::printInTheSameLineWithASpace);
    }

    //create a method to print the cube of distinct odd list elements om the console
    public  static void cubeOfOddElements(List<Integer> list){
        System.out.println("\n ===cube of elements====");
        list.stream().distinct().filter(t-> t%2!=0).map(t-> t*t*t).forEach(t-> System.out.print(t+" "));
        System.out.println("\n 2.way");
        list.stream().distinct().filter(UtilsClass::checkToBeOdd).map(UtilsClass::getCube).forEach(UtilsClass::printInTheSameLineWithASpace);
    }

    //create a method to calculate the sum of the squares of distinct even elements

    public static void squareOfDistinctElements(List<Integer> list){
        System.out.println("\n sum of square");
       int sum1= list.stream().distinct().filter(UtilsClass::checkToBeEven).map(UtilsClass::getSquare).reduce(0,Math::addExact);
        System.out.println(sum1);
        System.out.println("2.way");
        Integer sum2= list.stream().distinct().filter(UtilsClass::checkToBeEven).map(UtilsClass::getSquare).reduce(0,Integer::sum);
        System.out.println(sum2);
    }

    //create a method to calculate the product of the cubes of distinct even elements
    public  static void productOfCubesOfDistinctEvenElement(List<Integer> list){
        System.out.println("product of the cubes");
        Integer product=list.stream().distinct().filter(UtilsClass::checkToBeEven).map(UtilsClass::getCube).reduce(1,Math::multiplyExact);
        System.out.println(product);
    }

    //create a method to find the maximum value from the list elements
    public static void getMaximumElement(List<Integer> list){
        System.out.println("maximum value");
        Integer max=list.stream().distinct().reduce(Integer.MIN_VALUE,Math::max);
        System.out.println(max);
    }

    //create a method to find minimum value which means greater than seven and even elements from the list.

    public static void minimumValueGreaterSeven(List<Integer> list){
        System.out.println("greater than 7");
        Integer min= list.stream().distinct().filter(UtilsClass::checkToBeEven).filter(t-> t>7).reduce(Integer.MAX_VALUE,Math::min);
        System.out.println(min);
    }

    //Create a method to find the half of the elements which are distinct and greater tan 5 in reverse order

    public static void getHalfAndReverse(List<Integer> list){
        List<Double> reverseList=list.stream().
                                    distinct().
                                    filter(t-> t>5).
                                    map(UtilsClass::getHalf).
                                    sorted(Comparator.reverseOrder()).
                                    collect(Collectors.toList());
        System.out.println(reverseList);
    }

}


