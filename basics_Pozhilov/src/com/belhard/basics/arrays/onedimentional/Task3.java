package com.belhard.basics.arrays.onedimentional;

import java.util.Scanner;

public class Task3 {
    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of array elements: ");

        int value;

        if (scanner.hasNextInt()) {
            value = scanner.nextInt();
        } else {
            System.out.print("Error, invalid input");
            throw new RuntimeException("invalid input: " + scanner.nextLine());
        }

        return value;
    }

    public static int[] generateArray(int amountElements) {
        int[] nums = new int[amountElements];

        for (int i = 0; i < amountElements; i++) {
            nums[i] = (int) (Math.random() * 100);
            System.out.print(nums[i] + " ");
        }

        return nums;
    }

    public static int solveTask(int[] nums, int amountElements) {
        int min = nums[0];

        for (int i = 0; i < amountElements; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        
        return min;
    }

    public static void printResult(int[] nums, int amountElements, int min) {
        System.out.println("");
        System.out.println("Min = " + min);
        System.out.println("New array: ");
        
        for (int i = 0; i < amountElements; i++) {
            
            if (nums[i] == min) {
                continue;
            }
            System.out.print(nums[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        int amountElements = getUserInput();
        int[] nums = generateArray(amountElements);
        int min = solveTask(nums, amountElements);
        printResult(nums, amountElements, min);
    }
}
