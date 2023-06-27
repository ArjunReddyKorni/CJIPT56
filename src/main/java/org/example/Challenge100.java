package org.example;

import org.jetbrains.annotations.NotNull;

import java.io.FileReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Challenge100 {

    static Scanner scanner = new Scanner(System.in);

//    public static void main(String... args) {
////        Hello();
////        evenOrOdd();
////        checkVoteEligibility();
////        isPrime();
////        sumOfEvenAndOdd();
//
//    }


    /**
     * Program 1
     */
    public static void Hello() {
        System.out.println("Hello World");
    }

    /**
     * Program 2
     * -Write a program to check a number is even or odd
     */
    public static void evenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check Weather a number is odd or not");
        int number = scanner.nextInt();
        if (number > 0) {
            if (number % 2 == 0)
                System.out.println("Number is even");
            else
                System.out.println("number is odd");
        } else
            System.out.println("Number is negative");
    }

    /**
     * Program 3
     * -Write a program to check a person is eligible to vote or not
     */
    public static void checkVoteEligibility() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Age");
        int age = scanner.nextInt();
        if (age >= 0) {
            if (age > 18) {
                System.out.println("Your are eligible to vote");
            } else
                System.out.println("Your are not eligible to vote");
        } else
            System.out.println("Age cannot be negative");

    }

    /**
     * Program 4
     * -Write a program to check a number is prime or not
     */
    public static void isPrime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check the number is prime or not");
        int count = 0, number = scanner.nextInt();
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("Number is Not a prime number");
                count++;
                break;
            }
        }
        if (number <= 2) {
            System.out.println("Number is Not a prime number");
            count++;
        }
        if (count == 0)
            System.out.println("Number is prime");
    }

    /**
     * Program 5
     * -Write a program to accept a number from user and find the sum of even digits and sum of odd digits
     */
    public static void sumOfEvenAndOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find the sum of even and odd");
        int evenSum = 0, oddSum = 0, number = scanner.nextInt();
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0)
                evenSum += digit;
            else
                oddSum += digit;
            number /= 10;
        }
        System.out.println("evenSum  = " + evenSum + "\n" + "oddSum = " + oddSum);
    }

    /**
     * Program 6
     * -write a program to print a to z
     */
    public static void printAlphabet(String[] args) {
        char i;
        for (i = 'A'; i <= 'Z'; i++) {
            int j = i;

            System.out.println(j + "= " + i);
        }
        char s = 546;
        System.out.println("s = " + s);
    }


    /**
     * Program 7
     *
     * @param month
     * @param day
     * @param year
     * @return
     */
    public static String findDay(int month, int day, int year) {
        Date date = new Date(year, month, day);
        System.out.println(date.getDate());
        switch (date.getDay()) {
            case 0:
                return "WEDNESDAY";
            case 1:
                return "THURSDAY";
            case 2:
                return "FRIDAY";
            case 3:
                return "SATURDAY";
            case 4:
                return "SUNDAY";
            case 5:
                return "MONDAY";
            case 6:
                return "TUESDAY";
        }

        return null;
    }

    /**
     * progarm8
     *
     * @param args
     */
    public static void main1(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(A.length() + B.length());
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));
    }

    /**
     * program9
     */
    public static void Spliting(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        s.trim();
        if (s.length() == 0) {
            System.out.println(0);
        } else {
            String[] ss = s.split("[!,?._'@\\s+]+");
            System.out.println(ss.length);
            for (int i = 0; i < ss.length; i++) {
                System.out.println(ss[i]);
            }
        }
        scan.close();
    }

    /**
     * program10
     */
    public static void swapNumbers() {
        int number1 = 10;
        int number2 = 20;
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 -= number2;

        int[] students = new int[5];
    }

    /**
     * Program11
     */
    public static void binarySearch() {
        int[] array =
                {40575, 33565, 36480, 17605, 30675, 31474, 32037, 13838, 42611, 17889, 45440, 25659, 8016, 46344, 12900, 41305, 45536, 34052, 42068, 10645, 33864, 19531, 11356, 39744, 19986, 17496, 13439, 28505, 48292, 33506, 257, 13896, 4223, 20996, 44774, 37266, 3852, 44720, 9818, 42796, 25921, 20286, 28817, 3458, 10949, 49152, 47234, 10023, 43865, 11896, 34931, 41666, 24746, 10326, 4903, 18103, 46180, 42296, 31152, 37111, 43994, 3397, 18662, 5178, 27105, 47634, 27170, 38076, 43776, 18248, 27012, 9579, 11820, 21219, 13607, 42264, 33389, 7210, 6050, 12525, 33169, 30433, 11180, 12234, 3008, 10336, 47257, 31161, 7695, 20439, 35589, 37645, 40297, 26072, 18403, 38534, 41388, 39467, 39158, 47875, 36881, 19721, 11055, 28820, 43367, 21299, 26822, 48316, 18043, 3855, 41312, 43075, 46772, 39307, 21932, 7586, 38826, 38402, 44723, 25428, 6306, 7171, 41017, 33775, 24408, 24675, 15884, 30860, 45457, 15031, 36731, 44184, 6765, 39432, 46832, 7418, 2056, 44524, 9024, 18010, 11545, 7354, 34361, 4275, 14435, 29962, 15810, 22536, 44104, 8010, 8060, 27704, 38749, 43037, 36413, 23710, 31293, 18579, 32069, 46161, 28380, 43098, 23384, 45294, 32974, 31616, 1546, 3115, 11107, 19073, 24499, 27330, 45462, 31584, 30736, 21139, 7274, 17618, 5868, 13594, 17835, 32647, 22888, 35359, 1101, 28645, 37617, 28721, 18343, 44275, 20694, 10365, 7519, 343, 34098, 28937, 32926, 11241, 24249, 16079, 28257, 48365, 31269, 13720, 16341, 19856, 12253, 19407, 4372, 32390, 40356, 46031, 23873, 17738, 41443, 1183, 15534, 25867, 18812, 6287, 34186, 42408, 32068, 6760, 11573, 15824, 8138, 13697, 13228, 22472, 4698, 44855, 17773, 11994, 35652, 42621, 18048, 43214, 36212, 22665, 3046, 17812, 27523, 18895, 12847, 437, 44858, 38964, 48459, 23783, 31324, 36798, 42629, 23369, 17818, 1297, 39800, 14616, 20006, 30650, 32211, 2368, 22740, 36047, 24440, 10442, 33980, 13819, 40506, 9531, 5154, 34159, 12851, 2962, 35141, 23347, 4109, 39360, 37328, 11176, 25145, 27933, 37067, 31710, 40742, 36582, 32573, 14893, 17688, 23666, 3346, 48720, 12001, 3618, 40355, 48479, 14506, 45986, 2327, 17136, 8183, 24726, 48814, 39741, 7904, 31194, 20462, 2821, 31983, 26038, 25465, 24333, 8615, 15729, 17474, 39057, 3948, 41332, 38331, 34423, 1602, 14267, 29276, 12044, 6965, 22533, 36435, 26654, 43302, 27311, 30995, 40875, 42711, 15287, 13233, 34073, 35732, 12058, 11617, 8262,
                        4066, 22151, 17494, 44219, 39474, 16682, 21068, 22744, 17139, 33702, 33690, 34168, 44422, 31028, 29974, 6252, 10658, 38594, 34025, 21009, 1872, 8303, 12461, 39636, 7918, 38955, 25021, 28781, 46584, 15675, 28275, 20759, 24636, 42760, 28701, 45087, 28369, 17214, 36307, 24616, 5483, 24053, 33042, 37568, 10767, 22131, 40669, 13370, 9018, 45704, 45796, 21896, 27929, 11495, 9117, 32423, 40247, 31910, 11976, 21233, 19539, 44529, 46220, 41019, 41858, 40412, 36872, 26113, 45129, 6351, 31497, 25408, 36588, 31644, 7465, 12207, 37354, 39821, 6645, 32377, 30572, 19991, 10676, 26898, 22321, 40215, 10903, 7888, 21720, 9591, 13309, 34531, 30858, 20384, 33304, 21254, 9993, 11671, 41559, 38433, 36234, 45611, 27903, 15496, 27194, 44564, 4933, 44072, 33090, 8550, 522, 737, 7660, 17376, 11874, 6312, 2815, 21358, 1262, 11788, 2240, 11742, 30057, 29953, 46945, 34276, 19894, 17328, 37955, 40054, 45612, 16782, 503, 15700, 16133, 38420, 30649, 46704, 15421, 19032, 49407, 10833, 16203, 6190, 9478, 44122, 48596, 18234, 39108, 634, 33968, 41574, 28511, 4303, 30266, 25359, 44887, 14333, 42204, 43042, 16633, 49433, 33545, 47529, 44436, 12815, 21587, 41680, 27605, 44972, 3689, 46546, 1379, 42080, 48901, 109, 24986, 46621, 2120, 33855, 1643, 5066, 33327, 45577, 21886, 1239, 45478, 40578, 45568, 30366, 15880, 19374, 41488, 33318, 31278, 2746, 21966, 36420, 45904, 16892, 1422, 41573, 1338, 29651, 35071, 20874, 36260, 38972, 1764, 46750, 29358, 35456, 12745, 22129, 4459, 44807, 8703, 38982, 43857, 34178, 13613, 42905, 21951, 39634, 30582, 2935, 24657, 47020, 49644, 35539, 11097, 45909, 39080, 42562, 39411, 49259, 8942, 28374, 37872, 1905, 24104, 8901, 26360, 24204, 16285, 34813, 15750, 46076, 29191, 25943, 8273, 2667, 16986, 36173, 13496, 41501, 36993, 39692, 36988, 25168, 9659, 23860, 39318, 21422, 42595, 48619, 16080, 8389, 18449, 43030, 13640, 35931, 35698, 43864, 21648, 17328, 34696, 5316, 7534, 1226, 11302, 28474, 17256, 37252, 43286, 35181, 4537, 8434, 41079, 30400, 37610, 34837, 15335, 4451, 12315, 2067, 3199, 20553, 5894, 3670, 25283, 41352, 27386, 27082, 962, 16165, 8737, 13316, 30765, 7263, 6696, 34514, 7848, 32695, 42425, 40706, 25801, 32166, 6768, 38724, 3002, 355, 37207, 3100,
                        39663, 21507, 4887, 14692, 21865, 39371, 40035, 33282, 29698, 32570, 12148, 26546, 7940, 24392, 1572, 34644, 9893, 18798, 17800, 40777, 12125, 8039, 36549, 2805, 23040, 7273, 38778, 7440, 6652, 9402, 47992, 24341, 29500, 1750, 31856, 40917, 34863, 40778, 15997, 41288, 44958, 18562, 8415, 36999, 39164, 14404, 15404, 16551, 49820, 23321, 48450, 850, 49790, 42138, 11982, 34564, 11435, 444, 47644, 3983, 46351, 25667, 9908, 22696, 28144, 33309, 44431, 22544, 28586, 43598, 43637, 15828, 37485, 4448, 39589, 5630, 43734, 46146, 24361, 5001, 6770, 34664, 49436, 20213, 5433, 12781, 42787, 48786, 200, 6729, 49012, 29706, 41230, 7066, 24546, 17167, 19412, 18387, 1989, 44124, 34288, 37830, 16621, 29686, 16381, 20891, 10571, 17663, 30274, 36694, 12836, 7739, 12808, 2288, 4571, 26127, 46998, 42287, 35758, 29865, 6792, 20319, 39089, 39033, 22520, 37716, 14303, 7977, 22185, 19889, 47685, 29479, 18177, 37832, 49761, 25325, 2699, 39880, 13532, 45984, 25326, 35053, 47064, 15595, 1058, 10222, 22214, 40738, 8605, 16700, 555, 42440, 32101, 17069, 34340, 46307, 20550, 46897, 17275, 41903, 35651, 11857, 34780, 19911, 15075, 17155, 1814, 42205, 7817, 31856, 20715, 8008, 5130, 35532, 38789, 33810, 15979, 25276, 26658, 17881, 33843, 28990, 444, 15533, 14960, 41996, 20495, 48457, 17065, 4361, 49593, 13858, 24551, 35620, 11826, 46875, 16840, 7538, 35213, 42461, 3706, 16576, 30748, 11659, 9262, 35981, 35052, 36463, 34365, 36482, 8993, 2000, 2570, 43131, 26333, 44382, 35808, 946, 29005, 37721, 21201, 37365, 37392, 48664, 26389, 30474, 13092, 1137, 30231, 5606, 49205, 13843, 21378, 23119, 47768, 25498, 2901, 10480, 555, 5100, 1184, 9291, 37329, 33545, 48183, 17675, 11878, 26342, 30384, 11319, 30331, 5940, 36861, 43249, 31866, 15766, 45018, 15512, 5665, 26520, 28133, 38159, 42558, 536, 13077, 10967, 16197, 13804, 19983, 24336, 10713, 28953, 20689, 31846, 16127, 47306, 38515, 10959, 26248, 5080, 42675, 33564, 42726, 46766, 41848, 8265, 40119, 15478, 49284, 43102, 3947, 15979, 8683, 8336, 23115, 6630, 16276, 14466, 24731, 29640, 28327, 30484, 8584, 34478, 18544, 20202, 28134, 11304, 36336, 30810, 47022, 17444, 23541, 49437, 35844, 41954, 43401, 39075, 44526, 28829, 43400, 30537, 36304, 41165, 3211, 48305, 41587, 44669, 45346, 38329, 7233, 48105, 3277, 34662, 5274, 46252, 17032, 504, 13603, 6879, 45136, 2000};

        // linear search
        int count = 0;
        int index = -1;
        int search = 504;
        for (int i = 0; i < array.length; i++) {
            if (search == array[i]) {
                count++;
            }
            if (count == 3) {
                index = i;

                break;
            }

        }
        System.out.println("index = " + index);
        //sorted array
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - 1; j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print("  " + array[i]);
        }
        // Finding the repeated Elements in the Array
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[j] == array[i])) {
                    System.out.println("array = " + array[j]);
                }
            }
        }
    }

    /**
     * Program12
     * Cheak String is a isogram
     */
    public static boolean isogram(@NotNull String word) {
        Set<Character> characterSet = new HashSet<>();
        boolean isogram = true;
        for (int i = 0; i < word.length(); i++) {
            if (characterSet.contains(word.charAt(i))) {
                isogram = false;
                break;
            }
            characterSet.add(word.charAt(i));
        }
        return isogram;
    }

