package pl.globallogic.exercises.basic;

public class ex6DecimalComparator {
    public static void main(String[] args) {
        double number = -3.1756;
        double number2 = -3.175;
        areEqualByThreeDecimalPlaces(number,number2);


    }
    private static boolean areEqualByThreeDecimalPlaces (double number, double number2){
        number = (int) (number*1000);
        number2 = (int) (number*1000);
        if(number == number2){
            System.out.printf("numbers are equal");
            return true;

        }
        else {
            System.out.printf("numbers are not equal");
            return false;
        }

    }
}
