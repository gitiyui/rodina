package ua.edu.kibit;

public class WaterBottles {
    public static void main(String[] args) {
        System.out.println(numWaterBottles1(9, 3));
        System.out.println(numWaterBottles1(15, 4));
        System.out.println(numWaterBottles2(9, 3));
        System.out.println(numWaterBottles2(15, 4));
        System.out.println(numWaterBottles3(9, 3));
        System.out.println(numWaterBottles3(15, 4));
    }

    public static int numWaterBottles1(int numBottles, int numExchange) {
        int result = numBottles;
        while (numBottles >= numExchange) {
            int newBottles = numBottles / numExchange;
            result += newBottles;
            numBottles = newBottles + (newBottles % numExchange);
        }
        return result;
    }

    public static int numWaterBottles2(int numBottles, int numExchange) {
        int result = numBottles;
        while (numBottles >= numExchange) {
            int newBottles = numBottles / numExchange;
            result += newBottles;
            int remainderBottles = numBottles % numExchange;
            numBottles = newBottles + remainderBottles;
        }
        return result;
    }

    public static int numWaterBottles3(int numBottles, int numExchange) {
        int result = numBottles;
        while (numBottles >= numExchange) {
            numBottles /= numExchange;
            result += numBottles;
            numBottles += numBottles % numExchange;
        }
        return result;
    }
}
