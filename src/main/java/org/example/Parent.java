package org.example;

public class Parent {

    public Parent() {
        System.out.println(" i am parent ");
    }

    public static void main(String[] args) {
        int n = 10;
        int firstNum = 0, secondNum = 1;
        System.out.print("Fibonacci Series of " + n + " numbers: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(firstNum + " ");

            // compute the next number in the series
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}
