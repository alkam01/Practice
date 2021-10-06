package main.java;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int i = 1223221;
        int v = 0,remainder;
        while(i!=0){
            remainder = i%10;
            v = v*10+remainder;
            i/=10;
        }
        if(i==0 || i==v){
            System.out.println("+");
        }
        else{
            System.out.println("-");
        }

    }
}