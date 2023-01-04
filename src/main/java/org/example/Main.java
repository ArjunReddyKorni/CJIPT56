package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static  String name;

    public static void main(String args[]){
        System.out.println("Hello World");

        Main.name.charAt(0);


        Map<String,Integer> map1 = new HashMap<>();
        map1.put("a1",1);
        map1.put("a2",1);
        map1.put("a3",10);
        map1.put("a3",9);

        int result = 0;

        for (Map.Entry<String,Integer> entry: map1.entrySet()) {
            result += entry.getValue();
        }
        System.out.println("result = " + result);
        System.out.println("map1.size() = " + map1.size());
        Map<Integer,Integer> map2 = new HashMap<>();
        map2.put(1,1);
        map2.put(15,2);
        System.out.println("map2.entrySet() = " + map2.entrySet());
        String str = "Hello World";


    }
}