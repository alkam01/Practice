package main.java;

import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        input.nextLine();
        System.out.println("Enter Divider: ");
        int b = input.nextInt();
        int remainder = a-b*(a/b);
        System.out.println("Remainder is: "+remainder);

    }
}

