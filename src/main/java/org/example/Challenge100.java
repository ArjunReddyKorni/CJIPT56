package org.example;

import java.util.Date;
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


    /**
     * Program 7
     *
     * @param month
     * @param day
     * @param year
     * @return
     */
    public static String findDay(int month, int day, int year) {
        Date date = new Date(year, month, day);
        System.out.println(date.getDate());
        switch (date.getDay()) {
            case 0:
                return "WEDNESDAY";
            case 1:
                return "THURSDAY";
            case 2:
                return "FRIDAY";
            case 3:
                return "SATURDAY";
            case 4:
                return "SUNDAY";
            case 5:
                return "MONDAY";
            case 6:
                return "TUESDAY";
        }

        return null;
    }

    /**
     * progarm8
     *
     * @param args
     */

    public static void main1(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(A.length() + B.length());
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));
    }

    /**
     * program9
     */
    public static void Spliting(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        s.trim();
        if (s.length() == 0) {
            System.out.println(0);
        } else {
            String[] ss = s.split("[!,?._'@\\s+]+");
            System.out.println(ss.length);
            for (int i = 0; i < ss.length; i++) {
                System.out.println(ss[i]);
            }
        }
        scan.close();
    }

    /**
     * program10
     */

    public static void swapNumbers() {
        int number1 = 10;
        int number2 = 20;
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 -= number2;

        int[] students = new int[5];


    }

   
}
