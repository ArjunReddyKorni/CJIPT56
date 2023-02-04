package org.example;

import java.net.PasswordAuthentication;
import java.security.KeyStore;
import java.util.function.Function;
import java.util.function.Predicate;

public class LargestNumber {

    public static void main(String[] args) {

        int number1 = 102;
        int number2 = 20;

        //WithOut If Else
        int largeNumber = number1 > number2 ? number1 : number2;
        System.out.println("largeNumber = " + largeNumber);

        //With Predefined Method
        int largestNumber1 = Integer.max(number1,number2);
        System.out.println("largestNumber1 = " + largestNumber1);

        //If-Else
        int largestNumber3 = 0;
        if (number1 > number2) {
            largestNumber3 = number1;
        } else {
            largestNumber3 = number2;
        }
        System.out.println("largestNumber3 = " + largestNumber3);

        LargestNumber number = new LargestNumber();
        System.out.println("number.reverseNumber(12345) = " + number.reverseNumber(12345));
    }

    public int reverseNumber(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }
//        Function functionalInterface = new Predicate<>();
//        PasswordAuthentication;
//        KeyStore.PasswordProtection

        return reversedNumber;
    }


}
