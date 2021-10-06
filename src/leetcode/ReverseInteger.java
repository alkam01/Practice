package leetcode;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer: ");
        int x = input.nextInt();
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7))
                System.out.println("over the limit");
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8))
                System.out.println("over the limit");
            rev = rev * 10 + pop;
        }
        System.out.println(rev);
    }
}
