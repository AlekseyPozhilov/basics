package com.belhard.basics.arrays.multidimentional;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task2 {
    private static class Variables {
        static int rows;
        static int columns;
        public static int num;
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

        System.out.println("Enter 1, if you want to display the matrix in ascending order");
        System.out.println("Enter 2, if you want to display the matrix in descending order");

        Variables.num = getUserInput(scanner, "Enter 1 or 2 = ");

        System.out.println("Aamount of rows = " + Variables.rows);
        System.out.println("Aamount of columns = " + Variables.columns);

        return out;
    }

    public static Integer[][] generateArray(int rows, int columns) {
        Integer[][] arr = new Integer[rows][columns];

        System.out.println("Your matrix: ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = (int) (Math.random() * 100);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

        return arr;
    }

    public static void solveTask(Integer[][] arr, int num) {
        switch (num) {
        case 1: {
            for (int i = 0; i < arr.length; i++) {
                Arrays.sort(arr[i]);
            }

            System.out.println("matrix in ascending order: ");

            printResult(arr);

            break;
        }
        case 2: {
            System.out.println("matrix in descending order: ");

            for (Integer[] temp : arr) {
                Arrays.sort(temp, Collections.reverseOrder());
            }

            printResult(arr);

            break;
        }
        default:
            throw new IllegalArgumentException("Invalid input ");
        }
    }

    public static void printResult(Integer[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        getUserInput();
        Integer[][] arr = generateArray(Variables.rows, Variables.columns);
        solveTask(arr, Variables.num);
    }
}
