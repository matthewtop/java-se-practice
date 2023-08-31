package pl.globallogic.exercises.intermediate;

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
