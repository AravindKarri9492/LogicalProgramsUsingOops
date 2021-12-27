package com.bridgelabz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LogicalPrograms object = new LogicalPrograms();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter which program do you want to run :: ");
        System.out.println("1.fibonacci \t" +
                           "2.perfect number \t" +
                            " 3.exit");
        int userChoice = scanner.nextInt();
        switch (userChoice) {
            case 1:
                System.out.println("Enter a number to print fibonacci series ");
                int number = scanner.nextInt();
                object.fibonacci(number);
                break;
            case 2:
                System.out.println("Enter a number to check whether it is perfect number on not ::");
                int num = scanner.nextInt();
                object.perfectNumber(num);
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Choose correct option !");
        }

    }
}
