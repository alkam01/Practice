package main.java;

import java.util.Arrays;

public class SumOfTwoArrayElements {
    public static void main(String[] args) {

        int[] array1 = {2,4,6,8,4,6};
        int[] array2 = {9,8,7,6,5,4};
        int size = array1.length;
        int[]array3 = new int[size];

        for (int i=0; i<array1.length;i++){
            array3[i] = array1[i]+array2[i];
        }
        System.out.println(Arrays.toString(array3));
    }
}
