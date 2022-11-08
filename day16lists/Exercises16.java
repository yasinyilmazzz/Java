package day16lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercises16 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

//2- Find the product of the last elements in the array elements of the
//given multi dimensional array { {1,2,3}, {4,5}, {6} }



//       int[][] myArray = { {1,2,3}, {4,5}, {6} };
//
//       int result=1;
//
//       for(int w[] : myArray) {
//
//           for (int h : w) {
//
//               if (h == myArray[myArray.length-1][0]) {
//
//                   for (int i = 1; i <= h; i++) {
//
//                       result = result * i;
//                   }
//               }
//           }
//       }
//        System.out.println("the product of the last elements: " + result);

//        6) If a list has 15 or 13, remove them.
//                Example: (10, 31, 15, 13, 54) ==> Output is (10, 31, 54)
//        List<Integer> h = new ArrayList<>();
//        h.add(10);
//        h.add(31);
//        h.add(15);
//        h.add(13);
//        h.add(54);
//        h.add(13);
//
//        if (!h.contains(13)||!h.contains(15)){
//            System.out.println("does not contains");
//        }else {
//            List<Integer> sub=new ArrayList<>();
//
//            for (int w=0;w<h.size();w++){
//                if (h.get(w)==13||h.get(w)==15){
//                    sub.add(h.get(w));
//                }
//                h.removeAll(sub);
//            }System.out.println(h);
//        }

//        8) Increase the value of every element except 7 and 10 by 2 in a List
//        Example: (12, 31, 7, 13, 10) ==> Output is (14, 33, 7, 15, 10

        List<Integer> h = new ArrayList<>();
        h.add(12);
        h.add(31);
        h.add(7);
        h.add(13);
        h.add(10);

        for (int w:h){
            if (w==7||w==10){
                continue;
            }
            h.set(h.indexOf(w),w+2);
        }
        System.out.println(h);


















    }
}
