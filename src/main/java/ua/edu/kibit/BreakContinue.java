package ua.edu.kibit;

public class BreakContinue {
    public static void main(String[] args) {
        int[] numbers = {2, -3, 4, 6, -1, 7, 9, 1, 5, 3};
        int threshold = 5;
        for (int number : numbers) {
            if (number < 0) {
                continue;
            }
            if (number % 2 != 0 && number > threshold) {
                System.out.println("Found the first positive odd number: " + number);
                break;
            }
        }
    }
}
