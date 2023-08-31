package pl.globallogic.exercises.intermediate;
//Write a method named sumFirstAndLastDigit with one parameter of type int called number.
//        The method needs to find the first and the last digit of the parameter number passed to the
//        method, using a loop and return the sum of the first and the last digit of that number.
//        If the number is negative then the method needs to return -1 to indicate an invalid value.

public class ex17FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit( int number){
        if (number < 0){ return -1; }

        int firstDigit = 0;
        int lastDigit = number % 10;

        while( number >= 10){
            number /= 10;
        }
        firstDigit = number;

        return (firstDigit + lastDigit);
    }
}
