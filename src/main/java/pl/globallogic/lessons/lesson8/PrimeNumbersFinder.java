package pl.globallogic.lessons.lesson8;

public class PrimeNumbersFinder {
    // find prime numbers for given threshold value ( prime - 1 and number itself and divisors
    //input - int
    // 17 divisors 1 and 17 -> 3, 5 ,7, 11, 13, 17
    public static void main(String[] args) {
        int primeNumbersThreshold = 17;
        System.out.printf("Prime numbers before '%s':  \n", primeNumbersThreshold);
        printPrimesFor(primeNumbersThreshold);
    }

    private static void printPrimesFor(int primeNumbersThreshold) {
        for (int i = 2; i < primeNumbersThreshold; i++) {
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isPrime(int candidate) {
        for (int i = 2; i <= candidate/2 ; i++) {
            if(candidate % i == 0) {
                return false;
            }
        }
        return true;
    }
}

