package day33lambda;

import day32lambda.UtilsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class LambdaString01 {
    public static void main(String[] args) {

        List<String> l=new ArrayList<>();
        l.add("Tom");
        l.add("Alley");
        l.add("Mark");
        l.add("Amanda");
        l.add("Jackson");
        l.add("Marry");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Ben");

        printAllUppercase(l);
        printElementSortedByLength(l);
        printElementsInReverseOrderSortedByLength(l);
        printDistinctEleSortedByLastChar(l);
        printEleSortedByLengthThenSortedByInitials(l);
        removeIfTheLengthGreaterThanFive(l);
        RemoveIfStartsWithAOrEndsWithO01(l);
        removeIfLengthIsBetweenFiveAndTenOrEndingWithO(l);
        System.out.println(checkLengthToBeLessThanTwelve(l));
        System.out.println(checkAnyNotToStartWithX(l));
        System.out.println(checkAnyEleEndingWithR(l));
    }

    //1) Create a method to print all list elements in uppercase
    //1.Way
    public static void printAllUppercase(List<String> list){
        System.out.println("===printAllUppercase===");
        list.stream().map(String::toUpperCase).forEach(UtilsClass::printInTheSameLineWithASpace);

        System.out.println("\n ===2.Way===");
        list.replaceAll(String::toUpperCase);
        System.out.println(list);
    }

    //2) Create a method to print the elements after ordering according to their lengths
    public static void printElementSortedByLength(List<String> list){
        System.out.println("===printElementSortedByLength===");
        list.stream().sorted(Comparator.comparingInt(String::length)).forEach(UtilsClass::printInTheSameLineWithASpace);
        System.out.println("\n ===2.way===");
        list.sort(Comparator.comparingInt(String::length));
        System.out.println(list);
    }

    //3)Create a method to print the elements after ordering according to their lengths (In reverse order)
    public static void printElementsInReverseOrderSortedByLength(List<String> list){
        System.out.println("printElementsInReverseOrderSortedByLength");
        list.stream().sorted(Comparator.comparingInt(String::length).reversed()).forEach(UtilsClass::printInTheSameLineWithASpace);

    }

    //4) Create a method to sort the distinct elements by using their last character

    public static void printDistinctEleSortedByLastChar(List<String> list){
        System.out.println("\n ===printDistinctEleSortedByLastChar===");
        list.stream().distinct().sorted(Comparator.comparing(UtilsClass::getLastChar)).forEach(UtilsClass::printInTheSameLineWithASpace);

    }

    //5) Create a method to sort the elements according to their lengths then according to their first character.

    public static void printEleSortedByLengthThenSortedByInitials(List<String> list){
        System.out.println("\n ===printEleSortedByLengthThenSortedByInitials===");
        list.stream().sorted(Comparator.comparingInt(String::length).thenComparing((t-> t.charAt(0)))).
                        forEach(UtilsClass::printInTheSameLineWithASpace);
    }

    //6) Remove the elements if the length of the element is greater than 5

    public static void removeIfTheLengthGreaterThanFive(List<String> list){
        System.out.println("\n ===removeIfTheLengthGreaterThanFive===");
        list.removeIf(t-> t.length()>5);
        System.out.println(list);
    }

    // 7) Remove the elements if the element is starting with 'A', 'a' or ending with 'O' or 'o'.
    public static void RemoveIfStartsWithAOrEndsWithO01(List<String> list){
        System.out.println("===RemoveIfStartsWithAOrEndsWithO01===");
        list.removeIf(t-> t.startsWith("A")||t.startsWith("a")||t.endsWith("O")||t.endsWith("o"));
        System.out.println(list);

    }

    //8) Remove the elements if the element length is between 5 and 10 or ending with 'o'

    public static void removeIfLengthIsBetweenFiveAndTenOrEndingWithO(List<String> list){
        System.out.println("===removeIfLengthIsBetweenFiveAndTenOrEndingWithO===");
        list.removeIf(t-> t.length()>4 && t.length()<11 ||t.endsWith("o"));
        System.out.println(list);

        System.out.println("2.Way");
        Predicate<String> checkCondition= t-> (t.length()>4 && t.length()<11 ||t.endsWith("o"));
        list.removeIf(t-> checkCondition.test(t));
        System.out.println(list);

    }
    //9) Create a method to check if the lengths of all elements are less than 12

    public static boolean checkLengthToBeLessThanTwelve(List<String> list){
        System.out.println("===checkLengthToBeLessThanTwelve===");
        return list.stream().allMatch(t-> t.length()<12);
    }

    //10)Create a method to check if the initial of any element is not 'X'

    public static boolean checkAnyNotToStartWithX(List<String> list){
        System.out.println("===checkAnyNotToStartWithX===");
        return list.stream().noneMatch(t-> t.startsWith("X"));
    }

    //11) Create a method to check if at least one of the elements ending with "r"
    public static boolean checkAnyEleEndingWithR(List<String> list){
        System.out.println("===checkAnyEleEndingWithR===");
        return list.stream().anyMatch(t-> t.endsWith("r"));

    }
}
