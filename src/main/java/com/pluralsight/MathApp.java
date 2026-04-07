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

// Question 3: Area of a circle with radius 7.25 (radius must stay double per the question)
        double radius = 7.25;
        double circleArea = Math.PI * Math.pow(radius,2);
        System.out.println("The area of a circle with radius " + radius + " is " + circleArea);

// Question 4: Square root of 5.0 (must stay double per the question)
        double number = 5.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("The square root of " + number + " is " + squareRoot);

// Question 5: Distance between points (5, 10) and (85, 50)
        int x1 = 5, y1 = 10;
        int x2 =85, y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + distance);

// Question 6: Absolute value of -3.8 (must stay double per the question)
        double negativeValue = -3.8;
        double absoluteValue = Math.abs(negativeValue);
        System.out.println("The absolute value of " + negativeValue + " is " + absoluteValue);

// Question 7: Random number between 0 and 1
        double randomNumber = Math.random();
        System.out.println("A random number between 0 and 1: " + randomNumber);

// Question 8: How many minutes are in 24 days
        int days = 24;
        int hoursPerDay = 24;
        int minutesPerHour = 60;
        int totalMinutes = days * hoursPerDay * minutesPerHour;
        System.out.println("There are " + totalMinutes + " minutes in " + days + " days.");

// BONUS: How many milliseconds in 24 days
        int secondsPerMinute = 60;
        int millisecondsPerSecond = 1000;
        long totalMilliseconds = (long) totalMinutes * secondsPerMinute * millisecondsPerSecond;
        System.out.println("There are " + totalMilliseconds + " milliseconds in " + days + " days.");
    }
}
