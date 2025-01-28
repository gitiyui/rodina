package ua.edu.kibit;

public class Main {

    public static void main(String[] args) {
        int firstNumber;
        int secondNumber = 4;
        int thirdNumber = 9;
        firstNumber = 8;
        boolean result = firstNumber < secondNumber;

        /*if (firstNumber < secondNumber) {
            if (firstNumber < thirdNumber) {
                System.out.println("min=firstNumber: " + firstNumber);
            } else {
                System.out.println("min=thirdNumber " + thirdNumber);
            }
        } else {
            if (secondNumber < thirdNumber) {
                System.out.println("min=secondNumber: " + secondNumber);
            } else {
                System.out.println("min=thirdNumber " + thirdNumber);
            }
        }*/

        /*int min = firstNumber;
        if (secondNumber < min) {
            min = secondNumber;
        }
        if (thirdNumber < min) {
            min = thirdNumber;
        }
        System.out.println("min=" + min);*/

        int number = 5;
        System.out.println(number++);
        System.out.println(number);

        int inputNumber = 7;
        int factorial = 1;
        /*for (int i = 1; i <= inputNumber; i++) {
            factorial *= i;
        }
        System.out.println("factorial=" + factorial);*/

        /*for (int i = inputNumber; i >= 1; i--) {
            factorial *= i;
            System.out.println("current factorial=" + factorial);
        }*/

        int i = 1;
        while (i <= inputNumber) {
            factorial *= i++;
        }
        System.out.println("factorial=" + factorial);
    }
}