package com.belhard.basics.linear;

import java.util.Scanner;;

public class Task3 {

    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the elapsed time in seconds: ");

        int value;

        if (scanner.hasNextInt()) {
            value = scanner.nextInt();
        } else {
            System.out.println("Error, invalid input");
            throw new RuntimeException("invalid input: " + scanner.nextLine());
        }

        System.out.println("Elapsed time in seconds: = " + value);
        return value;
    }

    public static String solveTask(int totalSeconds) {
        int hours = totalSeconds / 3600;
        int min = totalSeconds / 60 % 60;
        int seconds = totalSeconds % 60;

        String formattedHours;
        if (hours < 10) {
            formattedHours = "0" + hours;
        } else {
            formattedHours = hours + "";
        }

        String formattedMin;
        if (min < 10) {
            formattedMin = "0" + min;
        } else {
            formattedMin = min + "";
        }

        String formattedSeconds;
        if (seconds < 10) {
            formattedSeconds = "0" + seconds;
        } else {
            formattedSeconds = seconds + "";
        }

        String result = formattedHours + "h " + formattedMin + "min " + formattedSeconds + "s";
        return result;
    }

    public static void printResult(String result) {
        System.out.println(result);
    }

    public static void main(String[] args) {
        int totalSeconds = getUserInput();
        String result = solveTask(totalSeconds);
        printResult(result);
    }
}
