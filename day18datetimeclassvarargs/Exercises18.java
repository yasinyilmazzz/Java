package day18datetimeclassvarargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercises18 {
    public static void main(String[] args) {
//        Find the closest 2 integers in an Integer List
//        Example: (12, 31, 15, 13, 54) ==> Output is 12 and 13
        List<Integer> h = Arrays.asList(12, 31, 15, 13, 54);

        Collections.sort(h);
        int minDef=Integer.MAX_VALUE;

        for (int i=1;i<h.size();i++){
            if (h.get(i)-h.get(i-1)<minDef){
                minDef=h.get(i)-h.get(i-1);
            }
        }
        for (int i=1;i<h.size();i++){
            if (h.get(i)-h.get(i-1)==minDef){
                System.out.println("the closest 2 integers are: "+ h.get(i)+" and "+h.get(i-1));
            }
        }

//        Find the sum of all prices given in a String list
//        Example: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04

        List<String> prizes=Arrays.asList("$12.99", "$23.60", "$54.45");

        double sum=0;
        List<Double> prizesDouble=new ArrayList<>();
        for (String w:prizes){
            Double title= Double.valueOf(w.replace("$",""));
            sum=sum+title;
            prizesDouble.add(title);
        }
        System.out.println(prizesDouble+" = "+sum);


//        Find the sum of the least and the greatest price given in a String list
//        Example: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70

        List<String> arr= Arrays.asList("$12.99", "$8.25", "$23.60", "$54.45");
        List<Double> brr= new ArrayList<>();
        for (String w: arr){
            brr.add(Double.valueOf(w.replace("$","")));
        }
        Collections.sort(brr);
        System.out.println(brr.get(0)+ brr.get(brr.size()-1));

//        Check if all elements are unique in an integer List by using loops.
                List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(15);
        myList.add(23);


        for (int w:myList){
            for (int i=1;i< myList.size();i++){
                if (w== myList.get(i)){
                    System.out.println("all element are not unique");
                }
                break;
            }
        }






























    }}