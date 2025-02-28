package ua.edu.kibit;

//F(n) = F(n-1) + F(n-2), where F(0)=0, F(1)=1, n>=2
public class Fibonacci {
    public static void main(String[] args) {
        int number = 8;
//        System.out.println(findFibonacciByRecursion(number));
//        System.out.println(findFibonacciByIteration(number));
//        System.out.println("Result: " + findFibonacciByIterationWithArray(number)[number]);
        System.out.println("Result: " + findFibonacciByIterationWithArray(number));
    }

    private static long findFibonacciByIterationWithArray(int number) {
        if (number <= 1) {
            return number;
        }
        long[] fibonacciNumbers = new long[number + 1];
        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;
        for (int i = 2; i <= number; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
            System.out.println(fibonacciNumbers[i]);
        }
        return fibonacciNumbers[number];
    }

    private static long findFibonacciByIteration(int number) {
        if (number <= 1) {
            return number;
        }
        int prev1 = 0;
        int prev2 = 1;
        int result = 0;
        for (int i = 2; i <= number; i++) {
            result = prev1 + prev2;
            prev1 = prev2;
            prev2 = result;
        }
        return result;
    }

    private static long findFibonacciByRecursion(int number) {
        return number <= 1
                ? number
                : findFibonacciByRecursion(number - 1) + findFibonacciByRecursion(number - 2);
    }
}
