package main.java;

import java.util.Random;

public class Dices {
    public static void main(String[] args) {
        int dicesNumber = 5;
        int[]dices = new int[dicesNumber];
        dices = throwDices(dicesNumber);
        int moves = calculate(dices);
        System.out.println("Moves = "+moves);
    }

    private static int calculate(int[] dices) {
        int moves = 0;
        for (int dice : dices) {
            if (dice == 1) {
                moves += 2;
                continue;
            }
            if (dice != 6) {
                moves++;
            }
        }
        return moves;
    }

    private static int[] throwDices(int dicesNumber) {
        int[]dices = new int[dicesNumber];
        Random random = new Random();
        for (int i=0;i<dicesNumber;i++){
            dices[i]=random.nextInt(6)+1;
            System.out.println(dices[i]);
        }
        return dices;
    }
}