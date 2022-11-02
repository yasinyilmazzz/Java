package day13arrays;

import java.util.Arrays;

public class CopyingArraysSwallowCopy {
    public static void main(String[] args) {
        //copying Arrays

        int [] numbers = {1, 2, 3, 4, 5, 6};
        int [] copyArray =numbers;          // copying arrays

        System.out.println();
        numbers[0]=-1;  // changing orijinal array's first element

        System.out.println(Arrays.toString(copyArray)); // Although [1, 2, 3, 4, 5, 6] is the expectation,
                                                        //because of the shallow copy, output is [-1, 2, 3, 4, 5, 6]
        System.out.println(Arrays.toString(numbers));   // [-1, 2, 3, 4, 5, 6]

        //It's because both arrays refer to the same array object. This is because of the shallow copy.
    }
}
