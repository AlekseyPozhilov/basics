package com.belhard.basics.util;

import java.util.Scanner;

public class Util {
    public static String getFirstNameOfStudent(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        String firstName;
        if (scanner.hasNextLine()) {
            firstName = scanner.nextLine();
        } else {
            System.out.println("Invalid input. Try again.");
            throw new RuntimeException("Invalid Input: " + scanner.nextLine());
        }
        return firstName;
    }

    public static String getLastNameOfStudent(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        String lastName;
        if (scanner.hasNextLine()) {
            lastName = scanner.nextLine();
        } else {
            System.out.println("Invalid input. Try again.");
            throw new RuntimeException("Invalid Input: " + scanner.nextLine());
        }
        return lastName;
    }

    public static int getUserInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);

        int value;

        if (scanner.hasNextInt()) {
            value = scanner.nextInt();
        } else {
            System.out.print("Error, invalid input");
            throw new RuntimeException("invalid input: " + scanner.nextLine());
        }

        return value;
    }

    public static double getUserDoubleInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);

        double value;

        if (scanner.hasNextDouble()) {
            value = scanner.nextDouble();
        } else {
            System.out.print("Error, invalid input");
            throw new RuntimeException("invalid input: " + scanner.nextLine());
        }

        return value;
    }

    public static long getUserLongInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);

        long value;

        if (scanner.hasNextLong()) {
            value = scanner.nextLong();
        } else {
            System.out.print("Error, invalid input");
            throw new RuntimeException("invalid input: " + scanner.nextLine());
        }

        return value;
    }

    public static String formattedDateOfBirth(int dayOfBirth, int monthOfBirth) {
        String formattedDayOfBirth;
        if (dayOfBirth < 10) {
            formattedDayOfBirth = "0" + dayOfBirth;
        } else {
            formattedDayOfBirth = dayOfBirth + "";
        }

        String formattedMonthOfBirth;
        if (monthOfBirth < 10) {
            formattedMonthOfBirth = "0" + monthOfBirth;
        } else {
            formattedMonthOfBirth = monthOfBirth + "";
        }

        String result = formattedDayOfBirth + "." + formattedMonthOfBirth + ".";
        return result;
    }

    public static void checkingDateOfBirth(int dayOfBirth, int monthOfBirth, int yearOfBirth) {
        if (dayOfBirth > 31 || dayOfBirth <= 0) {
            throw new RuntimeException("Invalid Input");
        }

        if (monthOfBirth > 12 || monthOfBirth <= 0) {
            throw new RuntimeException("Invalid Input");
        }

        if (yearOfBirth > 2010 || yearOfBirth < 1900) {
            throw new RuntimeException("Invalid Input");
        }
    }

    public static void checkingGroupNumber(int groupNumber) {
        if (groupNumber <= 0) {
            throw new RuntimeException("Invalid input");
        }
    }

    public static void checkingGPA(double gpa) {
        if (gpa > 10 || gpa <= 0) {
            throw new RuntimeException("Invalid input");
        }
    }

    public static void checkingID(long id) {
        if (id < 0) {
            throw new RuntimeException("Invalid input");
        }
    }

    public static void checkingAge(int age) {
        if (age < 0 || age > 120) {
            throw new RuntimeException("Invalid input");
        }
    }

    public static void printResult(int dayOfBirth, int monthOfBirth, int yearOfBirth, int groupNumber, double gpa,
            long id) {
        System.out.println("");
        System.out.println("Student information");

        System.out.println("Student First Name: ");
        System.out.println("Student Second Name: ");

        System.out.println("Faculty: ");

        String result = Util.formattedDateOfBirth(dayOfBirth, monthOfBirth);
        System.out.println("Date of birth: " + result + yearOfBirth);

        System.out.println("Student gpa: " + gpa);

        System.out.println("Student id: " + id);
    }
}
