package day15multidimensionalarraylists;

import java.util.Arrays;

public class Exercises15 {
    public static void main(String[] args) {
        //2- Find the product of the last elements in the array elements of the
//given multi dimensional array { {1,2,3}, {4,5}, {6} }

        int[][] myArray = { {1,2,3}, {4,5}, {6} };
        int result=1;

        for ( int w[]:myArray){
            result=result*w[w.length-1];
            }
        System.out.println(result);














    }
}
