package pl.globallogic.exercises.intermediate;

public class ex26LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));

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
