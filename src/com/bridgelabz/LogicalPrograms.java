package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class LogicalPrograms {
    //Fibonacci
    public void fibonacci(int number){
        int previousNum = 0;
        int currentNum = 1;
        System.out.print(previousNum + " " + currentNum);
        int nextNum;
        for(int count =2; count < number;count++) {
            nextNum = previousNum + currentNum;
            previousNum = currentNum;
            currentNum = nextNum;
            System.out.print(" " + nextNum);
        }
    }
    //Perfect Number
    public void perfectNumber(int number){
        int factorsSum=0;
        for(int i=1; i<=number/2; i++) {
            if (number%i == 0) {
                factorsSum += i;
            }
        }
        if (factorsSum == number) {
            System.out.println("It is a perfect number");
        }
        else {
            System.out.println("it is not a perfect number");
        }
    }
    //Prime Number
    public void primeNumber(int number) {
        boolean flag = true;
        for(int i =2; i<number/2; i++) {
            if(number % i == 0)
            {
                flag = false;
            }
        }
        if(flag == true) {
            System.out.println("It is a prime number");
        }
        else {
            System.out.println("It is not a prime number");
        }
    }
    //Reverse A Number
    public void reverseNumber(int number) {
        int remainder =0, reverse =0;
        while(number != 0) {
            remainder = number % 10;
            reverse = (reverse * 10) + remainder;
            number = number / 10;
        }
        System.out.println("Reverse of the given number is "+reverse);
    }
    //Distinct coupons
    public void distinctCoupons(int numOfCoupons)
    {
        int numOfRandomNumbers =0;
        int coupons[] = new int[numOfCoupons];
        int count=0;
        while(numOfCoupons > count) {
            boolean flag =true;
            Random rand = new Random();
            int randomNum = Math.abs(rand.nextInt());
            numOfRandomNumbers++;
            for(int index=0;index<coupons.length;index++) {
                if(coupons[index]==randomNum) {
                    flag=false;
                }
            }
            if(flag == true) {
                coupons[count++] = randomNum;
            }
        }
        //Print the distinct coupons
        for (int index =0 ; index< coupons.length ;index++) {
            System.out.println("Distinct coupons are: "+coupons[index]);
        }
        System.out.println("Number of attempts: "+numOfRandomNumbers);
    }
    //Stopwatch
    public long startStopWatch(char firstClick) {
        long startTime = 0;
        if(firstClick == 'A') {
            startTime = System.currentTimeMillis(); //print the current time in milliseconds
            System.out.println(startTime);
        }
        return  startTime;
    }

    public void endStopWatch(long startTime,char endClick) {
        if (endClick == 'Z') {
            long elapsedTime = System.currentTimeMillis() - startTime;
            System.out.println("Elapsed time in milliseconds :" + elapsedTime);
        }
    }
    //Temperature conversion
    public void temperatureConversion() {
        double fahrenheit,celsius;
        System.out.println( "1) fahrenheit to Celsius \t"+
                            "2) Celsius to  fahrenheit \t" +
                            "3) Exit");
        Scanner scanner = new Scanner(System.in);
        int userChoice=scanner.nextInt();
        switch (userChoice) {
            case 1:
                System.out.println("Enter Fahrenheit :: ");
                fahrenheit = scanner.nextDouble();
                celsius = (fahrenheit-32) * 5/9;
                System.out.println("conversion of given temperature is :: "+celsius);
                break;
            case 2:
                System.out.println("Enter Celsius :: ");
                celsius = scanner.nextDouble();
                fahrenheit = (celsius* 9/5)+ 32;
                System.out.println("conversion of given temperature is :: "+fahrenheit);
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("You entered a wrong input");
        }
    }
    //Monthly Payment
    public int calculateMonthlyPayment(double rate,double year,double principleAmount){
        double r = rate / (12 * 100);
        double n = - 1* 12 * year;
        double payment = (principleAmount * r) / (1 - Math.pow((1 + r) , n));
        return (int)payment;
    }
    //Newton's square root
    public void squareRoot(int number){
        double epsilon = 1e-15;
        double root = number;
        while(Math.abs(root-number/root) > epsilon * root) {
            root = (number/root+root)/2;
        }
        System.out.println("The square root of the number is " +root);
    }
}
