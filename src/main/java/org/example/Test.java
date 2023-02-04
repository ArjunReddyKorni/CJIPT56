package org.example;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

public class Test {

//    public static void main(String[] args) {
//     String name = "trst";
//        System.out.println("name.toLowerCase().matches(\".*[a,e,i,o,u].*\") = " + name.toLowerCase().matches(".*[a,e,i,o,u].*"));
//
//
//    }

    //    public static void main(String[] args) {
//        String name = new String("Ram").intern();
//        String name1 = new String("Ram").intern();
//
//        System.out.println(name == name1);
//    }
//
//    public static void main(String[] args) {
//        System.out.println(Math.random()*4);
//        System.out.println(new Random().nextDouble()*1003);
//    }
    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(0, 200);
        marks.add(122);
        marks.add(162);
        marks.add(125);
        marks.add(722);
        System.out.println("marks = " + marks);
        List pass = marks.stream().filter(mark -> mark < 500).collect(Collectors.toList());
        System.out.println("pass = " + pass);
        List grace = marks.stream().map(mark -> mark = mark + 15).collect(Collectors.toList());
        System.out.println("grace = " + grace);
    }
}
