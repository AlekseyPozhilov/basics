package com.belhard.basics.arrays.onedimentional;

import java.util.Scanner;

public class Task2 {
    public static class Options {
        static int positiveValue;
        static int negativeValue;
        static int nullValue;
    }

    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount of elements: ");

        int value;

        if (scanner.hasNextInt()) {
            value = scanner.nextInt();
        } else {
            System.out.println("Error, invalid input");
            throw new RuntimeException("invalid input: " + scanner.nextLine());
        }

        System.out.println("Amount of elements = " + value);
        return value;
    }

    public static double[] generateArray(int amountElements) {
        double[] nums = new double[amountElements];

        for (int i = 0; i < amountElements; i++) {
            nums[i] = (double) (Math.random() * 100) - 50;
            System.out.print(nums[i] + " ");
        }
        
        System.out.println("");
        
        return nums;
    }

    public static Options solveTask(double[] nums, int amountElements) {
        Options outValues = new Options();

        Options.positiveValue = 0;
        Options.negativeValue = 0;
        Options.nullValue = 0;

        for (int i = 0; i < amountElements; i++) {
            if (nums[i] > 0) {
                Options.positiveValue++;
            } else if (nums[i] < 0) {
                Options.negativeValue++;
            } else {
                Options.nullValue++;
            }
        }
        return outValues;
    }

    public static void printResult() {
        System.out.println("positiveValues: " + Options.positiveValue);
        System.out.println("negativeValue: " + Options.negativeValue);
        System.out.println("nullValue: " + Options.nullValue);
    }

    public static void main(String[] args) {
        int amountElements = getUserInput();
        double[] nums = generateArray(amountElements);
        solveTask(nums, amountElements);
        printResult();
    }
}
