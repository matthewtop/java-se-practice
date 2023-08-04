package pl.globallogic.exercises.intermediate;

public class ex20LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));
        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
    }
//    private static boolean rangeNumberValidation(int num1, int num2, int num3){
//        return (num1>=10&& num1<=1000 && num2>=10&&num2<=1000 && num3>=10 && num3 <=1000);
//    }
    private static boolean isValid(int number){
        if (number<10 || number >1000){
            return false;
        }
        else{
            return true;
        }
    }
    private static boolean hasSameLastDigit(int num1,int num2, int num3){
//        if(!rangeNumberValidation(num1,num2,num3)){
//            return false;
//        }
        if(!isValid(num1) || !isValid(num2) || !isValid(num3)){
            return false;
        }
        int lastDigitofNumber1= num1 %10;
        int lastDigitofNumber2 = num2 %10;
        int lastDigitofNumber3 = num3 %10;

        return (lastDigitofNumber1==lastDigitofNumber2 || lastDigitofNumber1==lastDigitofNumber3 || lastDigitofNumber2 == lastDigitofNumber3);

    }
}
