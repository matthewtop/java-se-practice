package pl.globallogic.exercises.intermediate;

public class ex24NumberToWords {
    public static void main(String[] args) {
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));
        System.out.println();

        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));
        System.out.println();

        numberToWords(123);
        System.out.println();
        numberToWords(1010);
        System.out.println();
        numberToWords(1000);
        System.out.println();
        numberToWords(-12);

    }
    private static void numberToWords(int number){
        if(number<0){
            System.out.println("Invalid value");
            return;
        }

        int reversedNumber = reverse(number);

        if(reversedNumber == 0){
            System.out.printf("Zero ");
            return;
        }


        while(reversedNumber != 0){
            int lastDigit = reversedNumber % 10;
            switch (lastDigit){
                case 0:
                    System.out.printf("Zero ");
                    break;
                case 1:
                    System.out.printf("One ");
                    break;
                case 2:
                    System.out.printf("Two ");
                    break;
                case 3:
                    System.out.printf("Three ");
                    break;
                case 4:
                    System.out.printf("Four ");
                    break;
                case 5:
                    System.out.printf("Five ");
                    break;
                case 6:
                    System.out.printf("Six ");
                    break;
                case 7:
                    System.out.printf("Seven ");
                    break;
                case 8:
                    System.out.printf("Eight ");
                    break;
                case 9:
                    System.out.printf("Nine ");
                    break;
            }
            reversedNumber /=10;

        }
        int digitCount = getDigitCount(number);
        int reversedDigitCount = getDigitCount(reverse(number));
        int zerosToPrint = digitCount - reversedDigitCount;
        for(int i=0;i<zerosToPrint; i++){
            System.out.printf("Zero ");
        }




    }

    private static int reverse(int numberToReverse){
        int reversedNumber = 0;
        int number = numberToReverse;

        while (number!=0){
            int lastDigit = number %10;
            reversedNumber = reversedNumber *10 + lastDigit;
            number /=10;
        }
        return reversedNumber;



    }

    private static int getDigitCount(int number){
        if(number<0){
            return -1;
        }
        if(number == 0){
            return 1;
        }
        int digitCount = 0;
        while (number!=0){
            digitCount++;
            number /=10;
        }
        return digitCount;

    }
}
