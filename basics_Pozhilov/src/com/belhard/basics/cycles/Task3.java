package com.belhard.basics.cycles;

import java.util.Scanner;

public class Task3 {

    public static long getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter firstNum: ");

        long value;

        if (scanner.hasNextLong()) {
            value = scanner.nextLong();
        } else {
            System.out.println("Error, invalid input");
            throw new RuntimeException("invalid input: " + scanner.nextLine());
        }

        System.out.println("firstNum = " + value);
        return value;
    }

    public static long solvetask(long firstNum) {
        long secondNum = 0;
        secondNum = firstNum + 100;
        System.out.println("secondNum = " + secondNum);

        long sum = 0;

        for (long i = firstNum; i < firstNum + 100; i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    public static void printResult(long sum) {
        System.out.println("sum = " + sum);
    }

    public static void main(String[] args) {
        long secondNum = getUserInput();
        long result = solvetask(secondNum);
        printResult(result);

    }
}