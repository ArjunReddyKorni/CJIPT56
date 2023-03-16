package org.example;

import java.util.Scanner;

public class Challenge100 {


//    public static void main(String... args) {
////        Hello();
////        evenOrOdd();
////        checkVoteEligibility();
////        isPrime();
////        sumOfEvenAndOdd();
//
//    }


    /**
     * Program 1
     */
    public static void Hello() {
        System.out.println("Hello World");
    }

    /**
     * Program 2
     * -Write a program to check a number is even or odd
     */
    public static void evenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check Weather a number is odd or not");
        int number = scanner.nextInt();
        if (number > 0) {
            if (number % 2 == 0)
                System.out.println("Number is even");
            else
                System.out.println("number is odd");
        } else
            System.out.println("Number is negative");
    }

    /**
     * Program 3
     * -Write a program to check a person is eligible to vote or not
     */
    public static void checkVoteEligibility() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Age");
        int age = scanner.nextInt();
        if (age >= 0) {
            if (age > 18) {
                System.out.println("Your are eligible to vote");
            } else
                System.out.println("Your are not eligible to vote");
        } else
            System.out.println("Age cannot be negative");

    }

    /**
     * Program 4
     * -Write a program to check a number is prime or not
     */
    public static void isPrime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check the number is prime or not");
        int count = 0, number = scanner.nextInt();
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("Number is Not a prime number");
                count++;
                break;
            }
        }
        if (number <= 2) {
            System.out.println("Number is Not a prime number");
            count++;
        }
        if (count == 0)
            System.out.println("Number is prime");
    }

    /**
     * Program 5
     * -Write a program to accept a number from user and find the sum of even digits and sum of odd digits
     */
    public static void sumOfEvenAndOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find the sum of even and odd");
        int evenSum = 0, oddSum = 0, number = scanner.nextInt();
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0)
                evenSum += digit;
            else
                oddSum += digit;
            number /= 10;
        }
        System.out.println("evenSum  = " + evenSum + "\n" + "oddSum = " + oddSum);
    }

    /**
     * Program 6
     * -write a program to print a to z
     */
    public static void main(String[] args) {
        char i;
        for (i = 'A'; i <= 'Z'; i++) {
            int j = i;

            System.out.println(j + "= " + i);
        }
        char s = 546;
        System.out.println("s = " + s);
    }


}
