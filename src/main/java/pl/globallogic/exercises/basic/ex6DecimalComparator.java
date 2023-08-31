package pl.globallogic.exercises.basic;

public class ex6DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175,3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0,3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123,3.123));

    }
    private static boolean areEqualByThreeDecimalPlaces (double number1, double number2){
        int num1 = (int) (number1*1000);
        int num2 = (int) (number2*1000);
        return num1 == num2;

    }
}
