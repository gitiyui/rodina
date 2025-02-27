package ua.edu.kibit;

public class AnArray {

    public static void main(String[] args) {
//        int[] anArray = new int[10];
//        anArray[4] = 500;
//        System.out.println(anArray[4]);
//        int[] anArray = new int[] {5, 2 ,8, 9, 10};
        int[] anArray = {5, 2, 10, 8, 9};
//        for (int i = 1; i < anArray.length; i++) {
//            System.out.println(anArray[i]);
//        }
//
//        for (int item : anArray) {
//            System.out.println(item);
//        }

//        System.out.println("Max number is: " + findMax(anArray));
//        System.out.println("Max number is: " + findMax2(anArray));
//        System.out.println("Sum is : " + sumArray(anArray));
//        System.out.println("Sum is : " + sumArray2(anArray));
//        String word = "radar";
//        String word = "noon";
        String word = "rada";
        System.out.println(word + " is palindrome: " + isPalindrome(word));
        System.out.println(word + " is palindrome: " + isPalindrome2(word));
    }

    private static boolean isPalindrome(String word) {
        char[] chars = word.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    private static boolean isPalindrome2(String word) {
        char[] chars = word.toCharArray();
        for (int start = 0, end = chars.length - 1; start < end; start++, end--) {
            if (chars[start] != chars[end]) {
                return false;
            }
        }
        return true;
    }

    private static int sumArray(int[] numbers) {
        int sum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    private static int sumArray2(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    private static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    private static int findMax2(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

}
