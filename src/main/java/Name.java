package main.java;

import java.util.Scanner;

class Name {

    static void printInitials(String name)
    {
        if (name.length() == 0)
            return;

        System.out.print(Character.toUpperCase(
                name.charAt(0)));

        for (int i = 1; i < name.length() - 1; i++)
            if (name.charAt(i) == ' ')
                System.out.print(" " + Character.toUpperCase(
                        name.charAt(i + 1)));
    }

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("full name please: ");
        String name  = scanner.nextLine();
        printInitials(name);
    }
}