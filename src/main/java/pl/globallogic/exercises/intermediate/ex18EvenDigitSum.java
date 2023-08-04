package pl.globallogic.exercises.intermediate;

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
