package com.bridgelabz.javaprograms;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args)
    {

        //Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check for perfect number");
        int pNum = sc.nextInt();

        UtilityClass factor = new UtilityClass();
        factor.perfNumb(pNum);
    }
}
