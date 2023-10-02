package com.belhard.basics.linear;

import java.util.Scanner;
import java.lang.Math;

public class Task4 {
    private static class Variables {
        static double a;
        static double b;
        static double c;
        static double d;
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
        Variables.d = getUserInput(scanner, "Enter d = ");

        System.out.println("a = " + Variables.a);
        System.out.println("b = " + Variables.b);
        System.out.println("c = " + Variables.c);
        System.out.println("d = " + Variables.d);
        return out;
    }

    public static double solveTask(double a, double b, double c, double d) {
        double numerator = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c));
        double denominator = 2 * a;
        double firstValue = numerator / denominator;
        double secondValue = Math.pow(a, 3) * c;
        double thirdValuer3 = Math.pow(b, -2);
        double result = firstValue - secondValue + thirdValuer3;
        return result;
    }

    public static void exceptions(double a) {
        if (a == 0) {
            System.out.println("Error, this value is not compatible");
            throw new RuntimeException("invalid input: this value is not compatible");
        }
    }

    public static void printresult(double result) {
        System.out.println("result = " + result);
    }

    public static void main(String[] args) {
        getUserInput();
        double result = solveTask(Variables.a, Variables.b, Variables.c, Variables.d);
        exceptions(Variables.a);
        printresult(result);
    }
}
