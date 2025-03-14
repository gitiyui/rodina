package ua.edu.kibit;

public class ShortCircuit {
    public static void main(String[] args) {
//        boolean result = true || false && false;
        boolean result = method("Left", false) || method("Middle", true) && method("Right", false);
        System.out.println("result: " + result);
        boolean result2 = (5 + 10 > 12) || (2 * 2 == 5) && (8 / 4 > 1);
    }

    private static boolean method(String name, boolean returnValue) {
        System.out.println("Executing: " + name);
        return returnValue;
    }
}
