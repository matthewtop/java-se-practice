package pl.globallogic.exercises.intermediate;
//Write a method named getLargestPrime with one parameter of type int named number.
//        If the number is negative or does not have any prime numbers, the method should
//        return -1 to indicate an invalid value.
//        The method should calculate the largest prime factor of a given number and return it.

public class ex26LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    private static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        else {
            int largestPrime = 2;
            while(largestPrime < number){
                if(number % largestPrime !=0){
                    largestPrime++;
                }
                else {
                    number = number / largestPrime;
                }
            }
            return number;
        }
    }
}
