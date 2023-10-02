package com.belhard.basics.linear;

import java.util.Scanner;

public class Task1 {
    private static class Variables {
        static double a;
        static double b;
        static double c;
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

        Variables.a = getUserInput(scanner, "Enter a = ");
        Variables.b = getUserInput(scanner, "Enter b = ");
        Variables.c = getUserInput(scanner, "Enter c = ");

        return out;
    }

    public static double solveTask(double a, double b, double c) {
        double numerator = (a - 3) * b;
        double denominator = 2;
        double result = (numerator / denominator) + c;
        return result;
    }

    public static void printResult(double result) {
        System.out.print("z = " + result);
    }

    public static void main(String[] args) {
        getUserInput();
        double result = solveTask(Variables.a, Variables.b, Variables.c);
        printResult(result);
    }
}
