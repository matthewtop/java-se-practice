package pl.globallogic.exercises.intermediate;
//Write a method called isPalindrome with one int parameter called number.
//        The method needs to return a boolean.
//        It should return true if the number is a palindrome number otherwise it should return
//        false.

public class ex16NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    private static boolean isPalindrome(int number){
        int revert = 0;
        int numberToRevert = number;
        while (number != 0){
            int lastDigit = number % 10;
            revert = (revert*10) + lastDigit;
            number /= 10;
        }
        return numberToRevert == revert;
    }
}
