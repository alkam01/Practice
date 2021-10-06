package main.java;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzbuzz1(100);
    }

    private static void fizzbuzz(int border) {
        for (int i=1;i<border;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
                continue;
            }
            if(i%3==0){
                System.out.println("Fizz");
                continue;
            }
            if (i%5==0){
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);
        }
    }
    private static void fizzbuzz1(int border) {
        for (int i=1;i<border;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            } else if(i%3==0){
                System.out.println("Fizz");
            } else if (i%5==0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
