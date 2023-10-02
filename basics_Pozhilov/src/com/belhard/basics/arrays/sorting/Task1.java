package com.belhard.basics.arrays.sorting;

import java.util.Scanner;

public class Task1 {
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
        int[] arr = new int[amountElements];

        for (int i = 0; i < amountElements; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }

        return arr;
    }

    public static void bubbleSort(int[] arr) {
        System.out.println("");

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public static void printResult(int[] arr) {
        System.out.println("New array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int amountElements = getUserInput();
        int[] arr = generateArray(amountElements);
        bubbleSort(arr);
        printResult(arr);
    }
}
