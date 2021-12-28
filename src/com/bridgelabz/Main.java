package com.bridgelabz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LogicalPrograms object = new LogicalPrograms();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Enter which program do you want to run :: ");
            System.out.println( "1.fibonacci \n" +
                                "2.perfect number \n" +
                                "3.prime number \n" +
                                "4.reverse number \n" +
                                "5.coupon numbers \n" +
                                "6.stop watch \n" +
                                "7.temperature conversion \n" +
                                "8.monthly payment \n" +
                                "9.square root \n" +
                                "10.exit");
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
                    System.out.println("Enter a number to check whether it is prime or not");
                    int number1 = scanner.nextInt();
                    object.primeNumber(number1);
                    break;
                case 4:
                    System.out.println("Enter a number to reverse ");
                    int number2 = scanner.nextInt();
                    object.reverseNumber(number2);
                    break;
                case 5:
                    System.out.println("Enter how many distinct coupons needed?");
                    int numOfCoupons = scanner.nextInt();
                    object.distinctCoupons(numOfCoupons);
                    break;
                case 6:
                    System.out.println("Enter A to begin the stopWatch : ");
                    char firstClick = scanner.next().charAt(0);
                    long startTime = object.startStopWatch(firstClick);
                    System.out.println("Enter Z to stop stopwatch: ");
                    char endClick = scanner.next().charAt(0);
                    object.endStopWatch(startTime,endClick);
                    break;
                case 7:
                    object.temperatureConversion();
                    break;
                case 8:
                    System.out.println("Enter How many years to pay off :: ");
                    double year = scanner.nextDouble();
                    System.out.println("Enter the principal loan amount :: ");
                    double principleAmount = scanner.nextDouble();
                    System.out.println("Rate percentage ::");
                    double rate = scanner.nextDouble();
                    double payment = object.calculateMonthlyPayment(rate,year,principleAmount);
                    System.out.println("Monthly payment is "+payment);
                    break;
                case 9:
                    System.out.println("Enter a non negative number ::");
                    int num1 = scanner.nextInt();
                    object.squareRoot(num1);
                    break;
                case 10:
                    System.exit(0);
                default:
                    System.out.println("Choose correct option !");
            }
        }
    }
}
