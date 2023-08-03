package pl.globallogic.exercises.basic;

import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to count digits: ");
        int number = scanner.nextInt();
        System.out.println("Digit count for " + number + " is equal to " + numberOfDigits(number));

    }

    private static int numberOfDigits(int targetNumber){
        if(targetNumber <0) {
            return -1;
        }
        int counter =0;
        while (targetNumber>0){
            targetNumber = targetNumber/10;
            counter++;
        }
        return counter;
    }
}
