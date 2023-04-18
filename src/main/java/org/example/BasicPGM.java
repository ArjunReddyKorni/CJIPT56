package org.example;

import java.util.Collection;

public class BasicPGM {
    public static int number1 = 0, number2 = 1, number3 = 0;

    public static void main(String[] args) {

//        
        String name = "rakesh";
        System.out.println("name = " + name);
        name = "ramesh";
        System.out.println("name = " + name);
    }

    public void evenOddNumber(int number) {

        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("Number is even");
            } else
                System.out.println("Number is odd");
        }
        System.out.println("Number cannot be negative");
    }

    public int factorial(int number) {

        if (number <= 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    public void fibonacciSeries(int number) {
        if (number > 0) {
            number3 = number1 + number2;
            System.out.print("," + number3);
            number1 = number2;
            number2 = number3;
            fibonacciSeries(number - 1);
            //Collection


        }
    }


}
