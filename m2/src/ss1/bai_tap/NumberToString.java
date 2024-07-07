package ss1.bai_tap;

import java.util.Scanner;

public class NumberToString {
    public static void main(String[] args) {
        int weight;
        String word3 ="";
        String word2 = "";
        String word1 = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        weight = sc.nextInt();
        if (weight <= 10 && weight > 0) {
            switch (weight) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
            }
        } else if (weight <= 20) {

            switch (weight) {
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eighteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
                case 20:
                    System.out.println("twenty");
                    break;
            }
        }
        else if (weight <= 100) {
            int tens = weight / 10;
            int ones = weight % 10;
            switch (tens) {

                case 2:
                    word2 = "twenty";
                    break;
                case 3:
                   word2 = "thirty";
                    break;
                case 4:
                    word2 = "forty";
                    break;
                case 5:
                    word2 = "fifty";
                    break;
                case 6:
                    word2 = "sixty";
                    break;
                case 7:
                    word2 = "seventy";
                    break;
                case 8:
                    word2 = "eighty";
                    break;
                case 9:
                    word2 = "ninety";
                    break;
                case 10:
                    System.out.println("one hundred");
                    break;
            }
            switch (ones) {
                case 1:
                    word1 = "one";
                    break;
                case 2:
                    word1 = "two";
                    break;
                case 3:
                    word1 = "three";
                    break;
                case 4:
                    word1 = "four";
                    break;
                case 5:
                    word1 = "five";
                    break;
                case 6:
                    word1 = "six";
                    break;
                case 7:
                    word1 = "seven";
                    break;
                case 8:
                   word1 = "eight";
                    break;
                case 9:
                    word1 = "nine";
                    break;

            }
            System.out.println( word2 +" " + word1);
        }
        else if (weight < 1000) {
            int hundreds = weight/100;
            int tens = (weight % 100) / 10;
            int ones = weight % 10;
            switch (hundreds) {
            case 1:
                word3 = "one hundred";
                break;
            case 2:
                word3 = "two hundred";
                break;
            case 3:
                word3 = "three hundred";
                break;
            case 4:
                word3 = "four hundred";
                break;
            case 5:
                word3 = "five hundred";
                break;
            case 6:
                word3 = "six hundred";
                break;
            case 7:
                word3 = "seven hundred";
                break;
            case 8:
                word3 = "eight hundred";
                break;
            case 9:
                word3 = "nine hundred";
                break;
        }
            switch (tens) {
                case 2:
                    word2 = "twenty";
                    break;
                case 3:
                    word2 = "thirty";
                    break;
                case 4:
                    word2 = "forty";
                    break;
                case 5:
                    word2 = "fifty";
                    break;
                case 6:
                    word2 = "sixty";
                    break;
                case 7:
                    word2 = "seventy";
                    break;
                case 8:
                    word2 = "eighty";
                    break;
                case 9:
                    word2 = "ninety";
                    break;
                case 10:
                    System.out.println("one hundred");
                    break;
            }
            switch (ones) {
                case 1:
                    word1 = "one";
                    break;
                case 2:
                    word1 = "two";
                    break;
                case 3:
                    word1 = "three";
                    break;
                case 4:
                    word1 = "four";
                    break;
                case 5:
                    word1 = "five";
                    break;
                case 6:
                    word1 = "six";
                    break;
                case 7:
                    word1 = "seven";
                    break;
                case 8:
                    word1 = "eight";
                    break;
                case 9:
                    word1 = "nine";
                    break;

            }
            System.out.println(word3 + " " + word2 +" " + word1);
        }
        else {
            System.out.println(" out of ability ");
        }
    }
}

