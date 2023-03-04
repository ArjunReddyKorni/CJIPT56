package org.example;//package org.example;
//
//
//import java.util.*;
//import java.util.concurrent.atomic.AtomicLong;
//import java.util.stream.Collectors;
//
//public class Test {
//
////    public static void main(String[] args) {
////     String name = "trst";
////        System.out.println("name.toLowerCase().matches(\".*[a,e,i,o,u].*\") = " + name.toLowerCase().matches(".*[a,e,i,o,u].*"));
////
////
////    }
//
//    //    public static void main(String[] args) {
////        String name = new String("Ram").intern();
////        String name1 = new String("Ram").intern();
////
////        System.out.println(name == name1);
////    }
////
////    public static void main(String[] args) {
////        System.out.println(Math.random()*4);
////        System.out.println(new Random().nextDouble()*1003);
////    }
////    public static void main(String[] args) {
////
////        ArrayList<Integer> marks = new ArrayList<>();
////        marks.add(0, 200);
////        marks.add(122);
////        marks.add(162);
////        marks.add(125);
////        marks.add(722);
////        System.out.println("marks = " + marks);
////        List pass = marks.stream().filter(mark -> mark < 500).collect(Collectors.toList());
////        System.out.println("pass = " + pass);
////        List grace = marks.stream().map(mark -> mark = mark + 15).collect(Collectors.toList());
////        System.out.println("grace = " + grace);
////    }
//
////    public static void main(String[] args) {
////        //String string = "Sample String";//
////        Scanner scanner = new Scanner(System.in);
////        String input = scanner.nextLine();;
////        StringBuffer reverse = new StringBuffer();
////
////        for (int i = 0; i < input.length(); i++) {
////            reverse = reverse.append(input.charAt(input.length()-i-1));
////        }
////        System.out.println("reverse = " + reverse);
////    }
//
////    public static void main(String[] args) {
////        Scanner scanner = new Scanner(System.in);
////        int inputNumber = scanner.nextInt();
////        int reverse = 0;
////        while (inputNumber != 0){
////            int digit = inputNumber%10;
////            reverse = reverse*10 +digit;
////            inputNumber = inputNumber/10;
////        }
////        System.out.println("reverse = " + reverse);
////    }
//
//    public static void main(String[] args) {
////        Scanner scanner = new Scanner(System.in);
////        int input = scanner.nextInt();
////        int factorial = 1;
////
////        for (int i = 1; i <= input; i++) {
////            factorial = factorial * i;
////        }
////        System.out.println("factorial = " + factorial);
////        int Integer = 24;
////        char String  = 'I';
////        System.out.print(Integer);
////        System.out.print(String);
//
//        System.out.println(Math.floor(3.6));
//    }
//
//}

class Solution {
    public static void main(String args[]) {
        int i;
        for (i = 1; i < 6; i++) {
            if (i > 3) continue;
        }
        System.out.println(i);
    }
}
