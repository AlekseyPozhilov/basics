package com.belhard.basics.cycles;

import java.util.Scanner;

public class Task2 {
    private static class Variables {
        static double a;
        static double b;
        static double h;
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
        Variables.h = getUserInput(scanner, "Enter h = ");

        System.out.println("a = " + Variables.a);
        System.out.println("b = " + Variables.b);
        System.out.println("h = " + Variables.h);

        return out;
    }

    public static double solveTask(double a, double b, double h) {
        double y = 0;

        for (double i = a; i <= b; i += h) {
            if (i > 2) {
                y = i + 4;
                System.out.println(" y = i + 4");
            } else {
                y = -i * 2;
                System.out.println("y = -i * 2");
            }
            
            System.out.println("result: y = " + y);
        }
        return y;
    }

    public static void main(String[] args) {
        getUserInput();
        double result = solveTask(Variables.a, Variables.b, Variables.h);
    }
}
