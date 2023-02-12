package org.example;

public class ThrowExample {


    public static void main(String[] args) {

        try {
            ThrowExample.checkOddNumber(2);
        } catch (evenNumberException e) {
            e.printStackTrace();
        }
    }

    public static void checkOddNumber(int number) throws evenNumberException {

        if (number % 2 == 0) {
            throw new evenNumberException("Number is even");
        }
    }


//    class Xyz
//    {
//        public final void m1()
//        {
//            System.out.println("m1-A");
//        }
//    }
//    public class Main extends Xyz
//    {
//        private void m1()
//        {
//            System.out.println("m1-B");
//        }
//        public static void main(String[] args)
//        {
//            Main b = new Main();
//            b.m1();
//        }
//    }
//
//    class Xyz
//    {
//        Xyz()
//        {
//            System.out.println("Hello");
//        }
//    }
//    public class Main extends Xyz
//    {
//
//        public static void main(String[] args)
//        {
//            Main b = new Main();
//        }
//    }
}
