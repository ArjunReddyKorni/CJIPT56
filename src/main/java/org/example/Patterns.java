package org.example;

public class Patterns {


    public static void pyramidPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 5;
        //pyramidPattern(n);
        numberPattern();
    }

    /**
     * 1
     * 12
     * 123
     * 1234
     * 12345
     */
    public static void numberPattern() {

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }
}
