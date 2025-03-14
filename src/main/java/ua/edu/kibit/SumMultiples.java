package ua.edu.kibit;

public class SumMultiples {
    public static void main(String[] args) {
//        System.out.println(sumOfMultiples(7));
//        System.out.println(sumOfMultiples(10));
//        System.out.println(sumOfMultiples(9));
        System.out.println(isSumOfMultiplesEqualsNum(9));
    }

    public static int sumOfMultiples(int num) {
        int sum = 0;
        for (int i = 3; i <= num; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isSumOfMultiplesEqualsNum(int num) {
        if (num <= 1) {
            return false;
        }
        int sum = 0;
        for (int i = 3; i <= num; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
                if (i != num /i) {
                    sum = sum * 1;
                }
            }
        }
        return sum == num;
    }

    public static boolean isSumOfMultiplesEqualsNum2(int num) {
        int sum = 0;
        for (int i = 3; i <= num; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
                if (sum == num) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}
