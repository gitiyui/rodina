package main.java.ua.edu.kibit.plab1;
public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28)); // має вивести true
        System.out.println(checkPerfectNumber(7));  // має вивести false
    }

    public static boolean checkPerfectNumber(int num) {
        if (num <= 1) {
            return false; // 1 не є досконалим числом
        }

        int sum = 1; // початково додаємо 1, оскільки 1 завжди дільник
        // Перевіряємо дільники від 2 до квадратного кореня числа
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i; // додаємо дільник i
                if (i != num / i) { // якщо i не є квадратним коренем з num
                    sum += num / i; // додаємо також парний дільник num / i
                }
            }
        }

        // Повертаємо true, якщо сума дільників дорівнює числу
        return sum == num;
    }
}
