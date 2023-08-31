package pl.globallogic.exercises.basic;
//Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
//        The method should return boolean and it needs to return true if two double numbers are
//        the same up to three decimal places. Otherwise, return false.

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
