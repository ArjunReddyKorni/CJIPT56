package org.example;

public class LargestNumber {

    public static void main(String[] args) {

        int number1 = 102;
        int number2 = 20;

        //WithOut If Else
        int largeNumber = number1>number2?number1:number2;
        System.out.println("largeNumber = " + largeNumber);

        //With Predefined Method
        int largestNumber1 = Integer.max(number1,number2);
        System.out.println("largestNumber1 = " + largestNumber1);
        
        //If-Else
        int largestNumber3 = 0;
        if (number1>number2){
            largestNumber3 = number1;
        }else {
            largestNumber3 = number2;
        }
        System.out.println("largestNumber3 = " + largestNumber3);
    }


}
