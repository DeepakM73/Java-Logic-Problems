package com.bridgelabz.javaprograms;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int userNum = sc.nextInt();

        UtilityClass checkPrime = new UtilityClass();

        checkPrime.prime(userNum);
    }
}