//    public static void main(String[] args) {
//       System.out.println("isogram " + isogram("pen"));
//       System.out.println("nthFibbonacci(10) = " + nthFibbonacci(5));
//        int i;
//        for (i = 1; i < 6; i++) {
//            if (i > 3) continue;
//        }
//        System.out.println(i);
//
//    }


    /**
     * Program13
     * Print nth fibbonacci number using recurssion
     */
    public static int nthFibbonacci(int n) {
        if (n <= 1)
            return n;
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet tryse</title>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet tryse at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
        return nthFibbonacci(n - 1) + nthFibbonacci(n - 2);
    }

    /**
     * program14
     * Count number of words in a Para And reverse them And Display
     */
    public void countWordsOfPara() {
        String para = scanner.nextLine();
        String[] split = para.split("\\s+");
        System.out.println("Words = " + split.length);
        StringBuffer reversedPara = new StringBuffer();
        for (int i = 0; i < split.length; i++) {
            reversedPara.append(split[split.length - 1 - i] + " ");
        }
        System.out.println("reversedPara = " + reversedPara);
    }

    public static void mainw(String[] args) {
        Challenge100 c = new Challenge100();
//        c.countWordsOfPara();
//        c.reversingString();
//         c.swapTwoNumbers();
        // c.checkVowels();
        int[] arr = {2, 3, 4, 10, 40};
        int key = 40;
        int result = binarySearch(arr, key);

        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }

    }

    /**
     * Program 15
     * Reverse a String
     */
    public void reversingString() {
        String word = scanner.nextLine();
        StringBuffer reversedWord = new StringBuffer();
        for (int i = 0; i < word.length(); i++) {
            reversedWord.append(word.charAt(word.length() - 1 - i));
        }
        System.out.println("reversedWord = " + reversedWord);
    }

    /**
     * program16
     * Swap two numbers without 3rd Variable
     */
    public void swapTwoNumbers() {
        double firstNumber = 10;
        double secondNumber = 20;
        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;
        System.out.println("firstNumber = " + firstNumber);
        System.out.println("secondNumber = " + secondNumber);
    }

    /**
     * Program 17
     * Check String Contains vowels and their count
     */
    public void checkVowels() {
        String word = scanner.nextLine();
        boolean containsVowels = word.matches(".*[aeiou].*");
        int count = 0;
        System.out.println("containsVowels = " + containsVowels);
        if (containsVowels) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                    count++;
                }
            }
        }
        System.out.println("count = " + count);
    }

    /**
     * Program 18
     * Binary Search
     */
    public static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[start] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void EncryptingCode() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value");
        String str = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 121 || str.charAt(i) == 122 || str.charAt(i) == 90 || str.charAt(i) == 89) {
                if (str.charAt(i) == 121) {
                    System.out.print('a');
                } else if (str.charAt(i) == 122) {
                    System.out.print('b');
                } else if (str.charAt(i) == 90) {
                    System.out.print('B');
                } else if (str.charAt(i) == 89) {
                    System.out.print('A');
                }

            } else {
                char str1 = str.charAt(i);
                char str2 = (char) (str.charAt(i) + 2);
                System.out.print(str2);
            }
        }
    }

    public static void maiP(String[] args) {
//        System.out.println(".");
//        EncryptingCode();
        // otpGenerator();
        // m(new int[][]{{1,12,13},{34,45,65}});
        //encrptMobile();
        //highestString();
        //filterByLength();
        //removeTheGivenCharacterFromTheString();
        //findNumbersStatingWith1();

    }

    public static void m(int[][] p) {
        int height = p.length;
        System.out.println("height = " + height);
    }

    /**
     * 4 Digit Otp Generate
     */
    public static void otpGenerator() {
        int otp = 0;
        Random random = new Random();
        for (int i = 1; i <= 4; i++) {
            otp = otp * 10 + random.nextInt(9);
        }
        System.out.println("otp = " + otp);
        //second way
        int randomNumber = (int) (Math.random() * 9000) + 1000;
        System.out.println("randomNumber = " + randomNumber);

    }

    /**
     * Display last 2 digits of mobile number and replace the remaining digits with #
     */
    public static void encrptMobile() {
        System.out.println("Please Enter your mobile number");
        String mobileNumber = scanner.nextLine();
        while (mobileNumber.length() == 10 || mobileNumber.matches(".*[1234567890].*")) {
            System.out.println("Please Enter a valid 10 digit mobile number");
            mobileNumber = scanner.nextLine();
            if (mobileNumber.length() == 10 || mobileNumber.matches(".*[1234567890].*")) {
                break;
            }
        }
        System.out.println("mobileNumber = " + /*mobileNumber.substring(0,7).replaceAll(".*[1234567890].*","#")*/"########" + mobileNumber.substring(8, 10));

    }

    /**
     * Find the highest String from the given string
     */

    public static void highestString() {

        List<String> names = Arrays.asList("Arjun", "ram", "var", "aurora");
        //Based on the value of the String
        List<String> highest = names.stream().max((name, name1) -> name.compareTo(name1)).stream().collect(Collectors.toList());
        highest.forEach(System.out::println);
        //Based on the length of the String
        Optional<String> collect = names.stream().collect(Collectors.maxBy(Comparator.comparing(name -> name.length())));
        System.out.println(collect.get());
    }

    /**
     * filter by Strings having the length more the 5
     */

    public static void filterByLength() {

        List<String> names = Arrays.asList("ArjunReddy", "Abhinav", "Priyanka", "ramesh", "hari", "Sam", "Harsha");
        names.stream().filter(name -> name.length() >= 5).collect(Collectors.toList()).forEach(System.out::println);
    }

    /**
     * Removing the given character from the String
     */
    public static void removeTheGivenCharacterFromTheString() {
        String sentence = "Hello World";
        char removeChar = 'o';
        String newSentence = sentence.replaceAll("o", "");
        System.out.println("newSentence = " + newSentence);
    }

    /**
     * Find All the number starting with 1 using java8 and print in natural sorting order
     * {12312,3534534,454,2342,123,5675,1235}->input
     * Output -> 123,1235,12312
     */
    public static void findNumbersStatingWith1() {
        List<Integer> numbers = Arrays.asList(12312, 3534534, 454, 2342, 123, 5675, 1235);
        numbers.stream()
                .map(number -> number + "")
                .filter(number -> number.startsWith("1"))
                .map(number -> Integer.parseInt(number))
                .sorted().forEach(System.out::println);
    }

    /**
     * Intersection of two Arrays and finding the common elements and unique
     * Ex:- arr1= [1,2,34,5,6,2] arr2 =[23,2,34,56,78,2] output:-[2,34]
     */
    public static void intersectionOfArrays() {
        int[] firstArray = {1, 2, 45, 56, 23, 2};
        int[] sencondArray = {2, 56, 46, 78, 12};
        Arrays.stream(firstArray)
                .filter(element -> Arrays.stream(sencondArray)
                        .anyMatch(x -> x == element)).distinct()
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        //intersectionOfArrays();
//        Stream<Integer> number = Stream.of(1, 2, 3, 4, 5);
//        number.filter(n -> n % 2 == 1);
//        number.forEach(System.out::println);
        fizzBuzz();
        sortByAlphabets();
    }

    /**
     * fizz buzz
     */
    public static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void sortByAlphabets() {
        String input = "Arjun";
        char[] characterArray = input.toCharArray();
        for (int i = 0; i < characterArray.length - 1; i++) {
            for (int j = 0; j < characterArray.length - i - 1; j++) {
                if (characterArray[j] > characterArray[j + 1]) {
                    char temp = characterArray[j];
                    characterArray[j] = characterArray[j + 1];
                    characterArray[j + 1] = temp;
                }
            }
        }
        System.out.println(new String(characterArray));
    }

}
