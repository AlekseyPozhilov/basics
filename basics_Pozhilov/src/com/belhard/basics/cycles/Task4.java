package com.belhard.basics.cycles;

import java.util.Scanner;

public class Task4 {
    
    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number from 33 to 127: ");

        int value;

        if (scanner.hasNextInt()) {
            value = scanner.nextInt();
        } else {
            System.out.println("Error, invalid input");
            throw new RuntimeException("invalid input: " + scanner.nextLine());
        }
        return value;
    }
    
    public static void printResult(int num) {
        System.out.println("Your number = " + num + "->" + (char)num);
    }
    
    public static void main(String[] args) {
        int num = getUserInput();
        printResult(num);
    }
}

