package main.java;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        int i, j, row=6;
//outer loop for rows
        for(i=1; i<=row; i++)
        {
//inner loop for columns
            for(j=1; j<=i; j++)
            {
//prints stars
                System.out.print(i+" ");
            }
//throws the cursor in a new line after printing each line
            System.out.println();
        }
    }
}