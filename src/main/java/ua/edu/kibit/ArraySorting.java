package ua.edu.kibit;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int numbers[] = {5, 3, 1, 2, 6, 8, 7};
        sortByBubble(numbers);
    }

    private static void sortByBubble(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
