package pl.globallogic.exercises.intermediate;
//Write a method named hasSameLastDigit with three parameters of type int.
//        Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the
//        numbers is not within the range, the method should return false.
//        The method should return true if at least two of the numbers share the same rightmost digit;
//        otherwise, it should return false.

public class ex20LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));
        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
    }

    private static boolean isValid(int number){
        return number >= 10 && number <= 1000;
    }
    private static boolean hasSameLastDigit(int num1,int num2, int num3){

        if(!isValid(num1) || !isValid(num2) || !isValid(num3)){
            return false;
        }
        int lastDigitOfNumber1= num1 %10;
        int lastDigitOfNumber2 = num2 %10;
        int lastDigitOfNumber3 = num3 %10;

        return (lastDigitOfNumber1==lastDigitOfNumber2 || lastDigitOfNumber1==lastDigitOfNumber3 || lastDigitOfNumber2 == lastDigitOfNumber3);
    }
}
