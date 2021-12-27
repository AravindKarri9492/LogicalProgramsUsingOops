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
}
