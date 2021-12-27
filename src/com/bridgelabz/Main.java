package com.bridgelabz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LogicalPrograms object = new LogicalPrograms();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to print fibonacci series ");
        int number = scanner.nextInt();
        scanner.close();
        object.fibonacci(number);
    }
}
