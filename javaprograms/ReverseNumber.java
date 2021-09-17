package com.bridgelabz.javaprograms;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int userNum = sc.nextInt();

        UtilityClass reverse = new UtilityClass();
        System.out.println(reverse.revNum(userNum));

    }
}
