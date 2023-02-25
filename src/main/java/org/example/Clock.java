package org.example;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {


    public static String timeConversion(String s) {
        // Write your code here
        String meridian = s.substring(8);
        if (meridian.equals("PM")) {
            if (s.substring(0, 2).equals("12")) {
                return "12" + s.substring(2, s.length() - 2);
            }
            String newTime = (Integer.parseInt(s.substring(0, 2))) + 12 + s.substring(2, s.length() - 2);
            return newTime;
        } else if (s.substring(0, 2).equals("12")) {
            String newTimeAm = (Integer.parseInt(s.substring(0, 2))) - 12 + s.substring(2, s.length() - 2);
            System.out.println(newTimeAm);
            return "0" + newTimeAm;
        }
        return s.substring(0, s.length() - 2);
    }

}

//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String s = bufferedReader.readLine();
//
//        String result = Result.timeConversion(s);
//
//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}

