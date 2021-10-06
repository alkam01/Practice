package main.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RepeatingNumbersInArray {
    public static void main(String[] args) {
        Integer[]array = {1,2,43,56,4,34,34,25,79,1,56,90,43,1,56,8,0,32,44,5,33};
        Set<Integer> set = new HashSet(Arrays.asList(array));

        for (int number:set){
            int count = 0;
            for (int j: array){
                if(number==j){
                    count++;
                }
            }
            if (count>0){
                System.out.println(number+" count = "+count);
            }
        }
    }
}
