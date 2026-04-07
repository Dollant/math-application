package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
// Question 1: Highest salary between Bob and Gary
        int bobSalary = 55000;
        int garySalary = 72000;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is $" + highestSalary);

// Question 2: Smallest of carPrice and truckPrice
        int carPrice = 24999;
        int truckPrice = 38500;
        int lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest vehicle price is $" + lowestPrice);

    }
}
