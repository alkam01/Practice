package main.java;

public class PrimeNumber {
    public static void main(String[] args) {
        primeNumbers(100);
    }

    private static boolean isPrime(int number) {
        for (int i = 2;i<number-1;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }

    private static void primeNumbers(int border) {
        for (int i= 2; i< border;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}