package com.belhard.basics.linear;

import java.util.Scanner;

public class Task2 {
    public static double getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter value: ");
        
        double value;

        if (scanner.hasNextDouble()) {
            value = scanner.nextDouble();
        } else {
            System.out.println("Error, invalid input");
            throw new RuntimeException("invalid input: " + scanner.nextLine());
        }
        
        System.out.println("Your value = " + value);
        return value;
    }

    public static double solveTask(double input) {
        int integerPart = (int) input;
        double fractionalPart = input % integerPart;
        double result = (fractionalPart * 1000) + ((input - (fractionalPart)) / 1000);
        return result;
    }

    public static void printResult(double result) {
        System.out.print("result = " + result);
    }

    public static void main(String[] args) {
        double input = getUserInput();
        double result = solveTask(input);
        printResult(result);
    }
}
