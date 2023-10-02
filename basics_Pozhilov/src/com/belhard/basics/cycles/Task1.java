package com.belhard.basics.cycles;

import java.util.Scanner;

public class Task1 {
    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");

        int value;

        if (scanner.hasNextInt()) {
            value = scanner.nextInt();
        } else {
            System.out.println("Error, invalid input");
            throw new RuntimeException("invalid input: " + scanner.nextLine());
        }
        System.out.println("n = " + value);
        return value;
    }

    public static int solveTask(int n) {
        int sum = 0;
        
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        
        return sum;
    }
    
    public static void checking(int n) {
        if (n < 0) {
            System.out.println("Error");
            throw new RuntimeException("Invalid input");
        }
    }
    
    public static void printResult(int sum) {
        System.out.println("sum = " + sum);
    }
    
    public static void main(String[] args) {
       int n = getUserInput();
       int result = solveTask(n);
       checking(n);
       printResult(result);
       
    }
}
