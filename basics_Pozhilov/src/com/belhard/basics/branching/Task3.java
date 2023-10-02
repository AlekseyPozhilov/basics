package com.belhard.basics.branching;

import java.util.Scanner;

public class Task3 {
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

        System.out.println("a = " + Variables.a);
        System.out.println("b = " + Variables.b);

        return out;
    }

    public static double solveTask(double a, double b) {
        double c;

        c = 180 - a - b;
        System.out.println("c = " + c);

        if (c > 0) {
            System.out.println("triangle exists");
            if (a == 90 || b == 90 || c == 90) {
                System.out.println("right triangle");
            } else {
                System.out.println("not a right triangle");
            }
        } else {
            System.out.println("triangle doesn't exists");
        }

        return c;
    }

    public static void Exceptions(double a, double b, double c) {
        if (a >= 180 || b >= 180 || c >= 180) {
            System.out.println("Error, there cannot be such values");
            throw new RuntimeException("invalid input: there cannot be such values");
        }

        if (a <= 0.0 || b <= 0.0 || c < 0.0) {
            System.out.println("Error, there cannot be such values");
            throw new RuntimeException("invalid input: there cannot be such values");
        }
    }

    public static void main(String[] args) {
        getUserInput();
        solveTask(Variables.a, Variables.b);
        Exceptions(Variables.a, Variables.b, Variables.c);

    }
}

