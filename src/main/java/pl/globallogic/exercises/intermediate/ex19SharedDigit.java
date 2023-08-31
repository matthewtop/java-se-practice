package pl.globallogic.exercises.intermediate;
//Write a method named hasSharedDigit with two parameters of type int.
//        Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the
//        numbers is not within the range, the method should return false.
//        The method should return true if there is a digit that appears in both numbers, such as 2 in 12
//        and 23; otherwise, the method should return false.

public class ex19SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
    }

    private static boolean numberValidation(int number1, int number2){
        return number1>=10 && number1<=99 && number2>=10 && number2<=99;
    }

    private static boolean hasSharedDigit(int number1, int number2){
        if(!numberValidation(number1,number2)){
            return false;
        }

        int number1_1 = number1 /10; //digits of number1
        int number1_2 = number1 %10;

        int number2_1 = number2 /10; //digits of number2
        int number2_2 = number2 %10;

        return (number1_1==number2_1|| number1_2==number2_1||number2_1==number2_2 || number1_1==number1_2);
    }

}
