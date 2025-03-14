package ua.edu.kibit;

public class Casting {
    public static void main(String[] args) {
        wideningCasting();
        narrowingCasting();
    }

    private static void wideningCasting() {
        byte byteValue = 17;
        short shortValue = byteValue;
        int intValue = shortValue;
        long longValue = intValue;
    }

    private static void narrowingCasting() {
        long longValue = 107;
        int intValue = (int) longValue;
        short shortValue = (short) intValue;
        byte byteValue = (byte) shortValue;
    }
}
