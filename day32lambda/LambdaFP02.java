package day32lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaFP02 {
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

        minimumValueGreaterSeven(l);
        getHalfAndReverse(l);
    }
    //create a method to find minimum value which means greater than seven and even elements from the list.

    public static void minimumValueGreaterSeven(List<Integer> list){
        Integer min=list.stream().distinct().filter(t-> t%2==0).filter(t-> t>7).sorted().findFirst().get();
        System.out.println(min);
    }

    //Create a method to find the half of the elements which are distinct and greater tan 5 in reverse order

    public static void getHalfAndReverse(List<Integer> list){
        List<Double> getHalfReversed=list.stream().
                                        distinct().
                                        filter(t-> t>5).
                                        map(t-> t/2.0).
                                        sorted(Comparator.reverseOrder()).
                                        collect(Collectors.toList());
        System.out.println(getHalfReversed);
    }








}
