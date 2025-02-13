package ua.edu.kibit;

public class WaterBottles {
    public static void main(String[] args) {
        System.out.println(numWaterBottles(9, 3));
        System.out.println(numWaterBottles(15, 4));
    }

    public static int numWaterBottles(int numBottles, int numExchange) {
        int result = numExchange + numBottles;
        if (numBottles >= 3) {
            numExchange += numBottles;
            while (numExchange < 3) {
                numBottles = 0;
                numBottles = numExchange % 3;
            }
        }
        return result;
    }
}
