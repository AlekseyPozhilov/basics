package com.belhard.basics.linear;

import java.util.Scanner;

public class Task5 {
    private static class Variables {
        static double x;
        static double y;
        static double denominator;
    }

    public static double getUserInput(Scanner scanner, String message) {
        System.out.print(message);
 
        double value;

        if (scanner.hasNextDouble()) {
            value = scanner.nextDouble();
        } else {
            System.out.println("Error, invalid input");
            throw new RuntimeException("invalid input: " + scanner.nextLine());
        }
        return value;
    }

    public static Variables getUserInput() {
        Scanner scanner = new Scanner(System.in);

        Variables out = new Variables();

        Variables.x = getUserInput(scanner, "Enter x: ");
        Variables.y = getUserInput(scanner, "Enter y: ");

        System.out.println("x = " + Variables.x);
        System.out.println("y = " + Variables.y);

        return out;
    }

    public static double solveTask(double x, double y) {
        double numerator = Math.sin(x) + Math.cos(x);
        double denominator = Math.cos(x) - Math.sin(y);
        double firstValue = numerator / denominator;
        double secondValue = Math.tan(x * y);
        double result = firstValue * secondValue;
        return result;
    }

    public static void exceptions(double denominator) {
        if (denominator == 0) {
            System.out.println("Error, no such value exists");
            throw new RuntimeException("invalid input: this value is not compatible");
        }
    }

    public static void printresult(double result) {
        System.out.println("result = " + result);
    }

    public static void main(String[] args) {
        getUserInput();
        double result = solveTask(Variables.x, Variables.y);
        exceptions(result);
        printresult(result);
    }
}
