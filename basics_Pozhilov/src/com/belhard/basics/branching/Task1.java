package com.belhard.basics.branching;

import java.util.Scanner;

public class Task1 {
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

        Variables.a = getUserInput(scanner, "Enter a: ");
        Variables.b = getUserInput(scanner, "Enter b: ");
        Variables.c = getUserInput(scanner, "Enter c: ");
        Variables.d = getUserInput(scanner, "Enter d: ");

        System.out.println("a = " + Variables.a);
        System.out.println("b = " + Variables.b);
        System.out.println("c = " + Variables.c);
        System.out.println("d = " + Variables.d);

        return out;
    }

    public static double solveTask(double a, double b, double c, double d) {
        double firstMin;

        if (a == b) {
            System.out.println("The values of a and b are equal");
            firstMin = a;
        } else if (a > b) {
            firstMin = b;
        } else {
            firstMin = a;
        }
        System.out.println("firstMin = " + firstMin);

        double secondMin;

        if (c == d) {
            System.out.println("The values of c and d are equal");
            secondMin = c;
        } else if (c > d) {
            secondMin = d;
        } else {
            secondMin = c;
        }
        System.out.println("secondMin = " + secondMin);

        double max = 0;

        if (firstMin == secondMin) {
            System.out.println("Error the values of min1 and min2 are equal");
            throw new RuntimeException();
        }

        if (firstMin > secondMin) {
            max = firstMin;
        } else {
            max = secondMin;
        }
        System.out.println("max = " + max);

        return max;
    }

    public static void main(String[] args) {
        System.out.println("max{min(a, b), min(c, d)}");
        getUserInput();
        solveTask(Variables.a, Variables.b, Variables.c, Variables.d);
    }
}
