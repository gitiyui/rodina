package ua.edu.kibit;

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        int intValue = 123;
        Integer integerValue = intValue;
        int intValue2 = integerValue;
        System.out.println(getNonPrimitiveNumber(integerValue));
        System.out.println(getPrimitiveNumber(intValue));
    }

    private static Integer getNonPrimitiveNumber(int intValue) {
        return intValue;
    }

    private static int getPrimitiveNumber(Integer integerValue) {
        return integerValue;
    }
}
