package com.belhard.basics.branching;

import java.util.Scanner;

public class Task2 {
    public static double getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");

        double value;

        if (scanner.hasNextDouble()) {
            value = scanner.nextDouble();
        } else {
            System.out.println("Error, invalid input");
            throw new RuntimeException("invalid input: " + scanner.nextLine());
        }
        System.out.println("x = " + value);
        return value;
    }

    public static double solveTask(double x) {
        double denominator = Math.pow(x, 3) + 6;
        double result;

        if (x <= 3) {
            System.out.println("y = x^2-3x+9");
            result = Math.pow(x, 2) - 3 * x + 9;
        } else {
            System.out.println("y = 1/(x^3+6)");
            result = 1 / denominator;
        }
        return result;
    }

    public static void exceptions(double denominator) {
        if (denominator == 0) {
            System.out.println("Error, this value is not compatible");
            throw new RuntimeException("invalid input: this value is not compatible");
        }
    }

    public static void printResult(double result) {
        System.out.println("result: y = " + result);
    }

    public static void main(String[] args) {
        double x = getUserInput();;
        double result = solveTask(x);
        exceptions(result);
        printResult(result);
    }
}

