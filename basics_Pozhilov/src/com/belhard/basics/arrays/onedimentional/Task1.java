package com.belhard.basics.arrays.onedimentional;

import java.util.Scanner;

public class Task1 {
    private static class Variables {
        static int amountElements;
        static int krat;
    }

    public static int getUserInput(Scanner scanner, String message) {
        System.out.print(message);

        int value;

        if (scanner.hasNextInt()) {
            value = scanner.nextInt();
        } else {
            System.out.println("Error, invalid input");
            throw new RuntimeException("invalid input: " + scanner.nextLine());
        }
        return value;
    }

    public static Variables getUserInput() {
        Scanner scanner = new Scanner(System.in);

        Variables out = new Variables();

        Variables.amountElements = getUserInput(scanner, "Enter amount of elements = ");
        Variables.krat = getUserInput(scanner, "Enter k = ");
        
        System.out.println("Aamount of elements = " + Variables.amountElements);
        System.out.println("krat = " + Variables.krat);

        return out;
    }

    public static int[] generateArray(int amountElements) {
        int[] nums = new int[amountElements];

        for (int i = 0; i < amountElements; i++) {
            nums[i] = (int) (Math.random() * 100);
            System.out.print(nums[i] + " ");
        }

        return nums;
    }

    public static int solveTask(int krat, int[] nums, int amountElements) {
        int sum = 0;

        for (int i = 0; i < amountElements; i++) {
            if (nums[i] % krat == 0) {
                sum += nums[i];
            }
        }
        
        return sum;
    }

    public static void printRerult(int sum) {
        System.out.println("");
        System.out.println("Sum = " + sum);
    }
    
    public static void main(String[] args) {
        getUserInput();
        int[] nums = generateArray(Variables.amountElements);
        int result = solveTask(Variables.krat, nums, Variables.amountElements);
        printRerult(result);
    }
}
