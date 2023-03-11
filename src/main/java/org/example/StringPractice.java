package org.example;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class StringPractice {



    public static void main(String[] args) {



        String name = "Arjun";
        String sampleString = "This Is A Sample Text";
        String blank = "    ";

        /**  Some Predefined Methods Of String Class **/
        System.out.println("sampleString.isEmpty() = " + sampleString.isEmpty());
        //true if the string is empty or contains only white space codepoints, otherwise false
        System.out.println("sampleString.isBlank() = " + sampleString.isBlank());
        System.out.println("blank.isBlank() = " + blank.isBlank());
        System.out.println("sampleString.length() = " + sampleString.length());
        System.out.println("sampleString.toLowerCase() = " + sampleString.toLowerCase());
        System.out.println("sampleString.toUpperCase() = " + sampleString.toUpperCase());
        System.out.println("sampleString.startsWith(\"th\") = " + sampleString.startsWith("th"));
        System.out.println("sampleString.charAt(2) = " + sampleString.charAt(2));
        System.out.println("sampleString.equals(\"this\") = " + sampleString.equals("this"));
        System.out.println("sampleString.split(\" \") = " + sampleString.split(" "));
        String[] ts = sampleString.split("T");
        for (int i = 0; i < ts.length; i++) {
            System.out.println("ts[i] = " + ts[i]);
        }
        System.out.println("name.concat(\" Reddy\") = " + name.concat(" Reddy"));
        System.out.println("name.subSequence(2,5) = " + name.subSequence(2, 5));
        System.out.println("sampleString.replace('a','A') = " + sampleString.replace('a', 'A'));
        System.out.println("blank.trim() = " + blank.trim());

        StringPractice  stringPractice = new StringPractice();
        System.out.println("stringPractice.countVowels(\"Arjuna\") = " + stringPractice.countVowels("Arjuna"));
        stringPractice.displayUpperCaseAndLowerCase("ArJuN");
        System.out.println("stringPractice.reverseTheString(\"Abhinav is a good boy\") = " + stringPractice.reverseTheString("Abhinav is a good boy"));
        System.out.println("stringPractice.reverseTheStringWords(\"this is for testing\") = " + stringPractice.reverseTheStringWords("this is for testing"));
        System.out.println("stringPractice.isPalindrome(\"madam\") = " + stringPractice.isPalindrome("madam"));
        System.out.println("stringPractice.checkVowels(\"\") = " + stringPractice.checkVowels("rjedgn"));
    }

    public int countVowels(String text){
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
             if (text.charAt(i) == 'a' || text.charAt(i) ==  'e' || text.charAt(i) == 'i'|| text.charAt(i) == 'o'|| text.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public void displayUpperCaseAndLowerCase(String text){
        //ascii upper=65-90 lower=97-122
        String upperCase = "",lowerCase = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) <= 90 && text.charAt(i) >= 65 ){
                upperCase += text.charAt(i);
            } else if (text.charAt(i) <= 122 && text.charAt(i) >= 97 ) {
                lowerCase += text.charAt(i);
            }
        }
        System.out.println("upperCase = " + upperCase);
        System.out.println("lowerCase = " + lowerCase);
    }

    public String reverseTheString(String paragraph){
        String reversePara = "";
        String[] words = paragraph.split(" ");
        String[] reverseWords = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            reverseWords[words.length-i-1] = words[i];
        }
        for (int i = 0; i < reverseWords.length; i++) {
            reversePara += reverseWords[i] + " ";
        }
       return reversePara;
    }

    public String reverseTheStringWords(String paragraph){

        String reversePara = "";
        String[] words = paragraph.split(" ");
        String[] reverseWords = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                String temp = "";

               temp += words[i].charAt(j);
                System.out.println("temp = " + temp);
                reverseWords[words.length-i-1] = temp;
            }
        }
        for (int i = 0; i < reverseWords.length; i++) {
            reversePara += reverseWords[i] + " ";
        }
        return reversePara;
    }

    public boolean isPalindrome(@NotNull String name){
            boolean isPalindrome = true;
        for(int i = 0; i <= name.length()/2; i++) {
            if (name.charAt(i) != name.charAt(name.length() - i - 1)) {
                return false;
            }
        }
        return isPalindrome;
    }

    public boolean checkVowels(String name) {
        // System.out.println("name.toLowerCase().matches(\".*[a,e,i,o,u].*\") = " + name.toLowerCase().matches(".*[a,e,i,o,u].*"));
        return name.toLowerCase().matches(".*[aeiou].*");
    }

    public void minMax() {

        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.next();
        String name2 = scanner.next();

        for (int i = 0; i < name1.length(); i++) {
            if (name1.charAt(i) == '?' || name2.charAt(i) == '?') {

            }
        }
    }

//    public class Test
//    {
//        static void charNum(String inputString) {
//            HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
//            char[] strArray = inputString.toCharArray();
//            for(char c: strArray) {
//                if(charMap.containsKey(c)) {
//                    charMap.put(c,  charMap.get(c)+1);
//                } else {
//                    charMap.put(c, 1);
//                }
//            }
//            Set<Character> charInString = charMap.keySet();
//            for(Character ch: charInString) {
//                if(charMap.get(ch) > 1) {
//                    System.out.println(ch +" : "+ charMap.get(ch));
//                }
//            }
//        }
//        public static void main(String[] args) {
//            charNum("JavaJ2Ee");
//        }
//    }


}
