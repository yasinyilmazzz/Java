package day13arrays;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {

        //arraycopy(Object src, int srcPos, Object dest, int destPos, int length)


        int[] n1 = {2, 3, 12, 4, 12, -2};

        int[] n2 = new int[n1.length];

        int[] n3 = new int[5];



        System.arraycopy(n1, 0, n2, 0, n1.length);      // copying elements from index 2 on n1 array
        System.out.println("n2 = " + Arrays.toString(n2));



        System.arraycopy(n1, 2, n3, 1, 2);          // copying element to index 1 of n3 array
        System.out.println("n3 = " + Arrays.toString(n3));
        //in this way, taking elements after 2. index of n1 and putting first two elements of them after 1. index of n3

    }
}
