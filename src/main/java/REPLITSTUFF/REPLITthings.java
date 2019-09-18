package REPLITSTUFF;

import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class REPLITthings {
    public static void main(String[] args) {
//        ArrayOfStrings();
//        AreWeThereYet();
//        Squares1();
//        OneToTen();
//        CountDown1();
//        SecondToLast();
//        SumOfArray();
//        AverageOfArray();

//        IndexThing();
//        PrintGivenString();
//        PrintOddNumbers();
//        ExtractAllEven();
//        SwapAray();


    }

    public static void ArrayOfStrings() {
        //ARRAY OF STRINGS
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};

        for (int x = 0; x < breakfast.length; x++) {
            System.out.println(breakfast[x]);
        }
    }

    public static void AreWeThereYet() {

        Scanner scanObject = new Scanner(System.in);
        System.out.println("Are We There Yet ?");
        String answer = scanObject.nextLine();
        System.out.println(answer);
        boolean yes = true;
        boolean no = false;
        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("We Have Arrived");
        } else if (answer.equalsIgnoreCase("no")) {
            System.out.println("Not There Yet");
        }
    }


    public static void Squares1() {

        //SQUARES

        for (int x = 1; x <= 10; x++) {
            System.out.println(x * x);
        }
    }

    public static void CountDown1() {

        for (int x = 1; x <= 19; x++)
            if (x % 2 != 0) {
                System.out.println(x + " ");
            }

    }

    public static void OneToTen() {
        //ONE TO TEN
        for (int x = 1; x <= 10; x++) {
            System.out.println(x);
        }


    }

    public static void SecondToLast() {
        String[] names = {"a", "b", "c", "d", "e"};
        int size = names.length;
        System.out.println(names[size - 2]);
    }

    public static void SumOfArray() {
        int sum = 0;
        double total = 0;
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int x = 0; x < numbers.length; x++)
            sum = sum + numbers[x];
        System.out.println(sum);

    }

    public static void AverageOfArray() {
        int sum = 0;
        double total = 0;
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int x = 0; x < numbers.length; x++)
            sum = sum + numbers[x];
        double average = sum / numbers.length;
        System.out.println(average);

    }

    //    Complete the method to check, if the array below contains a specific element.
//    For example, if I pass the string "e"or "E"as an argument to the contain method the implementation of your contains method should check if the string "e" or "E" exist in the array and if it does then return true.
//    Keep in mind,  that i can pass in any string that i want and if the string that i pass as an argument does not exist in the array then you should return false.
//
//    String[] names = {"a","b","c","d","e"};
    public static void Contains() {
        String[] names = {"a", "b", "c", "d", "e"};

    }

    public static void IndexThing() {
        String[] letters = {"a", "b", "c", "d", "e"};


    }

    public static void PrintGivenString() {
        String str = "ha";
        int n = 3;
        for (int i = 0; i < 1; i++) {
            String repeated = new String(new char[3]).replace("\0", str);
            System.out.println(repeated);
        }
    }

    public static void PrintOddNumbers() {
        int start = 19;
        int end = 3;

        while (start >= end) {
            if (start % 2 != 0) {
                System.out.println(start);

            }
            start--;
        }
    }

    public static void ExtractAllEven() {
        int[] input = {2, 5, 6, 7, 23, 4, 8, 12, 9};
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                Arrays.sort(input);
                System.out.println(input[i]);
            }
        }
    }
        public static void SwapAray() {
            String[] arr = {"A1", "B2", "C3"};
        System.out.println(Arrays.toString(arr));
        String temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;
        System.out.println(Arrays.toString(arr));

        }
    }




