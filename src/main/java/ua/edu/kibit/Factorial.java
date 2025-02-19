package ua.edu.kibit;

public class Factorial {
    public static void main(String[] args) {
//        int min = findMinNumber(8, 4, 9);
//        System.out.println("min=" + min);
//        System.out.println("factorialWithForLoop=" + findFactorialWithForLoop(7));
//        System.out.println("factorialWithReverseForLoop=" + findFactorialWithReverseForLoop(7));
//        System.out.println("factorialWithWhileLoopWithIncrement=" + findFactorialWithWhileLoopWithIncrement(7));
//        System.out.println("factorialWithWhileLoopWithDecrement=" + findFactorialWithWhileLoopWithDecrement(7));
//        System.out.println("factorialWithDoWhileLoopWithDecrement=" + findFactorialWithDoWhileLoopWithDecrement(7));
        System.out.println("factorialWithRecursion" + findFactorialRecursive(7));
        
    }

    private static long findFactorialRecursive(int inputNumber) {
        if (inputNumber <= 1) {
            return 1;
        } else {
            return inputNumber * findFactorialRecursive(inputNumber - 1);
        }
    }

    private static int findMinNumber(int firstNumber, int secondNumber, int thirdNumber) {
        int min = firstNumber;
        if (secondNumber < min) {
            min = secondNumber;
        }
        if (thirdNumber < min) {
            min = thirdNumber;
        }
        return min;
    }

    private static int findFactorialWithForLoop(int inputNumber) {
        int factorial = 1;
        for (int i = 1; i <= inputNumber; i++) {
            factorial *= i;
        }
        return factorial;
    }

    private static int findFactorialWithReverseForLoop(int inputNumber) {
        int factorial = 1;
        for (int i = inputNumber; i >= 1; i--) {
            factorial *= i;
        }
        return factorial;
    }

    private static int findFactorialWithWhileLoopWithIncrement(int inputNumber) {
        int factorial = 1;
        int i = 1;
        while (i <= inputNumber) {
            factorial *= i++;
        }
        return factorial;
    }

    private static int findFactorialWithWhileLoopWithDecrement(int inputNumber) {
        int factorial = 1;
        while (inputNumber > 1) {
            factorial *= inputNumber--;
        }
        return factorial;
    }

    private static int findFactorialWithDoWhileLoopWithDecrement(int inputNumber) {
        int factorial = 1;
        do {
            factorial *= inputNumber--;
        } while (inputNumber > 1);
        return factorial;
    }
}
