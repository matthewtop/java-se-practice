package pl.globallogic.exercises.intermediate;
//Write a method named getEvenDigitSum with one parameter of type int called number.
//        The method should return the sum of the even digits within the number.
//        If the number is negative, the method should return -1 to indicate an invalid value.

public class ex18EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    private static int getEvenDigitSum(int number){
        if(number<0){return -1;}

        int result = 0;
        while(number !=0){
            int digit = number%10;
            if(digit%2==0){
                result += digit;
            }
            number /=10;
        }
        return result;
    }
}
