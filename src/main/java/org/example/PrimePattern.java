package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimePattern {


    public static void pattern(int n) {

        int size = 0, isPrime = 1;
        for (int a = 1; a <= n; a++)
            size += a;
        List<Integer> list = new ArrayList<>();
        while (size + 1 != list.size()) {
            boolean prime = true;
            for (int j = 2; j < isPrime; j++) {
                if (isPrime % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                list.add(isPrime);
            }
            isPrime++;
        }
        int e, f, g = 1;
        for (e = 0; e < n; e++) {
            for (f = 0; f <= e; f++) {
                System.out.print(list.get(g) + " ");
                g++;
            }
            System.out.println();
        }

    }


    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the number of rows");
        int column = scanner.nextInt();
        scanner.close();
        pattern(column);
    }
}

