package com.belhard.basics.arrays.multidimentional;

import java.util.Scanner;

public class Task1 {
    private static class Variables {
        static int rows;
        static int columns;
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

        Variables.rows = getUserInput(scanner, "Enter amount of rows = ");
        Variables.columns = getUserInput(scanner, "Enter amount of columns = ");

        System.out.println("Aamount of rows = " + Variables.rows);
        System.out.println("Aamount of columns = " + Variables.columns);

        return out;
    }

    public static int[][] generateArray(int rows, int columns) {
        int[][] nums = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                nums[i][j] = (int) (Math.random() * 100);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println("");
        }

        return nums;
    }

    public static void main(String[] args) {
        getUserInput();
        generateArray(Variables.rows, Variables.columns);
    }
}
