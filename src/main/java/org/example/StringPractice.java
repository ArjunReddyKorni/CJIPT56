package org.example;

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





}