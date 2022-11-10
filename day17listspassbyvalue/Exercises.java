package day17listspassbyvalue;

import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Exercises {
    public static void main(String[] args) {

        //Find the sum of the elements in the array { {1,2,3}, {4,5}, {6,7} } and return an array.
// For example; for { {1,2,3}, {4,5}, {6,7} } output will be {6, 9, 13}

//        int arr[][]={ {1,2,3}, {4,5}, {6,7} };
////
//        int brr[]=new int[arr.length];
//        for (int i=0; i< arr.length;i++){
//            int sum=0;
//            for (int h=0;h< arr[i].length;h++){
//                sum=sum+arr[i][h];
//            }brr[i]=sum;
//        }
//        System.out.println(Arrays.toString(brr));

//        int arr[][]={ {1,2,3}, {4,5}, {6,7} };
//        int sum=0;
//        int i=0;
//        int arr2[] = new int[arr.length];
//
//        for(int []w:arr) {
//            for(int m :w ) {
//                sum=sum+m;
//            }
//            arr2[i] = sum;
//            sum=0;
//            i++;
//        }
//        System.out.println(Arrays.toString(arr2));

        // 3) Find the sum of the elements whose indexes are same in the given two multi dimensional arrays
// arr1 = { {1,2}, {3,4,5}, {6} } and arr2 = { {7,8,9}, {10,11}, {12} }



        int arr1[][] = { {1,2}, {3,4,5}, {6} } ;
        int arr2[][] = { {7,8,9}, {10,11}, {12} };
        int arr3[] = new int[arr1.length];
        int sum = 0;
        for(int i=0; i<arr1.length; i++) {
            int minLength= Math.min(arr1[i].length, arr2[i].length);
            for(int j=0; j<minLength; j++) {
                sum+= arr1[i][j] + arr2[i][j];
            }   }      System.out.println(sum);

        String srr[] = {"Veli", "Michael", "Ali", "Maria"};
        Arrays.sort(srr,Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(srr));
































    }
}
