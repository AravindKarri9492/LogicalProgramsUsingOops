package com.bridgelabz;

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
    public static void distinctCoupons(int numOfCoupons)
    {
        int numOfRandomNumbers =0;
        int coupons[] = new int[numOfCoupons];
        int count=0;
        while(numOfCoupons > count) {
            boolean flag =true;
            int randomNum = (int)Math.floor(Math.random()*100);
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
    public void stopWatch(char firstClick,char endClick)
    {
        long startTime = 0;
        if(firstClick == 'A')
        {
            startTime = System.currentTimeMillis(); //print the current time in milliseconds
            System.out.println(startTime);
        }
        if(endClick == 'Z')
        {
            long elapsedTime = System.currentTimeMillis() - startTime;
            System.out.println("Elapsed time in milliseconds :"+elapsedTime);
        }
    }
}
