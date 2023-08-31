package pl.globallogic.exercises.intermediate;
//Write a method called numberToWords with one int parameter named number.
//        The method should print out the passed number using words for the digits.
//        If the number is negative, print "Invalid Value".
//        o print the number as words, follow these steps:
//        1. Extract the last digit of the given number using the remainder operator.
//        2. Convert the value of the digit found in Step 1 into a word. There are 10 possible
//        values for that digit, those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9. Print the corresponding
//        word for each digit, e.g. print "Zero" if the digit is 0, "One" if the digit is 1, and so
//        on.
//        3. Remove the last digit from the number.
//        4. Repeat Steps 2 through 4 until the number is 0.
//        The logic above is correct, but in its current state, the words will be printed in reverse
//        order. For example, if the number is 234, the logic above will produce the output "Four
//        Three Two" instead of "Two Three Four". To overcome this problem, write a second
//        method called reverse.
//        The method reverse should have one int parameter and return the reversed number
//        (int). For example, if the number passed is 234, then the reversed number would be 432.
//        The method reverse should also reverse negative numbers.
//        Use the method reverse within the method numberToWords in order to print the words
//        in the correct order.
//        Another thing to keep in mind is any reversed number with leading zeroes (e.g. the
//        reversed number for 100 is 001). The logic above for the method numberToWords will
//        print "One", but that is incorrect. It should print "One Zero Zero". To solve this problem,
//        write a third method called getDigitCount.
//        The method getDigitCount should have one int parameter called number and return the
//        count of the digits in that number. If the number is negative, return -1 to indicate an
//        invalid value.

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
            System.out.println("Zero ");
            return;
        }

        while(reversedNumber != 0){
            int lastDigit = reversedNumber % 10;
            switch (lastDigit) {
                case 0 -> System.out.println("Zero ");
                case 1 -> System.out.println("One ");
                case 2 -> System.out.println("Two ");
                case 3 -> System.out.println("Three ");
                case 4 -> System.out.println("Four ");
                case 5 -> System.out.println("Five ");
                case 6 -> System.out.println("Six ");
                case 7 -> System.out.println("Seven ");
                case 8 -> System.out.println("Eight ");
                case 9 -> System.out.println("Nine ");
            }
            reversedNumber /=10;
        }
        int digitCount = getDigitCount(number);
        int reversedDigitCount = getDigitCount(reverse(number));
        int zerosToPrint = digitCount - reversedDigitCount;
        for(int i=0;i<zerosToPrint; i++){
            System.out.println("Zero ");
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
